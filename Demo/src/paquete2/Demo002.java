/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Mensaje;
import paquete3.Informacion;


/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // usar printf;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dijite cualquier numero para imprimir el mensaje");
        int num = entrada.nextInt();
        if( num >= 1 && num <= 5 ){
            System.out.printf("%s con %d\n",Mensaje.obtenerMensaje(),
                Informacion.obtenerHabitantes()); 
        }else{
              System.out.printf("%s con %d\n", Mensaje.obtenerMensaje().toUpperCase(),
                Informacion.obtenerHabitantes() ); 
              
           
        }
    }
    
}
