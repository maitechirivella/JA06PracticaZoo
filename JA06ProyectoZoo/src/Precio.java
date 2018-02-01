/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lliurex
 */
public class Precio {
    public double euros;

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }
    public void mostrarPrecio(){
        System.out.println(this.getEuros());
    }
   
    @Override
    public String toString(){
        String s;
        s=String.valueOf(this.getEuros());
        return s;
    }
    
}
