import java.util.Arrays;
import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[N-1] - arr[0]);
    }
}