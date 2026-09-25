class leapyear
{
    public static void main(String a[])
    {
        int year=2026;
        String result=(year%400==0 || year%4==0 && year%100!=0)?"leap year":"not a leap year";
        System.out.println(result);

    }
}