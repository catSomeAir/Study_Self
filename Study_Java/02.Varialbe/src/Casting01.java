public class Casting01 {
	public static void main(String[] args) {
		
		//1. 자동 형 변환 : 작은타입(int)이 큰 타입(double)로 자동으로 변환
		//	▶ 묵시적 형 변환 또는 UpCasting, Promotion 이라고도 한다.
		
		int num1 = 10;	//정수형 변수 num1을 선언하고, 값(1)을 할당 ▶ 초기화
		double num2;	//실수형 변수 num2를 선언만 한 상태
		num2 = num1;	//변수 num1의 값을 변수 num2에 할당(대입)
		System.out.println("변수 num1의 값 : " + num1);
		System.out.println("변수 num2의 값 : " + num2);
		
		//2. 강제 형 변환 : 큰 타입(double)이 작은 타입(int)으로 강제로 변환 : Casting연산자
		//	▶ 명시적 형 변환 또는 DownCasting 이라고 한다. 일반적인 Casting에 해당
		
		int num3;			//정수형 변수 num3을 선언만 한 상태
		double num4 = 3.14;	//실수형 변수 num4를 선언하고, 값(3.14)을 할당 ▶ 초기화
		// num3 = num4;		//오류 : 큰 타입(double)
		num3 = (int) num4;
		System.out.println("변수 num3 의 값 : " + num3);	// 출력값 : 3
		System.out.println("변수 num4 의 값 : " + num4);	// 출력값 : 3.14
		
		//큰 타입(int)인 x변수를 작은타입(byte)의 y변수에 할당 하려면 큰타입의 x변수를 
		//byte타입으로 케스팅 
		int x =128;
		byte y = (byte) x;
		System.out.println("변수 x의 값 : " + x);	// 출력값 128
		System.out.println("변수 y의 값 : " + y);	// 출력값 -128
		
	}//main()
}//class