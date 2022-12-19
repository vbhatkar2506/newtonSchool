import java.util.*;
public class twoSum {
    public static void findElement(int[] arr,int N,int target)
    {
        int[] temp = new int[] {-1,-1};
        for(int i=0;i<N-1;i++)
        {
            for(int j = i+1;j<N;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    //return new int[] {arr[i],arr[j]};
                    temp[0] = arr[i];
                    temp[1] = arr[j];
                }
            }
        }
        System.out.print(temp[0]+" "+temp[1]);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i] = sc.nextInt();
            }
      // System.out.print(findElement(arr,N,target));
      findElement(arr, N, target);
        }
    }
}
