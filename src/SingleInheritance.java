
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//B b= new B();
		C c = new C();
		c.getData();
		c.printData();
		c.showData();
		System.out.println(c.a+" "+ c.b+" "+c.c);
	}

}

class A{
	int a=20;
	void printData() {
		System.out.println("this is class A"+a);
	}
}

class B extends A{
	int b=30;
	int c =a+b;
	void getData(){
		System.out.println("this is class B "+(a+2));
	}
	
}
class C extends B{
	//int c=40;
	void showData() {
		System.out.println("a="+a+" b="+b);
	}
}



