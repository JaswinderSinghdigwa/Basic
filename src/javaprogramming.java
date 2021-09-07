import java.util.Scanner;


public class javaprogramming {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Find to largest Number");
		System.out.println("Enter 1 number=");
		int a = s.nextInt();
		System.out.println("Enter 2 number=");
		int b = s.nextInt();
		System.out.println("Enter 3 number=");
		int c = s.nextInt();
		if(a>b && a>c)
			
			{
			  System.out.println(a+ " a is largest number ");
			}
		else if(b>a && b>c)
		{
			System.out.println(b+ "b is largest number");
		}
		else
		{
			System.out.println(c+ "c is largest number");
	
		}
	}
}
