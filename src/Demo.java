
public class Demo {
	
	int a;
	int b;
	
	Demo(int c,int d){
		a=c;
		b=d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d= new Demo(10,30);
		d.print();

	}
	
	
	void print() {
		System.out.println("a="+a+" b="+b);
	}

}
