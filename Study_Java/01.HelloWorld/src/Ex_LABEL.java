public class Ex_LABEL {
	public static void main(String[] args) {
		LABEL:		//값을 할당할 때 콜론(:)
		for(char upper = 'A'; upper <= 'Z'; upper++)	{	//A~Z까지 동작
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break LABEL;	//break; 를 하면 for lower블록안이 끝나서 A-g다음 B-a가 시작
				}//if
			}//for lower
		}//for upper
			
	}//main()
}//clas