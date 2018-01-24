/*
 *                          BOLETIN 17
 * 1- Realiza un programa que cree un array llamado “numeros” con 
 * 6 numeros aleatorios de un rango de 1 a 50. Seguidamente visualiza el array 
 * al revés (el primer elemento se visualizará el último y así sucesivamente).
 */
package pro_boletin_17_1;

import javax.swing.JOptionPane;

/**
 *
 * @author abrandarizdominguez
 */
public class PRO_Boletin_17_1 {

    public static void main(String[] args) {
        Numeros num1 = new Numeros();
        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("¿De cuántos elementos se conformará la lista?"));
        float listaNumeros[] = new float[cantidadNumeros];
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = (int) Math.floor(Math.random() * 50 + 1);
            System.out.println("Elemento " + (i + 1) + " = " + listaNumeros[i]);
        }
        System.out.println("\n");
        num1.ordenarNumeros(listaNumeros);
    }
}
