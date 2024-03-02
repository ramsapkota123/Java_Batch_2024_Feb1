package feb23;

public class UseOfThis2 {
	public UseOfThis2() {
		//this(6);
		System.out.println("non parameterized constructor");

	}

	public UseOfThis2(int a) {
         this();
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		//UseOfThis2 useOfThis = new UseOfThis2();
		UseOfThis2 useOfThis1 =new UseOfThis2(1);

	}

}
