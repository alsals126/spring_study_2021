package kr.hs.study.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.TimeTableDAO;
import kr.hs.study.dto.TimeTableDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// TimeTableDAO 가져오기
		TimeTableDAO dao = ctx.getBean(TimeTableDAO.class);
		
		System.out.println("========시간표 요정 o(≧∀≦)o ============");
		System.out.println("      1. 시간표 데이터 삽입하기");
		System.out.println("      2. 시간표 데이터 수정하기");
		System.out.println("      3. 시간표 데이터 삭제하기");
		System.out.println("      4. 시간표 데이터 출력하기");
		System.out.print("\n 뭐 할거야?? ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		switch(num) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("   위에 번호 줬자나!!!!!!!!!!!! \n   됐어 나 갈거야 o(≧口≦)o");
		}
		/*
		TimeTableDTO bean1 = ctx.getBean(TimeTableDTO.class);
		bean1.setName("");
		bean1.setTeacher("");
		bean1.setDay("");
		bean1.setTime();
		dao.insert_data(bean1);
		System.out.println("삽입완료");
		*/
		
		/*
		List<TimeTableDTO> list = dao.select_data();
		for(TimeTableDTO dto : list) {
			System.out.println(dto.getName());
			System.out.println(dto.getTeacher());
			System.out.println(dto.getDay());
			System.out.println(dto.getTime());
		}
		*/
		
		ctx.close();
	}

}
