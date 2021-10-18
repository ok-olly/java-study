package application;

public class Cat {
	private String name; //����� �̸�
	public static final String FOOD = "����� ���";
	//����ƽ ������ ��ü���� ��������
	private static int count = 0; // ������ ������� ����
	
	public Cat(String name) { //�����ڴ� ���� Ÿ���� ����(�Ϲ� �޼ҵ�ʹ� �ٸ�), Ŭ���� �̸��� ����
		this.name = name;
		count++; //����� ��ü ���� �� ����ƽ count�� +1�� �ȴ�.
	}

	@Override
	public String toString() { //toString �޼ҵ� �ڵ�����
		return "����� [�̸�=" + name + "]";
	}
	
	public static int getCount() { //����ƽ �޼ҵ�
		//String n = name; ����ƽ�޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����. 
		return count;
	}
	
	
}
