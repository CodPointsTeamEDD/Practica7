
/**
 * Clase que representa la clase MainOrdenamientos2
 * 
 * @author Erick Xavier Martinez Briones
 * @author Luis Fernando Quintana López
 * @version 1.0.0
 * @since 2026
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainParo {

    /**
     * Metodo que obtiene la informacion de "Alumnos.txt" que crerara un estudiante
     * de la clase "Estudiante" con la informacion recabada del archivo txt, cada
     * estudiante se guardara en una lista doblemente ligada "Alumnos", que despues
     * se ordenara mediante el uso de un algortimo de ordenamiento, para
     * posteriormente ir guardando en el objeto "Curso" hasta que cupo se llene,
     * para finalmente imprimir la informacion del curso
     */
    public static void obtenerInfo() {
        ListaDoblementeLigada<Estudiante> Alumnos = new ListaDoblementeLigada<>();
        Curso curso = new Curso(new ListaDoblementeLigada<>());
        OrdenamientosNoCuadraticos or = new OrdenamientosNoCuadraticos();

        try (BufferedReader br = new BufferedReader((new FileReader("Alumnos.txt")))) {

            String linea;

            br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String numeroDeCuenta = datos[0].trim();

                String nombre = datos[1].trim();

                String materiasInscritas = datos[2].trim();

                String materiasAprobadas = datos[3].trim();

                String porcentajeCreditos = datos[4].trim();

                String regular = datos[5].trim();

                Estudiante estudiante = new Estudiante(numeroDeCuenta, nombre, Integer.parseInt(materiasInscritas),
                        Integer.parseInt(materiasAprobadas), Double.parseDouble(porcentajeCreditos),
                        Boolean.parseBoolean(regular));
                Alumnos.agregar(estudiante);
            }

            // ordnear la lista
            or.mergeSort(Alumnos);

            for (Estudiante es : Alumnos) {
                curso.agregarEstudiante(es);

                if (curso.devolverLongitud() == 10) {
                    break;
                }
            }

            System.out.println(curso.toString());

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }

    public static void main(String[] args) {
        System.out.println("======= Facultad de Ciencias  =======");
        System.out.println("");
        System.out.println("FUNDAMENTOS DE IA Y FILOSOFÍA DEL BRAINROT APLICADO (CÁTEDRA TUNG TUNG SAHUR)");
        System.out.println("---------------------------------------------------------");
        System.out.println("Grupo 6767. 10 lugares. 10 lugares. Modalidad presencial");
        System.out.println("5 alumnos esperando asignacion");
        System.out.println("Profesor Tung Tung Tung Sahur");
        System.out.println("Ayudante Tralalero Tralala");
        System.out.println("Ayud. Lab. Bombardiro Crocodilo");
        System.out.println("---------------------------------------------------------");

        System.out.println("");
        System.out.println("======== Alumnos seleccionados ========");
        obtenerInfo();
    }

}
