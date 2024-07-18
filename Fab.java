class Fab
{
	public static void main(String arg[])
	{
		int n1,n2,n,i;
		n1=0;
		n2=1;
		n=0;
		System.out.println("fabonacci series:");
		for(i=1;i<=5;i++)
		{
			n=n1+n2;
			System.out.println(n);
			n1=n2;
			n2=n;
		}
	}
}