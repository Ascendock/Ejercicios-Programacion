/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_Else;

import javax.swing.JOptionPane;

/**
 *
 * @author brunodc
 */
public class Ej2_IfElse_Switch_Horario_BuenosDias {

    public static void main(String[] args) {
        int hora = 0;

        hora = Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora del dia: "));

        if ((hora < 0) || (hora > 24)) {
            JOptionPane.showMessageDialog(null, "La hora introducida no es correcta");
        } else if ((hora >= 23) || (hora <= 8)) {
            JOptionPane.showMessageDialog(null, "Buenas noches!");
        } else if ((hora > 9) || (hora <= 13)) {
            JOptionPane.showMessageDialog(null, "Buenos dias!");
        } else if ((hora > 14) || (hora <= 22)) {
            JOptionPane.showMessageDialog(null, "Buenas tardes!");
        }

    }
}
