package chapter05.execute;

public class CalculatorImpl implements Calculator {

	@Override
	public long factorial(int num) {
		long start = System.nanoTime(); // 메소드 시작시간
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i; // result = result * i
		}
		long end = System.nanoTime(); // 메소드 종료 시간
		System.out.println("실행 시간: " + (end - start));
		return result;
	}

}