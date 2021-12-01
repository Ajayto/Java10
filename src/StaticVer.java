
public class StaticVer {
	
	
	int a=30;
	static int b=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVer obj1=new StaticVer();   //a=30  b=30
		
		obj1.m();
		StaticVer obj2=new StaticVer();   // a=30  b=31
		
		obj2.m();
		
		StaticVer obj3=new StaticVer();
		obj3.m();
		

	}
	
	
	void m() {
		++a;
		++b;
		System.out.println("a="+a+" b="+b);
	}

}
