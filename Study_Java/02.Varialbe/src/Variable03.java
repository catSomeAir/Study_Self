public class Variable03 {
	public static void main(String[] args) {
		//정수형 데이터 타입 : byte(1), short(2), int(4), long(8)
		
		//1Byte = 8bit
		
		//byte  : 1Byte (-128 ~ 127 사이의 값만 허용)
		byte num1 = 100;
		System.out.println("변수 num1의 값 : " + num1);
		
		//short : 2Byte (-32,768 ~ 32,767 사이 값만 허용)
		short num2 = 10000;	
		System.out.println("변수 num2의 값 : " + num2);
		
		//int : 4Btye (-2의 32제곱 ~ 2의 32제곱-1 사이의 값만 허용)
		int num3 = 100000;
		System.out.println("변수 num3의 값 : " + num3);
		
		//long : 8Byte (-2의 64제곱 ~ 2의 64제곱-1 사이의 값만 허용)
		long num4 = 1234567890123456789L;
		System.out.println("변수 num4의 값 : " + num4);
		
	}//main()
}//class