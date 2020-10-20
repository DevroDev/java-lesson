class ch4eg8
{
	public static void main (String[] args) {
		int totalCount=0;
		CounterLoop:
			while(totalCount<100)
			{
				for (int c=1;c<=100;c++)
				{
					totalCount+=c;
					if (totalCount>20) break CounterLoop;
				}
			}
			System.out.println ("Total Count="+totalCount);
}
}