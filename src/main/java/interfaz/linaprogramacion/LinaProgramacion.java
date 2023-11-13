/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package interfaz.linaprogramacion;

import javax.swing.JOptionPane;
import java.util.Map;
import logica.NombrePropio;
import logica.NumeroRomano;
import logica.NumeroPrimo;
import logica.NumeroEgolatra;
import logica.NumeroMagico;
/**
 *
 * @author LINA XIOMARA LADINO FERNANDEZ
 */
public class LinaProgramacion {
    
    public static void main(String arg[]){
     
        String[] botones = {"Menu", "Salir"};
        int ventana = JOptionPane.showOptionDialog(null,"Bienvenido a la calculadora LXLF ", "ProyectoLina.com", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        
        switch (ventana){
            case 0 :
                String[] botonesFin = {"SI", "NO"};
                int ventanafin = JOptionPane.showOptionDialog(null,"Continuar", "ProyectoLina.com", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, botonesFin, botonesFin[0]);
               
                do{
                String[] botonesMenu = {"1. Convertir a Romano", "2. Encontrar Numeros Primos","3. Es Ególatra?", "4. Es Magicó?", "5. Convertir en Nombre Propio"};
                int ventanamenu = JOptionPane.showOptionDialog(null,"Pulsa un boton:", "ProyectoLina.com", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, botonesMenu, botonesMenu[0]);
                
                switch (ventanafin){
                    case 1:                        
                        switch (ventanamenu){
                            case 0:
                                int nr = 0;
                                NumeroRomano nuevoromano = new NumeroRomano(nr);
                                do{
                                    nr= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea convertir en Romano"));                                                        
                                    if (nr>=1 & nr<=3000){

                                        String romano = nuevoromano.convertirRomano(nr);   
                                        JOptionPane.showMessageDialog(null,"El numero " +nr + " en números romanos es: " + romano, "Convertir a Romano", 1);           
                                    }else {
                                        JOptionPane.showMessageDialog(null,"Ingrese el numero entre 1 y  3000", "Convertir a Romano", 1);                            
                                    }
                                } while (nr<=1 || nr>=3000);           
                                break;


                            case 1:
                                int np = 0;
                                NumeroPrimo nuevoPrimo = new NumeroPrimo(np);
                                np= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea encontrar Numeros Primos"));                                                        
                                Map<Integer, Integer> validacion = nuevoPrimo.allarPrimos(np );
                                JOptionPane.showMessageDialog(null,"Los factores primos de " + np + " son:", "Encontrar Numeros Primos", 1);            
                                for (Map.Entry<Integer, Integer> entry : validacion.entrySet()) {
                                    JOptionPane.showMessageDialog(null,(entry.getKey() + " ^ " + entry.getValue()), "Encontrar Numeros Primos", 1);   
                                }                            
                                break;
                            case 2:
                                int ne = 0;
                                NumeroEgolatra nuevoEgolatra = new NumeroEgolatra(ne);
                                ne= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));                                                        
                                boolean neg = nuevoEgolatra.siEgolatra(ne);
                                if (neg) {
                                    JOptionPane.showMessageDialog(null,ne + " es un número ególatra.", "Es Ególatra?", 1);
                                } else {
                                    JOptionPane.showMessageDialog(null,ne + " no es un número ególatra.", "Es Ególatra?", 1);
                                }
                                break;
                            case 3:
                                int nm = 0;
                                NumeroMagico nuevoMagico = new NumeroMagico(nm);
                                nm= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));                                                        
                                boolean nma = nuevoMagico.siMagico(nm);
                                if (nma) {
                                    JOptionPane.showMessageDialog(null,nm + " es un número mágico.", "Es Magicó?", 1);
                                  } else {
                                    JOptionPane.showMessageDialog(null,nm + " no es un número mágico.", "Es Magicó?", 1);
                                }
                                break;
                            case 4:
                                String tx = "";
                                NombrePropio nuevoPropio = new NombrePropio(tx);
                                tx = JOptionPane.showInputDialog("Ingrese Texto"); 
                                String npr = nuevoPropio.convertirPropio(tx);
                                JOptionPane.showMessageDialog(null,"Su texto cambio de : "+ tx +" a "+npr, "Nombre Propio", 1);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese la opcion nuevamnete", "error", 0);
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Salite del  modulo", "Salida", 1);                                    
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese la opcion nuevamnete", "error", 0);
                    }
                ventanafin = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea continuar \n 1. SI \n 2. NO", "continuar", 1));
                }while(ventanafin == 1);

            case 1: 
                JOptionPane.showMessageDialog(null,"Adios", "Salida", 1);  
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese la opcion nuevamnete", "error", 0);
        }                            
    }
}