import java.util.Scanner;

public class FortuneTellerApp {
	
	//Check for quit
	public static void checkForQuit(String input) {
		if (input.equalsIgnoreCase("Quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
				
		System.out.println("Type \"Quit\" to quit any time.");

		Scanner input = new Scanner(System.in);
		
		//Input first name
		System.out.println("Enter your first name.");
		String firstName = input.nextLine();
		checkForQuit(firstName);

		//Inout last name
		System.out.println("Enter your last name.");
		String lastName = input.nextLine();
		checkForQuit(lastName);

		//Input age
		System.out.println("Enter your age.");
		String x = input.next();
		checkForQuit(x);
		int age = Integer.parseInt(x);

		//Input birth month
		System.out.println("Enter your birth month number 1-12.");
		String y = input.next();
		checkForQuit(y);
		int birthMonth = Integer.parseInt(y);
		
		//Input color
		System.out.println(
				"Enter your favorite ROYGBIV color. If you don't know what a ROYGBIV color is enter \"Help.\"");
		String color = input.next();
		checkForQuit(color);
		if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("yellow")
				|| color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("indigo")
				|| color.equalsIgnoreCase("violet")) {
		} else if (color.equalsIgnoreCase("help")) {
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo or Violet.");

			System.out.println(
					"Enter your favorite ROYGBIV color. If you don't know what a ROYGBIV color is enter \"Help.\"");
			color = input.next();
			checkForQuit(color);
			if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("yellow")
					|| color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue")
					|| color.equalsIgnoreCase("indigo") || color.equalsIgnoreCase("violet")) {
			} else if (color.equalsIgnoreCase("help")) {
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo or Violet.");
			}
		}
		
		//Input siblings
		System.out.println("Enter your number of siblings.");
		String z = input.next();
		checkForQuit(z);
		int siblings = Integer.parseInt(z);

		//Output retire years
		int retireYears = 0;
		if (age % 2 == 1) {
			retireYears = 15;
		} else if (age % 2 == 0) {
			retireYears = 20;
		}

		//Output vacation home
		String vacaHome;
		if (siblings < 0) {
			vacaHome = "Cleveland";
		} else {
			switch (siblings) {
			case 0:
				vacaHome = "Clintonville";
				break;
			case 1:
				vacaHome = "Maui";
				break;
			case 2:
				vacaHome = "Puerto Rico";
				break;
			case 3:
				vacaHome = "St Augustine";
				break;
			default:
				vacaHome = "Jacksonville";
				break;
			}
		}
		
		//Output mode of transportation
		String modeOfTransportation = color;
		switch (color) {
		case "red":
			modeOfTransportation = "Fiat";
			break;
		case "orange":
			modeOfTransportation = "Mini";
			break;
		case "yellow":
			modeOfTransportation = "Ford";
			break;
		case "green":
			modeOfTransportation = "Porsche";
			break;
		case "blue":
			modeOfTransportation = "Volkswagon";
			break;
		case "indigo":
			modeOfTransportation = "Prius";
			break;
		case "violet":
			modeOfTransportation = "Airplane";
			break;
		}
		//Output money
		String money = "none";
		if (birthMonth == 1 || birthMonth == 2 || birthMonth == 3 || birthMonth == 4) {
			money = ("$40,000");

		} else if (birthMonth == 5 || birthMonth == 6 || birthMonth == 7 || birthMonth == 8) {
			money = ("$50,000");

		} else if (birthMonth == 9 || birthMonth == 10 || birthMonth == 11 || birthMonth == 12) {
			money = ("$60,000");

		} else {
			money = ("$0");

		}
		//Final fortune
		System.out.println(firstName + " " + lastName + " will retire in " + retireYears + " years with " + money
				+ " in the bank, a vacation home in " + vacaHome + " and a " + modeOfTransportation + ".");

	}
}
