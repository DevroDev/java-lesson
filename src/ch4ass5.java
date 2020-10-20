import java.util.Scanner;
class ch4ass5
{
	public static void main (String[] args) 
		{
			int num;
			Scanner scan=new Scanner (System.in);
			System.out.println ("Enter first Number");
			num=scan.nextInt();
			
			while (num!=0)	
			{
				System.out.println ("square number= "+num*num);
				System.out.println ("Enter a number");
				num=scan.nextInt();
				
			}
		}
}