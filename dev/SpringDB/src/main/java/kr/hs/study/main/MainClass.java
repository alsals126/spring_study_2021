package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// LoginDAO 가져오기
		LoginDAO dao = ctx.getBean(LoginDAO.class);
		
		// LoginDTO 가져오기(id: bean1)
		LoginDTO bean1 = ctx.getBean(LoginDTO.class);
		
		/*
		// bean1에 kim, 1111 세팅
		bean1.setUserid("OH");
		bean1.setUserpass(3333);		
		// dao의 메서드 호출
		dao.insert_date(bean1);
		System.out.println("저장완료");
		*/
		
		/*
		// LoginDTO 가져오기(id: bean2)
		// 바꿀 비밀번호로 세팅
		// dao메소드 호출
		LoginDTO bean2 = ctx.getBean(LoginDTO.class);
		bean2.setUserid("kim");
		bean2.setUserpass(2222);
		dao.update_data(bean2);
		System.out.println("업데이트");
		*/
		
		List<LoginDTO> list = dao.select_data();
		for(LoginDTO dto: list) {
			System.out.println(dto.getUserid());
			System.out.println(dto.getUserpass());
		}
		
		ctx.close();
	}

}
