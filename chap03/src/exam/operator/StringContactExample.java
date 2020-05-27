package exam.operator;

public class StringContactExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		String str3 = 4+3+"jdk"; // 문자열을 연결할 때 +쓸 수 있지만 앞에 숫자들이 있으면 숫자들은 계산된다.
		System.out.println(str3);
		
	}

}
