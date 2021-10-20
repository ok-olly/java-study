package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorListner implements ActionListener {
	private MainPanel mainPanel;
	private Color color;
	
	public ColorListner(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(color);
	}	
}

public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new ColorListner(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorListner(mainPanel, Color.BLUE));
		
		add(redButton);
		add(blueButton);
	}

}
