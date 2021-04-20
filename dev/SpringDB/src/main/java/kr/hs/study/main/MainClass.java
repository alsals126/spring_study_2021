package kr.hs.study.main;

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
		LoginDTO dto = ctx.getBean("bean1", LoginDTO.class);
		// bean1에 kim, 1111 세팅
		dto.setUserid("kim");
		dto.setUserpass(1111);
		
		// dao의 메서드 호출
		dao.insert_date(dto);
		
		ctx.close();
	}

}
