package chapter2;

public class OperationEx5 {

	public static void main(String[] args) {

		//복합 연산자
		
			int num1 = 10;
			System.out.println(num1 += 1);
			
			System.out.println(num1 %= 10);
			num1 -= 1;  //num1 = num1 -1; (뭐징???)
			System.out.println(num1);
			
			
		//조건 연산자  : true 인 경우와  false 인경우에 따라 다른 식이나 결과가 수행됨
			int num = (5 > 3) ? 10 : 20; //10:20은 문장이 들어갈 수도 있음 TRUE:FALSE
			System.out.println(num);
			
		
			
	}

}
