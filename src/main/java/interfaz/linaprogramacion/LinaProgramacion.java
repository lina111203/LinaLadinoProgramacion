/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package interfaz.linaprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;
import logica.NumeroRomano;
import logica.NumeroPrimo;
import logica.NumeroEgolatra;
import logica.NumeroMagico;
/**
 *
 * @author LINA XIOMARA LADINO FERNANDEZ
 */
public class LinaProgramacion {

 Scanner sc = new Scanner (System.in);
    
    public static void main(String arg[]){
        
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora LXLF ", "ProyectoLina.com", 1);

        String[] botones = {"Menu", "Salir"};
        int ventana = JOptionPane.showOptionDialog(null,"Pulsa un boton:", "ProyectoLina.com", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        
        switch (ventana){
            case 0 :
                int jn = 0;
                
                String[] botonesMenu = {"1. Convertir a Romano", "2. Encontrar Numeros Primos","3. Es Ególatra?", "4. Es Magicó?", "5. Convertir en Nombre Propio"};
                int ventanamenu = JOptionPane.showOptionDialog(null,"Pulsa un boton:", "ProyectoLina.com", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, botonesMenu, botonesMenu[0]);

                int num2 = 0;
                
                do{
                    switch (ventanamenu){
                        case 0:
                            NumeroRomano nuevoromano = new NumeroRomano();
                            nuevoromano.validacion();                 
                            JOptionPane.showMessageDialog(null,nuevoromano, "Convertir a Romano", 1);
                           break;
                        case 1:
                            NumeroPrimo nuevoPrimo = new NumeroPrimo();
                            nuevoPrimo.Validacion();
                            JOptionPane.showMessageDialog(null, nuevoPrimo, "Encontrar Numeros Primos", 1);
                            break;
                        case 2:
                            NumeroEgolatra nuevoEgolatra = new NumeroEgolatra();
                            nuevoEgolatra.Validacion();
                            JOptionPane.showMessageDialog(null, nuevoEgolatra, "Es Ególatra?", 1);
                            break;
                        case 3:
                            NumeroMagico nuevoMagico = new NumeroMagico();
                            nuevoMagico.Validacion();
                            JOptionPane.showMessageDialog(null, nuevoMagico, "Es Magicó?", 1);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese la opcion nuevamnete", "error", 0);
                    }
                    JOptionPane.showInputDialog(null, "Desea continuar \n 1. SI \n 2. NO", "continuar", 1);
                }while(num2 == 1);
            break;
    case 1 : 
        JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese la opcion nuevamnete", "error", 0);
        break;
        }
    }
}