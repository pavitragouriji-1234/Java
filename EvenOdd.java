class EvenOdd
{
    public static void main(String a[])
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        if (num%2==0)
        {
            System.out.println("even number");
        }
        else if (num%2!=0)
        {
            System.out.println("odd number");
        }
        else
        {
            System.out.println("its just number");
        }
    }
}