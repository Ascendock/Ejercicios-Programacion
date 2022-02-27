package If_Else;

import javax.swing.JOptionPane;

/**
 * @author brunodc || Escribe un programa en que dado un número del 1 a 7
 * escriba el correspondiente nombre del día de la semana.
 */
public class Ej3_IfElse_Switch_DiaDeLaSemana {

    public static void main(String[] args) {

        int dia;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero del 1 al 7 y te dire a que dia de la semana corresponde: "));

        if (dia <= 1 || dia >= 7) {
            switch (dia) {
                
                case 1 -> JOptionPane.showMessageDialog(null, "El dia 1 de la semana es Lunes");
                case 2 -> JOptionPane.showMessageDialog(null, "El dia 2 de la semana es Martes");
                case 3 -> JOptionPane.showMessageDialog(null, "El dia 3 de la semana es Miercoles");
                case 4 -> JOptionPane.showMessageDialog(null, "El dia 4 de la semana es Jueves");
                case 5 -> JOptionPane.showMessageDialog(null, "El dia 5 de la semana es Viernes");
                case 6 -> JOptionPane.showMessageDialog(null, "El dia 6 de la semana es Sabado");
                case 7 -> JOptionPane.showMessageDialog(null, "El dia 7 de la semana es Domingo");
                default -> JOptionPane.showMessageDialog(null, "El numero introducido esta fuera del rango!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
