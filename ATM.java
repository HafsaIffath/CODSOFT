import java.util.Scanner;

class User{
	int accBal;
	
	public void withdraw(int amt) {
		if(accBal<amt) {
			System.out.println("There is no sufficient balance for withdrawal");
		}else {
			accBal=accBal-amt;
			System.out.println("Withdrawal successful, Account Balance: "+accBal);
		}
	}
	
	public void deposit(int amt) {
		accBal=accBal+amt;
		System.out.println("Deposited Successfullt, Account Balance: "+accBal);
	}
	
	public int checkBalance() {
		return accBal;
	}
}

public class ATM {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User user=new User();
		boolean bol=true;
		
		System.out.println("Enter 1 to withdraw money ");
		System.out.println("Enter 2 to deposit money");
		System.out.println("Enter 3 to check balance");
		System.out.println("Enter 4 to exit");
		while(bol) {
			
			int n=sc.nextInt();
			
			
			
			switch (n) {
			case 1:
				System.out.println("Enter amount to withdraw");
				int a=sc.nextInt();
				user.withdraw(a);
				break;
				
			case 2:
				System.out.println("Enter amount to deposit");
				int b=sc.nextInt();
				user.deposit(b);
				break;
				
			case 3:
				System.out.println("Account Balance: "+user.checkBalance());
				break;
			case 4:
				bol=false;
				System.out.println("Exiting...");
				break;
			default: 
				System.out.println("Invalid input");
				break;
			}
		}
		
		
	}
}
