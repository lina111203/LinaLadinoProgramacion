/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.TreeMap;
import javax.swing.JOptionPane;
/**
 *
 * @author LINA XIOMARA LADINO FERNANDEZ
 */
public class NumeroRomano {  

private int nromano;
    
    public NumeroRomano(){
    }

    private final static TreeMap<Integer, String> val = new TreeMap<>();

        static {
            val.put(1, "I");
            val.put(4, "IV");
            val.put(5, "V");
            val.put(9, "IX");
            val.put(10, "X");
            val.put(40, "XL");
            val.put(50, "L");
            val.put(90, "XC");
            val.put(100, "C");
            val.put(400, "CD");
            val.put(500, "D");
            val.put(900, "CM");
            val.put(1000, "M");
        }

    public String convertirRomano(int nromano) {
        int cromano = val.floorKey(nromano);
        if (nromano == cromano) {
            return val.get(nromano);
        }
        return val.get(cromano) + convertirRomano(nromano - cromano);
    }
    
     public void validacion(){
        if (nromano>1 & nromano<3000){
            String romano = convertirRomano(nromano);   
            JOptionPane.showMessageDialog(null,nromano + " en números romanos es: " + romano, "Convertir a Romano", 1); 
        }else {
            JOptionPane.showMessageDialog(null,"Ingrese el numero entre 1 y  3000", "Convertir a Romano", 1);
        }
     }
}