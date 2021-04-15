package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloEn;
import kr.hs.study.beans.HelloJp;
import kr.hs.study.beans.HelloKr;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HelloKr obj1 = ctx.getBean("h1", HelloKr.class);
		HelloEn obj2 = ctx.getBean("h2", HelloEn.class);
		HelloJp obj3 = ctx.getBean("h3", HelloJp.class);
		
		obj1.Hello1();
		obj1.Hello2();
		obj1.Hello3();
		obj2.Hi1();
		obj2.Hi2();
		obj2.Hi3();
		
		System.out.println("===============================================");
		
		obj3.bye1();
		obj3.bye2();
		obj3.bye3();
		
		System.out.println("===============================================");
		
		obj1.Hello1();
		System.out.println(obj2.Hi1_1());
		
		System.out.println("===============================================");
		
		obj1.Hello2();
		obj2.Hi2();
		
		ctx.close();
	}

}
