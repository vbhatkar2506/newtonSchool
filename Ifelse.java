import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        int x=0,y=1;
        System.out.println("Enter any integer number");
        Scanner scan=new Scanner(System.in);
        long n=scan.nextInt();
        scan.close();
        if(n%2==0)
        System.out.println(x);
        else
        System.out.println(y);
}
}