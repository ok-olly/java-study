package hashcodeThis;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();
		
		System.out.println(fox1.toString());
		System.out.printf("%x\n",fox1.hashCode()); //�ؽ��ڵ�(�ּҰ�)�� 16������ ��ȯ
		
		
		Fox fox2 = new Fox();
		
		System.out.println(fox2);
		
		Fox fox3 = fox1;
		
		System.out.println(fox3);
		System.out.println(fox3.name);
		
	}

}
