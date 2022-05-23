package ch16;

public class MusicPlayer extends Thread{
	//멤버변수
	int type;
	MusicBox musicBox;
	public MusicPlayer() {
	}
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}
	public void run() {
		switch (type) {
		case 1 : musicBox.playMusicA(); break;
		case 2 : musicBox.playMusicB(); break;
		case 3 : musicBox.playMusicC(); break;
		}
	}
}
