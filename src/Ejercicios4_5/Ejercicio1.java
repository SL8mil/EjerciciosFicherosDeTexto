package Ejercicios4_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    private static final String RUTA_FICHERO = "src/";
    public static void main(String[] args) {
        File fichero = new File(RUTA_FICHERO + "datos.txt");
        long contadorLineas = 0;
        if (fichero.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                while (br.readLine() != null) {
                    contadorLineas++;
                }
                System.out.println("Número total de líneas: " + contadorLineas);
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero 'datos.txt' no se encuentra en la ruta: " + RUTA_FICHERO);
        }
    }
}
