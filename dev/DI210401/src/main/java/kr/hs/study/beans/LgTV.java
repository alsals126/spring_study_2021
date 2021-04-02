package kr.hs.study.beans;

public class LgTV implements TV {
	private int price;
	private SongSpeaker speaker;
	
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 ON");
	}

	public void poserOff() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 OFF");
	}

}
