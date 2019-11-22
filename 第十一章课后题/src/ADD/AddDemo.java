package ADD;

import java.util.Scanner;

public class AddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		Add add = new Add(number1,number2);
		
		while(answer != add.getSum()){
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");

	}

}
