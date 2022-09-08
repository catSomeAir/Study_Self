public class Casting03 {
	public static void main(String[] args) {
		//String 클래스를 이용하여 문자 10(str1)과 문자 20(str2)을 더하기 연산
		
		String str1 = "10", str2 = "20";		//String 클래스는 문자열 저장 경우 "" 로 할당
				
		System.out.println(str1 + str2);	//출력값 : 1020 ▶ Concatenation(결합, 연결)
		
		//문자 10(str1)을 정수 10(num1)으로 변환
		//int num1 = (int) str1;		//오류 ▶ Casting 연산자를 사용할 수 없다.(Class → PDT)
		//String 타입(Class)을 기본 데이터 타입(PDT)으로 변환해 주는 클래스 ▶ Wrapper Class
		
		int num1 = Integer.parseInt(str1);	//변수 num1에는 문자1 10이 정수 10으로 저장
		int num2 = Integer.parseInt(str2);	//
		
		
		System.out.println(num1 + num2);	//문자를 int타입변수인 num1,num2로바꾼뒤 연산 출력
		System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));
		// 문자str1, str2를 연산 출력과정에서 바로 랩퍼클래스를 이용
		
		//String 클래스를 이용하여 문자 12.3(str3)과 문자 45.67(str4)을 더하기 연산
		String str3 = "12.3" , str4 = "45.67";
		System.out.println(str3 + str4);		//출력값 : 12.345.67

		double num3 = Double.parseDouble(str3);	//String → double
		double num4 = Double.parseDouble(str4);	//Wrapper Class
		System.out.println(num3 + num4);
		System.out.println(Double.parseDouble(str3) +Double.parseDouble(str4));
		
	}//main()
}//class