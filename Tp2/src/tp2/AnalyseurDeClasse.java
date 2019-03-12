package tp2;

import java.lang.reflect.*;
import java.io.*;

public class AnalyseurDeClasse
{

   public static void main( String[] args ){

       try {

            Class classe = Class.forName("java.lang.String");

            System.out.println("Classe de l'objet chaine : "+classe.getName());
            System.out.println("Classe mère : " + classe.getSuperclass());       

            System.out.println("\nLes modifiers de la classe  :");

            int a = classe.getModifiers();

            if(Modifier.isPublic(a)) {

                System.out.println("La classe est public");

            }

            else if(Modifier.isAbstract(a)) {

                System.out.println("La classe est abstraite");

            }

            else if(Modifier.isPublic(a)) {

                System.out.println("La classe est public");

            }

            else if(Modifier.isFinal(a)) {

                System.out.println("La classe est finale");

            }

            else if(Modifier.isInterface(a)) {

                System.out.println("La classe est une interface");

            }else if(Modifier.isPrivate(a)) {

                System.out.println("La classe est privée");

            }else if(Modifier.isProtected(a)) {

                System.out.println("La classe est protected");

            }

            

            Class[] interfaces = classe.getInterfaces();

            if(interfaces.length > 0) {

                System.out.println("Interface(s) de la classe : ");

                for (int i = 0; i < interfaces.length; i++) {

                    System.out.println(interfaces[i].getName());

                }

            }

            

            System.out.println("\nListe des constructeurs de la classe : ");

            @SuppressWarnings("rawtypes")

            Constructor[] cons = classe.getConstructors();

            for(@SuppressWarnings("rawtypes") Constructor c : cons) {

                System.out.println(c);

            }

            

            System.out.println("\nListe des méthodes de la classe : ");

            Method[] methodes = classe.getMethods();

            for(Method laMethode : methodes) {

                System.out.println(laMethode);

            }

            

            System.out.println("\nListe des fields de la classe : ");

            Field[] fields = classe.getFields();

            for(Field f : fields) {

                System.out.println(f);

            }

            

            //setAccessible(true)

            /*

             *

             * Class a = Abc.getClass();

             * Field f = a.getField(a);

             * sysout(a);

             *

             *  Field[] fs = a.getDeclaredFields();

             *  for(Field f : fs={

             *  field.setAccessible(true)

             *  field.

             */

        } catch(Exception e) {

            e.printStackTrace();

        }

           

   }

}

