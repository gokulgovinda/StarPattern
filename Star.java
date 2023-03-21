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
	
int n=7;
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
		
  	// Half pyramid
		1
		12
		123
		1234
	
int n=4;
 for(int line=1; line<=n; line++) {
	 for(int number=1;number<=line;number++) {
	   System.out.print(number);
	  }
	 System.out.println();
	 
	 }

	
// 	Character pattern
	A
	BC
	DEF
	GHIJ
	
int n=4;
char ch='A';
// 	outer loop
	for(int line =1;line<=n; line++){
		for(int chars=1;chars<=line; chars++){
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}

		
		
