package training;

public class StarPrint {

	public static void main(String[] args) {
		int row = 4;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// loop
		// for loop and while loop
		// (intialization ;condition check;increments/decrements){
		// statements}

		// print 5 times hello
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
		}
		// print 10 to 1
		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			// System.out.println("==================");
		}

		// table of 2
		for (int i = 0; i <= 20; i = i + 2) {
			System.out.println(i);
		}

		// continue
		for (int i = 0; i <= 5; i++) {
			// System.out.println(i);
			if (i == 3) {
				continue;
			}
			System.out.println(i);

		}
		// break
		for (int i = 0; i <= 5; i++) {
			// System.out.println(i);
			if (i == 3) {
				break;
			}
			System.out.println(i);

		}
		// while loop
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		int a = 0;
		while (a < 5) {

			if (a == 2) {
				a++;

				continue;

			}
			System.out.println(a);
			a++;

		}
	}
}
