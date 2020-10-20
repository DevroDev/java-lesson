public class testFinal
{
	public static void main (String[] args) 
		{
			superClass s=new superClass();
			System.out.println ("Message is "+ s.getMessage());
			subClass t =new subClass();
			System.out.println ("message is "+t.getMessage());
			
		}
}
class superClass 
{
	public final String getMessage()
	{
		return "SuperMessage";
	}
	
}
class subClass extends superClass
{
	/*public String getMessage ()error: getMessage() can't be overridden
	 {return "Sub Message";}
	 */
	 
}