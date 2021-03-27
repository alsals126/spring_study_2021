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
		
		TestBean2 t3 = ctx1.getBean("obj6", TestBean2.class);
		System.out.println("t3 : " + t3);
		
		TestBean2 t5 = ctx1.getBean("obj6", TestBean2.class);
		System.out.println("t5 : " + t5);
		
		ctx1.close();
		
		System.out.println("================================================");
		
		// 설정이 있는 자바파일 등록
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean2 t4 = ctx2.getBean("obj4", TestBean2.class);
		t4.pr();
		
		TestBean3 t1= ctx2.getBean("obj3", TestBean3.class);
		
		TestBean4 t7 = ctx2.getBean("obj7", TestBean4.class);
		System.out.println("t7.data1: " + t7.getData1());
		System.out.println("t7.data2: " + t7.getData2());
		
		ctx2.close();
	}
}