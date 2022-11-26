import java.util.Scanner;

public class HollowHalfPyramid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				if (j == 1 || j == i || i == num)
					System.out.print(j + " ");
				else
					System.out.print("  ");
			System.out.println();
		}
	}
}