
public class BusquedaBinaria {

    // Función principal de Busqueda binaria
    public static int binarySearch(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Si el elemento está en el medio
            if (arr[medio] == objetivo) {
                return medio; // aquí devuelve la posición
            }

            // Si el objetivo es mayor, ignorar la mitad izquierda del arreglo
            if (arr[medio] < objetivo) {
                inicio = medio + 1;
            }
            // Si el objetivo es menor, ignoramos la mitad derecha del arreglo
            else {
                fin = medio - 1;
            }
        }

        // Si no se encuentra el elemento
        return -1;
    }

    // Función para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}