/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author LINA XIOMARA LADINO FERNANDEZ
 */
public class NumeroPrimo {
private int nprimo;
    
    public static Map<Integer, Integer> allarPrimos(int nprimo) {
        Map<Integer, Integer> NumerosPrimos = new HashMap<>();

        for (int i = 2; i <= nprimo; i++) {
            while (nprimo % i == 0 && verificacionPrimos(i)) {
                NumerosPrimos.put(i, NumerosPrimos.getOrDefault(i, 0) + 1);
                nprimo /= i;
            }
        }
        return NumerosPrimos;
    }

    public static boolean verificacionPrimos(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void Validacion() {
       int nprimo1 = nprimo;
        Map<Integer, Integer> validacion = allarPrimos(nprimo1 );
        JOptionPane.showMessageDialog(null,"Los factores primos de " + nprimo + " es:", "Encontrar Numeros Primos", 1);            
        for (Map.Entry<Integer, Integer> entry : validacion.entrySet()) {
            JOptionPane.showMessageDialog(null,(entry.getKey() + " ^ " + entry.getValue()), "Encontrar Numeros Primos", 1);   
        }
    }
}   