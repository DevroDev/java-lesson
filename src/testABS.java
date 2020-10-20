public class testABS
{
	public static void main (String[] args) 
		{
			Rectangle r= new Rectangle(5,4);
			Triangle t=new Triangle(4,3);
			System.out.println ("Rectangle area is "+r.getArea());
			System.out.println ("Triangle are is "+t.getArea());
		}
}
abstract class Figure
{
	double idim, jdim;
	Figure (double a, double b)
	{idim = a;jdim = b;}
	abstract double getArea();
}
class Rectangle extends Figure
{
	Rectangle (double a,double b)
	{super(a,b);}
	double getArea()
	{
		return idim*jdim;
	}
}
class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	double getArea()
	{
		return 0.5*idim*jdim;
	}
}