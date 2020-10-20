import java.util.Scanner;
class ch3eg1
{
	public static void main (String[] args) 
		{
		Scanner scan=new Scanner (System.in);
		int n;
		System.out.println ("Enter number ");
		n=scan.nextInt();
		if(n<40)
		System.out.println ("Your Mark is Fail!");
		else if(n>=40&&n<80)
		System.out.println ("Your Mark is Pass!");
		else if(n>=80&&n<=100)
		System.out.println ("Your Mark is Distinction");
		else
		System.out.println ("Error!!!!!!");
	}
}
