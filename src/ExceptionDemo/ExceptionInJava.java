package ExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		int a=30;
		try {
			System.out.println("try block");
			b=a/1;  ///exception
		}
		//		
		catch(Exception e) {
			System.out.println("catch block");
			b=a/1;
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("in side try block");
		System.out.println("Hello java");

	}

}
