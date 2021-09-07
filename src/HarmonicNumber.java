import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) 
	{
		int i;
		float h=1;
		Scanner d = new Scanner(System.in);
		System.out.print(" Enter n for Harmonic Series");
	int n = d.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.println("1/"+i+" + ");
		h += (float)1 / i;
	}
	System.out.println("Sum of Harmonic series is =" +h);
	}
}

