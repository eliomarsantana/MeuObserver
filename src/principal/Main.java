/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    
    public static void main(String args[]) {
        Subject s1 = new Subject();
        Subject s2 = new Subject();
    
        Observador ob1 = new Observador();
        Observador ob2 = new Observador();
        Observador ob3 = new Observador();
    
        s1.addObserver(ob1, "esporte");
        s2.addObserver(ob1, "esporte");
        s2.addObserver(ob2, "musica");
        s2.addObserver(ob3);
        
        s1.setDataDoJogo(null);
    }
}
