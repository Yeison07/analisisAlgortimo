/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Solucion_Java_Factorial;

/**
 *
 * @author Yeison
 */
public class Test_BigFactorial_Solucion {
     public static void main(String[] args) {
        
        String numeroBig="999";
        try {
            Solucion_Java_Factorial numero=new Solucion_Java_Factorial(numeroBig);
            System.out.println("El factorial de:"+numero.toString()+", es:"+numero.getFactorial().toString());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
