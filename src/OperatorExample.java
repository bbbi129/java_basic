/*
 * 자바에서 지원하는 연산자들
 */
public class OperatorExample {

	public static void main(String[] args) {
		int x = 30, y = 5; 
		
		// 산술연산자
		System.out.println("합="+(x + y));
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);  //나머지 연산자..
		
//		+ 연산자 오버로딩(중복정의)
		System.out.println(10 + 50);
		System.out.println("김기정"+"바보");
		System.out.println("김기정"+ 10+20);  // 좌에서 우로 순서대로 이동, 문자열과 10을 먼저 연결, 문자열10과 20을 연결
		System.out.println("김기정"+(10+20));  //숫자를 먼저 더하고 싶으면, 괄호로 묶어주기
		System.out.println(10+"바보");  //10이 문자열로 형 변환 후 결합
		System.out.println(10+20+"바보");  //좌측을 먼저 계산하고 그 다음에는 +가 연결 역할을 한다.
		
//		복합대입연산자(+=, -=, *=, /=, %=)
//		x = x + 5;
		x += 5;
		x -= 5;
		x *= 5;
		System.out.println(x);
		
		x = 10;
		y = 5;
//		비교연산자(==, !=, >, >=,.....)
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);
		
//		증감연산자 (++, __)
//		x = x +1;
//		x += 1;   다 같지만 밑으로 내려갈수록 더 간단하게 표현하는 방법
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		x = 10;
//		System.out.println(x++);
		System.out.println(++x);
		
		x = 30;
		y = 50;
		
		System.out.println(x >=30 && y <=50);
		System.out.println(x < 30 && y <=50);
		System.out.println(x < 30 || y <=50);
		System.out.println(!true);
		
//		조건삼항연산자
		int score = 85;
		String result = score >= 60 ? "통과" : "실패";
		System.out.println(result);
		
//		기본데이터타입 형변환
//		자동형변환(Promotion - Up Casting)
		double some = 50;
		System.out.println(some);
		
//		강제형변환(Demotion - Down Casting)
		double avg = 85.34567;
		System.out.println(avg);
		System.out.println((int)avg);
		
		int avg2 = (int)avg;
		System.out.println(avg2);
		
		
	
		
		
		
		
		

	}

}
