//https://drive.google.com/file/d/15WvNFbHstyL-FqaRwm8CqOniyuUntHsW/view?usp=sharing
import java.util.*;
class BooleanMatrix
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            String[] matrix = new String[m];
            for(int i=0;i<m;i++)
            {
                matrix[i] = sc.nextLine();

            }
            StringBuffer ones = new StringBuffer();
            StringBuffer zeros = new StringBuffer();
            for (int i= 0;i<n;i++)
            {
                ones.append("1 ");
                zeros.append("0 ");

            }
            for (int i = 0;i<m;i++)
            {
                if(matrix[i].contains("1"))
                {
                    System.out.println(ones);
                }
                else
                {
                    System.out.println(zeros);
                }
            }
        }
        }
}