package tp2;

import java.awt.Point;
import java.awt.Polygon;
import java.lang.reflect.Field;

public class GenericToString {

	public static void main(String[] args) {
		
		  System.out.println(new GenericToString().toString(new Point(12,24)));  
		  
		  Polygon pol = new Polygon(new int[]{10, 20, 30}, new int[]{20,30, 40}, 3);  
		  pol.getBounds();  
		  System.out.println(new GenericToString().toString(pol, 2));

	}
	
	public String toString(Object o) {
		
		String str = o.getClass().getName()+"[";
		
		Class cl = null;
		
		try {
			cl = Class.forName(o.getClass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		Field[] fields = cl.getDeclaredFields();
		
		for(int i = 0 ; i<fields.length;i++) {
			fields[i].setAccessible(true);
			try {
				str+= fields[i].getName()+"="+fields[i].get(o);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			if(i < fields.length-1){
				str+=";";
			}
			
		}
		
		return str;
		
	}
	
	public String toString(Object o, int profondeur) {
		
		String str = o.getClass().getName()+"[";
		
		Class cl = null;
		
		try {
			cl = Class.forName(o.getClass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
Field[] fields = cl.getDeclaredFields();    

        

        for(int j=0; j<fields.length; j++) {

            fields[j].setAccessible(true);

            

            try {

                String alt = null;
				if(fields[j].get(o) instanceof  int[]) {

                    alt = "";
                    int[] inte = (int[]) fields[j].get(o);                    
                    String separator = "";

                    for(int k=0; k<inte.length; k++) {

                        if(k < 2) {
                            separator = ";";
                        }else {
                            separator = "";
                        }

                        alt += inte[k] + separator;
                    }

                }

                if(j>0 && j<3) {

                    str += fields[j].getName() + "={" + alt + "}";
                }else {
                    str += fields[j].getName() + "=" + fields[j].get(o) ;

                }
                
            }

            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

            catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            if(j<fields.length -1) {
                str +=  ";" ;
            }else {
                str += ']';
            }
        }
        return str;
    }
}
