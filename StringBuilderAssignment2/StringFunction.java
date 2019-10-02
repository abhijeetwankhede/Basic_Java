package StringBuilderAssignment2;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s1 = "Abhijeet";

		String s2 = "comp department";

		System.out.println("the concatenation of two strings is " + s1.concat(s2));

		System.out.println("the character at 7th place of string 2 is " + s2.charAt(7));

		System.out.println("the comparison of two strings is " + s1.compareTo(s2));

		System.out.println("Boolean comparison ignoring case considerations " +

				s1.equalsIgnoreCase(s2));

		System.out.println("hash code of string 2 is  " + s2.hashCode());

		System.out.println("index of E in string 2 is " + s2.indexOf('e', 3));

		System.out.println("index of E in string 2 from last is " + s2.lastIndexOf('e', 16));

		System.out.println("length of string 2 is " + s2.length());

		System.out.println("after replacing e with k in string 1, string 1 = " + s1.replace('E', 'K'));

		System.out.println("substring of string 2 = " + s2.substring(4));

		System.out.println("substring of string 2 from 4 to 9" + s2.substring(4, 9));

		System.out.println("lower case of string1 is =" + s1.toLowerCase());

		System.out.println("UPPER case of string 2 = " + s2.toUpperCase());

		System.out.println("after trimming, string 2 =" + s2.trim());

	}

}
