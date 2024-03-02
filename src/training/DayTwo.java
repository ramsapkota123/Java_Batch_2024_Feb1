package training;

public class DayTwo {
	public static void main(String[] args) {
		int a=8;
		System.out.println(a);
		
		//Arithmetic operator
		int s=1000;
		int v=100;
		System.out.println(s+v);
		System.out.println(s-v);
		System.out.println(s*v);
		System.out.println(s/v);
		System.out.println(s%v);
		
		int h=100;
		int g=50;
		int e=h+g;
		System.out.println(e);
		CalA();
		CalB(3,5);
		int y=CalC(10,30);
     System.out.println(y);	
     
     int d=Multiplication(4,5);
     System.out.println(d);
     
     int r=division(300,100);
     System.out.println(r);
     
	int l=modules(3,2);	
	System.out.println(l);
		
	}
	//function without parameter and without return type
	public static void CalA() {
		System.out.println(9+9);
	}
	//function with parameter and without return type
	public static void CalB(int x, int y) {
		System.out.println(x+y);
		
		
	}
	//function with parameter and with return type 
	public static int CalC(int d,int e) {
		return d+e;
	}
	public static int Multiplication(int v,int n) {
		return v*n;
	}
	public static int division(int g,int j) {
		return g/j;
		
	}
	public static int modules(int a,int b) {
		return a%b;
	}

	
	
	
	
	
	
	
	

}
