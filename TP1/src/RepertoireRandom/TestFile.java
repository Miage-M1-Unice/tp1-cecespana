package RepertoireRandom;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;



public class TestFile {

	public static void main(String[] args) {
		
		TestFile t = new TestFile();
		t.question2();
		

	}
	
	public void question2() {
		/*
	    File path = new File("src");     
	    String[] list; 

	    
	    list = path.list(new DirectoryFilter(".*txt"));   
	    for(String dirItem : list)       
	    	System.out.println(dirItem);
	    */
		

		// On analyse le dossier src
		File path = new File("src");
		File[] list = path.listFiles();
		
		if(list !=null) {
			for(int i = 0; i<list.length;i++){
				if(list[i].isDirectory()){
					File fDirectory = new File(list[i].getPath());
					File[] listDirectory = fDirectory.listFiles(new DirectoryFilter(".*java"));
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
