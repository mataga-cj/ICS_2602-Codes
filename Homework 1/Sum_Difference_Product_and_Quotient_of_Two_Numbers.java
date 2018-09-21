import java.io.*;

public class Sum_Difference_Product_and_Quotient_of_Two_Numbers{
	public static void main(String args[]) throws IOException {
	BufferedReader input = new BufferedReader (new
	InputStreamReader(System.in));
	double numberA = 0, numberB = 0, sumA = 0, differenceA = 0, productA = 0, quotientA = 0;
	System.out.println("Sum, Difference, Product, and Quotient of Two Numbers");
	System.out.println("Please input the first number.");
	numberA = Double.parseDouble(input.readLine());
	System.out.println("Please input the second number.");
	numberB = Double.parseDouble(input.readLine());
	sumA = numberA + numberB;
	differenceA = numberA - numberB;
	productA = numberA * numberB;
	quotientA = numberA / numberB;
	System.out.println("Results:");
	System.out.println("Sum: " + sumA);
	System.out.println("Difference: " + differenceA);
	System.out.println("Product: " + productA);
	System.out.println("Quotient: " + quotientA);
	}
}