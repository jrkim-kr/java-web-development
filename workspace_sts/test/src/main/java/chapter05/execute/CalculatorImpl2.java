package chapter05.execute;

public class CalculatorImpl2 implements Calculator {

	@Override
	public long factorial(int num) {
		// 재귀 호출
		
		if (num == 0) {
			return 1;
		}
		// 10 * 9 * 8 * 7 *...* 1
		return num * factorial(num - 1);  // 메소드 부분 먼저 실행
	}

}