import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, n;
		
		for (i = 1; i <= 5; i++) {
			System.out.println();
			System.out.print("Enter an value: ");
			n = input.nextInt();
			
			for (int j = 1; j <= n; j++)
				System.out.print("*");
		}
		
		input.close();

	}

}
