package triangle;

public class FullTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
				
			}
			for(int s=1;s<=i*2-1;s++) {
				System.out.print("*");
			}
			System.out.println();
		
			
		}

	}
	/*
	 *              *
	 *             ***
	 *            *****
	 *           *******
	 *              
	 */

}
    