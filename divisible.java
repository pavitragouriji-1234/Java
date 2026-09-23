class divisible
{
    public static void main(String a[])
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        if(num%5==0)
            System.out.println("it is divisible by 5");
        else
            System.out.println("it is not divisible by 5");
    }
}