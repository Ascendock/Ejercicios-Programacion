package If_Else;

import javax.swing.JOptionPane;

/**
 * @author brunodc Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40) se pagan a 12
 * euros la hora. A partir de la hora 41 se pagan a 16 euros la hora
 */
public class Ej4_IfElse_Switch_SueldoSemanal {

    public static void main(String[] args) {

        int sueldoSemana, horasTrabajadas;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas por el empleado"));

        if (horasTrabajadas <= 40) {
            sueldoSemana = horasTrabajadas * 12;
        } else {
            sueldoSemana = (40 * 12) + ((horasTrabajadas - 40) * 16);
        }
        JOptionPane.showMessageDialog(null, "El sueldo del empleado a la semana son: " + sueldoSemana + " euros");
        JOptionPane.showMessageDialog(null, "El sueldo mensual del empleado son:  " + sueldoSemana * 4 + " euros");
    }
}
