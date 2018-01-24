/*
 *                          BOLETIN 17
 * 3- Modifica el programa anterior y añádele un array con los nombres de los alumnos: 
 * - Visualiza la nota de un alumno determinado.
 * - Visualiza una lista con el nombre de los alumnos aprobados.
 * - Haz una lista ordenada por orden creciente de notas.
 * - Visualiza la nota de un alumno determinado que pides por teclado.
 */
package pro_boletin_17_3;

/**
 *
 * @author abrandarizdominguez
 */
public class PRO_Boletin_17_3 {

    public static void main(String[] args) {
        Dam dam1 = new Dam();
        dam1.notas();
        System.out.println("\n");
        dam1.verAprobados();
        System.out.println("\n");
        dam1.notaMedia();
        System.out.println("\n");
        dam1.notaAlta();
    }

}
