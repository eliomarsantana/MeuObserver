package principal;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eliomar Santana
 */
public class ObservadorDeMusica  implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notificando o observer -> "+ this.getClass().getName() +" para categoria -> "+arg + "//Subject -> "+o.getClass().getName());
    }
    
}
