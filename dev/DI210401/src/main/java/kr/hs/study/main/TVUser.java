package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SongSpeaker;
import kr.hs.study.beans.Speaker;
import kr.hs.study.beans.TV;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TV t1 = ctx1.getBean("st", SamsungTV.class);
		t1.powerOn();
		t1.powerOff();
		 
		TV t2 = ctx1.getBean("lt", LgTV.class);
		t2.powerOn();
		t2.powerOff();
		
		ctx1.close();
	}

}
