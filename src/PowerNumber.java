import java.util.Scanner;

public class PowerNumber {
 public static void main(String[] args) {
	int a=1,i;
	System.out.println("Enter the number for power Table");
	Scanner sc = new Scanner(System.in);
	Long b = sc.nextLong();
	
	for (i=1;i<=b;i++)
	{
		a=a*2;
		System.out.println("2 ^ " + i + " = " +a);
	}
	
}
}
