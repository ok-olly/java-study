package game.objects;

public enum GameObject {
	
	가위, 바위, 보;
	
	private int[][] comparison = {
				//����  ����  ��
		/*����*/	{ 0,  -1,  1 },
		/*����*/	{ 1,  0,  -1 },
		/*��*/		{ -1,  1,  0 }
	};
	
	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
	}
		
}
