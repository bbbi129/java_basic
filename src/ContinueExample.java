/*
 *  continue
 */
public class ContinueExample {

	public static void main(String[] args) {
		for (int i =0; i < 100; i++) {
			if(i == 50) {
				continue;
			}
			
			System.out.println("출력 = " + i);
			
		}                                               // continue가 있으면 이 줄 중괄호 안으로 들어간다. 그러므로 위 줄에 있는 println은 안하고 건너뛴다.
		
		
		
//		1부터 100까지 홀수만 출력하시오.. 3가지 표현방법
		for (int i =1; i < 100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
		for (int i =1; i < 100; i+=2) {
				System.out.println(i);
			}
		
		
		
		for (int i =1; i < 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
