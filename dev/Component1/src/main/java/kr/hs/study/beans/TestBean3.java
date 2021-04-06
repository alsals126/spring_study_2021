package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj3") /* 한 패키지안에는 같은 이름의 파일명이 있을 수 없어서 id를 등록하는건 무의미하다. */
@Lazy
@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 기본생성자");
	}
}
