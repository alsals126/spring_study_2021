package kr.hs.study.advisior;

public class Advice {
	public void beforeMethod() {
		System.out.println("before 호출");
	}
	public void afterMethod() {
		System.out.println("after 호출");
	}
}
