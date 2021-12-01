package ExceptionDemo;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDemo a=new AccountDemo();
		a.withdraw(11000);

	}

}

class AccountDemo{
	int balance=10000;
	void withdraw(int amount) {
		if(amount<balance) {
			balance=balance-amount;
			System.out.println("current balance"+balance);
		}
		else {
			throw new MyException("Your balance is low");
		}
		
	}
	
}
