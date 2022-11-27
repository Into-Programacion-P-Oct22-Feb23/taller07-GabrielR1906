/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author renat
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje = "";
        int contador = 2;
        int suma = 3;
        do {
            mensaje = mensaje + contador + "\n";
            contador = contador + suma;
            suma = suma + 2;
        } while (contador <= 37);
        System.out.println (mensaje);
    }
    
}
