import java.util.*;  
   
class LinSrch
{  
  public static void main(String args[])  
  {    
    int i; 
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-- >0)
    {  
    int N = sc.nextInt();  
    int X = sc.nextInt(); 
    boolean flag = false;
    int[] array = new int[N];  
     for (i = 0; i < N; i++)  
      array[i] = sc.nextInt();    
    for (i = 0; i<N; i++)  
    {  
 if (array[i] == X)     /* Searching element is present */  
      {  
         System.out.print(i+" ");  
         flag = true;
         // break;  
      }    

    } 
   if (flag == false)  /* Element to search isn't present */  
   {
      System.out.print("Not found");  
  } 
    System.out.println();
}  
}
}