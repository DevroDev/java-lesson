public class constMore
{
	public static void main (String args[])
	{
		Box b = new Box (3.0,4.0,2.0);
		System.out.println ("volume is " +b.getvolume());
		
	}
}
 class Box
 {
 	double width, height, depth;
 	public Box (double w, double h, double d)
 	{
 		width = w; height =h; depth =d;
 	}
 	public double getvolume ()
 	{
 		return width*height*depth;
 	}
 }