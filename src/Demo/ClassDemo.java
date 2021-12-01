package Demo;

public class ClassDemo {
	int a=10;
	void display() {
		System.out.println("value  of a="+a);
	}
	
	int AddTwo() {
		int c= a+2;
		addThree(c);
		return c;
	}
	
	int addThree(int a) {
		int c=a+3;
		return c;
	}


}


