
public class UseOfThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConstructorCall c= new ConstructorCall(20,30);
	
	}


}




class ConstructorCall{
	ConstructorCall(){
		//this(10,30);
		System.out.println("0 argument");
	}
	
	ConstructorCall(int a){
		this(10,30);
		System.out.println("1 argument");
		
	}
	
	ConstructorCall(int a, int b){
	      this();
		System.out.println("2 argument");
	}
}
