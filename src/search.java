import java.util.Scanner;
class search
{
	public static void main (String[] args) 
		{
			Scanner scan=new Scanner (System.in);
				String [] name=new String[20];
				for (int i=0;i<name.length;i++)
				{
					System.out.println ("Enter a word");
					name=scan.nextLine();
					
				}
				String search;boolean found=false;
				System.out.println ("Enter a word for search");
				search=scan.nextLine();
				for(int i=0;i<name.length;i++)
				{
					if(search==name[i])
					{
						found=true;
						System.out.println (search+" found at "+i);
					}
				}
				if(!found)
					System.out.println ("word is not found");
		}
}