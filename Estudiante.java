import java.util.Random;

/**
 * Clase que representa la clase Estudiante
 * Implementa la interfaz {@link Comparable}
 * 
 * @author Erick Xavier Martinez Briones
 * @author Luis Fernando Quintana López
 * @version 1.0.0
 * @since 2026
 */
public class Estudiante implements Comparable<Estudiante> {
    /** atributos de la clase */

    /** Cadena que representa el numero de cuenta */
    private String numeroDeCuenta;

    /** Cadena que representa el nombre del estudiante */
    private String nombre;

    /** Natural que representa el numero de materias inscritas */
    private int numeroMateriasInscritas;

    /** Natural que representa el numero de materias Aprobadas */
    private int numeroMateriasAprobadas;

    /** Numero que representa el porcentaje de creditos */
    private double porcentajeCreditos;

    /** Booleano que representa si el estudiante es regular o no es regular */
    private boolean regular;

    /**
     * Constructor de la clase Estudiante
     * 
     * @param numeroDeCuenta          numero de cuenta del estudiante
     * @param nombre                  nombre del estudiante
     * @param numeroMateriasInscritas numero de materias inscritas del estudiante
     * @param numeroMateriasAprobadas numero de materias aprobadas del estudiante
     * @param porcentajeCreditos      numero del porcentaje de creditos del
     *                                estudiante
     * @param regular                 representa si es regular o no es regular el
     *                                estudiante
     */
    public Estudiante(String numeroDeCuenta, String nombre, int numeroMateriasInscritas, int numeroMateriasAprobadas,
            double porcentajeCreditos, boolean regular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.nombre = nombre;
        this.numeroMateriasInscritas = numeroMateriasInscritas;
        this.numeroMateriasAprobadas = numeroMateriasAprobadas;
        this.porcentajeCreditos = porcentajeCreditos;
        this.regular = regular;
    }

    /**
     * Metodo para obtener el numero de cuenta
     * 
     * @return el numero de cuenta
     */
    public String getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }

    /**
     * Metodo para obtener el nombre del estudiante
     * 
     * @return Nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo que devuelve el numero de materias
     * 
     * @return numero de materias
     */
    public int getNumeroMateriasInscritas() {
        return this.numeroMateriasInscritas;
    }

    /**
     * Metodo que devuelve el numero de materias aprobadas
     * 
     * @return numero de materias aprobadas
     */
    public int getNumeroMateriasAprobadas() {
        return this.numeroMateriasAprobadas;
    }

    /**
     * Metodo que devuelve el porcentaje de creditos
     * 
     * @return numero que representa el porcentaje de creditos
     */
    public double getPorcentajeCreditos() {
        return this.porcentajeCreditos;
    }

    /**
     * Metodo que deuvelve Regular
     * 
     * @return Regular
     */
    public boolean getRegular() {
        return this.regular;
    }

    /**
     * Metodo que asigna el numero de cuenta
     * 
     * @param numeroDeCuenta el numero de cuenta del estudiante
     */
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * Metodo que asigna el nombre
     * 
     * @param nombre el nombre del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que asigna el numero de materias inscritas
     * 
     * @param numeroMateriasInscritas el numero de materias inscritas
     */
    public void setNumeroMateriasInscritas(int numeroMateriasInscritas) {
        this.numeroMateriasInscritas = numeroMateriasInscritas;
    }

    /**
     * Metodo que asigna el numero de materias aprobadas
     * 
     * @param numeroMateriasAprobadas el numero de materias aprobadas
     */
    public void setNumeroMateriasAprobadas(int numeroMateriasAprobadas) {
        this.numeroMateriasAprobadas = numeroMateriasAprobadas;
    }

    /**
     * Metodo que asigna el porcentaje de creditos
     * 
     * @param porcentajeCreditos el porcentaje de creditos
     */
    public void setPorcentajeCreditos(double porcentajeCreditos) {
        this.porcentajeCreditos = porcentajeCreditos;
    }

    /**
     * Metodo que asigna la regularidad
     * 
     * @param regular regular
     */
    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    /**
     * Metodo calcularIndiceAprobacion
     * Calcula el indice de aprobacion de un estudiante basado en su numero de
     * materias inscritas y aprobadas
     * 
     * @return double que representa el indice de aprobacion de un estudiante
     */
    public double calcularIndiceAprobacion() {
        return (this.numeroMateriasAprobadas * 100) / this.numeroMateriasInscritas;
    }

    public int numeroRandom() {
        Random rd = new Random();
        return rd.nextInt(67);
    }

    /**
     * Metodo compareTo que compara dos estudiantes segund su indice de aprobacion,
     * porcentaje de creditos, regularidad y en caso de coincidir con todas las
     * anteriores asigna un numero al azar entre los dos
     * 
     * @param e2 Estudiante con el cual sera comparado
     */
    @Override
    public int compareTo(Estudiante e2) {

        if (this.calcularIndiceAprobacion() > e2.calcularIndiceAprobacion()) {
            return 1;
        } else if (this.calcularIndiceAprobacion() < e2.calcularIndiceAprobacion()) {
            return -1;
        } else {

            if (this.getPorcentajeCreditos() > e2.getPorcentajeCreditos()) {
                return 1;
            } else if (this.getPorcentajeCreditos() < e2.getPorcentajeCreditos()) {
                return -1;
            } else {

                if (this.getRegular() && !e2.getRegular()) {
                    return 1;
                } else if (!this.getRegular() && e2.getRegular()) {
                    return -1;
                } else {

                    if (this.numeroRandom() > e2.numeroRandom()) {
                        return 1;
                    } else if (this.numeroRandom() < e2.numeroRandom()) {
                        return -1;
                    } else {
                        return 0;
                    }

                }

            }

        }

    }

}