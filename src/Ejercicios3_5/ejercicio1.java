package Ejercicios3_5;

import java.io.File;

public class ejercicio1 {
    public static void main(String[] args) {
        File directorio = new File("src/copias");
        if (directorio.exists()) {
            System.out.println("El directorio 'copias' ya existe.");
        } else {
            boolean creado = directorio.mkdir();
            if (creado) {
                System.out.println("Directorio 'copias' creado con éxito.");
            } else {
                System.out.println("Error al crear el directorio.");
            }
        }
    }
}
