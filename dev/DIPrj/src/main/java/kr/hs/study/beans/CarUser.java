package kr.hs.study.beans;

public class CarUser {
	private String owner; //차주이름
	private String color;
	private Car car_type;
	
	public CarUser() {
		System.out.println("CarUser의 기본생성자");
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car getCar_type() {
		return car_type;
	}
	public void setCar_type(Car car_type) {
		this.car_type = car_type;
	}
	
	public void Print() {
		System.out.println("차주이름: " + owner);
		System.out.println("색깔: " + color);
	}
}
