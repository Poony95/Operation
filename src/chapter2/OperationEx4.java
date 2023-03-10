package chapter2;

public class OperationEx4 {

	public static void main(String[] args) {

		// ㅣㅣ 논리합
		
				int num2 = 10;
				int j = 2;
				
				boolean value = ( ((num2 = num2 + 10) < 10) || ((j = j + 2) > 10) );
				System.out.println(value);
				System.out.println(num2);
				System.out.println(j);
				
// ll -> 논리 함, 두 한 중 하나의 항이 참이면 결과 값은 참임, 두 항이 모두 거짓이면 결과값 거짓. 
// ex) booleanval = (5>3) ll (5<2);
	}

}
