import java.util.Scanner;
class ch5eg1
{
	public static void main (String[] args) 
		{
		int[]a=new int[5];
		Scanner scan=new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			System.out.println ("Enter Number");
			a[i]=scan.nextInt();
			
		}
		for (int i=0;i<5;i++)
			System.out.println (a[i]);
			int max=a[0],min=a[0];
			for (int i=1;i<5;i++)
			{
				if(max<a[i]) max=a[i];
				if(min>a[i]) min=a[i];
			}
			System.out.println ("Maximum="+max+"\tMinimum="+min);
			}
		
		
		}
