/*package RepertoireRandom;

import java.io.*;
import java.util.*;
import java.util.regex.*;

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