import java.util.*;
class Even
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}