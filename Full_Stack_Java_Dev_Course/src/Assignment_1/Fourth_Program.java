package Assignment_1;

public class Fourth_Program {

	public static void main(String[] args) {
		int n=14;
		for(int i=0;i<n;i++) {			
	
					for(int j=0;j<n;j++) {
						if((i==(n-1))
						||j==0 && i>(n-1)/2
						||i==(n-1)
						||j==(n-1) && i>(n-1)/2
						||i-j>=(n-1)/2
						||i+j>=n+(n-1)/2-1
						
						
						
						)
							
						{System.out.print("*");}
						else {System.out.print(" ");
						}
						}
					System.out.println();	
					
					
		}

	}

}
