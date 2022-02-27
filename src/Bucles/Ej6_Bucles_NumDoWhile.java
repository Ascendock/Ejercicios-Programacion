package Bucles;

public class Ej6_Bucles_NumDoWhile {
    public static void main(String[] args) {
        int numero = 320;

        do {
            numero -= 20;
            System.out.print(numero + ",");
        } while (numero > 160);
    }
}
