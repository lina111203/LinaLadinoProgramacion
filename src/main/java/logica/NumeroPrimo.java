/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author LINA XIOMARA LADINO FERNANDEZ
 */
public class NumeroPrimo {
private int nprimo;

    public NumeroPrimo(int np){
        nprimo = np;
    }
    
    public Map<Integer, Integer> allarPrimos(int nprimo) {
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
}   