public class Strings{
	public static void main(String args[]){
		//basic declarations and outputs
		String a = "I ";
		String b = "love ";
		String c = "Philippines";
		String d = a + b + c;
		System.out.println(c);
		System.out.println(d + c);
		System.out.println(" ");
		//concat
		System.out.println(a.concat(b));
		System.out.println(a.concat(b).concat(c));
		System.out.println(" ");
		//length and substring syntax
		String country = "                I love Philippines                   ";
		System.out.println("Length: "+country.length());
		System.out.println(country.substring(2));
		System.out.println(country.substring(2,6));
		System.out.println(country.substring(0,18)); // this is the max length for I love Philippines
		String country2 = "Philippines";
		System.out.println(country.substring(country.length()-1)); // You can have methods inside of methods inside of methods, you get the point
		System.out.println(" ");
		//charAt syntax
		System.out.println(country.charAt(0));
		System.out.println("Philippines".charAt(0));
		String aa = "Juan";
		System.out.println(" ");
		//replace syntax
		String bb = aa.replace('u','e');
		System.out.println (aa);
		System.out.println (bb);
		String cc = a.replace("I", "!");
		System.out.println (cc);
		System.out.println(" ");
		// //toUpperCase syntax and //toLowerCase syntax
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(" ");
		//equals syntax
		System.out.println(d.equals("I love Philippines"));
		System.out.println(" ");
		//equalsIgnoreCase syntax
		System.out.println(d.equalsIgnoreCase("i LoVe PhiLippIneS"));
		System.out.println(" ");
		//trim syntax. it only works before and after the characters that are not spaces, not in between them
		System.out.println(country);
		System.out.println(d.trim());
		System.out.println(" ");
		//split syntax. will not appear in quiz or lab YET
		String str = "aaa:bbb:ccc";
		String results[] = str.split (":");
		for (String r : results) {
			System.out.println(r);
		}
		System.out.println(" ");
		// in StringBuffer, append is similar to concat
		// append syntax 
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);
		System.out.println(" ");
		// insert syntax
		sb.insert(1, "def");
		System.out.println(sb);
		System.out.println(" ");
	}
}
