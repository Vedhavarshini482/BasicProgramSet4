import java.util.Scanner;

public class DiamondPattern2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j == i; j++)
				System.out.print(i);
			for (int j = 1; j <= i - 1; j++)
				System.out.print("*" + i);
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = i; j == i; j++)
				System.out.print(i);
			for (int j = 1; j <= i - 1; j++)
				System.out.print("*" + i);
			System.out.println();
		}
	}
}