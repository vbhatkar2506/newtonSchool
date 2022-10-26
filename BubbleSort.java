import java.util.Scanner;

class BubbleSort {
  public static void main(String []args) {
    int N, i, j, Temp,Count = 0;
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of integers to sort:");
    N = sc.nextInt();
 
    int array[] = new int[N];
 
    System.out.println("Enter " + N + " integers: ");
 
    for (i = 0; i < N; i++) 
      array[i] = sc.nextInt();
 
    for (i = 0; i < ( N - 1 ); i++) {
      for (j = 0; j < N - i - 1; j++) {
        if (array[j] > array[j+1]) 
        {
          Temp = array[j];
          array[j] = array[j+1];
          array[j+1] = Temp;
          Count++;
        }
      }
    }
 
    System.out.println(Count);
 
    for (i = 0; i < N; i++) 
      System.out.print(array[i]+" ");
  } 
}

// import java.util.*;
 
// class BubbleSort {
 
//  public static class Pair {
//         int val;
//         int idx;
//         Pair(int val, int idx)
//         {
//             this.val = val;
//             this.idx = idx;
//         }
//     }
 
//     // Driver code
//     public static void main(String[] args)
//     {
//       int i;
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int[] arr = new int[n];
//       for(i = 0;i<n;i++)
//           arr[i] = sc.nextInt();
//         System.out.println(minOperations(arr, n));
//     }
//     public static int minOperations(int[] arr, int n)
//     {
//         Pair[] num = new Pair[n];
//         for (int i = 0; i < n; i++) {
//             num[i] = new Pair(arr[i], i);
//         }
//         Arrays.sort(num, (Pair a, Pair b) -> a.val - b.val);
//         int res = 1;
//         int streak = 1;
//         int prev = num[0].idx;
//         for (int i = 1; i < n; i++) {
//             if (prev < num[i].idx) {
//                 res++;
 
//                 // Updating streak
//                 streak = Math.max(res, streak);
//             }
//             else
//                 res = 1;
//             prev = num[i].idx;
//         }
//         return n - streak;
//     }
// }