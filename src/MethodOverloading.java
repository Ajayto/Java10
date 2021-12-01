
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading ml = new MethodOverloading();
		
		System.out.println(ml.add(10.10,20.20));

	}
	
	int add(int a) {
		return a+2;
	}
	long add(int a, int b) {
		System.out.println("both int");
		return a+b;
	}
	
	
//	int add(int a, int b) {
//		System.out.println("both int");
//		return a+b;
//	}
	
	
	float add(float a, int b) {
		System.out.println("1 float one int ");
		return a+b;
	}
	
	
	float add(int a, float b) {
		System.out.println("1 int one float ");
		return a+b;
	}
	double add(double a, double b) {
		System.out.println("both double ");
		return a+b;
	}
	
	double add(double a, int b) {
		System.out.println("1 double one int ");
		return a+b;
	}
	
	
	
	
//	
//	
//	float add(float a, int b) {
//		return a+b;
//	}
//	
//	float add(float a, float b) {
//		return a+b;
//	}
//	
//	int add(int a, int b,int c) {
//		return a+b+c;
//	}
//	
//	float add(int a, float b) {
//		return a+b;
//	}
	


}
