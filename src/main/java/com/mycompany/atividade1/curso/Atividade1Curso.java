/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1.curso;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Atividade1Curso {

    public static void main(String[] args) {
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho da área menor: "));
        double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho da área maior: "));
        double h = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho da altura: "));
        
        double area = (b +B) / 2.0 * h;
        
        JOptionPane.showMessageDialog(null, "A área do trapézio é:" + area);
    }
}
