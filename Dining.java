import java.util.*;
class Dining
{
    public static void main (String[] args) {
        try (Scanner s = new Scanner (System.in)) {
            int N = s.nextInt(); // no. of plates
            int R = s.nextInt(); // radius of table
            int r = s.nextInt(); // radius of plate
            double theta = Math.asin(r/(double)(R-r));
            double value = Math.PI/theta;
            if (N > value || r>R) {
                System.out.println("No");
            }  else {
                System.out.println("Yes");
            }
                          // Your code here
        }
    }
}