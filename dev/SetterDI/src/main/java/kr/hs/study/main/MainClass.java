package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본적으로 객체는 xml로딩시 생성된다. 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class); // 객체를 가져오는게 아니라 주소값을 가져오는 것이다.
		System.out.println("t1: " + t1); // 그래서 출력하면 주소값이 나온다.
		TestBean1 t2 =  ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2: " + t2); // 똑같은 주소값이 출력된다 => 스프링은 기본적으로 '싱글톤'이기 때문이다.
		
		TestBean1 t3 =  ctx.getBean("obj3", TestBean1.class);
		t3.a();
		
		TestBean1 t4 = ctx.getBean("obj4", TestBean1.class);
		System.out.println("t4.d1:" + t4.getD1());
		
		System.out.println("================================================");
		
		TestBean1 t5 = ctx.getBean("obj5", TestBean1.class);
		System.out.println("t5.d1:" + t5.getD1());
		
		System.out.println("================================================");
		
		TestBean1 t6 = ctx.getBean("obj6", TestBean1.class);
		System.out.println("t6.d1:" + t6.getD1());
		
		System.out.println("================================================");
		
		TestBean1 t7 = ctx.getBean("obj7", TestBean1.class);
		
		ctx.close();
	}

}
