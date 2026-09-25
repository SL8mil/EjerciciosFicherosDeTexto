package Ejercicios3_5;

import java.io.File;
import java.io.IOException;

public class ejercicio2 {
    public static void main(String[] args) {
        File directorio = new File("src/copias");
        File ficheroConfig = new File(directorio, "config.txt");

        try {
            if (!directorio.exists()) {
                directorio.mkdir();
            }

            if (ficheroConfig.exists()) {
                System.out.println("El fichero 'config.txt' ya existe.");
            } else {
                boolean creado = ficheroConfig.createNewFile();
                if (creado) {
                    System.out.println("Fichero 'config.txt' creado con éxito.");
                } else {
                    System.out.println("No se pudo crear el fichero.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error de E/S al crear el fichero: " + e.getMessage());
        }
    }
}
