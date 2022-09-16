import java.util.*;
class CheckIf
{
 
    // Function to check if an array is
    // Sorted and rotated clockwise
   // Driver code
    public static void main(String[] args)    
    {        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0)
        {
        int x = 0, y = 0,i;           // Initializing two variables x,y as zero.
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = new int [n];
            for(i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
        // Traversing array 0 to last element.
        // n-1 is taken as we used i+1.
        for (i = 0; i < n - 1; i++)
         {
            if (arr[i] < arr[i + 1])
                x++;
            else
                y++;
        }
 
        // If till now both x,y are greater
        // than 1 means array is not sorted.
        // If both any of x,y is zero means
        // array is not rotated.
        if (x == 1 || y == 1) 
        {
            // Checking for last element with first.
            if (arr[n - 1] < arr[0])
                x++;
            else
                y++;
 
            // Checking for final result.
            if (x == 1 || y == 1)
                flag = true;
        }
        // If still not true then definitely false.
        if (flag == true)
            System.out.println("YES");
        else
            System.out.println("NO");  
    }       
}
}