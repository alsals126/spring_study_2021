package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

@Configuration
public class JavaConfig {
	@Bean(name="obj4")
	public TestBean2 java1() {
		TestBean2 t1 = new TestBean2();
		return t1;
	}
	
	@Bean
	@Lazy
	public TestBean2 obj5() {
		return new TestBean2();
	}

	
	@Bean(initMethod = "init")
	@Scope("prototype")
	public TestBean2 obj6() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean3 obj13()
	{
		TestBean3 t3 = new TestBean3(3, "String3", new DataBean3());
		return t3;
	}
	
	@Bean
	public TestBean3 obj14()
	{
		TestBean3 t3 = new TestBean3();
		t3.setA(4);
		t3.setB("String4");
		t3.setC(new DataBean3());
		return t3;
	}
}