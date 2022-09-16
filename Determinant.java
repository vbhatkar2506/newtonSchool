import java.util.*;
class Determinant
{
    public static void main(String[] args)
{
    int i,j, M=2, N=2;
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int [10][10];
    System.out.println("Enter Elements of Array");
    for (i=0;i<M;i++)
    {
        for(j= 0;j<N;j++)
        {
        arr[i][j] = sc.nextInt();

        }
    }
System.out.println("Array is ");
int e= arr[0][0] * arr[1][1];
int f = arr[0][1] * arr[1][0];
int s = e - f; 

        System.out.print(s);
   

}
}