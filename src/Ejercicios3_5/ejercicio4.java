package Ejercicios3_5;

import java.io.File;

public class ejercicio4 {
    public static void main(String[] args) {
        File directorio = new File("src/copias");
        File ficheroConfig = new File(directorio, "config.txt");
        if (ficheroConfig.exists()) {
            boolean ficheroBorrado = ficheroConfig.delete();
            if (ficheroBorrado) {
                System.out.println("Fichero 'config.txt' eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el fichero 'config.txt'.");
            }
        } else {
            System.out.println("El fichero 'config.txt' no existe.");
        }
        if (directorio.exists()) {
            boolean directorioBorrado = directorio.delete();
            if (directorioBorrado) {
                System.out.println("Directorio 'copias' eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el directorio 'copias'.");
                System.out.println("Causa: El directorio no está vacío (o hubo un fallo de E/S).");
            }
        }
    }
}
