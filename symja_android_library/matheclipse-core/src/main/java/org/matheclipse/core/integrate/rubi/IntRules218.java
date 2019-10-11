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
public class IntRules218 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(5451,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Sech(Plus(a,Times(b,x))),n),Power(Times(b,n),CN1)),x)),Dist(Times(d,m,Power(Times(b,n),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Sech(Plus(a,Times(b,x))),n)),x),x)),And(FreeQ(List(a,b,c,d,n),x),EqQ(p,C1),GtQ(m,C0))));
IIntegrate(5452,Int(Times(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Csch(Plus(a,Times(b,x))),n),Power(Times(b,n),CN1)),x)),Dist(Times(d,m,Power(Times(b,n),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Csch(Plus(a,Times(b,x))),n)),x),x)),And(FreeQ(List(a,b,c,d,n),x),EqQ(p,C1),GtQ(m,C0))));
IIntegrate(5453,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Tanh(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),CN1)),x),Dist(Times(d,m,Power(Times(b,Plus(n,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Tanh(Plus(a,Times(b,x))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5454,Int(Times(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Sqr(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Coth(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),CN1)),x)),Dist(Times(d,m,Power(Times(b,Plus(n,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Coth(Plus(a,Times(b,x))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5455,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Subtract(Int(Times(Power(Plus(c,Times(d,x)),m),Sech(Plus(a,Times(b,x))),Power(Tanh(Plus(a,Times(b,x))),Subtract(p,C2))),x),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sech(Plus(a,Times(b,x))),C3),Power(Tanh(Plus(a,Times(b,x))),Subtract(p,C2))),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(Times(C1D2,p),C0))));
IIntegrate(5456,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Subtract(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sech(Plus(a,Times(b,x))),n),Power(Tanh(Plus(a,Times(b,x))),Subtract(p,C2))),x),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sech(Plus(a,Times(b,x))),Plus(n,C2)),Power(Tanh(Plus(a,Times(b,x))),Subtract(p,C2))),x)),And(FreeQ(List(a,b,c,d,m,n),x),IGtQ(Times(C1D2,p),C0))));
IIntegrate(5457,Int(Times(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_),Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Power(Plus(c,Times(d,x)),m),Csch(Plus(a,Times(b,x))),Power(Coth(Plus(a,Times(b,x))),Subtract(p,C2))),x),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csch(Plus(a,Times(b,x))),C3),Power(Coth(Plus(a,Times(b,x))),Subtract(p,C2))),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(Times(C1D2,p),C0))));
IIntegrate(5458,Int(Times(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_),Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csch(Plus(a,Times(b,x))),n),Power(Coth(Plus(a,Times(b,x))),Subtract(p,C2))),x),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csch(Plus(a,Times(b,x))),Plus(n,C2)),Power(Coth(Plus(a,Times(b,x))),Subtract(p,C2))),x)),And(FreeQ(List(a,b,c,d,m,n),x),IGtQ(Times(C1D2,p),C0))));
IIntegrate(5459,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Sech(Plus(a,Times(b,x))),n),Power(Tanh(Plus(a,Times(b,x))),p)),x))),Subtract(Dist(Power(Plus(c,Times(d,x)),m),u,x),Dist(Times(d,m),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),u),x),x))),And(FreeQ(List(a,b,c,d,n,p),x),IGtQ(m,C0),Or(IntegerQ(Times(C1D2,n)),IntegerQ(Times(C1D2,Subtract(p,C1)))))));
IIntegrate(5460,Int(Times(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Csch(Plus(a,Times(b,x))),n),Power(Coth(Plus(a,Times(b,x))),p)),x))),Subtract(Dist(Power(Plus(c,Times(d,x)),m),u,x),Dist(Times(d,m),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),u),x),x))),And(FreeQ(List(a,b,c,d,n,p),x),IGtQ(m,C0),Or(IntegerQ(Times(C1D2,n)),IntegerQ(Times(C1D2,Subtract(p,C1)))))));
IIntegrate(5461,Int(Times(Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(C2,n),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csch(Plus(Times(C2,a),Times(C2,b,x))),n)),x),x),And(FreeQ(List(a,b,c,d),x),RationalQ(m),IntegerQ(n))));
IIntegrate(5462,Int(Times(Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Csch(Plus(a,Times(b,x))),n),Power(Sech(Plus(a,Times(b,x))),p)),x))),Subtract(Dist(Power(Plus(c,Times(d,x)),m),u,x),Dist(Times(d,m),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),u),x),x))),And(FreeQ(List(a,b,c,d),x),IntegersQ(n,p),GtQ(m,C0),NeQ(n,p))));
IIntegrate(5463,Int(Times(Power(u_,m_DEFAULT),Power($(F_,v_),n_DEFAULT),Power($(G_,w_),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(F(ExpandToSum(v,x)),n),Power(G(ExpandToSum(v,x)),p)),x),And(FreeQ(List(m,n,p),x),HyperbolicQ(FSymbol),HyperbolicQ(GSymbol),EqQ(v,w),LinearQ(List(u,v,w),x),Not(LinearMatchQ(List(u,v,w),x)))));
IIntegrate(5464,Int(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),x),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Power(Plus(a,Times(b,Sinh(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5465,Int(Times(Power(Plus(Times(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),x),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Power(Plus(a,Times(b,Cosh(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5466,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sqr(Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(Plus(a_,Times(b_DEFAULT,Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),x),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5467,Int(Times(Sqr(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(Plus(Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Coth(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),x)),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Power(Plus(a,Times(b,Coth(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5468,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT),Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Sech(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),x)),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Power(Plus(a,Times(b,Sech(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5469,Int(Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,Csch(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),x)),Dist(Times(f,m,Power(Times(b,d,Plus(n,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Power(Plus(a,Times(b,Csch(Plus(c,Times(d,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5470,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Sinh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(e,Times(f,x)),m),Times(Power(Sinh(Plus(a,Times(b,x))),p),Power(Sinh(Plus(c,Times(d,x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IGtQ(q,C0),IntegerQ(m))));
IIntegrate(5471,Int(Times(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(e,Times(f,x)),m),Times(Power(Cosh(Plus(a,Times(b,x))),p),Power(Cosh(Plus(c,Times(d,x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),IGtQ(q,C0),IntegerQ(m))));
IIntegrate(5472,Int(Times(Power(Cosh(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(e,Times(f,x)),m),Times(Power(Sinh(Plus(a,Times(b,x))),p),Power(Cosh(Plus(c,Times(d,x))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IGtQ(q,C0))));
IIntegrate(5473,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigExpand(Times(Power(Plus(e,Times(f,x)),m),Power(G(Plus(c,Times(d,x))),q)),FSymbol,Plus(c,Times(d,x)),p,Times(b,Power(d,CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),MemberQ(List(Sinh,Cosh),FSymbol),MemberQ(List(Sech,Csch),GSymbol),IGtQ(p,C0),IGtQ(q,C0),EqQ(Subtract(Times(b,c),Times(a,d)),C0),IGtQ(Times(b,Power(d,CN1)),C1))));
IIntegrate(5474,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Sinh(Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(d,Times(e,x))),Power(Subtract(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),CN1)),x)),Simp(Times(e,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(d,Times(e,x))),Power(Subtract(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),CN1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Subtract(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0))));
IIntegrate(5475,Int(Times(Cosh(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,c,Log(FSymbol),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Cosh(Plus(d,Times(e,x))),Power(Subtract(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),CN1)),x)),Simp(Times(e,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Sinh(Plus(d,Times(e,x))),Power(Subtract(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),CN1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Subtract(Sqr(e),Times(Sqr(b),Sqr(c),Sqr(Log(FSymbol)))),C0))));
  }
}
}