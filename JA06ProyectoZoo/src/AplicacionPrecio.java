/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lliurex
 */
public class AplicacionPrecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Precio p;
        p=new Precio();
        p.setEuros(56.8);
        System.out.println("valor = "+ p.getEuros());
        
        Precio q=new Precio();
        q.euros=75.6;
        System.out.println("valor ="+ q.euros);
        
        System.out.println(p);
        
        
        
    }
    
}
