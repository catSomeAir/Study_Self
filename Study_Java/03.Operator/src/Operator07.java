public class Operator07 {
	public static void main(String[] args) {
		//Escape Sequence : 프로그램에서 사용되는 특수기호 연산자 ▶ 출력문
		//역슬래쉬(\, ￦)를 먼저 입력하고 사용한다
		System.out.println("1. HelloWorld");
		System.out.println("2. Hello" + "\t" + "World");	// \t : TAB → 일정간격 띄어쓰기
		System.out.println("3. Hello\tWorld");				// 문자열 출력문안에서 써도 된다
		System.out.println("4. Hello" + "\b" + "World");	// \b : Back Space 앞글자를 지운다
		System.out.println("5. Hello" + "\r" + "World");	// \r : Carriage Return(행의 처음으로 
															// \r 뒤의 World 다섯글자가 5. He 다섯칸에 대체
		System.out.println("6. Hello" + "\n" + "World");	// \n : New Line(줄바꿈, Line Feed) 
		System.out.println("7. Hello" + "\'" + "World");	// \' : 특수기호연산자 그대로 출력시키는 방법 
		System.out.println("8. Hello" + "\"" + "World");	// \" : 특수기호연산자 그대로 출력시키는 방법 
		System.out.println("9. Hello" + "\\" + "World");	// \\ : 특수기호연산자 그대로 출력시키는 방법 
		
		System.out.println("번호" + "\t" + "이름" + "\t" + "주소");		
		System.out.println("1" + "\t" + "홍길동" + "\t" + "농성동");		
		System.out.println("100" + "\t" + "박문수" + "\t" + "경열로3");		

		System.out.println("나는 '자바'를 공부하고 있습니다!");							
		System.out.println("나는 \'자바\'를 공부하고 있습니다!");						
		System.out.println("나는 " + "\'" + "자바" + "\'" + "를 공부하고 있습니다!");	
		System.out.println("나는 " + "\'자바\'" + "를 공부하고 있습니다!");	
		System.out.println("\\'");
		System.out.println("\'"+ "\\");
	}//main()	
}//class