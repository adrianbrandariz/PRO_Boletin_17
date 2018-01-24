/*
 *                          BOLETIN 17
 * 2- Carga un array de tipo int, con las notas en el módulo de programación.
 * De los 30 alumnos de la clase de DAM:
 * - Visualiza el número de aprobados y el de suspensos.
 * - Calcula y visualiza la nota media de la clase.
 * - Visualiza la nota más alta.
 */
package pro_boletin_17_2;

/**
 *
 * @author abrandarizdominguez
 */
public class PRO_Boletin_17_2 {

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
