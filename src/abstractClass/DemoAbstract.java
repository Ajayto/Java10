package abstractClass;

public class DemoAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RBI r= new RBI();
		
		
		SBI s= new SBI();
		s.getROIForHL(6);
		HDFC h= new HDFC();
		h.getROIForHL(7);

	}

}

abstract class RBI{
	
	RBI(){
		
	}
	abstract void getROIForPL(int roi);  ///4
	abstract void m();
	abstract void getROIForHL(int roi);
	void displayMsg(){
		System.out.println("This is RBI bank and address is .......");
	}
}

class SBI extends RBI{
	void getROIForPL(int roi) {
		//System.out.println("ROI of SBI for PL is "+roi);	
	}

	void m(){
		System.out.println("this is m");
	}

	void getROIForHL(int roi){
		System.out.println("SBI roi for HL"+roi);
	}
}

class HDFC extends RBI{
	void getROIForPL(int roi) {
		System.out.println("ROI of HDFC for PL is "+roi);	
	}

	void m(){
		System.out.println("this is m");
	}

	void getROIForHL(int roi){
		System.out.println("HDFC roi for HL "+roi);
	}

}
