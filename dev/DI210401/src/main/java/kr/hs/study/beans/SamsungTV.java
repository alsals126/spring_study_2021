package kr.hs.study.beans;

public class SamsungTV implements TV {
	private int price;
	private SongSpeaker speaker;
	
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 On");
	}

	public void poserOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 Off");
	}

}
