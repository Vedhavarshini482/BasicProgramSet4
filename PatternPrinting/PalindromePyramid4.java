import java.util.Scanner;

public class PalindromePyramid4 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 2 * n - i; j++)
				System.out.print("*");
			for (int j = 1; j <= i; j++)
				System.out.print(i + "*");
			for (int j = 1; j < 2 * n - i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}