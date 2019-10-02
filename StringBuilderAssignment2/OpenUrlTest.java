package StringBuilderAssignment2;

import java.util.Scanner;

public class OpenUrlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OpenUrl url = new OpenUrl();

		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();

		System.out.println(url.checkOpenUrl(s1));

	}

}
