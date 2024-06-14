package bitManipulation;

public class clearIthBitInReal {

	public static void main(String[] args) {
		clearIthBit(15,2);
		
	}
	static void clearIthBit(int number, int i) {
		System.out.println(number & ~(1<<i));
	}

}
