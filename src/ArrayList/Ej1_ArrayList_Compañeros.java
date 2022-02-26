package ArrayList;

import java.util.ArrayList;

/**
 * @author bdeza Crea un ArrayList con los nombres de 6 compañeros de clase. A
 * continuación muestra esos nombres por pantalla. Utiliza para ello un bucle
 * for que recorra todo el ArrayList sin usar ningún indice
 */
public class Ej1_ArrayList_Compañeros {

    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<String>();

        compañeros.add("Artai");
        compañeros.add("Bruno");
        compañeros.add("Jacob");
        compañeros.add("Diego");
        compañeros.add("Dani");
        compañeros.add("Brais");

        System.out.println(compañeros);
    }

}
