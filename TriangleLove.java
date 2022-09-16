import java.util.*;
public class TriangleLove
{
   public static void main(String[] args)
   {
       // Create a Scanner object
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the x coordinate of 1st point Q");
      // Read user input
      double x1 = s.nextDouble();
      System.out.println("Enter the y coordinate of 1st point Q");
      double y1 = s.nextDouble();
      System.out.println("Enter the x coordinate of 2nd point R");
      double x2 = s.nextDouble();
      System.out.println("Enter the y coordinate of 2nd point R");
      double y2 = s.nextDouble();
      System.out.println("Enter the x coordinate of 3rd point P");
      double x3 = s.nextDouble();
      System.out.println("Enter the y coordinate of 3rd point P");
      double y3 = s.nextDouble();
    // formula to find distance between 2 points
       double a = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
       double b = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
       double c = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
       // side checking 
       if (a + b > c)
           System.out.println("Right angle triangle"); 
       else if (a + b == c)
           System.out.println("Special");
       else
           System.out.println("Obtuse angle triangle"); 
   }
}