package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// JFrame���� ������ â �����
		
		SwingUtilities.invokeLater(()->{
			
			new MainFrame("�׽�Ʈ ����"); //�� â mainFrame�� ����
						
		});
		
	}

}
