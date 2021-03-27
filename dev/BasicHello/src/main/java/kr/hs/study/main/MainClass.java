package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldInter;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.TVInter;
import kr.hs.study.beans.TVSamsung;
import kr.hs.study.beans.TVLg;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//HelloWorldEn 객체 가져오기
		//HelloWorldEn h1 = ctx.getBean("hello1", HelloWorldEn.class); ==> 이렇게 해도 되지만, 다형성을 위해 아래코드로 한다.
		HelloWorldInter h1 = ctx.getBean("hello1", HelloWorldEn.class);
		h1.sayHello();
		
		//HelloWorldKo 객체 가져오기
		//HelloWorldKo h2 = ctx.getBean("hello2", HelloWorldKo.class); ==> 이렇게 해도 되지만, 다형성을 위해 아래코드로 한다.
		HelloWorldInter h2 = ctx.getBean("hello2", HelloWorldKo.class);
		h2.sayHello();
		
		System.out.println("===================================");
		
		TVInter tv1 = ctx.getBean("samsung", TVSamsung.class);
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.powerOn();
		tv1.powerOff();
		
		TVInter tv2 = ctx.getBean("lg", TVLg.class);
		tv2.volumeUp();
		tv2.volumeDown();
		tv2.powerOn();
		tv2.powerOff();
		
		ctx.close();
	}

}