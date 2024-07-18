import java.util.*;
class Vote
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int age,vote,elg;
		vote=18;
		System.out.println("enter age:");
		age=sc.nextInt();

		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		
		else
		{
			elg=vote-age;
			System.out.println(" eligible after"+elg);
		}
	}
}