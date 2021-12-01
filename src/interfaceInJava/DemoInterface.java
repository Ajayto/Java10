package interfaceInJava;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s= new SBI();
		s.getRoi();
		s.msg();

	}

}

interface RBI{
	public static final int roi=9;
	public abstract  void getRoi();
	void msg();
}


class SBI implements RBI{
	 roi=10;
	
	@Override
    
	public void getRoi() {
		// TODO Auto-generated method stub
		System.out.println("ROI for SBI is "+roi);
		
	}
	 @Override
	public void msg() {
		System.out.println("this is SBI bank");
		
	}
	
}