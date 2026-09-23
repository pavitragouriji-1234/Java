//Take a person's age and check whether they are eligible to vote (18 or above).
class ifelse1
{
    public static void main(String a[])
    {
        java.util.Scanner sc = new java.util. Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible");
        }
    }
}