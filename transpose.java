import java.util.*;
class transpose
{
    public static void main(String[] args)
{
    int i,j;
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int[][] arr = new int [10][10];
    System.out.println("Enter Elements of Array");
    for (i=0;i<M;i++)
    {
        for(j= 0;j<M;j++)
        {
        arr[i][j] = sc.nextInt();

        }
    }
System.out.println("Array is ");
for(i= 0;i<M;i++)
{
    for(j= 0;j<M;j++)
    {
        System.out.print(arr[j][i]+" ");
    }
    System.out.println();
}
}
}