package Ampliacion;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File ruta = new File("src/Ampliacion/Ficheros");
        String[] orden;

        System.out.print("Introduce el nombre del fichero de texto que quieras contar: \n");
        String nombreFichero = sc.nextLine();
        String Ruta_Completa = ruta + "/" + nombreFichero;

        try {
            int contador = 0;
            try (BufferedReader lector = new BufferedReader(new FileReader(Ruta_Completa))) {
                while (lector.readLine() != null) {
                    contador++;
                }
            }

            orden = new String[contador];

            try (BufferedReader lector = new BufferedReader(new FileReader(Ruta_Completa))) {
                String linea;
                int i = 0;
                while ((linea = lector.readLine()) != null) {
                    orden[i] = linea;
                    i++;
                }
            }
            System.out.println("Contiene " + contador + " lineas");
            //Orden Inverso
            for (int i = contador - 1; i >= 0; i--) {
                System.out.println(orden[i]);
            }

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}