public class Temporal{
    public static void main(String[] args) {
        ListaDoblementeLigada<Integer> L1 = new ListaDoblementeLigada<Integer>();
        ListaDoblementeLigada<Integer> L2 = new ListaDoblementeLigada<Integer>();

        L1.agregarFinal(1);
        L1.agregarFinal(2);
        L1.agregarFinal(3);

        L2.agregarFinal(4);
        L2.agregarFinal(5);
        L2.agregarFinal(6);

        ListaDoblementeLigada<Integer> L3 = OrdenamientosNoCuadraticos.mezclar(L1, L2);

        for (Object elem : L3) {
            System.out.println(elem + " ");
        }
    }
}