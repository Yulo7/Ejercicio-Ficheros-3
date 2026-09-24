package Ampliacion;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        File ruta = new File("src/Ampliacion/Ficheros");

        System.out.print("Introduce el nombre del fichero de texto que quieras contar: \n");
        String nombreFichero = sc.nextLine();

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta+"/"+nombreFichero))) {
            String linea;
            int contador = 0;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                contador++;

            }
            System.out.print("Contiene "+contador+" lineas");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
