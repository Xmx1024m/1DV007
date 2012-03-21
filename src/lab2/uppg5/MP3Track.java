<<<<<<< HEAD
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
=======
//package lab2.uppg5;
//
//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;
//
//public class MP3Track extends Thread implements AudioTrack {
//	
//	private MP3Random mp3_file;
//	private Player player;
//	
//	public MP3Track () { mp3_file = new MP3Random(); }
//
//	@Override
//	public void play() throws JavaLayerException {
//		player.play();
//	}
//	
//	public void quit() { if (player != null) player.close(); }
//
//}
>>>>>>> c4f08516adb5a2fee413389b261dec3702b13c12
