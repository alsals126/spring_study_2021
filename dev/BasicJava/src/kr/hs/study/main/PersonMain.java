package kr.hs.study.main;

import kr.hs.study.beans.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("kim");
		p1.setAge(30);
		
		System.out.println("�̸�> " + p1.getName() +" ����> " + p1.getAge());
		
		Person p2 = new Person("lee", 25);
		System.out.println(p2.getName() + ", " + p2.getAge());
	}

}
