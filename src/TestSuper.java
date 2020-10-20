class TestSuper
{
	protected int SuperValue;
	public TestSuper (int p)
	{
		SuperValue = p;
	}
	public int getSuperValue()
		{
			return SuperValue;
		}
}
class SubClass extends TestSuper
{
	protected int SubValue;
	public SubClass (int subV,int p)
	{
		super (p);
		SubValue =subV;
	}
	public int getSubValue()
		{
			return SubValue;
		}
}
public class SuperClass
{
	public static void main (String[] args) 
		{
			SubClass ref=new SubClass(4,3);
			System.out.println ("Super Value is:" +ref.getSuperValue());
			System.out.println ("Sub Value is:" +ref.getSubValue());
		}
}