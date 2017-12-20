package ui;

import java.util.Scanner;

public class console {

	public static void main(String args[]){
		int os_num = -1;
		Scanner scanner = new Scanner(System.in);
		COManager com = new COManager();

		System.out.println("Greetings, and welcome to the Cookoff 2.0 Console\n\n");

		System.out.println("User:");
		String username = scanner.nextLine();
		System.out.println("Pass:");
		String password = scanner.nextLine();

		int unsuccessfulAttempts = 0;
		while(!com.initialize(username, password)){
			unsuccessfulAttempts++;
			if(unsuccessfulAttempts >= 5){
				System.out.println("Maximum unsuccessful attempts reached. Goodbye.");
				return;
			}

			System.out.println("Login unsuccessful. Please Try Again.");

			System.out.println("User:");
			username = scanner.nextLine();
			System.out.println("Pass:");
			password = scanner.nextLine();
		}

		while(os_num != 0){

		}

	}	

}
