import java.util.Arrays;
class sort
{
	public static void main (String[] args) 
		{
			int[]a={9,5,7,3,8,2,1,6,4,0};
			System.out.println ("\tBefore Sorting ");
			for (int i=0;i<a.length;i++)
			{
				System.out.println (a[i]+" ");
			}
			Arrays.sort(a);
			System.out.println ("\t\nAfter Sorting");
			for (int i=0;i<a.length;i++)
			{
				System.out.println (a[i]+" ");
			}
		}
}