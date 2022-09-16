import java.util.Scanner;

public class SortIt {
    public static void main (String[] args) {
        // Your code here
int i,j,count = 0;
try (Scanner sc = new Scanner(System.in)) {
    int N = sc.nextInt();
    int[] arr = new int[N];
    for(i = 0;i<N;i++)
    {arr[i] = sc.nextInt();}
    for(i=0;i<N;i++)
    {
    int minldx = i;
    for(j=i+1;j<N;j++)
    {
    if(arr[minldx] > arr[j])
    {
    minldx = j;  
    count++;
    }
    }
    int temp = arr[i];
    arr[i] = arr[minldx];
    arr[minldx] = temp;    
    }
}
System.out.print(count);
}
}
