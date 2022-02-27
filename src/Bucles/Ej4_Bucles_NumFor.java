package Bucles;

/*
 * Muestra los numeros del 320 al 160, contando de 20 en 20 hacia atras utilizando un bucle for
 * */

public class Ej4_Bucles_NumFor {
    public static void main(String[] args) {

        int i;

        for (i = 320; i >= 160; i -= 20) {
            System.out.print(i + ",");
        }
    }
}
