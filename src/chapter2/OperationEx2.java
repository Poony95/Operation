package chapter2;

public class OperationEx2 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num++);
		
		System.out.println(num);
		
		// ++num 일 때 값이 증가되어 바로 11이 첫 번째 번호로 도출. 11,12,13---
		// num++ 일 때 기존 10의 값을 먼저 도출 한 후 그 다음 명령부터 1씩 증가. (11) 10,11,12---
		
	
		
		System.out.println(3<5);
		int num1 = 10;
		int num2 = 5;
		boolean flag =(num1 > num2);
		System.out.println(flag);
		
		// 논리연산자 *단락회로평가
		// %% -> 논리 곱, 두 항이 모두 참인 경우에만 결과 값이 참이다. 그렇지 않은 경우 거짓  
		// ex) booleanval = (5>3) && (5>2);
		
		// ll -> 논리 함, 두 한 중 하나의 항이 참이면 결과 값은 참임, 두 항이 모두 거짓이면 결과값 거짓. 
		// ex) booleanval = (5>3) ll (5<2);
		
		// ! -> 부정, 단항 연산자임 참인경우 거짓으로 바꾸고 거짓인 경우 참으로 바꿈. 
		// ex) booleanval = !(5>3);
	}
	
}
