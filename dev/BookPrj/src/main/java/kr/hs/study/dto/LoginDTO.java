package kr.hs.study.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//bean으로 등록하고, 매번 객체를 생성해야 하기 때문에 prototype 속성 줌
@Component
@Scope("prototype")
public class LoginDTO {
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;
	private String bookEmail;
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookEmail() {
		return bookEmail;
	}
	public void setBookEmail(String bookEmail) {
		this.bookEmail = bookEmail;
	}
}
