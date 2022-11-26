import java.util.Scanner;

public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if (j == i || j == n || i == 1)
					System.out.print(j + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}