package feb23;

public class UseOfThis1 {
	int num1;
	int num2;
	public UseOfThis1(int a,int b) {
		this.num1=a;
		this.num2=b;
	}
	public static void main(String[] args) {

		UseOfThis1 t=new UseOfThis1(4,5);
		System.out.println(t.num1);
		System.out.println(t.num2);
		
		
	}

}
