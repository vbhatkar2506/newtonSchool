import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    // time cmp: o(n^2)
	public static void selectionSort(int ar[]){
		for(int i=0;i<ar.length;i++){
			int minIdx = i;
			for(int j=i+1;j<ar.length;j++){
				if(ar[minIdx]>ar[j]){
					minIdx = j;
				}
			}
			int tmp = ar[i];
			ar[i] = ar[minIdx];
			ar[minIdx] = tmp;
		}
	}


	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++){
			ar[i] = sc.nextInt();
		}
		selectionSort(ar);
		System.out.println(Arrays.toString(ar));
	}
}
