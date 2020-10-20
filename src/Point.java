import java.awt.*;
import java.io.*;
public class Point
{
	private double x,y;
	public Point(double a,double b)
	{x=a;y=b;}
	public Point(Point p)
	{
		x=p.x;
		y=p.y;
	}
	public double x()
	{
		return x;
	}
	public double y()
	{
		return y;
	}
	public boolean equals(Point p)
	{
		return (x==p.x&&y=p.y);
	}
	public String toString()
	{
		return new String("("+x +",+y+")");
	}
	public static void main (String[] args) 
		{
			point p=new Point(2,3)
				System.out.println ("p= "+p);
				Point q=new Point(p);
				System.out.println ("q= "+q);
				if(q.equal(p))
					System.out.println ("q equal p");
					else 
						System.out.println ("q does not equal p");
		}
}