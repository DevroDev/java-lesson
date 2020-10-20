class ch3eg5
{
	public static void main (String[] args) 
		{
			int  n=(int)Math.round(100*Math.random());
			System.out.println ("n="+n);
			switch((int )n/20)
			{
				case 0:System.out.println (n+" <20");break;
				case 1:System.out.println (n+"<40");break;
				case 2:System.out.println (n+"<60");break;
				case 3:System.out.println (n+"<80");break;
				default:System.out.println (n+ ">80");break;
			}
			System.out.println (n+(n%2==0?"is Even":"is Odd"));
}
}