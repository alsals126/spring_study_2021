package kr.hs.study.main;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldInter;
import kr.hs.study.beans.HelloWorldKo;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldEn hello = new HelloWorldEn();
		hello.sayHello();
		
		HelloWorldKo hello2 = new HelloWorldKo();
		hello2.sayHello();
		
		//인터페이스 사용하면
		HelloWorldInter interEn = new HelloWorldEn();
		interEn.sayHello();
		HelloWorldInter interKo = new HelloWorldKo();
		interKo.sayHello();
	}

}
