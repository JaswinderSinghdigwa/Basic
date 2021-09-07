import java.util.*;

public class swaping {
	public static void main(String[] args) {
		int x,y,t;
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = b.nextInt();
		y = b.nextInt();
		System.out.println("before swaping numbers: "+x +"  " + y);
		t=x;
		x=y;
		y=t;
		System.out.println("After Swaping=  "+x +" " + y);
		System.out.println();
	}
}
