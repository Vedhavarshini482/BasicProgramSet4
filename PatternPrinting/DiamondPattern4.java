import java.util.Scanner;

public class DiamondPatter4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int j = 1;
		for (int i = 1; i <= n + 1; i++) {
			System.out.print("* ");
			for (j = 1; j < i; j++)
				System.out.print(j + " ");
			for (int k = j; k > 1; k--) {
				if (k - 1 == 1)
					System.out.print("* ");
				else
					System.out.print(k - 2 + " ");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			System.out.print("* ");
			for (j = 1; j < i; j++)
				System.out.print(j + " ");
			for (int k = j; k > 1; k--) {
				if (k - 1 == 1)
					System.out.print("* ");
				else
					System.out.print(k - 2 + " ");
			}
			System.out.println();
		}
	}
}