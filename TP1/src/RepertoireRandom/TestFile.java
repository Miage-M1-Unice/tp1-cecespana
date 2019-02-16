package RepertoireRandom;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.regex.*;



public class TestFile {

	public static void main(String[] args) {
		
		TestFile t = new TestFile();
		t.question2();
		

	}
	
	// anonymous inner class
	  public static FilenameFilter filter(final String regex) {     
		  // Creation of anonymous inner class:     
		  return new FilenameFilter() {       
			  private Pattern pattern = Pattern.compile(regex);       
		  public boolean accept(File dir, String name) {         
			  return pattern.matcher(name).matches();       
			  }     
		  }; // End of anonymous inner class   }
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
					File[] listDirectory = fDirectory.listFiles(filter(".*java"));
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
	/*
	// Classe interne nommée
	public class DirectoryFilter implements FilenameFilter {
		
		private Pattern pattern;
		
		public DirectoryFilter(String regex) {
			pattern = Pattern.compile(regex);
		}

		@Override
		public boolean accept(File dir, String name) {
			return pattern.matcher(name).matches();
		}

	}
	*/
	


}
