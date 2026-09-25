package EjerciciosAmpliacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ampliacion2 {
    private static final String RUTA_FICHERO = "src/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = scanner.nextLine();
        File fichero = new File(RUTA_FICHERO + nombreFichero);

        if (fichero.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int contadorLineas = 0;

                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    contadorLineas++;
                    if (contadorLineas % 24 == 0) {
                        System.out.print("\n--- Pulsa [Intro] para continuar ---");
                        scanner.nextLine();
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero no existe en la ruta: " + RUTA_FICHERO);
        }
        scanner.close();
    }
}