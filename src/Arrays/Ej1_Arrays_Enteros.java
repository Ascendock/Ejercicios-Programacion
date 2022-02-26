package Arrays;

/**
 * @author bdeza Define un Array de 12 numeros enteros con nombre "num" y asigna
 * los valores segun la tabla que se muestra a continuacion. Muestra el
 * contenido de todos los elementos del array. ¿Que sucede con los valores de
 * los elementos que no han sido inicializados?
 * [0]=39,[1]=-2,[4]=0,[6]=14,[8]=5,[9]=120.
 */
public class Ej1_Arrays_Enteros {

    public static void main(String[] args) {

        //Creamos un array con memoria para 12 enteros
        int[] num = new int[12];

        //Definimos las posiciones del array según la lista del ejercicio
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for (int i : num) {
            System.out.print(i + " | ");
        }
    }
}

//Las posiciones que no tienen valor especificado tendrán un valor 0
