import java.util.Scanner;

class DTriplet
 {
 
    // Function to count the triplets
    static int CountTriplets(int[] arr, int d)
    {
        int count = 0;
        int n = arr.length;
 
        // Three nested for loops to count the
        // triplets that satisfy the given criteria
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
 
                    if ((Math.abs(arr[i] - arr[j]) <= d) && (Math.abs(arr[i] - arr[k]) <= d) && (Math.abs(arr[j] - arr[k]) <= d)) 
                        {
                        count++;
                    }
                }
            }
        }
        return count;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); 
            int D = sc.nextInt();    
            int A[] = new int[n];
            for (int i = 0; i < n; i++)
            {
              A[i] = sc.nextInt();
            }
      /*  int A[] = { 1,3,2,5,9 };*/
            
            System.out.println(CountTriplets(A, D));
        }
    }
}
