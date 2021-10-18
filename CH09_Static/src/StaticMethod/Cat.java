package StaticMethod;

public class Cat {
	private String name; //����� �̸�
	private int id; //����� ���̵�
	public static final String FOOD = "����� ���";
	//����ƽ ������ ��ü���� ��������
	private static int count = 0; // ������ ������� ����
	
	public Cat(String name) { //�����ڴ� ���� Ÿ���� ����(�Ϲ� �޼ҵ�ʹ� �ٸ�), Ŭ���� �̸��� ����
		this.name = name;
		//�ڵ� �߰�		
		count++; //����� ��ü ���� �� ����ƽ count�� +1�� �ȴ�.
		id = count;
	}

	@Override
	public String toString() { //toString �޼ҵ� �ڵ�����
		return "����� [���̵�=" + id + ", �̸�=" + name + "]";
	}
	
	public static int getCount() { //����ƽ �޼ҵ�
		//String n = name; ����ƽ�޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����. 
		return count;
	}
	
	
}
