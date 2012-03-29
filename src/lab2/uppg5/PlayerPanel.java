//package lab2.uppg5;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//import javazoom.jl.decoder.JavaLayerException;
//
//public class PlayerPanel extends JPanel {
//	
//	private final int WIDTH = 500, HEIGHT = 80;
//	private JButton PLAY, NEXT, STOP;
//	private JLabel PLAYING, TIME;
//	
//	public PlayerPanel () {
//		
//		// Knappar
//		PLAY = new JButton("Play");
//		PLAY.addActionListener(new PlayListener());
//		PLAY.setBounds(2, 2, 80, 20);
//		
//		NEXT = new JButton("Next");
//		NEXT.addActionListener(new NextListener());
//		NEXT.setBounds(85, 2, 80, 20);
//		
//		STOP = new JButton("Stop");
//		STOP.addActionListener(new StopListener());
//		STOP.setBounds(168, 2, 80, 20);
//		
//		// Text
//		PLAYING = new JLabel("Spelas: ");
//		PLAYING.setBounds(100, 100, 80, 20);
//		
//		setLayout(null);
//		setPreferredSize(new Dimension(WIDTH, HEIGHT));
//		setBackground(Color.white);
//		setFont(new Font("Arial", Font.BOLD, 32));
//		
//		add(PLAY);
//		add(NEXT);
//		add(STOP);
//		
//		add(PLAYING);
//	}
//	
//	private class PlayListener extends MP3Track implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Kallar play() från MP3Random
//			try {
//				play();
//			} catch (JavaLayerException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}
//	}
//	
//	private class NextListener implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//		}
//	}
//	
//	private class StopListener extends MP3Track implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Kallar quit() från MP3Random
//			quit();
//		}
//	}
//
//}