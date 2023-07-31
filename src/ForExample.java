/*
 *  for 반복문
 */
public class ForExample {

	public static void main(String[] args) {

		for (int index = 0; index < 100; index++) {
			System.out.println("평화로운 세상");

		}

		/*
		 * for(int index = 1; index < 100; index++) { 위에 있는 for문의 index와 이 for문의 index는
		 * 서로 다른 것이다. 각 index가 각각이 속한 index안에서만 유효하기 때문에 int result = 0; 여기다 선언하면 안된다.
		 * scope의 개념 result += index; }
		 */

		int result = 0;
		for (int index = 1; index < 100; index++) {

			result += index;
		}
		System.out.println(result);

//			중첩for문을 이용한 사각형 출력
		for (int i = 0; i < 5; i++) { // 행반복
			for (int j = 0; j < 5; j++) { // 열반복
				System.out.print('*'); // 한줄에 찍어야 하니까 print해야된다.

			}
			System.out.println();
		}
			
			for (int i = 0; i < 10; i++) {        // 행반복
				for (int j = 0; j <= i; j++) {    // 열반복
					System.out.print(j + " ");    // (j + ' ')라고 하면 스페이스를 숫자로 인식해서 +이 연결이 아닌 덧셈으로 인식해서 나온다.

				}
				System.out.println();
		}
		
			for (int i = 0; i < 10; i++) {       
				for (int j = 0; j <= i; j++) {    
					System.out.print(j + ' ');
				}
				System.out.println();
		}
		
			
			
			for (int i = 0; i < 10; i++) {        
				for (int j = 0; j <= i; j++) {    
					System.out.print((j +1) + " ");    // j가 1부터 나오도록 하기

				}
				System.out.println();
		}
			
			
			for (int i = 0; i < 10; i++) {        
				for (int j = 9; j >= i; j--) {      // j가 9부터 나오도록 바꾸기
					System.out.print(j + " ");    

				}
				System.out.println();
		}

//			중첩for문을 활용한 구구단 출력
			
			for (int i = 2; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i+"*"+j+"="+(i*j)+"\t");
					
				}
				System.out.println();
				
				
			}
			
	
		
			
			
			
			
	}

}
