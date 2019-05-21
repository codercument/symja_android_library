package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ArcCscRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 12, 0 };

  final public static IAST RULES = List(
    IInit(ArcCsc, SIZES),
    // ArcCsc(0)=ComplexInfinity
    ISet(ArcCsc(C0),
      CComplexInfinity),
    // ArcCsc(1)=Pi/2
    ISet(ArcCsc(C1),
      CPiHalf),
    // ArcCsc(2/Sqrt(3))=Pi/3
    ISet(ArcCsc(Times(C2,C1DSqrt3)),
      Times(C1D3,Pi)),
    // ArcCsc(Sqrt(2))=Pi/4
    ISet(ArcCsc(CSqrt2),
      Times(C1D4,Pi)),
    // ArcCsc(2)=Pi/6
    ISet(ArcCsc(C2),
      Times(QQ(1L,6L),Pi)),
    // ArcCsc(1+Sqrt(5))=Pi/10
    ISet(ArcCsc(Plus(C1,CSqrt5)),
      Times(QQ(1L,10L),Pi)),
    // ArcCsc(Sqrt(2)+Sqrt(6))=Pi/12
    ISet(ArcCsc(Plus(CSqrt2,CSqrt6)),
      Times(QQ(1L,12L),Pi)),
    // ArcCsc(Infinity)=0
    ISet(ArcCsc(oo),
      C0),
    // ArcCsc(-Infinity)=0
    ISet(ArcCsc(Noo),
      C0),
    // ArcCsc(I*Infinity)=0
    ISet(ArcCsc(DirectedInfinity(CI)),
      C0),
    // ArcCsc(-I*Infinity)=0
    ISet(ArcCsc(DirectedInfinity(CNI)),
      C0),
    // ArcCsc(ComplexInfinity)=0
    ISet(ArcCsc(CComplexInfinity),
      C0)
  );
}
