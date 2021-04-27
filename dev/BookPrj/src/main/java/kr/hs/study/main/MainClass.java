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
		
		/*
		LoginDTO bean1 = ctx.getBean(LoginDTO.class);
		bean1.setBookTitle("title");
		bean1.setBookAuthor("author");
		bean1.setBookPrice(5000);
		bean1.setBookEmail("abcd");
		dao.insert_data(bean1);
		*/
		
		/*
		LoginDTO bean2 = ctx.getBean(LoginDTO.class);
		bean2.setBookPrice(7000);
		bean2.setBookEmail("s2019s33");
		dao.update_data(bean2);
		*/
		
		/*
		LoginDTO bean3 = ctx.getBean(LoginDTO.class);
		bean3.setBookEmail("abcd");
		dao.delete_data(bean3);
		*/
		
		List<LoginDTO> list = dao.select_data();
		for(LoginDTO dto: list) {
			System.out.println(dto.getBookTitle());
			System.out.println(dto.getBookAuthor());
			System.out.println(dto.getBookPrice());
			System.out.println(dto.getBookEmail());
		}
		System.out.println("완료");
		
		ctx.close();
	}

}
