package lab2.uppg5;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MP3Track extends Thread implements AudioTrack {
	
	private MP3Random mp3_file;
	private Player player;
	
	public MP3Track () { mp3_file = new MP3Random(); }

	@Override
	public void play() throws JavaLayerException {
		player.play();
	}
	
	public void quit() { if (player != null) player.close(); }

}
