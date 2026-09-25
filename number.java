
class number
{
    public static void main(String a[])
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        if(num==0)
            System.out.println("zero");
        else if(num>0 && num%2==0)
            System.out.println("positive even");
        else if(num>=0 && num%2!=0)
            System.out.println("positive odd");
        else if(num<0 && num%2==0)
            System.out.println("negetive even");
        else if(num<0 && num%2!=0)
            System.out.println("negetive odd");
        else 
            System.out.println("it is just a number");
    }
}