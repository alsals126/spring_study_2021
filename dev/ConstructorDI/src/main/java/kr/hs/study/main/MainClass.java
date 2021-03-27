package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//객체 가지고와서 obj1에 대입시켜서 prData() 호출
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		obj1.prData();
		System.out.println("========================================================");
		
		//TestBean1 obj2 = new TestBean1(10);
		//obj2.prData();
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		obj2.prData();
		
		System.out.println("========================================================");
		
		TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
		obj3.prData();
		
		System.out.println("========================================================");
		
		TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
		obj4.prData();
		
		System.out.println("========================================================");
		
		TestBean1 obj5 = ctx.getBean("t5", TestBean1.class);
		obj5.prData();
		
		System.out.println("========================================================");
		
		TestBean1 obj6 = ctx.getBean("t6", TestBean1.class);
		obj6.prData();
		
		System.out.println("========================================================");
		
		TestBean2 obj7 = ctx.getBean("t7", TestBean2.class);
		obj7.prData();

		System.out.println("========================================================");
		
		TestBean2 obj8 = ctx.getBean("t8", TestBean2.class);
		obj7.prData();
		
		System.out.println("========================================================");
		
		
		TestBean2 obj9 = ctx.getBean("t9", TestBean2.class);
		obj9.getData1().prData();
		
		ctx.close();
	}

}
