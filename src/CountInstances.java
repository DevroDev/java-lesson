public class CountInstances
{
	private static int numInstance=0;
	protected static int getNuminstance()
	{
		return numInstance;
	}
	private static void addInstance()
	{
		numInstance++;
	}
	CountInstances()
	{
		CountInstances.addInstance();
	}
	public static void main (String[] args) 
		{
			System.out.println ("Starting with"+CountInstances.getNuminstance()+" instances");
			for(int i=0;i<10;++i)
				new CountInstances();
				System.out.println ("Created"+CountInstances.getNuminstance()+"instances");
		}
}