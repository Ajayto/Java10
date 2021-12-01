package supperInJava;

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c= new Child();

	}

}


class Parent{
	Parent(){
		System.out.println("parent class constructor");
	}
	
	Parent(int a){
		System.out.println("parent class 1 args constructor");
	}
	
	void super() {
		
	}
}


class Child extends Parent{
	
	Child(){
		super(10);
		System.out.println("child class constructor");
	}
	
}
