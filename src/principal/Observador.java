/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eliomar Santana
 */
public class Observador implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        o.notifyObservers();
        
    }
    
}
