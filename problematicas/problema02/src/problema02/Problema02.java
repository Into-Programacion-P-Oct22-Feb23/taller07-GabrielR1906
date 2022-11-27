/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author renat
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 2;
        int suma = 4;
        String mensaje = "";
        
        while(contador <=110) {
            mensaje = mensaje + contador + "\n";
            contador = contador + suma;
            suma = suma + 2;
        }
        System.out.println(mensaje);
    }
    
}
