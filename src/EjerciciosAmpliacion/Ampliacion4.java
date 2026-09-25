package EjerciciosAmpliacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ampliacion4 {
    private static final String RUTA_FICHERO = "src/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = scanner.nextLine();
        scanner.close();
        File fichero = new File(RUTA_FICHERO + nombreFichero);
        if (fichero.exists()) {
            try {
                int totalLineas = 0;
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    while (br.readLine() != null) {
                        totalLineas++;
                    }
                }
                String[] arrayLineas = new String[totalLineas];
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    String linea;
                    int i = 0;
                    while ((linea = br.readLine()) != null) {
                        arrayLineas[i] = linea;
                        i++;
                    }
                }
                System.out.println("\n Líneas en orden inverso");
                for (int i = arrayLineas.length - 1; i >= 0; i--) {
                    System.out.println(arrayLineas[i]);
                }

            } catch (IOException e) {
                System.out.println("Error al procesar el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero no existe en la ruta: " + RUTA_FICHERO);
        }
    }
}
