public class Variable05 {
	public static void main(String[] args) {
		//단일 문자 데이터 타입 : char(2Byte) ▶ 하나의 글자만 저장
		// 값을 할당할 때는 반드시 작은 따옴표('')를 사용한다.
		
		//char : char 타입에 ch1 변수에 A , ch2 변수에 '가', ch3 변수에 '★'를 초기화해라.
		char ch1 = 'A';
		char ch2 = '가';
		char ch3 = '★';
		
		System.out.println("변수 ch1의 값 : " + ch1);
		System.out.println("변수 ch2의 값 : " + ch2);
		System.out.println("변수 ch3의 값 : " + ch3);
		
		// char는 변수 선언, 할당을 한글자씩 해야 하는 번거로움이있다.
		// 불편함을 해결하고자 새로운 타입 String
		
		
		//String : 문자열을 저장할 수 있는 클래스(참조형자료에 사용됨)
		//값을 할당할 때는 반드시 쌍따옴표("")를 사용한다.
	
		String str1 = "ABCD";
		String str2 = "대한민국";
		
		System.out.println(str1);
		System.out.println(str2);
	}//main()
}//class