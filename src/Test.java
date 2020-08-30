//------------------------------
//Zachary Bennitt
//Programming Fundamentals
//Summer 2020
//PROGRAMMING ASSIGNMENT 4 - SET
//------------------------------

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//Prints my info
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Zachary Bennitt");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
		System.out.println(" ");
		
		// Scanner for user
		Scanner scan = new Scanner(System.in);
		Set set = new Set();
		Boolean input = true;
		
		// Loop (infinite) for user to enter command and integer
		while (input) {
			
			System.out.print("Enter command: ");
			String[] adt = scan.nextLine().split(" ");
			int i = Integer.parseInt(adt[1]);
			
			try {
			
				// Switch statement for choosing method from use input command
				switch (adt[0]) {
			
				case "add":
					set.add(i);
					System.out.println(set);
					break;
				
				case "del":
					set.del(i);
					System.out.println(set);
					break;
				
				case "exists":
					System.out.println(set.exists(i));
					break;
				
				default:
					System.out.println("Please enter a valid command... ");
					break;
			
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid number... ");
			}
		}
		scan.close();
	}
}
