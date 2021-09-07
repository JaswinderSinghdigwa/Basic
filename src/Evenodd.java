

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("Enter the number =");
		Scanner b = new Scanner(System.in);
		int a = b.nextInt();
		if (a % 2 == 0 )
		{
			System.out.println(a+ "= number is even");
		}
		else
			System.out.println(a+ "= number is odd");
		}
}
