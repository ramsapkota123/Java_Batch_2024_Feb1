package triangle;

public class TrianglePriant2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
				
			}
			for(int s=0;s<i*2-1;s++) {
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
    