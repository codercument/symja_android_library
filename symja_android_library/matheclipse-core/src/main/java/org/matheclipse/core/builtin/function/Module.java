package org.matheclipse.core.builtin.function;
 
import java.util.IdentityHashMap;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.generic.Functors;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.math.MathException;

public class Module extends AbstractCoreFunctionEvaluator {
	public Module() {
	}

	/**
	 *
	 */
	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 3);

		if (ast.arg1().isList()) {
			IAST lst = (IAST) ast.arg1();
			IExpr arg2 = ast.arg2();
			final EvalEngine engine = EvalEngine.get();
			return evalModule(lst, arg2, engine);
		}

		return null;
	}

	/**
	 * Check the (possible nested) module condition in pattern matcher without evaluating a result.
	 * 
	 * @param arg1
	 * @param arg2
	 * @param engine
	 * @return
	 */
	public static boolean checkModuleCondition(IExpr arg1, IExpr arg2, final EvalEngine engine) {
		if (arg1.isList()) {
			IAST intializerList = (IAST) arg1;
			final int moduleCounter = engine.incModuleCounter();
			final String varAppend = "$" + moduleCounter;
			// final IAST lst = (IAST) ast.arg1();
			final java.util.Map<ISymbol, ISymbol> moduleVariables = new IdentityHashMap<ISymbol, ISymbol>();

			try {
				rememberVariables(intializerList, engine, varAppend, moduleVariables);
				IExpr result = F.subst(arg2, Functors.rules(moduleVariables));
				if (result.isCondition()) {
					return Condition.checkCondition(result.getAt(1), result.getAt(2), engine);
				} else if (result.isModule()) {
					return checkModuleCondition(result.getAt(1), result.getAt(2), engine);
				}
			} finally {
				engine.removeUserVariables(moduleVariables);
			}
		}
		return true;
	}

	/**
	 * <code>Module[{variablesList}, rhs ]</code>
	 * 
	 * @param intializerList
	 * @param arg2
	 * @param engine
	 * @return
	 */
	private static IExpr evalModule(IAST intializerList, IExpr arg2, final EvalEngine engine) {
		final int moduleCounter = engine.incModuleCounter();
		final String varAppend = "$" + moduleCounter;
		final java.util.Map<ISymbol, ISymbol> moduleVariables = new IdentityHashMap<ISymbol, ISymbol>();

		try {
			rememberVariables(intializerList, engine, varAppend, moduleVariables);
			IExpr temp = engine.evaluate(F.subst(arg2, Functors.rules(moduleVariables)));
			return temp;
		} finally {
			engine.removeUserVariables(moduleVariables);
		}
	} 

	private static void rememberVariables(IAST variablesList, final EvalEngine engine, final String varAppend,
			final java.util.Map<ISymbol, ISymbol> variables) {
		ISymbol oldSymbol;
		ISymbol newSymbol;
		// remember which local variables we use:
		for (int i = 1; i < variablesList.size(); i++) {
			if (variablesList.get(i).isSymbol()) {
				oldSymbol = (ISymbol) variablesList.get(i);
				newSymbol = F.$s(oldSymbol.toString() + varAppend);
				variables.put(oldSymbol, newSymbol);
				newSymbol.pushLocalVariable();
			} else {
				if (variablesList.get(i).isAST(F.Set, 3)) {
					final IAST setFun = (IAST) variablesList.get(i);
					if (setFun.arg1().isSymbol()) {
						oldSymbol = (ISymbol) setFun.arg1();
						newSymbol = F.$s(oldSymbol.toString() + varAppend);
						variables.put(oldSymbol, newSymbol);
						IExpr rightHandSide = setFun.arg2();
						try {
							rightHandSide = engine.evaluate(rightHandSide);
						} catch (MathException me) {
							if (Config.DEBUG) {
								me.printStackTrace();
							}
						}
						newSymbol.pushLocalVariable(rightHandSide);
					}
				}
			}
		}
	}

	@Override
	public void setUp(ISymbol symbol) {
		symbol.setAttributes(ISymbol.HOLDALL);
	}

}
