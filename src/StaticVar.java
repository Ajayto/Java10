
public class StaticVar {
	
	int a=20;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar ob1= new StaticVar();
		ob1.getNumber();
		StaticVar ob2= new StaticVar();
		ob2.getNumber();
		StaticVar ob3= new StaticVar();
		ob3.getNumber();
	}
	
	
	void getNumber(){
		int c=20;
		a=a+1;   
		b=b+1;   
		c=c+1;
		
		System.out.println("a= "+a+" b="+b+" c="+c);
				
	}
	

}
