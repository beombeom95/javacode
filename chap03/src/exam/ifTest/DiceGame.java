package exam.ifTest;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count = 0;
		while(count<=4) {
			int computer = (int)(Math.random()*6)+1;

			System.out.println("1에서 6사이의 숫자를 입력해주세요.");
			int user = scan.nextInt();
			System.out.println(computer); //주사위
			
			
			if(user>=1 & user <=6) {
				if(computer==user) {
					System.out.println("정답입니다!");
					count1 = ++count;
				}else {
					System.out.println("오답입니다!");
					count2 = ++count2;
				}
			}else {
				System.out.println("error!");
				count3 = ++count3;
			}
		}
		count = count1+count2+count3;
		System.out.println(count+"번 시도해서"+count1+"번 맞췄습니다! 허접이시네요 ㅇㅅㅇ ");
	}
}
