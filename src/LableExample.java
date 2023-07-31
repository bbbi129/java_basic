/*
 *  Lable
 */
public class LableExample {

	public static void main(String[] args) {
		// 레이블 선언: 모두다대문자로선언하는것이관례
		OUT:
		for (int i =0; i <10; i++) {
			for(int j =0; j <10; j++) {
				System.out.println(i + "," + j);
				if(j == 5) {
//					break;								lable이 없으면 반복된다.
					break OUT;
				}
			}
		}												// lable 때문에 여기로 이동한다.
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
