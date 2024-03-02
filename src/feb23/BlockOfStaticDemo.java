package feb23;

public class BlockOfStaticDemo {
	public BlockOfStaticDemo(){
		System.out.println("this is a default constructor");
	}
	{
		System.out.println("this is not a static block");
	}
	
	static {
		System.out.println("this is a static block");/* 
		this block is always execute first*/
	}

	public static void main(String[] args) {
		BlockOfStaticDemo blockOfStaticDemo =new BlockOfStaticDemo();
	
		

	}

}
