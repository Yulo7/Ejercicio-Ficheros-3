package Actividad3;

import java.io.File;
import java.io.IOException;

public class Ejercicio3part2 {
    static void main() throws IOException {
        File config = new File("src/Actividad3/copias/config.txt");
        if (config.exists()){
            System.out.println("El fichero ya existe.");
        }
        else {
            config.createNewFile();
            System.out.println("el fichero se a creado correctamente");
        }
    }
}
