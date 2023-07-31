/*
 * 조건(분기)문 switch
 * */
public class SwitchExample {
	
	public static void main(String[]args) {
	
		int num = 1;
		switch (num) {
			case 1: System.out.println("1입니다.."); break;  //break는 실행되면 중괄호 바깥으로 이동시키라는 의미, break가 없으면 switch는 바로 다음으로 간다.
			case 2: System.out.println("2입니다.."); break;
			case 3: System.out.println("3입니다.."); break;
			case 4: System.out.println("4입니다.."); break;
			case 5: System.out.println("5입니다.."); break;
			default: System.out.println("일치하는 값이 없습니다..");  // default가 끝나고 나면 바깥으로 이동하기 때문에, break를 쓰지 않는다.
		
		}
		char some = 'a';
		switch (some) {
			case 'a': System.out.println("1입니다.."); break;  
			case 'b': System.out.println("2입니다.."); break;
			case 'c': System.out.println("3입니다.."); break;
			case 'd': System.out.println("4입니다.."); break;
			case 'e': System.out.println("5입니다.."); break;
			default: System.out.println("일치하는 값이 없습니다..");  
	
	}
		
/*		double some = 13.4                                              실수는 불가능
*		switch (num) {
	*	case 1: System.out.println("1입니다.."); break;  
	*	case 2: System.out.println("2입니다.."); break;
	*	case 3: System.out.println("3입니다.."); break;
	*	case 4: System.out.println("4입니다.."); break;
	*	case 5: System.out.println("5입니다.."); break;
		default: System.out.println("일치하는 값이 없습니다..");  }
		*/
	
	
	
	
	
		int score = 88;
		switch (score/10) {
			case 10: 									//System.out.println("수"); break; 라고 써도 되지만 굳이 반복하지 않고 어차피 다음으로 넘어가니까 쓰지 않아도 된다.
			case 9: System.out.println("수"); break;
			case 8: System.out.println("우"); break;
			case 7: System.out.println("미"); break;
			case 6: System.out.println("양"); break;
			default: System.out.println("가");
		
		}
		
		int x =50, y = 30;
		char operator = '+';
		switch (operator) {
		case '+': System.out.println("덧셈 = " + (x + y)); break;
		case '-': System.out.println("뺄셈 = " + (x - y)); break;
		case '*': System.out.println("곱셈 = " + (x * y)); break;
		case '/': System.out.println("나눗셈 = " + (x / y)); break;
		}
	}
	
	

}

