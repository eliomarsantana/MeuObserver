/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eliomar Santana
 */
public class Subject extends Observable {
    
    public Subject(){
        listaDeObservers = new ArrayList<>();
        hash = new HashMap<String, ArrayList<Observer>>();
    }

    public synchronized void addObserver(Observer obsrvr) {
        listaDeObservers.add(obsrvr);
    }
    
    public void addObserver(Observer o, String categoria) {
        ArrayList<Observer> lista = (ArrayList<Observer>) hash.get(categoria);
        if(lista == null){
            hash.put(categoria, new ArrayList<Observer>());
            hash.get(categoria).add(o);
        }else{
            lista.add(o);
        }    
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : listaDeObservers){
            observer.update(this, null);//passar observable e a categoria
        } 
    }

    @Override
    public void notifyObservers(Object categoria) {
        ArrayList<Observer> observers = hash.get(categoria);
        if(observers!=null) {
            for(Observer o : observers){
                o.update(this, categoria);
            }
            notifyObservers();      
        }
    }

    private HashMap<String, ArrayList<Observer>> hash;
    private ArrayList<Observer> listaDeObservers;
}
