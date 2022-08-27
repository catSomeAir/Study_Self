public class Operator05 {
	public static void main(String[] args) {
		//▶대입(할당) 연산자 : =(equal)는 같다라는 의미가 아니라 대입(할당)을 의미
		//Left_Value = R_Value의 값을 L_Value에 대입(할당)
		
		//변수에 정수값의 변수값을 할당
		int num1 = 10;	//정수형 변수 num1을 선언하고 값(10)을 할당(대입) → 초기화
		System.out.println("변수 num1의 값 : " + num1);		//출력값 : 10
		
		//변수에 정수가 아닌 선언된 변수 값으로 할당
		int num2 = num1;
		System.out.println("변수 num2의 값 : " + num2);		//출력값 : 10
		
		//선언된 변수를 다른 변수값으로 할당 ▶ 재할당
		num2 = num1 + num1;
		System.out.println("변수 num2의 값 : " + num2);		//출력값 : 20
		
		//▶복합대입 연산자 : R-Value에서 사용되는 변수와 L-Value에서 대입되는 변수가 동일 할 경우 사용
		num2 = num2 + num1;		// num2 += num1;
		System.out.println("변수 num2의 값 : " + num2);		//출력값 : 30
		
		
		num2 += num1;
		System.out.println("변수 num2의 값 : " + num2);		//출력값 : 40
		
		num2 -= num1;
		System.out.println("변수 num2의 값 : " + num2);		//출력값 : 30
	}//main()
}//class