import java.util.Scanner;
public class RemoveDuplicates {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
	System.out.print("enter no of elements:");
        int n1=input.nextInt();
        int[] a1=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a1[i]=input.nextInt();
        }
        System.out.print("enter no of elements:");
        int n2=input.nextInt();
        int[] a2=new int[n2];
        for(int i=0;i<n2;i++)
        {
            a2[i]=input.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(a1[i]==a2[j])
                {
                    System.out.print(a1[i]+" ");
                    break;
                }
            }
        }
    }
    
}