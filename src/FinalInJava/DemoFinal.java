package FinalInJava;

public class DemoFinal {
     final static  int a;
     static {
    	 a=20;
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFinal d= new DemoFinal();
		d.setData();

	}
	
	void setData() {
		//a=30;
		System.out.println(a);
	}

}


 class A {
 final void display() {
		System.out.println("class A display");
	}
	
}

class B extends A{
	
	 void show() {
		display();
		System.out.println("class B display");
	}
	
}



