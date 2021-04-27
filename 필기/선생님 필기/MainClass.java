package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		//컨테이너의 config.xml 파일을 불러온다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		
		ctx.close();
	
	}

}
