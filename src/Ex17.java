import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		double sum = 0;
		int quantity;

		System.out.println("Product number - Quantity sold");
		System.out.println("1 -Product 1, $2.98");
		System.out.println("2 -Product 2, $4.50");
		System.out.println("3 -Product 3, $9.98");
		System.out.println("4 -Product 4, $4.49");
		System.out.println("5 -Product 5, $6.87");
		
		while (number != -1) {

			System.out.print("Enter product number: ");
			number = input.nextInt();
			System.out.print("Enter quantity sold: ");
			quantity = input.nextInt();
			switch (number) {
			case 1:
				sum += 2.98 * quantity;
				break;
			case 2:
				sum += 4.50 * quantity;
				break;
			case 3:
				sum += 9.98 * quantity;
				break;
			case 4:
				sum += 4.49 * quantity;
				break;
			case 5:
				sum += 6.87 * quantity;
				break;
			}

		}
		System.out.printf("The total retail value of all products sold is %f", sum);
		input.close();
	}

}
