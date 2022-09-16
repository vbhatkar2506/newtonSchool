import java.util.*;
  
class MedianArray
 {
  
    // A utility function to find median of two integers
    static float MO2(int a, int b) {
        return (float) ((a + b) / 2.0);
    }
  
    // A utility function to find median of three integers
    static float MO3(int a, int b, int c) {
        return a + b + c - Math.max(a, Math.max(b, c)) - 
          Math.min(a, Math.min(b, c));
    }
  
    // A utility function to find a median of four integers
    static float MO4(int a, int b, int c, int d) {
        int Max = Math.max(a, Math.max(b, Math.max(c, d)));
        int Min = Math.min(a, Math.min(b, Math.min(c, d)));
        return (float) ((a + b + c + d - Max - Min) / 2.0);
    }
  
    // Utility function to find median of single array
    static float medianSingle(int arr[], int n) {
        if (n == 0)
            return -1;
        if (n % 2 == 0)
            return (float) ((double) (arr[n / 2] + 
                                      arr[n / 2 - 1]) / 2);
        return arr[n / 2];
    }
  
   
    static float findMedianUtil(int A[], int N, int B[], int M) 
    {
        if (N == 0)
            return medianSingle(B, M);
  
           if (N == 1) {
            
            
            if (M == 1)
                return MO2(A[0], B[0]);
  
          
            if (M % 2 == 1)
                return MO2(B[M / 2], (int) MO3(A[0], 
                            B[M / 2 - 1], B[M / 2 + 1]));
            return MO3(B[M / 2], B[M / 2 - 1], A[0]);
        }
        else if (N == 2) {
            if (M == 2)
                return MO4(A[0], A[1], B[0], B[1]);
  
            if (M % 2 == 1)
                return MO3(B[M / 2], Math.max(A[0], B[M / 2 - 1]),
                           Math.min(A[1], B[M / 2 + 1]));
  
          
            return MO4(B[M / 2], B[M / 2 - 1], 
                       Math.max(A[0], B[M / 2 - 2]), 
                       Math.min(A[1], B[M / 2 + 1]));
        }
  
        int idxA = (N - 1) / 2;
        int idxB = (M - 1) / 2;
  
        
        if (A[idxA] <= B[idxB])
            return findMedianUtil(Arrays.copyOfRange(A, idxA, A.length),
                                  N / 2 + 1, B, M - idxA);
  
       
        return findMedianUtil(A, N / 2 + 1, 
               Arrays.copyOfRange(B, idxB, B.length), M - idxA);
    }
    static float findMedian(int A[], int N, int B[], int M)
    {
        if (N > M)
            return findMedianUtil(B, M, A, N);
  
        return findMedianUtil(A, N, B, M);
    }
  
  
    public static void main(String[] args)
    {
        /*int A[] = { 1,3 };
        int B[] = { 2 };
  
        int N = A.length;
        int M = B.length;*/
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for(int i = 0;i<N;i++)
            A[i] = sc.nextInt();
        for(int j = 0;j<M;j++)
            B[j] = sc.nextInt();
  
        System.out.printf("%.2f", findMedian(A, N, B, M));
    }
}
  /*  int i,j,sum1 = 0, sum2 = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[m];
    for(i = 0;i<n;i++)
    {
        A[i] = sc.nextInt();
        sum1 = sum1 + A[i];
    }
    for (j=0;j<m;j++)
    {
        B[j] = sc.nextInt();
        sum2 = sum2 + B[j];
    }
        float median = (sum1 + sum2)/(n + m);
        System.out.printf("%.2f",median);
    }*/ 