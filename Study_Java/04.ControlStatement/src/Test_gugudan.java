public class Test_gugudan {
	public static void main(String[] args) {
		int i, j;
		//for 가로 출력
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				if(i * j < 10) {
					System.out.print(i + "X" + j + "=0" + (i * j) + "\t");
				}else {
					System.out.print(i + "X" + j + "=" + (i * j) + "\t");
				}//if
			}//for j
			System.out.println();
		}//for i
		
		System.out.println();
		
		//for 세로 출력
		for(i = 1; i <= 9; i++) {
			for(j = 2; j <= 9; j++) {
				if(i * j < 10) {
					System.out.print(j + "X" + i + "=0" + (i * j) + "\t");
				}else {
					System.out.print(j + "X" + i + "=" + (i * j) + "\t");
				}//if
			}//for j
			System.out.println();
		}//for i
		
		System.out.println();
		
		//while 가로 출력
		i = 2;
		while(i <= 9) {
			j = 1;
			while(j <= 9) {
				if(i * j < 10) {
					System.out.print(i + "X" + j + "=0" + (i * j) + "\t");
				}else {
					System.out.print(i + "X" + j + "=" + (i * j) + "\t");
				}//if
				j++;
			}//while
			System.out.println();			
			i++;
		}//while
		
		System.out.println();
		
		//while 세로 출력
		i = 1;
		while(i <= 9) {
			j = 2;
			while(j <= 9) {
				if(i * j < 10) {
					System.out.print(j + "X" + i + "=0" + (i * j) + "\t");
				}else {
					System.out.print(j + "X" + i + "=" + (i * j) + "\t");
				}//if
				j++;
			}//while
			System.out.println();
			i++;
		}//while
		
		System.out.println();
		
		//do_while 가로 출력
		i = 2;
		do {
			j = 1;
			do {
				if(i * j < 10) {
					System.out.print(i + "X" + j + "=0" + (i * j) + "\t");
				}else {
					System.out.print(i + "X" + j + "=" + (i * j) + "\t");
				}//if
				j++;
			}while(j <= 9);
			System.out.println();
			i++;
		} while(i <= 9);
		
		System.out.println();
		
		//do_while 세로 출력
		i = 1;
		do {
			j = 2;
			do {
				if(i * j < 10) {
					System.out.print(j + "X" + i + "=0" + (i * j) + "\t");
				}else {
					System.out.print(j + "X" + i + "=" + (i * j) + "\t");
				}//if
				j++;
			}while(j <= 9);
			System.out.println();
			i++;
		}while(i <= 9);
	}//main()
}//class
