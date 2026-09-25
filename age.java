//Take a person's age and print:
class age
{
    public static void main(String a[])
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        if(age<13)
            System.out.println("child");
        else if(age>13 && age<=19)
            System.out.println("teenager");
        else if(age>20 && age<=59)
            System.out.println("adult");
        else if(age>60)
            System.out.println("senior citizen");

    }
}