package exam.ifTest;
import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.(1~100)");
		int grade = scan.nextInt();
		
		switch(grade/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("E");
			break;
		}
		
		
	}

}
