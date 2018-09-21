import java.io.*;

public class DollartoPeso{
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new
		InputStreamReader(System.in));
		double dollarAmount = 0, pesoAmount = 0;
		System.out.println("Dollar to Peso Converter");
		System.out.println("Please input the amount of Dollars you want to convert");
		dollarAmount = Double.parseDouble(input.readLine());
		pesoAmount = dollarAmount*53.84;
		System.out.println("Dollar(s): " + dollarAmount);
		System.out.println("Equivalent Pesos: " + pesoAmount);
	}
}