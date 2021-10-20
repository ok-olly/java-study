package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RedListner implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("빨간버튼 클릭");
	}	
}

class BlueListner implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("파란버튼 클릭");
	}	
}

public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar() {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new RedListner());
		blueButton.addActionListener(new BlueListner());
		
		add(redButton);
		add(blueButton);
	}

}
