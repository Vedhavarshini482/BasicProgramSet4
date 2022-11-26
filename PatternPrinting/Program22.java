import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Odd number");
		int number = scanner.nextInt();
		if (number % 2 != 0) {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= number; j++) {
					if (i == number || i == 1 || i == j || j == number
							|| j == 1 || j + i == number + 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		} else
			System.out.println("You entered an even number ");
	}
}