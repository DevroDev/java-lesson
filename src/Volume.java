class Volume
{
	public static void main (String[] args) 
		{
			Box b=new Box(3.0,4.0,5.0);
			System.out.println ("Volume is "+b.getvolume());
		}
}
class Box
{
	double height,width,depth;
	public Box (double h,double w,double d)
	{height=h;width=w;depth=d;
	}
	public double getvolume()
	{
		return width*height*depth;
	}
}