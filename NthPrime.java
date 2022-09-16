import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class NthPrime {
    public static void main (String[] args) throws NumberFormatException, IOException 
    {
            // Your code here
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader inp = new BufferedReader (in);

        int T= Integer.parseInt(inp.readLine());
        while(T-->0)
        {
        int a=1, p=0,m,d;
        int N=Integer.parseInt(inp.readLine());
        while(p!=N){
            m=a;
            while(m!=0){
              d= m % 10;
              if(d==2 || d==3 || d==5 ||d==7){
                  m=m/10;
              }else{
                break;
              }
            }
            if(m==0){
                p++;
            }a++;
        }
        System.out.println((a-1)); 
        }           
    }
}
//https://drive.google.com/file/d/1cXv0LpXvpBZ0t_434wHNu7H9G3KywmAv/view?usp=sharing