/*
 * 메소드(함수) 정의 및 사용
 */
public class MethodExample {
		
	/*
	 * 	구구단을 출력하는 메소드 정의
	 */
	static void printGugudan ( ) {										//하나의 독립된 실행 코드 블록 ... 한번 정의된 코드블록은 필요할 때마다 호출해서 사용할 수 있다.. 괄호 안에 매개변수가 들어간다.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j)+"\t");
				
			}
			System.out.println();
			
			
		}
		
	}
	
	/*
	 *  단을 입력받아 해당 단을 출력하는 기능
	 */
	static void printDan(int dan) {										// 뭔가를 전달받기 위한 변수이기 때문에 매개변수: 함수 사용(호출) 시 전달되는 값(전달인자: Argument)들을 입력 받기 위한 변수를 선언한다.
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * "+ i +" = "+ (dan*i) +"\t");
			
		}
		System.out.println();
	}
	
	/*
	 * 두개의 정수를 전달받아 해당 정수의 합을 반환하는 기능
	 */
	static int sum(int x, int y) {
		return x + y;													//return의 두번째 기능: 끝내면서 결과값을 호출하는 쪽으로 반환해주는 것
	}
	
// double y; 자동형변환이여서 y가 정수여도 double 붙여도 된다.
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("구구단 출력하기");
		// 구구단 출력 메소드 사용(호출) (변수 사용하듯이)
		printGugudan();		
																		// 위에 Gugudan 코드블럭으로 가서 그게 실행되고 다 끝나면 이곳으로 온다.
		System.out.println(">>>>>>>>>>>>");
		printGugudan();
																		// 위에 Gugudan 코드블럭으로 가서 그게 실행되고 다 끝나면 이곳으로 온다.
		
//		5단 출력
		printDan(5);		// 5를 전달인자라고 한다(Argument)
		
		System.out.println(">>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>");
		
		printDan(7);
		
		
		int x = 500, y = 4545454;										//여기 x와 y는 지역변수다. 위에 sum에 있는 x와 y와 이름은 똑같지만 완전 다른 것이다. 둘은 서로 별개이다.
		
		int result = sum(x, y);											//함수를 호출하고 결과값을 넣는다.
		System.out.println(result);
		
		
		sum(5, 10);
		System.out.println(sum(5,10));		//위와 같다
		
//		sum(x, y);														//x와 y에 위에 있는 500과 4545454이 전달된다.
	}

	
	
	
	
	
	
	
	
}
