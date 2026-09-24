package Actividad4;

import java.io.*;

public class Ejercicio1 {
    static void main(String[] args) throws IOException {


        File directorio = new File("src/Actividad4/cosas");
        File archivo = new File(directorio + "/datos.txt");
        if (!directorio.exists()){
            directorio.mkdir();
            archivo.createNewFile();
            System.out.println("Directorio y Fichero creado con exixto");
            leer(archivo);
        }
        else if(archivo.exists()){
            System.out.println("El archivo ya existe");
            leer(archivo);
        }


    }
    public static void leer(File archivo){
        try (BufferedReader leer=new BufferedReader(new FileReader(archivo))){
            String linea;
            int cont=0;
            while ((linea=leer.readLine())!= null){
                System.out.println(linea);
                cont++;
            }
            System.out.println("Contine "+cont+" Lineas");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

