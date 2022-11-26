import java.util.Scanner;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int n = num;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print(j + " ");
			n--;
			System.out.println();
		}
	}
}