import java.util.*;
public class SelectionSort {
    // time cmp: o(n^2)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int minIdx = i;
			for(int j=i+1;j<n;j++){
				if(arr[minIdx]>arr[j]){
					minIdx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
