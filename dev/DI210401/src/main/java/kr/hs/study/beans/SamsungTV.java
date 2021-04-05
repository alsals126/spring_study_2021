package kr.hs.study.beans;

public class SamsungTV implements TV {
	private int price;
	private SongSpeaker speaker;
	
	
	public SamsungTV() {
		super();
	}
	public SamsungTV(int price, SongSpeaker speaker) {
		super();
		this.price = price;
		this.speaker = speaker;
	}

	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 On");
	}

	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 Off");
	}

}
