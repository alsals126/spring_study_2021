package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// 컨테이너의 config.xml파일을 읽어준다
		// 객체 생성
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/*
		/* 컨테이너에 잇는 객체 가지고 오기(getBean()) 
		// singleton : 객체는 한번 가져오면 계속 사용된다. 새로 생성되지 않는다
		// getBean()의 리턴값 : object
		// 업캐스팅
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.method();
		
		// t2가져오기
		// 다운캐스팅
		/* TestBean t2 = (TestBean) ctx.getBean("t2"); 
		Test t2 = ctx.getBean("t2", TestBean.class); 
		// 이 방법을 많이 씀 (t2 : testBean)=> 다형성 이용 => 부모에서 자식을 이용한다
		t2.method();
		System.out.println("t2 : " + t2); //주소 찍기
		
		Test t3 = ctx.getBean("t2", TestBean.class);
		System.out.println("t3 : " + t3);
		
		Test t4 = ctx.getBean("t2", TestBean.class);
		System.out.println("t4 : " + t4);
		*/
		
		Test t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("t1: " + t1);
		
		// 주소가 t1과 같다. 왜냐하면 spring은 singleton이기 때문이다.
		// singleton을 bean만들때 scope="property"를 넣어주면 된다.
		Test t2 = ctx.getBean("t1", TestBean.class);
		System.out.println("t2: " + t2);
		
		System.out.println("=======================================");
		
		Test tt1 = ctx.getBean("t2", TestBean.class);
		System.out.println("tt1: " + tt1);
		
		// 주소가 t1과 같다. 왜냐하면 spring은 singleton이기 때문이다.
		// singleton을 bean만들때 scope="prototype"를 넣어주면 된다.
		Test tt2 = ctx.getBean("t2", TestBean.class);
		System.out.println("tt2: " + tt2);
		
		ctx.close();
	}

}
