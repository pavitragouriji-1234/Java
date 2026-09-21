class PositiveNegetive
{
    public static void main(String a[])
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();
    
        if (num>0)
        {
            System.out.println("positive");
        }
        else if (num<0)
        {
            System.out.println("negetive");
        }
        else
        {
            System.out.println("neigther positive nor negetive");
        }
    }
}