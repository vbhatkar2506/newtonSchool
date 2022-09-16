import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
System.out.println("Enter any integer number");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
scan.close();
P:
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i+" is Even number");
continue P;
}
Q:
for(int j=0;j<=n;j++)
{
System.out.println(i+" is Odd number");
break Q;
}
}
}
}