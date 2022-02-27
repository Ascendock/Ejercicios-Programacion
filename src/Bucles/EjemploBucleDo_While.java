package Bucles;

/*
 * En el bucle do-while primero indicamos que es la accion que tiene que iterar y luego de haber entrado en el bucle
 * comprueba que la condicion es correcta, esto quiere decir la accion se ejecuta al menos una vez
 * */

public class EjemploBucleDo_While {
    public static void main(String[] args) {

        int i = 0;

        do {
            i++;
            System.out.print(i + ",");
        } while (i < 10);
    }
}
