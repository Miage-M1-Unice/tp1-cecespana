package RepertoireRandom;

import java.io.File;
import java.io.FilenameFilter;

public class FiltreFichier {
		FilenameFilter filtreFichier = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
	               if(name.lastIndexOf('.')>0) {

	                   int lastIndex = name.lastIndexOf('.');

	                   String str = name.substring(lastIndex);

	                   if(str.equals(".java")) {
	                      return true;
	                   }
	                }
	                
	                return false;
	             }
		};
}
