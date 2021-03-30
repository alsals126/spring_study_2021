package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/*
		 * // data1, data2, data3 값 출력 TestBean1 tb1 = ctx1.getBean("obj1",
		 * TestBean1.class); System.out.println("tb1.data1: " + tb1.getData1());
		 * System.out.println("tb1.data2: " + tb1.getData2());
		 * System.out.println("tb1.data3: " + tb1.getData3());
		 * System.out.println("tb1.data4: " + tb1.getData4());
		 * 
		 * // 11, 11.11, databean1의 주소(setter로 세팅) TestBean1 tb2 = ctx1.getBean("obj2",
		 * TestBean1.class); System.out.println("tb2.data: " + tb2);
		 */
		
		ctx1.close();
		
		System.out.println("===================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		/*
		 * // data1, data2, data3 값 출력 TestBean1 t1 = ctx2.getBean("java1",
		 * TestBean1.class); System.out.println("t1.data1: " + t1.getData1());
		 * System.out.println("t1.data2: " + t1.getData2());
		 * System.out.println("t1.data3: " + t1.getData3());
		 * System.out.println("t1.data4: " + t1.getData4()); ctx2.close();
		 */
		
		TestBean1 t2 = ctx2.getBean("java1", TestBean1.class);
		System.out.println("t2.data1: " + t2.getData1());
		System.out.println("t2.data2: " + t2.getData2());
		System.out.println("t2.data3: " + t2.getData3());
		System.out.println("t2.data4: " + t2.getData4());
		
		ctx2.close();
	}

}
