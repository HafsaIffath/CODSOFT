import java.util.*;

public class NumberGame {
	static Scanner sc=new Scanner(System.in);
	static int result=0;
	public static void number() {
		
		int randInt=(int)(Math.random()*100)+1;
		int count=10;
		while(count>0) {
			int n=sc.nextInt();
			
			if(n==randInt) {
				result++;
				System.out.println("Congrats!! Your guess is correct.");
				break;
			}else if(n<randInt) {
				count--;
				if(count==0) {
					System.out.println("Game End: Too many wrong guesses, Wish you luck next time");
					break;
				}
				System.out.println("OOPS! Number is too small! "+"No. of guesses left: "+count);
				System.out.println("Try again:  ");
			}
			else {
				count--;
				if(count==0) {
					System.out.println("Game End: Too many wrong guesses, Wish you luck next time.");					break;
				}
				System.out.println("OOPS! Number is too big! Try again:  "+"No. of guesses left: "+count);
				System.out.println("Try again:  ");


			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 to start the game: ");
		System.out.println("Enter 2 to play agian");
		System.out.println("Enter 3 to display your score");
		System.out.println("Enter 4 to quit");
		while(true) {
			
			System.out.println("Enter your input: ");
			int a=sc.nextInt();
			
			if(a==1) {
				System.out.println("Enter a number between 1 and 100");
				number();
				
			}else if(a==2) {
				System.out.println("Enter a number between 1 and 100");
				number();
			}else if(a==3) {
				System.out.println("Your score is: "+result);
			}else if(a==4) {
				System.out.println("You Quit");
				return;
			}
		}

		
	}
}
