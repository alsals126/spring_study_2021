package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		/*
		TestBean2 t3 = ctx1.getBean("obj6", TestBean2.class);
		System.out.println("t3 : " + t3);
		
		TestBean2 t5 = ctx1.getBean("obj6", TestBean2.class);
		System.out.println("t5 : " + t5);
		
		ctx1.close();*/
		
		System.out.println("================================================");
		
		// 설정이 있는 자바파일 등록
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean2 t7 = ctx2.getBean("obj4", TestBean2.class);
		t7.pr();
		System.out.println("t7: " + t7);
		
		TestBean2 t8 = ctx2.getBean("obj4", TestBean2.class);
		t8.pr();
		System.out.println("t8: " + t8);

		System.out.println("\n---\n");
		
		
		TestBean2 t9 = ctx2.getBean("obj5", TestBean2.class);
		t9.pr();
		System.out.println("t9: " + t9);
		
		TestBean2 t10 = ctx2.getBean("obj5", TestBean2.class);
		t10.pr();
		System.out.println("t10: " + t10);

		System.out.println("\n---\n");
		

		TestBean2 t11 = ctx2.getBean("obj6", TestBean2.class);
		t11.pr();
		System.out.println("t11: " + t11);

		TestBean2 t12 = ctx2.getBean("obj6", TestBean2.class);
		t12.pr();
		System.out.println("t12: " + t12);

		
		System.out.println("\n---\n");
		
		
		TestBean3 t23 = ctx2.getBean("obj13", TestBean3.class);
		
		System.out.println("t23:      " + t23.getA() + "      " + t23.getB() + "      " + t23.getC());
		

		TestBean3 t24 = ctx2.getBean("obj14", TestBean3.class);
		
		System.out.println("t24:      " + t24.getA() + "      " + t24.getB() + "      " + t24.getC());
		
		
		ctx2.close();
	}
}