import java.util.Scanner;

public class PalindromePyramid2 {

	public static void main(String[] args) {
		System.out.println("Enter a Character");
		Scanner s = new Scanner(System.in);
		char n = s.next().charAt(0);
		for (char i = 'A'; i <= n; i++) {
			for (char j = 'A'; j <= i; j++)
				System.out.print(j + " ");
			for (char j = i; j > 'A'; j--)
				System.out.print((char) (j - 1) + " ");
			System.out.println();
		}
	}
}