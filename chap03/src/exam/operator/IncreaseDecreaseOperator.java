package exam.operator;

public class IncreaseDecreaseOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		
		System.out.println(x);
		z=x++;
		System.out.println(z);
		System.out.println(x);
	}

}
