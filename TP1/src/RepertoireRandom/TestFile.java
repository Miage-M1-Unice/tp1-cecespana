package RepertoireRandom;

import java.io.File;
import java.io.FilenameFilter;



public class TestFile {

	public static void main(String[] args) {
		
		TestFile t = new TestFile();
		t.question2();
		

	}
	
	public void question2() {
		

		
		File f = new File("src");
		File[] list = f.listFiles();
		
		if(list !=null) {
			for(int i = 0; i<list.length;i++){
				if(list[i].isDirectory()){
					File fDirectory = new File(list[i].getPath());
					File[] listDirectory = fDirectory.listFiles();
						for(int j = 0; j<listDirectory.length;j++){
							System.out.println(listDirectory[j]);
						}
				}
				
			}
		}
			else{
				System.out.println("Erreur path");
			}
		
		
	}

}
