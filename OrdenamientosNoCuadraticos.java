import java.util.Iterator;
public class OrdenamientosNoCuadraticos {

    public static void countingSort(Integer[] arreglo) {
        int mayor = obtenerMax(arreglo);
        int[] conteo = new int[mayor+1];
        for (int i = 0; i < arreglo.length; i++) {
            conteo[arreglo[i]] = conteo[arreglo[i]] + 1; 
        }    
        int indice = 0;

        for (int i = 0; i < conteo.length; i++) {
            while(conteo[i] > 0){
                arreglo[indice] = i;
                indice = indice + 1; 
                conteo[i] = conteo[i] - 1;
            }
        }
    }

    private static int obtenerMax(Integer[] arreglo) {
        int max = arreglo[0];

        for (Integer elem : arreglo) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void mergeSort(ListaDoblementeLigada<T> lista) {
        if (lista.devolverLongitud() < 2) {
            return;
        }
        ListaDoblementeLigada<T> izquierda = new ListaDoblementeLigada<>();        
        ListaDoblementeLigada<T> derecha = new ListaDoblementeLigada<>();        

        int mitad = (int) lista.devolverLongitud()/2;

        int i = 0;

        for (T aux : lista) {
            if(i < mitad){
                izquierda.agregarFinal(aux);
            } else {
                derecha.agregarFinal(aux);
            }
            i = i+1;
        }

        mergeSort(izquierda);
        mergeSort(derecha);

        ListaDoblementeLigada<T> resultado = mezclar(izquierda, derecha);        
        ListaDoblementeLigada<T>.Nodo nodoActualLista = lista.cabeza;        
        ListaDoblementeLigada<T>.Nodo nodoActualResultado = resultado.cabeza;        


        while (nodoActualLista != null && nodoActualResultado != null) { 
            nodoActualLista.elemento = nodoActualResultado.elemento;
            nodoActualLista = nodoActualLista.siguiente;
            nodoActualResultado = nodoActualResultado.siguiente;
        }

        
    }

    private static <T extends Comparable<T>> ListaDoblementeLigada<T> mezclar(ListaDoblementeLigada<T> li, ListaDoblementeLigada<T> ld) {
        ListaDoblementeLigada<T>.Nodo ni = li.cabeza;        
        ListaDoblementeLigada<T>.Nodo nd = ld.cabeza;        
        ListaDoblementeLigada<T> resultado = new ListaDoblementeLigada<>();        

        while(ni != null && nd != null){
            if (ni.elemento.compareTo(nd.elemento) <= 0) {
                resultado.agregarFinal(ni.elemento);
                ni = ni.siguiente;
            } else {
                resultado.agregarFinal(nd.elemento);
                nd = nd.siguiente;
            }
        }
        ListaDoblementeLigada<T>.Nodo restante;
        if (ni != null) {
            restante = ni;
        } else {
            restante = nd;
        }
        while(restante != null){
            resultado.agregarFinal(restante.elemento);
            restante = restante.siguiente;
        }
        return resultado;
    }

    public static <T extends Comparable<T>> void quickSort(T[] arreglo) {
        quickSortAux(arreglo, 0, arreglo.length-1);
    }

    private static <T extends Comparable<T>> void quickSortAux(T[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int indicePivote = particionar(arreglo, inicio, fin);

        quickSortAux(arreglo, inicio, indicePivote-1);
        quickSortAux(arreglo, indicePivote + 1, fin);

    }

    private static <T extends Comparable<T>> int particionar(T[] arreglo, int inicio, int fin) {
        T pivote = arreglo[fin];   // pivote ← arreglo[fin]
        int i = inicio - 1;        // i ← inicio - 1

        for (int j = inicio; j < fin; j++) {
            // arreglo[j] ≤ pivote usando compareTo
            if (arreglo[j].compareTo(pivote) <= 0) {
                i++;

                // intercambiar arreglo[i] y arreglo[j]
                intercambiar(arreglo, i, j);
            }
        }

        // intercambiar arreglo[i + 1] y arreglo[fin]
        intercambiar(arreglo, i + 1, fin);
        return i + 1;
    }

    private static <T> void intercambiar(T[] arreglo, int i, int j) {
        T temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
}
