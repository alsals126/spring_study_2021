package kr.hs.study.beans;

public class TestBean2 {
   public TestBean2() {
      System.out.println("TestBean2의 기본 생성자 입니다.");
   }
   public void pr() {
      System.out.println("출력");
   }
   public void init() {
	   System.out.println("생성자 호출 다음에 실행되는 init메서드");
   }
   public void destroy() {
		System.out.println("destroy 메소드");
	}
}