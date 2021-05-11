package kr.hs.study.beans;

public class SongSpeaker implements Speaker {
	public SongSpeaker() {
		System.out.println("songspeaker 입니다.");
	}
	public void volumeUP() {
		// TODO Auto-generated method stub
		System.out.println("songspeaker UP");
	}

	public void volumeDOWN() {
		// TODO Auto-generated method stub
		System.out.println("songspeaker DOWN");
	}

}
