package exam.operator;

public class CompareOperatorExample {

	public static void main(String[] args) {
		System.out.println(1==1);
		System.out.println('A'==65); 
		System.out.println('A'<'B'); // char변수도 비교가능
		System.out.println(3==3.0);
		System.out.println(0.1==0.1f);
		System.out.println(1.0==1.0f);
		
		String str1="대구";
		String str2="대구";
		String str3=new String("대구");
		String str4=new String("대구");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4); // == : 주소값으로 비교
		System.out.println(str3.equals(str4));
	}

}
