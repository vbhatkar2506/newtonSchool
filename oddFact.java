import java.util.Scanner;

class oddFact 
{
    public static void main(String[] args) {
        int fact =1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            fact = fact * i;
            if(i%2 != 0)
            {
                sum = sum + fact;
            }
        }
        System.out.println(fact);
        System.out.print(sum);
    }
}