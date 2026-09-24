package Ampliacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ampliacion {
    static void main() throws IOException {
        File directorio = new File("src/Ampliacion/Ficheros");
        File archivo = new File(directorio+"/datos.txt");
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        if (!directorio.exists()){
            directorio.mkdir();
        }
        else {
            while (salir==false) {
                System.out.print("Que desea: \n");
                String palabras=sc.nextLine();

                if(palabras.equals("x")){
                  salir=true;
                }else {
                    BufferedWriter escribir= new BufferedWriter(new FileWriter(archivo,true));
                    escribir.write(palabras);
                    escribir.newLine();
                    escribir.close();
                }




                }
            }
        }
    }
