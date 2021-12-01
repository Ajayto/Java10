package ExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UseofThrows {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		UseofThrows t= new UseofThrows();
		t.readFileData();
		

	}
	
	void readFileData() throws FileNotFoundException {
		File f= new File("c://data.txt");
		FileInputStream fs= new FileInputStream(f);
		
	}
	
	
}



class ABC{
	void data() throws FileNotFoundException{
		UseofThrows ut= new UseofThrows();
		ut.readFileData();
		
	}
}
