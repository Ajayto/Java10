import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter user input");
		Scanner sc= new Scanner(System.in);
		int userInput=sc.nextInt();
		do {
			System.out.println(userInput);
			userInput++;
		}
		while(userInput<=100);

	}

}
