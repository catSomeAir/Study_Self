import java.util.Random;
import java.util.Scanner;

public class Dicegame01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			
			System.out.println("게임시작 : 1, 게임종료 : -1을 입력하세요 ▶ ");
			int input = Integer.parseInt(scanner.nextLine());
			if(input != 1 && input != -1) {
				System.out.println("숫자를 잘못 입력하였습니다!");
				continue;
			}else if (input == -1){
				System.out.println("게임을 종료합니다!");
				break;
			}else {
				System.out.println("주사위 게임을 시작합니다^^");
				System.out.println("Enter Key를 입력하세요!");
				scanner.nextLine();
			}//if
			
			int userNumber = random.nextInt(6) +1 ;
			System.out.println("사용자의 숫자는 "+ userNumber + "입니다"+"\n");
			System.out.println("컴퓨터가 주사위를 굴립니다.");
			System.out.println("Enter Key를 입력하세요!");
			scanner.nextLine();
			
			int comNumber = random.nextInt(6) + 1;
			System.out.println("컴퓨터의 숫자는 "+ comNumber + "입니다"+"\n");
			
			if(userNumber > comNumber) {
				System.out.println("Result : You Win!");
			}else if(userNumber < comNumber) {
				System.out.println("Result : You Lose!");
				
			}else {
				System.out.println("Result : Draw!");
			}
			
		}//while
			scanner.close();
	}//main()
}//class