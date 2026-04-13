import java.util.Iterator;
public class OrdenamientosNoCuadraticos {

    public static void countingSort(Integer[] arreglo) {
        // Aquí va tu codigo 
    }

    private static int obtenerMax(Integer[] arreglo) {
        // Aquí va tu codigo
    }

    public static <T extends Comparable<T>> void mergeSort(ListaDoblementeLigada<T> lista) {
        // Aquí va tu codigo
    }

    private static <T extends Comparable<T>> ListaDoblementeLigada<T> mezclar(ListaDoblementeLigada<T> li, ListaDoblementeLigada<T> ld) {
          
    }

    public static <T extends Comparable<T>> void quickSort(T[] arreglo) {
        // Aquí va tu codigo
    }

    private static <T extends Comparable<T>> void quickSortAux(T[] arreglo, int inicio, int fin) {
        // Aquí va tu codigo
    }

    private static <T extends Comparable<T>> int particionar(T[] arreglo, int inicio, int fin) {
        T pivote  = arreglo[fin];
        Integer i = inicio - 1;

        for (T j : arreglo) {
            if(j.compareTo(inicio) >= 0 && j.compareTo(fin) < 0){

            }
        }
    }

    private static <T> void intercambiar(T[] arreglo, int i, int j) {
        // Aquí va tu codigo
    }
}
