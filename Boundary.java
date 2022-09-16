import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Boundary {
	public static void main (String[] args) {
                      // Your code 
					  Scanner sc = new Scanner(System.in);
		  int T,n,m;
		  T=sc.nextInt();
		  
		  for(int k=1;k<=T;k++){
			  n=sc.nextInt();
			  m=sc.nextInt();
			  
		 int A[][]=new int[n][m];
		  for(int i=0;i<=n-1;i++){
			  for(int j=0;j<=m-1;j++){
				  A[i][j]=sc.nextInt();
			  }
		  }
		  if(n==1 || m==1){
			  for(int i=0;i<=n-1;i++){
				  for(int j=0;j<=m-1;j++){
					  System.out.print(A[i][j]+" ");
				  }
				  
			  }
			  System.out.println();
		  }
		  else{
		  int rowstart=0;
		  int rowstart1=0;
			int colstart=0;
			int rowend=n-1;
			int colend=m-1;
			int colend1=m-1;
		    for(int i=0;i<=n-1;i++)
		    {
			for(int j=0;j<=m-1;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			rowstart++;
			for(int row=rowstart;row<=rowend;row++) {
				System.out.print(A[row][colend]+" ");
			}
			colend--;
			for(int col=colend;col>=colstart;col--) {
				System.out.print(A[rowend][col]+" ");
			}
			rowend--;
			for( int row=rowend;row>colstart;row--) {
				System.out.print(A[row][colstart]+" ");
			}
			System.out.println();
		break;
		    }
		  }

		  }
	}
}