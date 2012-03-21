<<<<<<< HEAD
/*
 * Författare: Simon Metsi & Mathias Andreasen
 * MP3Main.java
 */
package lab2.uppg5;

import javax.swing.JFrame;

public class MP3Main {
	public static void main(String[] args) throws Exception {
		// Testar vår simpla mp3-spelare
		
		PlayerPanel panel = new PlayerPanel();
		JFrame frame = new JFrame("MusicPlayer");
		
		AudioTrack track = new MP3Track();
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
=======
///*
// * Författare: Simon Metsi & Mathias Andreasen
// * MP3Main.java
// */
//package lab2.uppg5;
//
//import javax.swing.JFrame;
//
//public class MP3Main {
//	public static void main(String[] args) throws Exception {
//		// Testar vår simpla mp3-spelare
//		
//		PlayerPanel panel = new PlayerPanel();
//		JFrame frame = new JFrame("MusicPlayer");
//		
//		AudioTrack track = new MP3Track();
//		
//		frame.add(panel);
//		frame.pack();
//		frame.setVisible(true);
//
//	}
//
////}
>>>>>>> c4f08516adb5a2fee413389b261dec3702b13c12
