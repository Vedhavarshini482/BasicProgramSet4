import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n; j++) {
				{
					if (i >= j || i > (2 * n) - j)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= 2 * n; j++) {
				{
					if (i >= j || i > (2 * n) - j)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}