package supperInJava;

public class SupperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c= new C();
		


	}

}

class A{
	A(){
		System.out.println("A class constructor");
	}
}

class B extends A{
	B(){
		System.out.println("B class constructor");
	}
	
	B(int a){
		super();
		System.out.println("B class one aregs constructor"+a);
	}
	
	B(int a, int b){
		System.out.println("B class two aregs constructor"+a+" "+b);
	}
	
}

class C extends B{
	C(int a,int b){
		super();
		System.out.println("C class two aregs constructor"+a+" "+b);
	}
	C(){
		
		super(10,20);
		System.out.println("C class constructor");
	}
}	
