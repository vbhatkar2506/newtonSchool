import java.util.*;
public class Assignment4
{
    public static void main (String[] args)
    {
System.out.println("Enter the height of the pattern : ");
Scanner scan = new Scanner(System.in);
int N = scan.nextInt();
for(int i = 0 ; i < N ; i++)

{

 int t = i * 6;

 for(int j = 0 ; j < N ; j++)

 {

  int k = j*4;

System.out.print(t + k+" "); 

 }
System.out.print("\n");

}

}
}