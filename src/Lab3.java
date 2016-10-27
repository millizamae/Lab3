import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		System.out.println("Learn your squares and cubes!");

		String input = "y";

		Scanner scn = new Scanner(System.in);

		while (input.equalsIgnoreCase("y")) {

			System.out.println("Enter an integer: ");
			int amount = scn.nextInt();
			
	

			System.out.println("Number" + "\t" + "Squared" + "\t" + "Cubed");
			System.out.println("====" + "\t" + "====" + "\t" + "====");

			for (int i = 1; i <= amount; i++) {
				System.out.print(i + "\t");
				System.out.print(i * i + "\t");
				System.out.println(i * i * i);
			}

			System.out.println("Continue y/n?");
			input = scn.next();
		}
			System.out.println("Goodbye!");
			scn.close();
	}
	
}
