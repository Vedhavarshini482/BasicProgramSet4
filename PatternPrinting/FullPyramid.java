import java.util.Scanner;

public class FullPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < 2 * (num - i); j++)
				System.out.print(" ");
			for (int k = 1, j = i; k <= i; k++, j++) {
				System.out.print(j + " ");
				n = j;
			}
			for (int k = n - 1; k >= i; k--)
				System.out.print(k + " ");
			System.out.println();
		}
	}
}