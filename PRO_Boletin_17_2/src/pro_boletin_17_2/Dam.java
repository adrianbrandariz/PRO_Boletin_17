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
public class Dam {

    int tamaño = 30;
    int[] notas = new int[tamaño];
    /**
     * Método "notas" que genera una nota aleatoria para cada alumno, le
     * da el valor a una variable auxiliar de tipo int y luego el array recibe
     * el valor de esa variable.
     */
    public void notas() {
        // Estructura repetitiva for que genera aleatoriamente las notas de los alumnos.
        for (int i = 0; i < tamaño; i++) {
            double notaAleatoria = Math.random() * 10 + 1;
            int valor = (int) notaAleatoria;
            notas[i] = valor;
            System.out.println("Nota del alumno " + (i + 1) + " = " + notas[i]);
        }
    }
    /**
     * Método "verAprobados" que saca por pantalla los acumuladores de aprobados
     * y de suspensos, ambas variables de tipo int.
     */
    public void verAprobados() {
        int aprobados = 0, suspensos = 0;
        /* Estructura repetitiva for con un condicional doble en su interior que
        * contabiliza el número de aprobados y de suspensos.
        */
        for (int i = 0; i < tamaño; i++) {
            if (notas[i] >= 5) {
                System.out.println("Nota del alumno " + (i + 1) + " = " + notas[i] + " está aprobado.");
                aprobados++;
            } else {
                System.out.println("Nota del alumno " + (i + 1) + " = " + notas[i] + " está suspenso.");
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados + "\nSuspensos: " + suspensos);
    }
    /**
     * Método "notaMedia" que calcula la nota media entre todos 
     * los alumnos de programación.
     */
    public void notaMedia() {
        int acumulador = 0;
        for (int i = 0; i < tamaño; i++) {
            acumulador += notas[i];
        }
        System.out.println("Nota media de los alumnos de programación: " + (acumulador / tamaño));
    }
    /**
     * Método "notaAlta" que muestra la nota más alta de la clase.
     */
    public void notaAlta() {
        int notaAlta = 0;
        for (int i = 0; i < tamaño; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
        }
        System.out.println("Nota más alta: " + notaAlta);
    }
}
