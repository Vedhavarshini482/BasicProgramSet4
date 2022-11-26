import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int row = scanner.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (j == row / 2 || i == row / 2 || i + j == row / 2
						|| Math.abs(i - j) == row / 2 || i + j == (row / 2) * 3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}