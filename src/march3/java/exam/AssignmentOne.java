package march3.java.exam;

public class AssignmentOne {
	public static void main(String[] args) {
		StaicOne s=new StaicOne();
		s.dispalyName();
		
		
	}

	
		

	}

class StaicDemo{
	
	static {
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is not static block");
	}
	public void dispalyName() {
		System.out.println("I am Ram Sapkota");
	}
	
	
}
class StaicOne extends StaicDemo{
	
	public StaicOne() {
		this("Ram");
		System.out.println("this is firs type of constructor");
		
	}
	
	public StaicOne(String name) {
		this("euless",14);
		System.out.println("This is second constructor of  "+name);
		
	}
	public StaicOne(String cityName,int age) {
		System.out.println("this is third constructor of "+cityName+" "+age);
		
	}
	    
	@Override
	public void dispalyName() {
		super.dispalyName();
		System.out.println("I  am surendra");
		
		
	}
	 
	
	
	
}