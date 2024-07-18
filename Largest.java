import java.util.Arrays;
import java.util.*;
class Largest
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of the array:");
		int size= sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements in the array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("enter the position of the largest:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+"th largest is"+a[size-n]);
		}
		else
		{
			System.out.println("enter valid input:");
		}
	}
}