public class TestOperator{
	public static void main(String args[]){
		int x = 10;
		boolean ans = true;
		System.out.println(x++ + "   Current Value of x is " + x);
		System.out.println(++x + "   Current Value of x is " + x);
		System.out.println(x-- + "   Current Value of x is " + x);
		System.out.println(--x + "   Current Value of x is " + x);
		System.out.println(x++ + ++x + "   Current Value of x is " + x);
		System.out.println(++x + x++ + "   Current Value of x is " + x);
		System.out.println(x-- + --x + "   Current Value of x is " + x);
		System.out.println(!ans);
		System.out.print(x<<2);
		System.out.println("   Current Value of x is " + x);
		System.out.println(-20>>2);
		System.out.println(-20>>>2);
		System.out.println(-20>2 && 10>20);
		System.out.println(-20>2 & 10>20);
		System.out.println(-20>2?"hello":"hi");
	}
}