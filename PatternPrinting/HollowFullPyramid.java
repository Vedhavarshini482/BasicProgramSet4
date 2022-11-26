import java.util.Scanner;

public class HollowFullPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = i; j < num; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == num)
					System.out.print(j + " ");
				else
					System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				if (j == i - 1 && j < num - 1)
					System.out.print(j + 1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}