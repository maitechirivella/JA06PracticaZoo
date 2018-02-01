/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lliurex
 */
public class AplicacionArrayPrecios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Precio[] catalogo;
        catalogo = new Precio[5];
        for (int i = 0; i < catalogo.length; i++) {
            catalogo[i] = new Precio();
            catalogo[i].setEuros(10 * Math.random());
            System.out.println("Producto " + i + ":" + catalogo[i].getEuros());
        }
        double maximo = catalogo[0].getEuros();
        for (int i = 1; i < catalogo.length; i++) {
            if (maximo < catalogo[i].getEuros()) {
                maximo = catalogo[i].getEuros();
            }
        }
        System.out.println("el producto mqas caro vale " + maximo + " euros");
    }
}


