package Actividad4;

import java.io.*;

public class Ejercicio4 {
    static void main() {
        String RUTA = "src/Actividad4/cosas";
        String ORIGEN = "/datos.txt";
        String DESTINO = "/copia.txt";
        try (BufferedReader leerFichero = new BufferedReader(new
                FileReader(RUTA + ORIGEN));
             BufferedWriter escribirFichero = new BufferedWriter(new
                     FileWriter(RUTA + DESTINO))) {
            String linea;
            while ((linea = leerFichero.readLine()) != null) {
                if(linea.length()==0 || linea.trim().isEmpty()){
                    System.out.println("Linea en blanco eliminada");
                }
                else {
                    escribirFichero.write(linea);
                    escribirFichero.newLine();
                }
            }
            System.out.println("Fichero copiado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el fichero.");
        }
    }
}
