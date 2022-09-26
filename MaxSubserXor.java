import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int  arr[]= new  int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      Solution g = new Solution();
		  System.out.println(g.maxSubarrayXOR(arr , n));
    }
}
class Solution
{
    public static int maxSubarrayXOR(int arr[], int N)
    {
        //add code here.
       if(N == 0) return 0;
       int num = 0;
       while(true)
       {
         int max = Integer.MIN_VALUE;
         for(int i=0;i<N;i++)
         {
             if(max<arr[i]) max=arr[i];
         }
         if(max == 0) 
         {
             return num;
         }
         num = Math.max(num,num^max);
         for(int i=0;i<N;i++)
         {
           arr[i] = Math.min(arr[i],arr[i]^max);
         }
       }
    }
}
