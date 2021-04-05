package kr.hs.study.beans;

public class LgTV implements TV {
	private int price;
	private SongSpeaker speaker;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SongSpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(SongSpeaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 ON");
	}
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 OFF");
	}
}
