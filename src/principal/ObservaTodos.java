package principal;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eliomar Santana
 */
public class ObservaTodos implements Observer {
    
    @Override
    public void update(Observable o, Object arg) {
        Subject sub = (Subject) o;
        
        if(arg == null)
            arg = "Todas ";
        
        System.out.println("Notificando o observer -> "+ this.getClass().getName() +" para categoria -> "+arg + "// Registrado no "+sub.getNome());
    }
}
