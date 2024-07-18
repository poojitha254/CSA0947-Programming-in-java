import java.util.*;
class Pattern2
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n= sc.nextInt();
		System.out.println("enter a symbol:");
		char c= sc.next().charAt(0);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
			}	
			System.out.println();
		}
	}
}
