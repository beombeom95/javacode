package exam.operator;

import java.util.Scanner;

public class AppleBox {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사과갯수를 입력해주세요");
		int apple = scan.nextInt();
		System.out.println("박스당 갯수를 입력해주세요");
		int box = scan.nextInt();
		
		int a = (int) Math.ceil(apple/box);
		int b = apple%box;
		
		System.out.println("사과의 총 갯수는" + apple);
		System.out.println(a+"박스"+b+"개");

	}

}
