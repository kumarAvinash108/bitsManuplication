package bitManipulation;

public class isPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerTwo(8));

	}
	static boolean isPowerTwo(int n) {
		return (n & (n-1))==0;
	}

}
