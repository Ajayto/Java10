
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HDFC h= new HDFC();
		h.getROI();

	}

}

class RBI{
	int roi=3;
	protected void getROI(){
		System.out.println("ROI for RBI is "+roi);
	}
}

class SBI extends RBI{
	int roi=5;
	public void getROI(){
		System.out.println("ROI for SBI is "+roi);
	}
}

class HDFC extends SBI{
	float roi=5.5f;
	void getROI(){
		System.out.println("ROI for HDFC is "+roi);
	}
}
