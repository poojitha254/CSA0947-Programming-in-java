class Prime
{
	public static void main(String arg[])
	{
		int n, i, count;
		n=57;
		count=0;
		for(i=2;i<n; i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
}
		

		