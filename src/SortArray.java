import java.util.*;
class SortArray
{
	public static void main (String[] args) 
		{
			int [] a={2,4,52,54,64,12,46,34,23,6,9,6,};
			System.out.println ("Before Sorting ");
				for (int i=0;i<=a.length;i++)
				{
					System.out.println (a[i]+" ");
				}
				Arrays.sort(a);
				System.out.println ("After Sorting ");
				for (int i=0;i<=a.length;i++)
				{
					System.out.println (a[i]+" ");
				}
				
			
		}
}