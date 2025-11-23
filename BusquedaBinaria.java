import java.io.*;

public class BusquedaBinaria {

    // Funcion principal de búsqueda binaria
    public static int binarySearch(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == objetivo) {
                return medio; // posición encontrada
            }

            if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; // si es que no se encuentra el número
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Guardar resultado en archivo
    public static void guardarResultado(int[] arr, int objetivo, int resultado, String nombreArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
        bw.write("Arreglo ordenado: ");
        for (int num : arr) {
            bw.write(num + " ");
        }
        bw.newLine();

        if (resultado != -1) {
            bw.write("Elemento " + objetivo + " encontrado en la posición: " + resultado);
        } else {
            bw.write("Elemento " + objetivo + " no encontrado en el arreglo.");
        }
        bw.close();
    }
}