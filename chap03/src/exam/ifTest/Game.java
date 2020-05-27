package exam.ifTest;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int computer = (int)(Math.random()*100)+1;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int counts = 0;

		while(count<=9) {
			System.out.println("숫자를 입력해주세요.");
			int user = scan.nextInt();
			if(user>=1 & user<=100){
				if(user>computer) {
					System.out.println("더 작은수를 입력하세요.");
					count1 = ++count1;
				}else if (user<computer) {
					System.out.println("더 큰수를 입려하세요.");
					count2 = ++count2;
				}else if (user==computer){
					System.out.println("정답입니다.");
					break;
				}
			}else {
				System.out.println("'warning'입력 숫자를 확인하세요");
				count3 = ++count3;
				
			}
		}
		counts = count1+count2+count3;
		if(counts<3 & counts>=1) {
			System.out.println(counts+"번 시도해서" +"100점입니다");
		}
		else if(counts<5 & counts>=3) {
			System.out.println(counts+"번 시도해서" +"90점입니다");
		}
		else if(counts<7 & counts>=5) {
			System.out.println(counts+"번 시도해서" +"80점입니다");
		}
		else if(counts<9 & counts>=7) {
			System.out.println(counts+"번 시도해서" +"70점입니다");
		}
		else if(counts<11 & counts>=9) {
			System.out.println(counts+"번 시도해서" +"60점입니다");
		}
		else{
			System.out.println("10회안에 맞추지 못하셔서 탈락입니다");
		}
		
	}
}
// 10번 기회를 줘서 점수 구하기(게임포기 불가능 맞출때까지 해야함)
// 1~2시도 : 100
// 3~4시도 : 90
// 5~6시도 : 80
// 7~8시도 : 70
// 9~10시도 :60
// 탈락