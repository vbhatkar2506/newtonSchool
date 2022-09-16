// Java program to print sum of alternate
// elements of a N x N matrix
 /*import java.util.*;
class ChessBoard
{
        // Function to find the sum of alternate
        // elements of a matrix
          public static void main(String [] args)
        {
           int cnt = 0,i ,j;
            int count = 0;
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[][] mat = new int[10][10];
            for(i = 0;i<N;i++)
            {
                for(j= 0;j<N;j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }
            // check the alternate elements
           if(mat[1][1] == 1)
           {
            for (i = 0; i < N; i++) {
         
                for(j=0;j<N ;j++)
                {
                    if (cnt % 2 == 0)
                    {
                        if(mat[i][j]==1)
                        {
                            count++;
                        }
                    }
                   cnt++;
                }
            }
        count -= 1;
            System.out.print(count);
          //return (count);
           }
           else 
            {
            for (i = 0; i < N; i++) {
         
                for(j=1;j<N ;j++)
                {
                    if (cnt % 2 == 0)
                    {
                        if(mat[i][j]==0)
                        {
                            count++;
                        }
                    }
                   cnt++;
                }
            }
        count -= 1;
            System.out.print(count);
          //return (count);
           }
        }
         
        // Driver code
      
      
}           */

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ChessBoard {
	public static void main (String[] args) {
                      try (// Your code here
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
             sc.nextLine();
             int x = 0, y = 0;
             String row;
             for(int i= 0;i<n;i++)
             {
                 row = sc.nextLine();
                 int j = 0;
                 for (char ch:row.toCharArray())
                 {
                     if(ch ==' ')
                     {
                         continue;
                     }
                     if((i+j)%2 == 0)
                     {
                         if(ch=='0')
                            x++;
                        else
                            y++;
                     }
                     else
                     {
                    if(ch=='1')
                        x++;
                    else
                        y++;
                     }
                     j++;
                 }
             }
             System.out.println(Math.min(x,y));
        }
	}
}