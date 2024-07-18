import java.util.*;
class Sinterest
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		double p , r, t, amount;
		System.out.println("principal amount:");
		p=sc.nextDouble();
		System.out.println("rate of interest:");
		r=sc.nextDouble();
		System.out.println("years:");
		t=sc.nextDouble();
		amount=(p*r*t)/100;
		System.out.println("amount:"+amount);
	}
} 