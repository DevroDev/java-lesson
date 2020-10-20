import java.util.Scanner;
class ch2eg2
{
	public static void main (String[] args) 
		{
		int num1,num2,total,avg;
		Scanner scan=new Scanner (System.in);
		System.out.println ("Enter Number 1");
		num1=scan.nextInt();
		System.out.println ("Enter Number 2");
		num2=scan.nextInt();
		total=num1+num2;
		avg=total/2;
		System.out.println ("Total="+total);
		System.out.println ("Average="+avg);
	}
}