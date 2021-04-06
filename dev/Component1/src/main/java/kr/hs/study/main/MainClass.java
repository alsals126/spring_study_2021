package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1> " + t1);
		/*
		 * TestBean2 t2 = ctx1.getBean(TestBean2.class); System.out.println("t2: " +
		 * t2);
		 */
		
		ctx1.close();
		
		System.out.println("========================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
		
		/*
		 * TestBean2 t3 = ctx2.getBean(TestBean2.class); System.out.println("t3> " +
		 * t3);
		 * 
		 * TestBean3 tt4 = ctx2.getBean(TestBean3.class); System.out.println("t4> " +
		 * tt4);
		 * 
		 * TestBean3 tt5 = ctx2.getBean(TestBean3.class); System.out.println("t4> " +
		 * tt5);
		 */
		
		
		ctx2.close();
	}
}
