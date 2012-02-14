/*
 * Författare: Simon Metsi & Mathias Andreasen
 * CatchCreature.java
 */
package lab1.uppg4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CatchCreature extends JPanel {
	
	public CatchCreature () {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(500, 500));
		setFont(new Font("Arial", Font.BOLD, 32));
		
		Creature taz = new Creature();
		JPanel creaturePanel = new JPanel();
		creaturePanel.add(new JLabel(taz.getImg()));
		
		add(creaturePanel);
	}

}
