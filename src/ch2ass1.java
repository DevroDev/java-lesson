import java.util.Scanner;
class ch2ass1
{
	public static void main (String[] args) 
		{
			String sex,name;
			int mark;
			Scanner scan=new Scanner(System.in);
			System.out.println ("Enter Student name");
			name=scan.nextLine();
			System.out.println ("Enter Student sex");
			sex=scan.nextLine();
			System.out.println ("Enter Mark");
			mark=scan.nextInt();
			System.out.println ("Name="+name);
			System.out.println ("Sex="+sex);
			System.out.println ("Mark="+mark);
			
		}
}