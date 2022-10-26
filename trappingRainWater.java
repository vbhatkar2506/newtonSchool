import java.util.*;

class trappingRainWater
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i]= sc.nextInt();
            }
            int[] left = new int[N];
            int[] right = new int[N];
            left[0] = arr[0];
            right[N-1] = arr[N-1];
            for(int i=1;i<N;i++)
            {
                left[i] = Math.max(left[i-1], arr[i]);
            }
            for(int i = N-2;i >= 0;i--)
            {
                right[i] = Math.max(right[i+1], arr[i]);
            }
            int ans = 0;
            for(int i=0;i<N;i++)
            {           
                ans += Math.min(left[i], right[i]) - arr[i];
            }
            System.out.print(ans);
        }
    }
}
//[0,1,0,2,1,0,1,3,2,1,2,1]

// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
        
//         int[] left = new int[n];
//         int[] right = new int[n];
        
//         left[0] = height[0];
//         right[n-1] = height[n-1];
        
//         for(int i = 1; i < n; i++){
//             left[i] = Math.max(left[i-1], height[i]);
//         }
//         for(int i = n-2; i >= 0; i--){
//             right[i] = Math.max(right[i+1], height[i]);
//         }
//         int ans = 0;
//         for(int i = 0; i < n; i++){
//             ans += Math.min(left[i], right[i]) - height[i];
//         }
//         return ans;
//     }
// }