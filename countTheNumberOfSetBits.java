package bitManipulation;

public class countTheNumberOfSetBits {
public static void main(String[] args) {
	count(8);
}
static void count(int num) {
	int count = 0;
	while(num!=0) {
		if((num &1) == 1) {
			count++;
		}
		num = num>>1;
	}
	System.out.print(count);
}
}
