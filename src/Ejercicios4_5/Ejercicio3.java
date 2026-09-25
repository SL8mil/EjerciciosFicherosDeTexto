package Ejercicios4_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    private static final String RUTA_FICHERO = "src/";

    public static void main(String[] args) {
        File origen = new File(RUTA_FICHERO + "datos.txt");
        File destino = new File(RUTA_FICHERO + "copia.txt");
        if (origen.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(origen));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine();
                }
                System.out.println("Fichero copiado con éxito a 'copia.txt'.");
            } catch (IOException e) {
                System.out.println("Error durante el proceso de copia: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero de origen 'datos.txt' no existe en la ruta: " + RUTA_FICHERO);
        }
    }
}