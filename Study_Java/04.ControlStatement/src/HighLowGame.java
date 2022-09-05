import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
	public static void main(String[] args) {
		//1 ~ 100 사이의 임의의 정수값을 할당하여 comNumber 변수에 저장 ▶ Random 객체
		Random random = new Random();				//Random 객체 생성
		int comNumber = random.nextInt(100) + 1;	//1 ~ 100 사이의 임의의 정수값을 할당
		
		//사용자로부터 숫자를 입력받기 위한 준비상태 ▶ Scanner 객체
		Scanner scanner = new Scanner(System.in);	//Scanner 객체 생성  
		int userNumber = 0;		//사용자가 입력한 값을 저장할 변수를 초기화
		int count = 0;			//시도횟수를 저장할 변수를 초기화	
		
		//게임시작
		do {
			System.out.print("1부터 100 사이의 정수값을 입력하세요 : ");
			userNumber = Integer.parseInt(scanner.nextLine());
			count++;
			
			if(userNumber < comNumber) {
				System.out.println("더 큰수를 입력하세요!");
				System.out.println("시도횟수 : " + count + "\n");
				continue;
			}else if(userNumber > comNumber) {
				System.out.println("더 작은수를 입력하세요!");
				System.out.println("시도횟수 : " + count + "\n");
				continue;
			}else {
				System.out.println("맞췄습니다!");
				System.out.println("시도횟수 : " + count);
				break;
			}//if
		}while(true);
		scanner.close();		
	}//main()
}//class

/*
comNumber : 1 ~ 100 사이의 임의의 정수값을 할당 → 70

1부터 100 사이의 정수값을 입력하세요 : 50 → userNumber
더 큰수를 입력하세요!
시도횟수 : 1회

1부터 100 사이의 정수값을 입력하세요 : 80 → userNumber
더 작은수를 입력하세요!
시도횟수 : 2회

1부터 100 사이의 정수값을 입력하세요 : 70 → userNumber
맞췄습니다!
시도횟수 : 3회
*/