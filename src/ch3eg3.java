import java.util.Scanner;
class ch3eg3
{
	public static void main (String[] args) 
		{
			Scanner scan=new Scanner (System.in);
			int a,b,c;
			System.out.println ("Enter three numbers");
			a=scan.nextInt(); b=scan.nextInt(); c=scan.nextInt();
			if (a>b&&a>c)
			System.out.println ("Max no="+a);
			else if (b>a&&b>c)
			System.out.println ("Max no="+b);
			else 
			System.out.println ("Max no="+c);
			
		}
}