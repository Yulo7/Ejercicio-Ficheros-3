package Ampliacion;
import java.io.*;
import java.util.Scanner;
public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int pausa = 24;
        File ruta = new File("src/Ampliacion/Ficheros");

        System.out.print("Introduce el nombre del fichero de texto que quieras ver de la carpeta de ficheros: \n");
        String nombreFichero = sc.nextLine();

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta+"/"+nombreFichero))) {
            String linea;
            int contador = 0;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                contador++;

                if (contador - pausa == 0) {
                    System.out.print("-- Pulsa Intro para continuar --");
                    sc.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
