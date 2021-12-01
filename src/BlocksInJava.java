
public class BlocksInJava {
	
	int a;
	int b;
	
	{
		a=30;
		b=40;
	}
	
	
	static {
		System.out.println("this is static block");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is main");
		BlocksInJava bj=new BlocksInJava();
		System.out.println("end main");
		

	}

}
