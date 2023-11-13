/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author SORAIDA
 */
public class NombrePropio {

private String texto;

    public NombrePropio(String tx){
        texto = tx;
    }

    public String convertirPropio(String texto) {
        String[] palabras = texto.trim().split("\\s+");

        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                          .append(palabra.substring(1).toLowerCase())
                          .append(" ");
            }
        }
        return resultado.toString().trim();
    }
}