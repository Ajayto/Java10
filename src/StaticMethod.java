
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod ob1= new StaticMethod();
		ob1.m1();
		
		
		

	}
	
	
	void m1() {
		int a=30;
	}
	
	static void m2(){
		System.out.println("this is ststic method");
		
		
		StaticMethod sm=new StaticMethod();
		sm.m1();
		m3();
		
	}
	
	static void m3() {
		
	}

}
