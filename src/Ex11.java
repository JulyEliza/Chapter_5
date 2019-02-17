import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, n, value, smallest = 0;
		
		System.out.print("Enter the numbers of values: ");
		n = input.nextInt();
		
		System.out.printf("Enter %d values: ", n);
		for (i = 1; i <= n; i++) {
			value = input.nextInt();
			
			 if (i == 1)
		            smallest = value; 
		         else
		            if (value < smallest)
		               smallest = value; 
		}
		
		System.out.printf("\nThe smallest integer is %d\n\n", smallest);
		input.close();
	}

}
