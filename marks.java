//Take marks and print:
class marks
{
    public static void main(String a[])
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter marks:");
        int marks=sc.nextInt();
        if(marks>90 && marks<=100)
            System.out.println("excellent");
        else if(marks>60 && marks<=89)
            System.out.println("good");
        else if(marks>35 && marks<=59)
            System.out.println("pass");
        else
            System.out.println("fail");



    }
}