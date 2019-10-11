package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules140 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(3501,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(d),Power(Times(d,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(b,f,Subtract(Plus(m,n),C1)),CN1)),x),Dist(Times(Sqr(d),Subtract(m,C2),Power(Times(a,Subtract(Plus(m,n),C1)),CN1)),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,d,e,f),x),EqQ(Plus(Sqr(a),Sqr(b)),C0),LtQ(n,C0),GtQ(m,C1),Not(ILtQ(Plus(m,n),C0)),NeQ(Subtract(Plus(m,n),C1),C0),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(3502,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(a,Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),n),Power(Times(b,f,Plus(m,Times(C2,n))),CN1)),x),Dist(Times(Simplify(Plus(m,n)),Power(Times(a,Plus(m,Times(C2,n))),CN1)),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,d,e,f,m),x),EqQ(Plus(Sqr(a),Sqr(b)),C0),LtQ(n,C0),NeQ(Plus(m,Times(C2,n)),C0),IntegersQ(Times(C2,m),Times(C2,n)))));
IIntegrate(3503,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Power(Times(f,Simplify(Subtract(Plus(m,n),C1))),CN1)),x),Dist(Times(a,Subtract(Plus(m,Times(C2,n)),C2),Power(Simplify(Subtract(Plus(m,n),C1)),CN1)),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(n,C1))),x),x)),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Plus(Sqr(a),Sqr(b)),C0),IGtQ(Simplify(Subtract(Plus(m,n),C1)),C0),RationalQ(n))));
IIntegrate(3504,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(a,Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),n),Power(Times(b,f,Plus(m,Times(C2,n))),CN1)),x),Dist(Times(Simplify(Plus(m,n)),Power(Times(a,Plus(m,Times(C2,n))),CN1)),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Plus(Sqr(a),Sqr(b)),C0),ILtQ(Simplify(Plus(m,n)),C0),NeQ(Plus(m,Times(C2,n)),C0))));
IIntegrate(3505,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Power(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Times(C1D2,m)),Power(Subtract(a,Times(b,Tan(Plus(e,Times(f,x))))),Times(C1D2,m))),CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(Times(C1D2,m),n)),Power(Subtract(a,Times(b,Tan(Plus(e,Times(f,x))))),Times(C1D2,m))),x),x),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3506,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Power(Times(b,f),CN1),Subst(Int(Times(Power(Plus(a,x),n),Power(Plus(C1,Times(Sqr(x),Power(b,CN2))),Subtract(Times(C1D2,m),C1))),x),x,Times(b,Tan(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,n),x),NeQ(Plus(Sqr(a),Sqr(b)),C0),IntegerQ(Times(C1D2,m)))));
IIntegrate(3507,Int(Times(Power($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),CN1),Sqr(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(b),ArcTanh(Sin(Plus(e,Times(f,x)))),Power(f,CN1)),x),Negate(Simp(Times(C2,a,b,Cos(Plus(e,Times(f,x))),Power(f,CN1)),x)),Simp(Times(Subtract(Sqr(a),Sqr(b)),Sin(Plus(e,Times(f,x))),Power(f,CN1)),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3508,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Sqr(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Power(Plus(m,C1),CN1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Plus(Times(Sqr(a),Plus(m,C1)),Negate(Sqr(b)),Times(a,b,Plus(m,C2),Tan(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,d,e,f,m),x),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(m,CN1))));
IIntegrate(3509,Int(Times($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Negate(Dist(Power(f,CN1),Subst(Int(Power(Subtract(Plus(Sqr(a),Sqr(b)),Sqr(x)),CN1),x),x,Times(Subtract(b,Times(a,Tan(Plus(e,Times(f,x))))),Power(Sec(Plus(e,Times(f,x))),CN1))),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3510,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(Sqr(d),Power(b,CN2)),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Subtract(a,Times(b,Tan(Plus(e,Times(f,x)))))),x),x)),Dist(Times(Sqr(d),Plus(Sqr(a),Sqr(b)),Power(b,CN2)),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Subtract(m,C2)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Sqr(b)),C0),IGtQ(m,C1))));
IIntegrate(3511,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Dist(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),Subtract(a,Times(b,Tan(Plus(e,Times(f,x)))))),x),x),Dist(Times(Sqr(b),Power(Times(Sqr(d),Plus(Sqr(a),Sqr(b))),CN1)),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Sqr(b)),C0),ILtQ(m,C0))));
IIntegrate(3512,Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(d,Times(C2,IntPart(Times(C1D2,m)))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,m)))),Power(Times(b,f,Power(Sqr(Sec(Plus(e,Times(f,x)))),FracPart(Times(C1D2,m)))),CN1)),Subst(Int(Times(Power(Plus(a,x),n),Power(Plus(C1,Times(Sqr(x),Power(b,CN2))),Subtract(Times(C1D2,m),C1))),x),x,Times(b,Tan(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,d,e,f,m,n),x),NeQ(Plus(Sqr(a),Sqr(b)),C0),Not(IntegerQ(Times(C1D2,m))))));
IIntegrate(3513,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Times(CN4,b,Power(f,CN1)),Subst(Int(Times(Sqr(x),Power(Plus(Times(Sqr(a),Sqr(d)),Power(x,C4)),CN1)),x),x,Times(Sqrt(Times(d,Cos(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))))),x),And(FreeQ(List(a,b,d,e,f),x),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3514,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),QQ(-3L,2L)),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Power(Times(d,Cos(Plus(e,Times(f,x))),Sqrt(Subtract(a,Times(b,Tan(Plus(e,Times(f,x)))))),Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))))),CN1),Int(Times(Sqrt(Subtract(a,Times(b,Tan(Plus(e,Times(f,x)))))),Power(Times(d,Cos(Plus(e,Times(f,x)))),CN1D2)),x),x),And(FreeQ(List(a,b,d,e,f),x),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3515,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),m)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),n),Power(Power(Times(d,Sec(Plus(e,Times(f,x)))),m),CN1)),x),x),And(FreeQ(List(a,b,d,e,f,m,n),x),Not(IntegerQ(m)))));
IIntegrate(3516,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(b,Power(f,CN1)),Subst(Int(Times(Power(x,m),Power(Plus(a,x),n),Power(Power(Plus(Sqr(b),Sqr(x)),Plus(Times(C1D2,m),C1)),CN1)),x),x,Times(b,Tan(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,e,f,n),x),IntegerQ(Times(C1D2,m)))));
IIntegrate(3517,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(Expand(Times(Power(Sin(Plus(e,Times(f,x))),m),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),n)),x),x),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,Subtract(m,C1))),IGtQ(n,C0))));
IIntegrate(3518,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Sin(Plus(e,Times(f,x))),m),Power(Plus(Times(a,Cos(Plus(e,Times(f,x)))),Times(b,Sin(Plus(e,Times(f,x))))),n),Power(Power(Cos(Plus(e,Times(f,x))),n),CN1)),x),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,Subtract(m,C1))),ILtQ(n,C0),Or(And(LtQ(m,C5),GtQ(n,CN4)),And(EqQ(m,C5),EqQ(n,CN1))))));
IIntegrate(3519,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sin(Plus(e,Times(f,x))),Power(d,CN1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),n),Power(Power(Times(Sin(Plus(e,Times(f,x))),Power(d,CN1)),m),CN1)),x),x),And(FreeQ(List(a,b,d,e,f,m,n),x),Not(IntegerQ(m)))));
IIntegrate(3520,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Cos(Plus(e,Times(f,x))),Subtract(m,n)),Power(Sin(Plus(e,Times(f,x))),p),Power(Plus(Times(a,Cos(Plus(e,Times(f,x)))),Times(b,Sin(Plus(e,Times(f,x))))),n)),x),And(FreeQ(List(a,b,e,f,m,p),x),IntegerQ(n))));
IIntegrate(3521,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT),Power(Plus(Times($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Sin(Plus(e,Times(f,x))),Subtract(m,n)),Power(Cos(Plus(e,Times(f,x))),p),Power(Plus(Times(a,Sin(Plus(e,Times(f,x)))),Times(b,Cos(Plus(e,Times(f,x))))),n)),x),And(FreeQ(List(a,b,e,f,m,p),x),IntegerQ(n))));
IIntegrate(3522,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(a,m),Power(c,m)),Int(Times(Power(Sec(Plus(e,Times(f,x))),Times(C2,m)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,m))),x),x),And(FreeQ(List(a,b,c,d,e,f,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),IntegerQ(m),Not(And(IGtQ(n,C0),Or(LtQ(m,C0),GtQ(m,n)))))));
IIntegrate(3523,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(a,c,Power(f,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),Subtract(m,C1)),Power(Plus(c,Times(d,x)),Subtract(n,C1))),x),x,Tan(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0))));
IIntegrate(3524,Int(Times(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Plus(c_,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(a,c),Times(b,d)),x),x),Simp(Times(b,d,Tan(Plus(e,Times(f,x))),Power(f,CN1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Times(b,c),Times(a,d)),C0))));
IIntegrate(3525,Int(Times(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(a,c),Times(b,d)),x),x),Dist(Plus(Times(b,c),Times(a,d)),Int(Tan(Plus(e,Times(f,x))),x),x),Simp(Times(b,d,Tan(Plus(e,Times(f,x))),Power(f,CN1)),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Times(b,c),Times(a,d)),C0))));
  }
}
}