package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SongSpeaker;
import kr.hs.study.beans.Speaker;
import kr.hs.study.beans.TV;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Speaker s1 = ctx1.getBean("ss", SongSpeaker.class);
		TV t1 = ctx1.getBean("st", SamsungTV.class);
		t1.powerOn();
		
		ctx1.close();
	}

}
