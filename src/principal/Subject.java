/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eliomar Santana
 */
public class Subject extends Observable {

    @Override
    public synchronized void addObserver(Observer o) {
        observers.add((Observador) o);
    }
    
    public void addObserver(Observer o, Object arg){
        observers.add((Observador) o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observador ob : observers) {
            System.out.println("Notificando observers!");
              ob.update(this, ob);
            }
    }
    
    public void setObservers(ArrayList<Observador> observers) {
        this.observers = observers;
    }

    public void setDataDoJogo(Date data){
        this.dataEvento = data;
    }

    public void setDataDoSshow(Date data){
        this.dataEvento = data;
    }
    
    private ArrayList<Observador> observers = new ArrayList();
    private Date dataEvento;
}
