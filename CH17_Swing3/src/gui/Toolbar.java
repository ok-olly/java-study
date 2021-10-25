package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//class ColorListner implements ActionListener {
//	private ColorChangeListener colorChanger;
//	private Color color;
//	
//	public ColorListner(ColorChangeListener colorchanger, Color color) {
//		this.colorChanger = colorchanger;
//		this.color = color;
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		colorChanger.changeColor(color);
//	}	
//}
//
public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar(ColorChangeListener colorChanger) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new ActionListener() { //익명 클래스
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.RED); //마우스 클릭 시 실행
			}
		});
		
		//람다식
		blueButton.addActionListener(e->colorChanger.changeColor(Color.BLUE));
		
		add(redButton);
		add(blueButton);
	}

}