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

    public NumeroEgolatra(int ne){
        num  = ne;
    }
    
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
}