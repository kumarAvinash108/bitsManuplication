package bitManipulation;

public class clearBitsInRange {
	public static void main(String[] args) {
		clearBitsInRange1(10,0,2);
	}
static void clearBitsInRange1(int number, int i , int j) {
	int a = (-1)<<j+1;
	int b = (1<<i) - 1;
	System.out.print(number & (a|b));
	
}
}
