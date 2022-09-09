import java.util.Scanner;

public class Yaegum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("==============================");
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("==============================");
			System.out.print("선택 > ");
			
			int input = Integer.parseInt(scanner.nextLine());
					
				if(input !=1 && input !=2 && input !=3 && input !=4) {
					System.err.println("올바른 번호를 입력하세요.");
					continue;
				}else if(input == 4) {
					while(true) {
						System.out.println("정말 종료 하시겠습니까?");
						System.out.print(" ▶ 1. 예 , 2. 아니오 : ");
						int d = Integer.parseInt(scanner.nextLine());
						if(d != 1 && d !=2) {
							System.err.println("1번과 2번 중 선택해주세요!");
						} else if(d == 2 ) {
							System.out.println("원하시는 서비스를 선택해주세요.");
							
						} else {
							System.out.println("서비스를 종료합니다.");
						}//if
					}//while
					
					break;
				}else {
						if(input == 1) {
							System.out.print("맡기실 금액을 입력하세요 : ");
							balance += Integer.parseInt(scanner.nextLine());
							System.out.println("\n" + "예금액 > " + balance + "원" + "\n");
							System.out.println("  잔고 > " + balance + "원" + "\n");
							
						}else if(input == 2) {
							
							while (true) {
								System.out.print("찾으실 금액을 입력하세요 : ");
								/*int a = balance;
								a -= Integer.parseInt(scanner.nextLine());*/
								int b = Integer.parseInt(scanner.nextLine());
								if (b > balance) {
									System.err.println("잔고가 부족합니다." + "\n");
									System.out.println("금액을 다시 입력하세요" + "\n");
									
								} else {
									/*balance = a;*/
									System.out.println("출금액> " + b + "원" );
									System.out.println("  잔고 > " + balance + "원" + "\n");
									break;
								}//if 출금액 잔고 비교
							}
					
						}else {
							System.out.println("  잔고 > " + balance + "원" + "\n");
						}//if input값 1,2,3경우
					
				}//if
			
			
		}//while
		scanner.close();
		
				
	}//main()
}//class