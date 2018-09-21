import java.lang.Math;
import java.io.*;

public class Lab3_Group15{
	public static void main(String args[]) throws IOException{
		BufferedReader input = new BufferedReader (new
		InputStreamReader (System.in));
		double numberA = 0, numberB = 0, numberC = 0;
		System.out.println(" ");
		System.out.println("Hypotenuse Calculator");
		System.out.println(" ");
		System.out.println("Please input the first number:");
		System.out.print("First Number: ");
		numberA = Double.parseDouble(input.readLine());
		System.out.println(" ");
		System.out.println("Please input the second number:");
		System.out.print("Second Number: ");
		numberB = Double.parseDouble(input.readLine());
		numberA = Math.pow((numberA),(2));
		numberB = Math.pow((numberB),(2));
		numberC = numberA+numberB;
		numberC = Math.sqrt(numberC);
		System.out.println(" ");
		System.out.println("Results");
		System.out.println("Hypotenuse:" + "	"+ numberC);
		numberA = Math.sqrt(numberA);
		numberB = Math.sqrt(numberB);
		System.out.println("Side A:" + "		" + numberA);
		System.out.println("Side B:" + "		" + numberB);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Made by: Carl Mataga and Franko Padulla");
	}
}
