
public  class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticClass.Innner2.m();

	}
	
	
 static class Innner2{
		
		static void m() {
			System.out.println("ststic class2");
		}
		 
	 }

}

  class demoStatic{
	 
	public static class Innner{
		
		static void m() {
			System.out.println("ststic class");
		}
		 
	 }
	
}
