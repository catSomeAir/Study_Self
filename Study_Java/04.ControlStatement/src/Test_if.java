public class Test_if {
	public static void main(String[] args) {
		//점수(score)가 90점 이상이면 'A학점', 80점 이상이면 'B학점'
		//70점 이상이면 'C학점', 60점 이상이면 'D학점', 그외에는 'F학점'
		int score = 77;
		
		if(score >= 90) {
			System.out.println("A학점");
		}else if(score >= 80) {
			System.out.println("B학점");
		}else if(score >= 70) {
			System.out.println("C학점");
		}else if(score >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}//if
		
	}//main()
}//class