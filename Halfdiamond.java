class Halfdiamond
{
    public static void main(String arg[])
    {
        int x=1,n=3,j,i;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}