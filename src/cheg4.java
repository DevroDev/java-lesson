class cheg4
{
	public static void main (String[] args) throws Exception
		
		{
			System.out.println ("Enter Sex");
			char sex =(char)System.in.read();
			switch(sex)
			{
				case 'M':
				case 'm':System.out.println ("Your sex is Male");break;
				case 'F':
				case 'f':System.out.println ("Your sex is Female");break;
				default :
					System.out.println ("Wround Sex");
			}
				
				
				
			
		}
}