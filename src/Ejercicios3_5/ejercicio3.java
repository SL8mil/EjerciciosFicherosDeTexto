package Ejercicios3_5;

import java.io.File;

public class ejercicio3 {
    public static void main(String[] args) {
        File directorio = new File("src/copias");
        if (directorio.exists() && directorio.isDirectory()) {
            System.out.println("--- Contenido del directorio 'copias' ---");
            File[] elementos = directorio.listFiles();

            if (elementos != null) {
                for (File elemento : elementos) {
                    String tipo = elemento.isDirectory() ? "Directorio" : "Fichero";
                    System.out.println("- " + elemento.getName() + " (" + tipo + ")");
                }
            } else {
                System.out.println("El directorio está vacío o no se pudo leer.");
            }
        } else {
            System.out.println("El directorio 'copias' no existe.");
        }
    }
}
