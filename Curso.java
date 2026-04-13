public class Curso {

    /**
     * Lista ligada simple que almacena las páginas del alumnosEnCurso.
     */
    private Lista<Estudiante> alumnosEnCurso;
    private int longitud = 0;

    /**
     * Crea un alumnosEnCurso nuevo con la lista ligada simple proporcionada.
     *
     * @param alumnosEnCurso la lista ligada simple de páginas inicial
     */
    public Curso(Lista<Estudiante> alumnosEnCurso) {
        this.alumnosEnCurso = alumnosEnCurso;
    }

    /**
     * Agrega una página al alumnosEnCurso
     * Si la página ya existe elimina la existente y agrega la nueva al inicio,
     * en otro caso, simplemente la agrega al inicio.
     *
     * @param p la página a agregar
     */
    public void agregarEstudiante(Estudiante e) {
        this.alumnosEnCurso.agregar(e);
        this.longitud++;
    }

    public int devolverLongitud() {
        return this.longitud;
    }

    /**
     * Devuelve una representación en cadena del alumnosEnCurso,
     * que corresponde a la representación en cadena
     * de la lista ligada simple de páginas.
     *
     * @return una cadena con el alumnosEnCurso completo
     */
    @Override
    public String toString() {
        String separacion = "--------------------------------";
        String nom = "Nombre del estudiante: ";
        String ult = "Numero de cuenta: ";
        String interfaz = " ";

        for (Estudiante es : alumnosEnCurso) {

            interfaz += separacion + "\n" +
                    nom + es.getNombre() + "\n" +
                    ult + es.getNumeroDeCuenta() + "\n" +
                    separacion
                    + "\n";

        }
        return interfaz;

    }

}