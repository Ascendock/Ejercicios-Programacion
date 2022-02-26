package Arrays;

/**
 * @author bdeza Define 3 arrays de 20 numeros enteros cada uno, con nombres
 * numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0
 * y 100. En el array cuadrado se deben almacenar los cuadrados de los valores
 * que hay en el array numero. En el array cubo se deben almacenar los cubos de
 * los valores que hay en el array numero. A continuacion muestra el contenido
 * de los 3 arrays dispuesto en tres columnas.
 */
public class Ej4_Arrays_TripleArray {

    public static void main(String[] args) {

        int[] numeros = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 100) + 1);
            cuadrado[i] = numeros[i] * numeros[i];
            cubo[i] = cuadrado[i] * numeros[i];
           
        }

        int i = 0;
        System.out.print("El numero, cuadrado y cubo es:  " + numeros[i] + " " + cuadrado[i] + " " + cubo[i] + " ");

    }
}
