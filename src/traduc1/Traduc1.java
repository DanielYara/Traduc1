/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traduc1;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Traduc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kyb = new Scanner(System.in);
        int resultado = 0, numero = 0;
        System.out.println("Ingrese numero");
        numero = kyb.nextInt();
        
        if(numero > 0){
            for(int i = 0; i <= numero; i++) {                
                System.out.println(i);
            }
        }
        else {
            resultado = funcion(numero);
            System.out.println(resultado);
        }
}
    
    public static int funcion(int entrada){
        int proceso = 0, salida = 0;
        proceso = entrada*(-1);
        salida = proceso;
        return salida;
    }

}
