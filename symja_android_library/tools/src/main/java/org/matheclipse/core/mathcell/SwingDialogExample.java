package org.matheclipse.core.mathcell;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.math.MathException;

public class SwingDialogExample extends BasePlotExample {

	@Override
	public String exampleFunction() {
		return "DialogInput(DialogNotebook(Row({TextCell(\"Click the DoIt button:\"), Button(\"DoIt\", DialogReturn(\"Hello dialog world\"))})))";
	}

	public static void main(String[] args) {
		SwingDialogExample p = new SwingDialogExample();
		p.generateHTML();
	}
 
}