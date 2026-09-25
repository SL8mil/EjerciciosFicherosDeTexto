package EjerciciosAmpliacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ampliacion3 {
    private static final String RUTA_FICHERO = "src/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = scanner.nextLine();
        scanner.close();
        File fichero = new File(RUTA_FICHERO + nombreFichero);
        long contadorLineas = 0;
        if (fichero.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                while (br.readLine() != null) {
                    contadorLineas++;
                }
                System.out.println("El fichero contiene " + contadorLineas + " líneas de texto.");
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero no existe en la ruta: " + RUTA_FICHERO);
        }
    }
}
