package chapter2;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( ((num1 = num1 + 10) < 10) && ((i = i + 2) > 10) );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// && 논리 곱
				// %% -> 논리 곱, 두 항이 모두 참인 경우에만 결과 값이 참이다. 그렇지 않은 경우 거짓  
				// ex) booleanval = (5>3) && (5>2);
	}

}
