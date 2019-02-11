import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;


public class TestFile {

	public static void main(String[] args) {
		
		File f = new File("src");
		String list[] = f.list();
		
		if(list !=null) {
			for(int i = 0; i<list.length;i++){
				System.out.println(list[i]);
			}
		}
			else{
				System.out.println("Erreur path");
			}
		


	}

}
