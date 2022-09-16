/*class BinSrch
{  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
} */
import java.util.*;
class BinSrch
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases");
        int T = sc.nextInt();
        while(T-- >0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            boolean EFound = false;
            int[] arr = new int [N];
            for(i = 0;i<N;i++)
            {
                arr[i] = sc.nextInt();
            }
            int first = 0, last = N - 1;
            int mid = (first + last)/2;
            if(first <= last)
              {
                 if(arr[mid] == K)
                {
                 EFound = true;  
                 break;
                 }   
                 else if(arr[mid] < K)
                 {
                first = mid + 1;               
                    }
                 else
                 {
                last = mid - 1; 
                 }
                 }
            if(EFound == true)
            {
                 System.out.print("-1 ");
            }
             else
            {
                 System.out.print("1");
            }
        }
    }
}