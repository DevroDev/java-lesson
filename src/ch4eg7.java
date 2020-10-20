class ch4eg7
{
	public static void main (String[] args) {
		int index=10;
		while(index<=100)
		{
			index+=10;
			if (index%3==0)continue;
			System.out.println ("The index is "+index);
		}
}
}