import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		
		//declaration of variables
		String dayOfWeek;
		int age, i = 0;
		
		//input method
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		//accepting day input
		System.out.println("***Ticketing System***");
		System.out.println("Enter the day of the week ");
		dayOfWeek = keyboard.next();
		
		
		switch(dayOfWeek.toUpperCase()) {
		
		//switch for weekdays
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY":
			
			System.out.println("Enter the customer's age");
			age = keyboard.nextInt();
			
			if ((age < 10 ) || (age > 65)) {
				System.out.println("The ticket is free of cost");
			}
			else if ((age >= 10) && (age <= 65)){
				System.out.println("The ticket costs RM10");
			}
			else {
					System.out.println("INVALID AGE");
				}
		break;
		
		//switch for weekends
		case "FRIDAY", "SATURDAY", "SUNDAY":
			
			System.out.println("Enter the customer's age");
			age = keyboard.nextInt();
			
			if ((age < 10) || (age > 65)) {
				System.out.println("The ticket costs RM10");
			}
			else if ((age >= 10) && (age <= 65)) {
				System.out.println("The ticket costs RM20");
			}
			else {
				System.out.println("INVALID AGE");
			}
		break;
		
		default : System.out.println("Invalid day");
				
			}
		
		//To retry in case of invalid input
		System.out.println("To go again enter any integer || to exit enter 1");
		i = keyboard.nextInt();
		
		}while(i!=1);
		
		System.out.println("***THANK YOU, HAVE A GOOD DAY***");
		keyboard.close();
				
			}
		
		
		}
		

	


