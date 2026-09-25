package Ejercicios4_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    private static final String RUTA_FICHERO = "src/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine().toLowerCase();
        scanner.close();

        File fichero = new File(RUTA_FICHERO + "datos.txt");
        long contadorCoincidencias = 0;
        if (fichero.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.toLowerCase().contains(palabraBuscada)) {
                        contadorCoincidencias++;
                    }
                }
                System.out.println("La palabra aparece en " + contadorCoincidencias + " líneas.");
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero 'datos.txt' no se encuentra en la ruta: " + RUTA_FICHERO);
        }
    }
}
