import java.util.Scanner;
class ch5eg2
{
	public static void main (String[] args) 
		{
			int[] a=new int[5];
			Scanner scan=new Scanner(System.in);
			for (int i=0;i<a.length;i++)
			{
				System.out.println ("Enter Number");
				a[i]=scan.nextInt();
				
			}
			int search; boolean found=false;
			System.out.println ("Enter number for search");
			search=scan.nextInt();
			for(int i=0;i<a.length;i++)
			{ 
				if(search==a[i])
				{
					found=true;
					System.out.println (search+" found at " +i);
				}
			}
			if(!found)
				System.out.println ("Search is not found");
		
		}
}