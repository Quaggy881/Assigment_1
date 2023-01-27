import java.util.Scanner;
public class Task_1 {

	public static void main(String[] args) {
		
		//Declaration of variables
		int adults = 0, kids = 0, dessert = 0, salad = 0,answer, i = 1;
		double total;
		
		//to accept input
		Scanner keyboard = new Scanner(System.in);
		
		do { try {
			
			String ans ;
			
			//Takes in the number of main orders
			System.out.println("Enter the number of Adult Lunch sets you would like to purchase: ");
			ans = keyboard.next();
			adults = Integer.parseInt(ans);
			
			System.out.println("Enter the number of Kids Lunch sets you would like to purchase: ");
			ans = keyboard.next();
			kids = Integer.parseInt(ans);
			
			System.out.println("Would you like to buy any side dishes? Enter 1 for yes || any other integer for no");
			answer = keyboard.nextInt();
			
			//Takes in the number of side orders
			if (answer == 1) {
				
				System.out.println("Enter the number of Salads you would like to purchase: ");
				ans = keyboard.next();
				salad = Integer.parseInt(ans); 
				
				System.out.println("Enter the number of Desserts you would like to purchase: ");
				ans = keyboard.next();
				dessert = Integer.parseInt(ans);
			}	
			else {
					System.out.println("Thank you, proceed.");
				}
				
			//Calculates & Outputs the total
			total = (adults * 20) + (kids * 12) + (salad * 4) + (dessert * 5);
			
			System.out.println("Your total is: RM" + total);
			
			//Prompts user to go again or end program
			System.out.println("To order more enter 1 || To exit enter 2");
			ans = keyboard.next();
			i = Integer.parseInt(ans);
			
		} 
		//Implementation of exception handling
		catch(NumberFormatException e) {
			System.out.println("Please enter a number");
		}
		catch(Exception e){
			System.out.println("Please enter a number");
		}
			
		} while(i==1);
		
		System.out.println("Have a good day :)");
		
		keyboard.close();
	
	}
}
