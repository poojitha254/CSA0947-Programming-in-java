import java.util.Scanner;
class JavaApplication48 {

  
    public static int revnum(int num)
    {
        int rev=0;
        while(num>0)
        {
            int i=num%10;
            rev=rev*10+i;
            num/=10;
        }
        return rev;
    }
    public static boolean check(int num)
    {
        int rev=revnum(num);
        if (rev==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void add(int num)
    {
        if(check(num))
        {
            System.out.println("Palindrome");
        }
        else
        {
            while(!check(num))
            {
                int rev=revnum(num);
                int sum=num+rev;
                System.out.println(num+"+"+rev+"="+sum);
                num=sum;
            }
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        add(n);
      
    }
    
}