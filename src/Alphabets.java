import java.util.Scanner;


public class Alphabets {
 public static void main(String[] args) {
	System.out.println("Enter a character = " );
	Scanner b = new Scanner(System.in);
	char ch = b.next().charAt(0);
	if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch =='u' || ch =='A' || ch =='I' || ch =='O' || ch =='E' || ch =='U')
		System.out.println(ch + "Character is Vowel");
	else
		System.out.println(ch + "Character is not Vowel");
}
}
