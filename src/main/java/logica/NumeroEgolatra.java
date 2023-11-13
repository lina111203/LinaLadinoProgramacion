/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author LINA XIOMARA LADINO FERNANDEZ
 */
public class NumeroEgolatra {

private int num;
    
    public boolean siEgolatra(int num) {
        int numInicial = num;
        int numDigitos = digitos(num);
        int suma = 0;

        while (num > 0) {
            int digito = num % 10;
            suma += Math.pow(digito, numDigitos);
            num /= 10;   
        }
        return suma == numInicial;
    }
    
    public int digitos(int num) {
        int ndigitos = 0;
        while (num != 0) {
            num /= 10;
            ndigitos++;
        }
        return ndigitos;
    }
    public void Validacion() {
        int num1 = num;
        if (siEgolatra(num1)) {
            JOptionPane.showMessageDialog(null,num1 + " es un número ególatra.", "Es Ególatra?", 1);
        } else {
            JOptionPane.showMessageDialog(null,num1 + " no es un número ególatra.", "Es Ególatra?", 1);
        }
    }
}