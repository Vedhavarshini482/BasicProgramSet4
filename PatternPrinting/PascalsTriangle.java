import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++)
				System.out.print(" ");
			int num = 1;
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					num = 1;
				else
					num = num * (i - j + 1) / j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}