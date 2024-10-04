import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		numbers();
	}

	@SuppressWarnings("resource")
	public static void numbers() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome");
		System.out.print("How many elements should the array contain?");
		
		int numberLengt = scanner.nextInt();
		
		int[] numbers = new int[numberLengt];
		for (int i = 0; i < numberLengt; i++) {
			System.out.print(" Plase enter the number " + i + "--------");
			int number = scanner.nextInt();
			numbers[i] = number;
		}
		testNumber(numbers);
	}

	public static void testNumber(int numbers[]) {
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(" is an even number " + number);
			} else {
				System.out.println(" is an odd number " + number);
			}
		}
	}

}
