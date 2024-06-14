package bitManipulation;

public class clearIthBit {
// clearing i bits
	public static void main(String[] args) {
		System.out.println(clearIBits(11,1));

	}
	static int clearIBits(int number , int i) {
		
		int bitMask  = (-1)<<i;
//		System.out.println(bitMask);
		
		return number & bitMask;
	}

}
