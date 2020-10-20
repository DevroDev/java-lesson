class continue
{
	public static void main (String[] args) 
		{
			int i=10;
			while (i<=100)
			{
				i=i+=10;
				if (i<=50)continue;
				System.out.println ("Value of i="+i);
				
			}
		}
}