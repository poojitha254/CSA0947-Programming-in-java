class Perfect
{
	public static void main(String arg[])
	{
		int n,i,sum;
		n=6;
		sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println(n+" is perfect number");
		}
		else
		{
			System.out.println(n+"not a perfect number");
		}
	
	}
}