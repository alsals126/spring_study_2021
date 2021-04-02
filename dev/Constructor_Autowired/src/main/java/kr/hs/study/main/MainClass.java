package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = ctx1.getBean("obj1", TestBean.class);
		System.out.println("data3 : " + t1.getData3());
		System.out.println("data4 : " + t1.getData4());
		
		ctx1.close();
		
		System.out.println("-===============================================-");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
	}l

}
