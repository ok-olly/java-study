package integer;

public class VariableAssignment {

	public static void main(String[] args) {
		// ������ �׻� ���Ҵ� (���� ���� �Է°���) �� �� �ִ�.
		int dogs = 8;
		int cats = 3;
		
		System.out.println("1. Dogs: " + dogs);
		System.out.println("2. Cats: " + cats);
		
		dogs = cats;
		cats = 10;
		
		System.out.println("1. Dogs: " + dogs);
		System.out.println("2. Cats: " + cats);
	}

}
