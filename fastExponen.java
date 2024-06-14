package bitManipulation;

public class fastExponen {
	public static void main(String[] args) {
		System.out.println(exponencial(2,8));
	}
	static int exponencial(int n, int a) {
		int ans =1;
		while(a!=0) {
			if((a & 1) == 1) {
				ans *= n;
			}
			n *=n;
			a = a>>1;
		}
	
		
		return ans;
	}

}
