package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ArcCschRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 8, 0 };

  final public static IAST RULES = List(
    IInit(ArcCsch, SIZES),
    // ArcCsch(0)=ComplexInfinity
    ISet(ArcCsch(C0),
      CComplexInfinity),
    // ArcCsch(I)=-1/2*Pi*I
    ISet(ArcCsch(CI),
      Times(CC(0L,1L,-1L,2L),Pi)),
    // ArcCsch(2*I/Sqrt(3))=-1/3*Pi*I
    ISet(ArcCsch(Times(CC(0L,1L,2L,1L),C1DSqrt3)),
      Times(CC(0L,1L,-1L,3L),Pi)),
    // ArcCsch(I*Sqrt(2))=-1/4*Pi*I
    ISet(ArcCsch(Times(CI,CSqrt2)),
      Times(CC(0L,1L,-1L,4L),Pi)),
    // ArcCsch(2*I)=-1/6*Pi*I
    ISet(ArcCsch(CC(0L,1L,2L,1L)),
      Times(CC(0L,1L,-1L,6L),Pi)),
    // ArcCsch(Infinity)=0
    ISet(ArcCsch(oo),
      C0),
    // ArcCsch(I*Infinity)=0
    ISet(ArcCsch(DirectedInfinity(CI)),
      C0),
    // ArcCsch(ComplexInfinity)=0
    ISet(ArcCsch(CComplexInfinity),
      C0)
  );
}
