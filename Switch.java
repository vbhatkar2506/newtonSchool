import java.util.Scanner;
class Switch
{
    public static void main(String[] args)
    {
int day;
System.out.println("Enter any integer number");
Scanner scan=new Scanner(System.in);
day=scan.nextInt();
scan.close();

switch (day)
{
    case 1:
    System.out.println("One");
    break;
    case 2:
    System.out.println("two");
    break;
    case 3:
    System.out.println("three");
    break;
    case 4:
    System.out.println("four");
    break;
    case 5:
    System.out.println("five");
    break;
    default:
    System.out.println("Greater than 5");
    }
    }
}