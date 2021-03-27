package kr.hs.study.beans;

public class Car {
	private int price;
	private String name; //차종
	
	public Car() {
		System.out.println("Car의 기본생성자입니다.");
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void Print() {
		System.out.println("가격: " + price);
		System.out.println("차종: " + name);
	}
}
