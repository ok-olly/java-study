package application;

public class MultiArray2 {

	public static void main(String[] args) {
		// ���� �迭
		String[][] texts = {
				{"�ϳ�","��","��"},
				{"��","�ټ�","����"},
				{"�ϰ�","����","��ȩ"},
		};
		
		for(int i=0;i<texts.length;i++) {
			
			for (int j=0;j<texts[i].length;j++) {
				System.out.printf("%s\t", texts[i][j]);
			}
			
			System.out.println();
		}

	}

}
