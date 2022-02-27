package Numeros_Aleatorios;

public class EjemploAleatorios {
    public static void main(String[] args) {

        System.out.println("20 Numeros aleatorios");

        for (int i = 1; i <= 10; i++) {
            System.out.print((int) (Math.random() * 11 + 50) + " ");
        }
    }
}
