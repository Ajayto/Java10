
public class MyClass {
	
	
	MyClass(int a){
		System.out.println("my class one arg constructor"+a);
	}

	public static void main(String[] args) {
	
		MyClass mc= new MyClass(10);
		// TODO Auto-generated method stub
//		DemoClass dc = new DemoClass();
//		//dc.m();
//		
//		DemoClass dc1=new DemoClass(10);
//		
        DemoClass  dc2=new DemoClass(10,20);
        dc2.m();
//		 
//		DemoClass dc3= new DemoClass(10000,10.20f);

	}

}


class DemoClass{
	
	DemoClass(){
		System.out.println("0 argument constructor");
	}
	
	DemoClass(int a){
		System.out.println("one aregument constructor ="+a);
	}
	
	DemoClass(int a,int b){
		int c= a+b;
		System.out.println(c);
	}
	
	DemoClass(int a, float b){
		System.out.println("two aregument constructor 1st ="+a+" 2nd"+b);
	}
	
	
	DemoClass(float a, float b){
		System.out.println("two aregument constructor 1st ="+a+" 2nd"+b);
	}
	
	
	void m() {
		
	}
	
	
	
	
	
}
