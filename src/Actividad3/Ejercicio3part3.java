package Actividad3;

import java.io.File;

public class Ejercicio3part3 {
    static void main() {
        File directorio = new File("src/Actividad3/copias");
        String [] elementos= directorio.list();

        if (elementos != null){
            for (String nombre: elementos){
                File elemento=new File(directorio, nombre);

                if(elemento.isDirectory()){
                    System.out.println("Directorio:  "+nombre);
                    File posible= new File(elemento.getAbsolutePath()+"/");
                    if (posible.list()!=null){
                        hijos(posible);
                    }
                }
                else {
                    System.out.println("Fichero:   "+nombre);
                }
            }
        }

    }
    public static void hijos(File directorio){
        String[] elementos =directorio.list();
        if (directorio != null){
            for(String nombre: elementos){
                File elemento=new File(directorio, nombre);

                if(elemento.isDirectory()){
                    System.out.println("    Directorio:  "+nombre);
                    File posible= new File(elemento.getAbsolutePath()+"/");
                    if (posible.list()!=null){
                        hijos(posible);
                    }
                }
                else {
                    System.out.println("    Fichero:   "+nombre);
                }
            }
        }
    }
}
