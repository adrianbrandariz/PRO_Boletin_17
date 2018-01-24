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
public class Dam {

    int tamaño = 30;
    int[] notas = new int[tamaño];
    /**
     * Método "notas" que genera una nota aleatoria para cada alumno, le
     * da el valor a una variable auxiliar de tipo int y luego el array recibe
     * el valor de esa variable.
     */
    public void notas() {
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
    
    public void visualizarNota() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Alumno "+ i + " = " + notas[i]);
        }
    }
    
    public void nombreAlumno() {
        
    }
    
    
}
