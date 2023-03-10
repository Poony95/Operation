package chapter2;

public class OperationEx6 {

	public static void main(String[] args) {
		 
		
		/* 비트 연산자 - 정수에서만 사용가능
		  ~ : 비트의 반전 (1의 보수) - 비트 값을 0은 1로 1은 0으로 바꾸는 연산자 a= ~a;
		  & : 비트 단위 AND - 두비트가 모두 1인 경우만 (1 & 1) 1반환 그외는 0
		  | : 비트 단위 OR - 두 비트가 모두 0인 경우만 (O|O) 0반환 그외는 1
		  ^ : 비트 단위 XOR - 두 개의 비트가 서로 다른 경우에 1을 반환, 같은 값이면 0
		  << : 왼쪽 SHIFT - a << 2 변수 a를 2비트 만큼 왼쪽으로 이동
		  >> : 오른쪽 SHIFT - a << 2 변수 a를 2비트 만큼 오른쪽으로 이동
		  <<<,>>> : 왼쪽, 오른쪽 shift - shift로 비트 이동은 동일한데
		                              남은 공간을 무조건 부호비트가 아닌 0으로 채움
		 */
		
		int num1 = 5;	
		int num2 = 10;
		
		int result = num1 | num2;
		System.out.println(result);
		
		
		int num3 = 5; ///00000101;
		System.out.println(num3 << 1);  // 1비트를 밀면 2의 1승 2배의 숫자 변경
		System.out.println(num3);
		System.out.println(num3 << 2);  // 2비트를 밀면 2의 2승 4배의 숫자 변경
		System.out.println(num3 << 3);  // 3비트를 밀면 2의 3승 8배의 숫자 변경
		
		System.out.println(num3 >> 1);  //00000010  -> 2를 나눈 것과 같음(나누기)
	}

}
