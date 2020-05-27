package exam.operator;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		
		byte x1 = 127;
		byte y1 = (byte)(x1+2);
		System.out.println(y1);
		
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2*y2;
		System.out.println(z2);
		
	}

}
