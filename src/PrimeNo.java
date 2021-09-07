import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int number,i;
		Scanner b = new Scanner(System.in);
		System.out.println("Enter a number");
		number = b.nextInt();
		for ( i=2 ;  i <=number ; i++)
		{
			while (number % i == 0)
			{
				System.out.println(i+ " ");
				number=number/i;
			}
		}
	if (number > 2)
	{
		System.out.println(number);
	}
	}
}
