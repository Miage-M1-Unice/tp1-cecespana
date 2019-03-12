package exercice2;

import java.io.BufferedWriter;
import java.io.File;  
import java.io.FileNotFoundException;   
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;  


public class SeLit {
	

	void lecture(Scanner source) {  
		
		File file = new File(source.nextLine());
		try {
			source = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		   
		while(source.hasNextLine()) {  
			String s = source.nextLine();          
	        System.out.println("LU:"+s);
	   }  
        source.close();
	}  
	
	void ecriture(String source) throws IOException {  
		
		BufferedWriter out = new BufferedWriter(new FileWriter(source,true));
		out.write("Write the string to text file");
		out.newLine();
		out.close();
		
	}
	  
	static public void main(String[] args) throws IOException {   
       
			//System.out.print( new File(".").getCanonicalPath());

			//System.out.print("Entrer le fichier avec son extension : ");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("Entrer le fichier avec son extension : ");
			String str = input.nextLine();
			
			SeLit oSeLit = new SeLit();
			//oSeLit.lecture(input);
			oSeLit.ecriture(str);

	}
}
