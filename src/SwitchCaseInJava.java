import java.util.Scanner;

public class SwitchCaseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice");
		System.out.println("1. Add \n 2. sub \n 3.mult. \n 4. division");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter key");
	    int optios=sc.nextInt();
	    System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		switch (optios) {
		case 1: {
			int c=a+b;	
			System.out.println("addition is "+c);
			break;
		}
		
		case 2: {
			int c=a-b;	
			System.out.println("sub is "+c);
			break;
		}
		
		case 3: {
			int c=a*b;	
			System.out.println("mult is "+c);
			break;
		}
		
		case 4: {
			int c=a/b;	
			System.out.println("divsion is "+c);
			break;
		}
		default:
			System.out.println("enter valid input");
		}

	}

}
