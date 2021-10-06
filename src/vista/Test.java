/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
        Ordenador pc1 = new Portatil(200,1000,12345); // Downcasting
        imprimirOrdenador(pc1);
        
        Ordenador pc2 = new Sobremesa("ATX", 500, 56789);
        imprimirOrdenador(pc2);
    }
    
    public static void imprimirOrdenador(Ordenador ordenador){
        System.out.println("Informacion del ordenador: ");
        System.out.println("-----------------------------------");
        String tipo = (ordenador instanceof Portatil) ? "Portatil" :"Sobremesa";
        System.out.println("Tipo: " + tipo);
        System.out.println(ordenador.verInfo());
        
        
    }
}
