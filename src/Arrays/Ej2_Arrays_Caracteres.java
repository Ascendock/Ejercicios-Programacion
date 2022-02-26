package Arrays;

/**
 * @author bdeza Define un array de 10 elementos con nombre simbolo y asigna
 * valores a los elementos según la tabla que se muestra a continuación. Muestra
 * el contenido de todos los elementos. ¿Que sucede con los elementos que no han
 * sido inicializados?
 *
 * [0]='a',[1]='x',[4]='@',[6]='',[7]='+',[8]='Q'.
 */
public class Ej2_Arrays_Caracteres {

    public static void main(String[] args) {
        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (char c : simbolo) {
            System.out.print(c + ",");
        }

    }
}

//Los elementos que no hayan sido inicializados aparecerán en blanco
