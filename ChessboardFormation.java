import java.util.Scanner;

class ChessboardFormation 
{
public static void main(String[] args) {
    int i, j;
    try (Scanner sc = new Scanner(System.in)) {
        int T = sc.nextInt();
        while(T-- >0)
        {
            int N = sc.nextInt();
            int[][] a = new int[N][N];
            for(i = 0;i<N;i++)
            {
                for(j=0;j<N;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println(Chess(a));
        }
    }
}    
public static int Chess(int b[][])
{
    int n = b.length , rowSum = 0, colSum = 0, rowSwap = 0, colSwap = 0;
    for(int i = 0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        if ((b[0][0] ^ b[i][0] ^ b[0][j] ^ b[i][j]) == 1)
            return -1;
    }
    for (int i = 0;i<n;i++)
        {
            rowSum += b[0][i];
            colSum += b[i][0];
            if (b[i][0] == i%2)
                rowSwap++;
            if(b[i][0] == i%2)
                colSwap++;
        }
        if (rowSum !=n/2 && rowSum != (n+1)/2)
            return -1;
        if (colSum != n/2 && colSum != (n+1)/2)
            return -1;
        if (n%2 == 1)
        {
            if (colSwap % 2 == 1)
                colSwap = n - colSwap;
            
            if (rowSwap % 2 == 1)
                rowSwap = n - rowSwap;
        }
        else
        {
            colSwap = Math.min(n-colSwap, colSwap);
            rowSwap = Math.min(n-rowSwap, rowSwap);
        }
        return (colSwap + rowSwap) / 2;
        } 
    }