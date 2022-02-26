package If_Else;

import javax.swing.JOptionPane;

/**
 * @author brunodc Escribe un programa que pida por teclado un dia de la semana
 * y que diga que asignatura toca a primera hora ese dia
 */
public class Ej1_IfElse_Switch_DiasDeLaSemana {
    public static void main(String[] args) {
        String dia;
        
        dia = JOptionPane.showInputDialog("Introduce el dia de la semana que quieras y te dire que toca a primera hora: ").toLowerCase();
        
        switch(dia){
            
            case "lunes" -> {
                JOptionPane.showMessageDialog(null, "Los lunes toca sistemas operativos");
            }
            case "martes" -> {
                JOptionPane.showMessageDialog(null, "Los martes toca Fol");
            }
            case "miercoles" ->{
                JOptionPane.showMessageDialog(null, "Los miercoles toca bases de datos");
            }
            case "jueves" ->{
                JOptionPane.showMessageDialog(null, "Los jueves toca sistemas operativos");
            }
            case "viernes" ->{
                JOptionPane.showMessageDialog(null, "Los viernes toca lenguajes de marcas");
            }
            case "sabado" ->{
                JOptionPane.showMessageDialog(null, "Los sabados no hay clase!");
            }
            case "domingo" ->{
                JOptionPane.showMessageDialog(null, "Los sabados no hay clase!");
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Elije una opcion correcta!");
            }
        }
        
        
    }
}
