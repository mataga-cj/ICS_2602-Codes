import java.util.*;

public class dataTypes{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		boolean varBoolean = true;
		byte varByte = 10;
		short varShort = 100;
		int varInt = 1000;
		long varLong = 10000;
		float varFloat = 10;
		double varDouble = 60.50;
		char varChar = 'A';
		
		double num1 = 10, num2 = 20, sum = 0;
		
		System.out.println("\nBoolean: " + varBoolean);
		System.out.println("Byte: " + varByte);
		System.out.println("Short: " + varShort);
		System.out.println("Int: " + varInt);
		System.out.println("Long: " + varLong);
		System.out.println("Float: " + varFloat);
		System.out.println("Double: " + varDouble);
		System.out.println("Character: " + varChar);
		
		System.out.println("========== Sum of two numbers ==========");
		System.out.print("Input First Number: ");
		num1 = input.nextDouble();
		System.out.print("Input Second Number: ");
		num2 = input.nextDouble();
		sum = num1 + num2;
		System.out.print("Sum of Two Numbers: " + sum);
	}
}