package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.TestBean;

@Configuration
public class JavaConfig {
	@Bean
	public TestBean java1() {
		return new TestBean(new DataBean(), new DataBean());
	}
	@Bean
	public DataBean d1() {
		return new DataBean();
	}
	
}
