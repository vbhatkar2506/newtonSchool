import java.util.Scanner;  
/*class Roots  
{  
public static void main(String[] Strings)   
{  
Scanner input = new Scanner(System.in);  
System.out.print("Enter the value of a: ");  
double a = input.nextDouble();  
System.out.print("Enter the value of b: ");  
double b = input.nextDouble();  
System.out.print("Enter the value of c: ");  
double c = input.nextDouble();  
double d= 9- 4.0 * 1* c;  
if (d> 0.0)   
{  
int r1 = (int)(-b + Math.pow(d, 0.5)) / (int)(2.0 * a);  
int r2 = (int)(-b - Math.pow(d, 0.5)) / (int)(2.0 * a);  
if(r1 > 0)
{
System.out.println("The roots are " + r1);  
}
else if(r2 > 0)
{
System.out.println("The roots are "+ r2);  
}
else
{
System.out.println("The roots are -1");  
}
}   
else if (d == 0.0)   
{  
int r1 = (int)(-b / (2.0 * a));  
if(r1 > 0)
{
System.out.println("The roots are " + r1);  
}
  else
{
System.out.println("The roots are -1");  
}
}   
else   
{  
System.out.println("-1");  
}  
}  
}  */
class Roots
{
public static void main (String[] args) {
  try (// Your code here
Scanner sc = new Scanner(System.in)) {
  int K = sc.nextInt();
  int x = 1, i;
  boolean flag = false;
  for( i = 1; i < K; i++) {
  while(K == ((i*i) + (3*i))) {
  x = i;
  flag = true;
  System.out.println(x);
  break;
  }                  
  }
  //while(K != ((x*x) + (3*x)))
  if (flag == false)
  {
  System.out.println("-1");
  }
}
}
}