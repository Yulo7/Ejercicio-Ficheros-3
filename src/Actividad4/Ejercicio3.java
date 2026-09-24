package Actividad4;

import java.io.*;

public class Ejercicio3 {
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
                escribirFichero.write(linea);
                escribirFichero.newLine();
            }
            System.out.println("Fichero copiado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el fichero.");
        }
    }
}
