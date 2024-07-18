import java.util.*;
class Lcm
{
	public static void main(String arg[])
	{
		int n1,n2,x,y,temp,gcd,lcm;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		n1=sc.nextInt();
		System.out.println("enter second number:");
		n2=sc.nextInt();
		x=n1;
		y=n2;
		while(n2!=0)
		{
			temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		gcd=n1;
		lcm=(x*y)/gcd;
		System.out.println("gcd of two numbers:"+gcd);
		System.out.println("lcm of two numbers:"+lcm);
	}
}