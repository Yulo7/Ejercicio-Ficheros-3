package Actividad4;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        File ruta = new File("src/Actividad4/cosas/datos.txt");
        if(ruta.exists()){
            System.out.println("Ingrese su palabra");
            String palabra = sc.next();
            try (BufferedReader leer = new BufferedReader(new FileReader(ruta))){
                String linea;
                String[] coleccion;
                int aparece = 0;
                while ((linea = leer.readLine()) != null){
                    coleccion = linea.split(" ");
                    for (int i=0;i < coleccion.length;i++){
                        if (coleccion[i].equals(palabra)){
                            aparece++;
                            break;
                        }
                    }
                }
                System.out.println("La palabra "+palabra+" aparece "+aparece+" veces");
            }catch (FileNotFoundException e){
                throw new RuntimeException(e);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
