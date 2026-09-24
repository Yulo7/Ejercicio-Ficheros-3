
package Actividad3;

import java.io.File;

public class Ejercicio3 {
    static void main() {
        File directorio = new File("src/Actividad3/copias");
        if (directorio.exists()){
            System.out.println("El directorio ya existe.");
        }
        else {
            directorio.mkdir();
            System.out.println("el Directorio se a creado correctamente");
        }
    }
}
