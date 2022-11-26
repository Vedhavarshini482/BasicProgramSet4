import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= number; j++)
				if (j == 1 || j == number || i == 1 || i == number)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}