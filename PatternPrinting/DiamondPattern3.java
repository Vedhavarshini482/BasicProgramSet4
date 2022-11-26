import java.util.Scanner;

public class DiamondPattern3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int number = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j == i; j++, number++)
				System.out.print(number);
			for (int j = 1; j < i; j++, number++)
				System.out.print("*" + number);
			System.out.println();
		}
		number = number - n;
		for (int i = n; i >= 1; i--) {
			for (int j = i; j == i; j++, number++)
				System.out.print(number);
			for (int j = 1; j < i; j++, number++)
				System.out.print("*" + number);
			number = number - 2 * (i - 1) - 1;
			System.out.println();
		}
	}
}