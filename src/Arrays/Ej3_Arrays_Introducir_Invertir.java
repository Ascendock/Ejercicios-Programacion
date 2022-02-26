package Arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author bdeza Escribe un programa que lea 10 numeros por teclado y que luego
 * los muestre en orden inverso, es decir, que el primero que se introduce es el
 * ultimo en mostrarse y el ultimo en introducirse es el primero en mostrarse.
 */
public class Ej3_Arrays_Introducir_Invertir {

    public static void main(String[] args) {

        int[] num = new int[4];
        Scanner in = new Scanner(System.in);

        //Introduccion de datos mediante teclado
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduzca el numero de la posicion " + i + ": ");
            num[i] = in.nextInt();
        }

        //Mostrar array normal
        System.out.println("---------");
        System.out.println("Array por orden de inserción: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
        //Mostrar array inverso
        System.out.println(" ");
        System.out.println("---------");
        System.out.println("Array inverso: ");
        for (int i = num.length -1 ; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
