import java.util.Scanner;

public class Test {
	// login ultraslan
	// pasword 1905
	
	static boolean active = true;
	static int chance = 3;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome");

		while (active && chance != 0) {

			System.out.print("Please write you name : ");
			String userName = scanner.nextLine();

			System.out.print("Please write you password : ");
			String userPassword = scanner.nextLine();
			loginToCheck(userName, userPassword);
		}

	}

	public static void loginToCheck(String userName, String userPassword) {

		if (userName.equals("ultraslan") && userPassword.equals("1905")) {
			System.out.println("You have entered the program :)");
			active = false;

		} else {
			System.out.println("You password or name is incorrect");
			chance--;
			if (chance == 0) {
				active = false;
				System.out.println("You have request login 3 times. You account has been blocked");
			}
		}
	}

}
