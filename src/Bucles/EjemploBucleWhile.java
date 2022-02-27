package Bucles;

/*
 * El bucle while se utiliza principalmente para repetir un proceso siempre que se cumpla una condición, esta condición
 * siempre se comprueba en el inicio del bucle y no al final como en el caso del bucle do-while
 *
 *   Ejemplo:
 *
 *               While(condicion){
 *                   sentencias
 *               }
 *
 *     En este caso las sentencias se repetiran una y otra vez mientras la condicion sea true, o en otras palabras
 *     el bucle dejara de repetirse una y otra vez cuando la condición sea false
 * */

public class EjemploBucleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + ",");
        }
    }

}
