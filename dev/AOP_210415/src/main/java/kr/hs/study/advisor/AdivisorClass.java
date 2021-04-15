package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdivisorClass {
	public void before() {
		System.out.println("*before 메서드 호출");
	}
	public void after() {
		System.out.println("*after 메서드 호출");
	}
	public void around1(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("**around1 메서드 전");
		pjp.proceed();
		System.out.println("**around1 메서드 후");
	}
	public int around2(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("**around2 메서드 전");
		int a = (Integer) pjp.proceed();
		System.out.println("**around2 메서드 후");
		return a;
	}
	public void afterThrowing(Exception e) {
		System.out.println("afterThrowing 메서드 호출");
	}
	public void afterReturning() {
		System.out.println("afterReturning 메서드 호출"); 
	}
}
