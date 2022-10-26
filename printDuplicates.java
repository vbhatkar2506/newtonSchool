import java.util.*;
public class printDuplicates {
    public static void main(String[] args) {
        int i =0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        HashSet<Integer> set = new HashSet<>();
        for(i =0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            int count = 0;
            for(int j = 0;j<N;j++)
            {
                if(i != j && arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count >= 1)
            {
                flag = true;
                set.add(arr[i]);
            }
        }
        if(!flag)
        {
            System.out.print("No Repeated value");
        }
        else
            System.out.print(set);
    }
}


// . What is the time complexity?
// int i, j, k = 0;
// for (i = n / 2; i <= n; i++) {
//   for (j = 2; j <= n; j = j * 2) {
//     k = k + n / 2;
//   }
// }
// Time Complexity = n/2 logn


// 2. What is the output?
// int main()
// {
//     int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//     int n = sizeof(arr) / sizeof(arr[0]);
//     func1(arr, 2, n);
//     printArray(arr, n);  //Prints arr & n
//     return 0;
// }

// void func2 (int arr[], int n)
// {
//     int temp = arr[0], i;
//     for (i = 0; i < n - 1; i++)
//         arr[i] = arr[i + 1];
//     arr[n-1] = temp;
// }

// void func1(int arr[], int d, int n)
// {
//     for (int i = 0; i < d; i++)
//         func2(arr, n);
// }



// 3. WAP to find duplicates from an unsorted array.
// e.g. 
// a) 1,3,5 -> o/p = No
// b) 1,3,5,5 -> o/p = 5
// c) 1,3,5,3,5 -> o/p = 3,5
// d) 1,3,5,3,5,5 -> o/p 3,5