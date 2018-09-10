{
Tan(0)=0,
Tan(1/12*Pi)=2-Sqrt(3),
Tan(1/10*Pi)=Sqrt(1-2/Sqrt(5)),
Tan(1/8*Pi)=-1+Sqrt(2),
Tan(1/6*Pi)=1/Sqrt(3),
Tan(1/5*Pi)=Sqrt(5-2*Sqrt(5)),
Tan(1/4*Pi)=1,
Tan(3/10*Pi)=Sqrt(1+2/Sqrt(5)),
Tan(1/3*Pi)=Sqrt(3),
Tan(3/8*Pi)=1+Sqrt(2),
Tan(2/5*Pi)=Sqrt(5+2*Sqrt(5)),
Tan(5/12*Pi)=2+Sqrt(3),
Tan(1/2*Pi)=ComplexInfinity,
Tan(7/12*Pi)=-2-Sqrt(3),
Tan(3/5*Pi)=-Sqrt(5+2*Sqrt(5)),
Tan(5/8*Pi)=-1-Sqrt(2),
Tan(2/3*Pi)=-Sqrt(3),
Tan(7/10*Pi)=-Sqrt(1+2/Sqrt(5)),
Tan(3/4*Pi)=-1,
Tan(4/5*Pi)=-Sqrt(5-2*Sqrt(5)),
Tan(5/6*Pi)=-1/Sqrt(3),
Tan(7/8*Pi)=1-Sqrt(2),
Tan(9/10*Pi)=-Sqrt(1-2/Sqrt(5)),
Tan(11/12*Pi)=-2+Sqrt(3),
Tan(Pi)=0,

Tan(I)=I*Tanh(1),

Tan(Pi*x_NumberQ):=If(x<1,(-1)*Tan((1-x)*Pi),If(x<2,Tan((x-1)*Pi),Tan((x-2*Quotient(IntegerPart(x),2))*Pi)))/;x>1/2,

Tan(ArcSin(x_)):=x*(1-x^2)^(-1/2),
Tan(ArcCos(x_)):=(1-x^2)^(1/2)/x,
Tan(ArcTan(x_)):=x,
Tan(ArcCot(x_)):=1/x,
Tan(ArcCsc(x_)):=(1-x^(-2))^(-1/2)*x^(-1),
Tan(ArcSec(x_)):=(1-x^(-2))^(1/2)*x,
	 
Tan(I*Infinity)=I,
Tan(-I*Infinity)=-I,
Tan(ComplexInfinity)=Indeterminate
}