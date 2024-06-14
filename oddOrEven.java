

package bitManipulation;
import java.util.*;

public class oddOrEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number  = sc.nextInt();
		if((number & 1) == 0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("It is a odd number");
		}
	}

}
