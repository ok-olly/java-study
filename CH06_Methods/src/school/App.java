package school;

public class App {

	public static void main(String[] args) {

		Student s1 = new Student("���",7,true,36.5);
		Student s2 = new Student("�浿",17,false,35.5);
		Student s3 = new Student("���̾�",27,true,36.0);
		Student s4 = new Student();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

	}

}
