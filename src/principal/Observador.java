package principal;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eliomar Santana
 */
public class Observador implements Observer {
    
    public Observador(String nomeObserver){
        this.nomeObserver = nomeObserver;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        Subject sub = (Subject) o;
        
        if(arg == null)
            arg = "Todas ";
        
        System.out.println("Notificando o observer -> "+ this.getNome() +" para categoria -> "+arg + "// Registrado no "+sub.getNome());
    }
    
    public String getNome(){
        return this.nomeObserver;
    }
    private String nomeObserver;
}
