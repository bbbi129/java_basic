/*
 *  Return : 쫑낸다라는 의미
 */
public class ReturnExample {

	public static void main(String[] args) {
		System.out.println("자바 프로그램 시작됨..");
		
			for (int i =0; i <10; i++) {
				if(i == 5) {
//					break;
//					continue;
					return;					// main() 메소드에서 return문을 사용하면 프로그램이 종료된다.
				}
				System.out.println(i);
				} 							//break하면 여기 중괄호 안으로, continue하면 여기 중괄호 밖으로 이동
				System.out.println("자바프로그램 종료됨...");
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
