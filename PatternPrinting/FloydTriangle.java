import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n = s.nextInt();

		for (int i = 1, a = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++, a++)
				System.out.print(a + " ");
			System.out.println();
		}
	}
}