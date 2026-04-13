import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainParo {

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
                        Integer.parseInt(materiasAprobadas), Integer.parseInt(porcentajeCreditos),
                        Boolean.parseBoolean(regular));
                Alumnos.agregar(estudiante);
            }

            // ordnear la lista
            or.mergeSort(Alumnos);

            for (Estudiante es : Alumnos) {
                curso.agregarEstudiante(es);
                
                if (curso.devolverLongitud() > 10) {
                    break;
                }
            }

            System.out.println(curso.toString());

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }

}
