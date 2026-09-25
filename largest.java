//ternary operator
class largest
{
    public static void main(String a[])
    {
        int x=10;
        int y=25;
        int z=15;
        int largest=(x>y)?((x>z)?x:z):((y>z)?y:z);
        System.out.println(largest);
    }
}