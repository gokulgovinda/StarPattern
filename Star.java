public class Stars {
	 public static void main(String args[]) {
// 	  for(int line=1; line<=4; line++) {
// 		  for(int star=1;star<=line;star++) {
// 		  System.out.print("*");
// 	  }
// 	 System.out.println();
	 
// 	 }
// 	 }
}
// output 
// *
// **
// ***
// ****
	
int n=7
 for(int line=1; line<=n; line++) {
		  for(int star=1;star<=n-line+1;star++) {
		  System.out.print("*");
	  }
	 System.out.println();
	 
	 }
	
// 	Output
	*******
	******
	*****
	****
	***
	**
	*
		
