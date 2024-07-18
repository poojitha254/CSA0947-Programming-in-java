class Sumd
{
	public static void main(String arg[])
	{
		int n,r,sum;
		n=1543;
		r=0;
		sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum ofdigits of number:"+sum);
	}
}