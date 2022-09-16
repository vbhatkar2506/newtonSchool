/* import java.util.*;
 class xor11
 {
    public static void main (String[] args)
    {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 //sc.nextLine();
int mat[] =new int[n];
  for(int i=0;i<n;i++)
  {
 mat[i]=sc.nextInt();
	  }
 int ans=0;
 For(i=0; i<n;i++)
{
 int a; //input//a;
 ans= ans+((a)^(n-i));
   }
 System.out.print(ans);
 }
 }*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class xor11 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[100000];
		long xor=0;
		
for(int j=0,i=1;j<n;j++,i++){
	arr[j]=sc.nextInt();
	int a = arr[j];
	xor +=(a ^ (n-i));
	}
		
	System.out.println(xor);
	
	}
}