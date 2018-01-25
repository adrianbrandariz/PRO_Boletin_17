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

    //Ajustado el tamaño del array para el ejercicio.
    int tamaño = 5;
    int[] notas = new int[tamaño];
    String[] alumnos = {"AA", "BB", "CC", "DD", "EE"};

    /**
     * Método "notas" que genera una nota aleatoria para cada alumno, le da el
     * valor a una variable auxiliar de tipo int y luego el array recibe el
     * valor de esa variable.
     */
    public void notas() {
        for (int i = 0; i < tamaño; i++) {
            double notaAleatoria = Math.random() * 10 + 1;
            int valor = (int) notaAleatoria;
            notas[i] = valor;
            System.out.println("Nota del alumno " + alumnos[i] + " = " + notas[i]);
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
     * Método "notaMedia" que calcula la nota media entre todos los alumnos de
     * programación.
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

    /**
     * Método "visualizarNota" que muestra la nota de cada alumno a través de
     * una estructura repetitiva for.
     */
    public void visualizarNota() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Alumno " + alumnos[i] + " = " + notas[i]);
        }
    }

    /**
     * Método "ordenarNotas" que ordena las notas de menos a mayor, y pasando
     * también, el nombre del alumno.
     */
    public void ordenarNotas() {
        // Se declaran las variables y se inicializa una variable que se usa como marca.
        int c, aux;
        String aux2;
        /*
         * Estructura repetitiva do while en la cual está en bucle hasta que
         * la variable c tome el valor de uno y no lo cambie.
         */
        do {
            c = 0;
            /*
             * Estructura repetitiva de tipo for en la que seguirá en bucle
             * hasta que "i < tamaño - 1". Contiene una estructura condicional if.
             */
            for (int i = 0; i < tamaño - 1; i++) {
                /*
                 * Estructura condicional que permitirá reordenar los alumnos
                 * en base a la nota.
                 */
                if (notas[i] > notas[i + 1]) {
                    aux = notas[i];
                    notas[i] = notas[i + 1];
                    notas[i + 1] = aux;

                    aux2 = alumnos[i];
                    alumnos[i] = alumnos[i + 1];
                    alumnos[i + 1] = aux2;
                    
                    c = 1;
                }
            }
        } while (c != 0);
    }

}
