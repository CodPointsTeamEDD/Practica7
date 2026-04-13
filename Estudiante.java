import java.util.Random;

public class Estudiante implements Comparable<Estudiante> {
    /** atributos */
    private String numeroDeCuenta;

    private String nombre;

    private int numeroMateriasInscritas;

    private int numeroMateriasAprobadas;

    private double porcentajeCreditos;

    private boolean regular;

    public Estudiante(String numeroDeCuenta, String nomnre, int numeroMateriasInscritas, int numeroMateriasAprobadas,
            double porcentajeCreditos, boolean regular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.nombre = nomnre;
        this.numeroMateriasInscritas = numeroMateriasInscritas;
        this.numeroMateriasAprobadas = numeroMateriasAprobadas;
        this.porcentajeCreditos = porcentajeCreditos;
        this.regular = regular;
    }

    public String getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroMateriasInscritas() {
        return this.numeroMateriasInscritas;
    }

    public int getNumeroMateriasAprobadas() {
        return this.numeroMateriasAprobadas;
    }

    public double getPorcentajeCreditos() {
        return this.porcentajeCreditos;
    }

    public boolean getRegular() {
        return this.regular;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroMateriasInscritas(int numeroMateriasInscritas) {
        this.numeroMateriasInscritas = numeroMateriasInscritas;
    }

    public void setNumeroMateriasAprobadas(int numeroMateriasAprobadas) {
        this.numeroMateriasAprobadas = numeroMateriasAprobadas;
    }

    public void setPorcentajeCreditos(double porcentajeCreditos) {
        this.porcentajeCreditos = porcentajeCreditos;
    }

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