package Arrays;

import java.util.Scanner;

/**
 * @author bdeza Ejercicio 5 - Arrays Escribe un programa que pida 10 numeros
 * por teclado y que luego muestre los numeros introducidos junto con las
 * palabras "maximo" y "minimo" al lado del maximo y del minimo respectivamente
 */
public class Ej5_Arrays_MaxMin {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] num = new int[10];
        int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
        System.out.println("Introduzca numeros y pulse enter despues de cada uno: ");

//        maximo = in.nextInt();
//        minimo = maximo;
        
        for (int i = 0; i < 10; i++) {
            num[i] = in.nextInt();

            if (num[i] < minimo) {
                minimo = num[i];
            }
            if (num[i] > maximo) {
                maximo = num[i];
            }
        }

        System.out.println();

//        System.out.println(maximo+ " maximo");
//        System.out.println(minimo+ " minimo");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i]);
            if (num[i] == maximo) {
                System.out.print(" La posicion en el array numero " + i + " tiene el numero máximo");
            }

            if (num[i] == minimo) {
                System.out.print(" La posicion en el array numero " + i + " tiene el numero minimo");
            }
            System.out.println();
        }
    }
}
