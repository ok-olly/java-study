package file_class;

import java.io.File;

public class App {

	public static void main(String[] args) {
		File currentDirectory = new File("src");
		
		//절대경로(현재 프로젝트폴더까지)
		System.out.println(currentDirectory.getAbsolutePath());
		
		//폴더 안의 내부파일들의 이름 출력
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}

	}

}
