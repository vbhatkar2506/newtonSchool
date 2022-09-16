// Array Missing Number in java
import java.util.*;
class Assignment15
{
public static void main(String[] args)
{
    int i;
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter Aray Size");
 int N =sc.nextInt();
 int[] arr = new int[10];
 System.out.println("Enter elements of array");
 for (i = 1; i<N; i++)
 {
        arr[i] = sc.nextInt();

 }
 System.out.println("Array is");
 int total = ((N)*(N+1))/2;
 for(i = 1;i<N;i++)
 {
    
    total -= arr[i];
    // System.out.println(arr[i]);
    if ( i== N-1)
    {
        System.out.print(total);
    }
}
}

}