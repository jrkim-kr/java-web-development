package chapter05.execute;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Timer {
	@Pointcut("execution(public * chapter05.execute..*(..))")
	private void timerTarget() {};
	
	@Around("timerTarget()")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable{
		// 메서드 실행전
		long start = System.nanoTime();
		// 실제 메서드 실행
		Object result = joinPoint.proceed();
		// 메서드 실행후
		long end = System.nanoTime();
		System.out.println("AOP 실행시간:"+(end-start));
		return result;
	}
}
