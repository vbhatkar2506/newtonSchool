import java.util.*;
class Assignment3
{
    public static void main(String[] args)
{
    int N = 5,D = 3,C;
   for(int i=1;i<=D;i++)
    {
int a = N/2;
int b = N%2;
int c = a+b;
N = c*3;
if (i==3)
{
System.out.println(N);
 }
   
}
}
}