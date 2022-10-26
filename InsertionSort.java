import java.util.*;
public class InsertionSort
 {  
public static void main(String[] args) 
{  
    try (//declare an array and print the original contents
    Scanner sc = new Scanner(System.in)) {
            int i;
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(i = 0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        //apply insertion sort algorithm on the array
        for(i=1;i<N;i++)   
        {  
            int temp = arr[i];  
            int j= i-1;  
            while(j>=0 && temp <= arr[j])  
            {  
                arr[j+1] = arr[j];   
                j = j-1;  
            }  
            arr[j+1] = temp;  
        }  
        //print the sorted array
        for(i=0;i<N;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
}  
} 