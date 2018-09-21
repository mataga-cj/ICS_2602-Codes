//import java.util.Scanner;
import java.lang.Math;
import java.io.*;
public class areaOfACircle{
	public static void main(String args[]) throws IOException {
	BufferedReader input = new BufferedReader(new
	InputStreamReader(System.in));
	//Scanner input = new Scanner (System.in);
	double radius = 0, area = 0;
	System.out.println("Input radius");
	radius = Double.parseDouble(input.readLine());
	area = radius*radius*Math.PI;
	System.out.println("Area is " + area);
	}
}	