import java.io.*;
import java.util.Scanner;

public class BusquedaBinariaTesting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingrese los números en orden ascendente:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Arreglo ingresado:");
        BusquedaBinaria.imprimirArreglo(numeros);

        System.out.println("Ingrese el número a buscar:");
        int objetivo = sc.nextInt();

        int resultado = BusquedaBinaria.binarySearch(numeros, objetivo);

        if (resultado != -1) {
            System.out.println("Elemento " + objetivo + " encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento " + objetivo + " no encontrado en el arreglo.");
        }

        // Guardar resultado en archivo
        BusquedaBinaria.guardarResultado(numeros, objetivo, resultado, "salida.txt");
        System.out.println("El resultado se guardó en salida.txt");

        sc.close(); // cerrar Scanner para evitar advertencia
    }
}