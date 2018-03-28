package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface LaplaceTransformRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 13 };

  final public static IAST RULES = List(
    IInit(LaplaceTransform, SIZES),
    // LaplaceTransform(a_*t_^n_.,t_,s_):=(-1)^n*D(LaplaceTransform(a,t,s),{s,n})/;FreeQ(n,t)&&n>0
    ISetDelayed(LaplaceTransform(Times(a_,Power(t_,n_DEFAULT)),t_,s_),
      Condition(Times(Power(CN1,n),D(LaplaceTransform(a,t,s),List(s,n))),And(FreeQ(n,t),Greater(n,C0)))),
    // LaplaceTransform(a_.*E^(b_.+c_.*t_),t_,s_):=LaplaceTransform(a*E^b,t,-c+s)/;FreeQ({b,c},t)
    ISetDelayed(LaplaceTransform(Times(Exp(Plus(b_DEFAULT,Times(c_DEFAULT,t_))),a_DEFAULT),t_,s_),
      Condition(LaplaceTransform(Times(a,Exp(b)),t,Plus(Negate(c),s)),FreeQ(List(b,c),t))),
    // LaplaceTransform(Sqrt(t_),t_,s_):=Sqrt(Pi)/(2*s^(3/2))
    ISetDelayed(LaplaceTransform(Sqrt(t_),t_,s_),
      Times(Sqrt(Pi),Power(Times(C2,Power(s,QQ(3L,2L))),-1))),
    // LaplaceTransform(Sin(t_),t_,s_):=1/(s^2+1)
    ISetDelayed(LaplaceTransform(Sin(t_),t_,s_),
      Power(Plus(Sqr(s),C1),-1)),
    // LaplaceTransform(Cos(t_),t_,s_):=s/(s^2+1)
    ISetDelayed(LaplaceTransform(Cos(t_),t_,s_),
      Times(Power(Plus(Sqr(s),C1),-1),s)),
    // LaplaceTransform(Sinh(t_),t_,s_):=c/(-1+s^2)
    ISetDelayed(LaplaceTransform(Sinh(t_),t_,s_),
      Times(c,Power(Plus(CN1,Sqr(s)),-1))),
    // LaplaceTransform(Cosh(t_),t_,s_):=s/(-1+s^2)
    ISetDelayed(LaplaceTransform(Cosh(t_),t_,s_),
      Times(s,Power(Plus(CN1,Sqr(s)),-1))),
    // LaplaceTransform(E^t_,t_,s_):=1/(-1+s)
    ISetDelayed(LaplaceTransform(Exp(t_),t_,s_),
      Power(Plus(CN1,s),-1)),
    // LaplaceTransform(Log(t_),t_,s_):=-(EulerGamma+Log(s))/s
    ISetDelayed(LaplaceTransform(Log(t_),t_,s_),
      Times(CN1,Power(s,-1),Plus(EulerGamma,Log(s)))),
    // LaplaceTransform(Log(t_)^2,t_,s_):=(6*EulerGamma^2+Pi^2+6*Log(s)*(2*EulerGamma+Log(s)))/(6*s)
    ISetDelayed(LaplaceTransform(Sqr(Log(t_)),t_,s_),
      Times(Power(Times(C6,s),-1),Plus(Times(C6,Sqr(EulerGamma)),Sqr(Pi),Times(C6,Log(s),Plus(Times(C2,EulerGamma),Log(s)))))),
    // LaplaceTransform(Erf(t_),t_,s_):=E^(s^2/4)*Erfc(s/2)/s
    ISetDelayed(LaplaceTransform(Erf(t_),t_,s_),
      Times(Exp(Times(C1D4,Sqr(s))),Power(s,-1),Erfc(Times(C1D2,s)))),
    // LaplaceTransform(Erf(Sqrt(t_)),t_,s_):=1/(Sqrt(s+1)*s)
    ISetDelayed(LaplaceTransform(Erf(Sqrt(t_)),t_,s_),
      Power(Times(Sqrt(Plus(s,C1)),s),-1)),
    // LaplaceTransform(Derivative(1)[f_][t_],t_,s_):=-f(0)+s*LaplaceTransform(f(t),t,s)/;FreeQ(f,t)
    ISetDelayed(LaplaceTransform($($(Derivative(C1),f_),t_),t_,s_),
      Condition(Plus(Negate($(f,C0)),Times(s,LaplaceTransform($(f,t),t,s))),FreeQ(f,t))),
    // LaplaceTransform(Derivative(2)[f_][t_],t_,s_):=-s*f(0)+s^2*LaplaceTransform(f(t),t,s)-f'(0)/;FreeQ(f,t)
    ISetDelayed(LaplaceTransform($($(Derivative(C2),f_),t_),t_,s_),
      Condition(Plus(Times(CN1,s,$(f,C0)),Times(Sqr(s),LaplaceTransform($(f,t),t,s)),Negate($($(Derivative(C1),f),C0))),FreeQ(f,t)))
  );
}
