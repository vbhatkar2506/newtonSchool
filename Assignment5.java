/*import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer greater 1 for the length");
        int M = scan.nextInt();
        int N = scan.nextInt();
        for (int i = 0; i < M; i++)
         {
            System.out.print("*");
        }
        System.out.println("\n");
        for (int j = 0;j < N;j++)
         {
            System.out.print("*");
        }      
    }  
      
    }*/


/*
import java.util.Scanner;
public class Assignment5 
{
public static void main(String[] args)
{
int height;
int width;
Scanner keyboard = new Scanner(System.in); 
System.out.println("Please enter the height of the rectangle.");
height = keyboard.nextInt();
if (height < 0)
{
    height = 1;
}
System.out.println("Please enter the width of the rectangle.");
width = keyboard.nextInt();
if(width < 0)
{
    width = 1;
}

for(int h = 0; h < height; h++) 
{ 
    for(int w = 0; w < width; w++) 
    { 
        System.out.print("*"); 
    } 
    System.out.println(" "); 
} 
}
} */



import java.util.Scanner;

  public class Assignment5
  {
    

 public static void main(String [] args)        
{
  System.out.print("Enter the height of the rectangle: ");
Scanner sc= new Scanner (System.in);
  int M = sc.nextInt();

  System.out.print("Enter the width of the rectangle: ");
  int N = sc.nextInt();

  for(int j=1; j<=M; j++)
  {  
    for(int i=1; i<=N; i++)
    {
      if(j ==1 || j==M || i==1 || i==N)  
      {
        System.out.print("*");
      }
      else
      {
           System.out.print(" ");
      }
    }
     System.out.println();
  } 
 }
}