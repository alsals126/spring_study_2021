package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.DataBean5;
import kr.hs.study.beans.TestBean5;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class JavaConfig {
	// 200, 55.55, 주소값 2개로 변경
	@Bean
	public TestBean5 java1() {
		TestBean5 t = new TestBean5();
		t.setA(200);
		t.setB(55.55);
		t.setC(new DataBean4());
		t.setD(new DataBean5());
		return t;
	}
}