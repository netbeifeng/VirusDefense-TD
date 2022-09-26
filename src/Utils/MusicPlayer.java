package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class MusicPlayer implements Runnable{
	
	public static int musicNumbers = 2;
	public static AudioStream []BGM = new AudioStream[musicNumbers];
	boolean flag;
	private static FileInputStream fileInputStream[] = new FileInputStream[musicNumbers];
	private static String path[] = new String[musicNumbers];
	
	public MusicPlayer() {
		flag = true;
		try {
			path[0] = "./res/sound/click_1.wav";
			path[1] = "./res/sound/click_2.wav";
			for(int i =0;i<path.length;i++) {
				fileInputStream[i] = new FileInputStream(path[i]);
				BGM[i] = new AudioStream(fileInputStream[i]);
			}
		} catch (IOException e) {e.printStackTrace();}
	}
	
	//play Music
	public static void play(int i ,int isIn) {
		try {
			if (isIn == 0) {
				AudioPlayer.player.start(BGM[i]);
			}else if (isIn == 1) {
				AudioPlayer.player.start(BGM[i]);
				fileInputStream[i] = new FileInputStream(path[i]);
				BGM[i] = new AudioStream(fileInputStream[i]);
			}else {
				fileInputStream[i] = new FileInputStream(path[i]);
				BGM[i] = new AudioStream(fileInputStream[i]);
			}
		} catch (Exception e) {e.printStackTrace();}
		
	}
	//pause
	public void stop(AudioStream music) {
		AudioPlayer.player.stop(music);
		flag = false;
	}
	//restart
	public void restart(AudioStream music) {
			flag = true;
			new Thread(this).start();
	}
	//repeat
	public void run() { 
		//stop Thread
		while(flag) {
			try {
				if (BGM[0].available()==0) {
					fileInputStream[0] = new FileInputStream("./res/sound/click_2.wav");
					BGM[0] = new AudioStream(fileInputStream[0]);
					play(0,0);
				}else {
					play(0,0);
					Thread.sleep(289300);
				}
			} catch (IOException | InterruptedException e) {e.printStackTrace();}
		}
	}
}
