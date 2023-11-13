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

public class NumeroMagico {
    
private int num;

    public NumeroMagico(int nm) {
        num = nm;
    }

    public boolean siMagico(int num) {
        int sumDigitos= 0;
        int numInicial = num;
        int numDigitos = digitos(num);

        while (num > 0) {
            int digito = num % 10;
            sumDigitos += Math.pow(digito, numDigitos);
            num /= 10;
        }
        return sumDigitos == numInicial;
    }
    
    public int digitos(int num) {
        int suma = 0;
        while (num != 0) {
            int digito = num % 10;
            suma += digito;
            num /= 10;
        }

        return suma;
    }
}