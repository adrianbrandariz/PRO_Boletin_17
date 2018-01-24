/*
 *                          BOLETIN 17
 * 1- Realiza un programa que cree un array llamado “numeros” con 
 * 6 numeros aleatorios de un rango de 1 a 50. Seguidamente visualiza el array 
 * al revés (el primer elemento se visualizará el último y así sucesivamente).
 */
package pro_boletin_17_1;

/**
 *
 * @author abrandarizdominguez
 */
public class Numeros {
    /**
     * Método "ordenarNumeros" que coloca por orden de forma inversa
     * los elementos de la lista.
     * @param listaNumeros array de tipo float que almacena números aleatorios.
     */
    public void ordenarNumeros(float[] listaNumeros) {
        System.out.println("Orden inverso:");
        // Estructura repetitiva de tipo for que va mostrando los elementos de la lista.
        for (int i = listaNumeros.length - 1; i >= 0; i--) {
            System.out.println("Elemento " + (i + 1) + " = " + listaNumeros[i]);
        }
    }
}
