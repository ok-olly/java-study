package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); //JFrame占쏙옙 타占쏙옙틀占쏙옙 占쏙옙占쏙옙占싹듸옙占쏙옙
		
		MainPanel mainPanel = new MainPanel();
		
		setLayout(new BorderLayout()); //占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙창占쏙옙 占쏙옙占쏙옙占쏙옙트占쏙옙 占쏙옙占싱깍옙 占쏙옙占쏙옙
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER); //占쌩억옙 占쏙옙占쏘데 占싻놂옙占쏙옙 占쏙옙占싱깍옙
		
		setSize(600,400);//창 占쏙옙占쏙옙占쏙옙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창占쏙옙 占쏙옙占쏙옙 占쏙옙 占쏙옙占싸그뤄옙 占쏙옙占쏙옙
		setVisible(true); //占쏙옙占싱곤옙 占싹깍옙		
	}

}
