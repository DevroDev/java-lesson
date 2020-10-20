public class testconstr
{
	private String name;
	private int age;
	public testconstr (String str, int a)
	{
		name =str;
		age = a;
	}
	public testconstr()
	{
		name="Susan";
		age=18;
	}
	public String getName ()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public static void main (String[] args) 
		{
			testconstr tc=new testconstr("John",45);
			System.out.println ("Name is" +tc.getName());
			System.out.println ("Age is" +tc.getAge());
			testconstr ts=new testconstr();
			System.out.println ("Name is" + ts.getName());
			System.out.println ("Age is " + ts.getAge());
		}
}