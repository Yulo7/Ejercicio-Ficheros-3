package Actividad3;

import java.io.*;

public class Ejercicio3part4 {
    static void main() {
        File directorio = new File("src/Actividad3/copias/");
        File archivo = new File("src/Actividad3/copias/config.txt");

        if (archivo.exists()){
            archivo.delete();
            System.out.println("Archivo eliminado correctamente");
        }
        else {
            System.out.println("El archivo no existe");
        }
        if (directorio.exists()){
            directorio.delete();
            System.out.println("El directorio se elimino correctamente");
        }
        else {
            System.out.println("No se ha encontrado el directorio");
        }

    }
    }
