
public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,2,30,45,5,20};
		             
		int greaterNumber=0;
		for (int i=0;i<a.length;i++) {
			if(greaterNumber<a[i]) {  //  45 <20
			  greaterNumber=a[i];   //45
			}
			
		}
		
		System.out.println("greater number is "+greaterNumber);	
	}

}





