public class Temporal{
    public static void main(String[] args) {
        ListaDoblementeLigada<Integer> L1 = new ListaDoblementeLigada<Integer>();

        L1.agregarFinal(5);
        L1.agregarFinal(1);
        L1.agregarFinal(8);
        L1.agregarFinal(5);
        L1.agregarFinal(7);
        L1.agregarFinal(1);

        OrdenamientosNoCuadraticos.mergeSort(L1);

        for (Object elem : L1) {
            System.out.println(elem + " ");
        }
    }
}