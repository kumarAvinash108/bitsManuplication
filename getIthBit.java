package bitManipulation;

public class getIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getBit(10,1);
//		System.out.println(setBit(10,0));
		System.out.println(clearBit(4,2));

}
	static void getBit(int number, int i) {
		int bitmask = 1<<i;
		int result =number & bitmask ;
		if(result == 0) {
			System.out.print(0);
		}
		else {
			System.out.println(1);
		}
	}
	static int setBit(int number, int i) {
		int ans;
		
		int bitmask = 1<<i;
		ans = number | bitmask;
		
		return ans;
	}
	static int clearBit(int number , int i) {
		int bitmask = ~(1 << i);
		
		return number & bitmask;
	}

}
