import java.util.Scanner;

public class DiamondPattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int first = scanner.nextInt();
		System.out.println("Enter the number of rows");
		int rows = scanner.nextInt();
		int count = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= count; j++)
				System.out.print(first);
			count++;
			first++;
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j < count - 1; j++)
				System.out.print(first - 2);
			count--;
			first--;
			System.out.println();
		}
	}
}