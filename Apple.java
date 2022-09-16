import java.util.*;
class Apple
{
    public static void main(String[] args)
    {
        int C,T;
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        C = A + B;
        T = C - N;
        System.out.println(T);
    }
}