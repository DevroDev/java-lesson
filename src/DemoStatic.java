public class DemoStatic
{
	public static void main(String[] args)
	{
		String str=AnotherClass.getData();
		System.out.println (str);
	}
}
class AnotherClass
{
	public static String getData()
	{
		return "Hello!";
	}
}