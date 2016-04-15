package principal;

import java.util.Date;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    
    public static void main(String args[]) {
        Eventos s1 = new Eventos();
        Eventos s2 = new Eventos();
    
        ObservadorDeEsportes ob1 = new ObservadorDeEsportes();
        ObservadorDeMusica ob2 = new ObservadorDeMusica();
        ObservaTodos ob3 = new ObservaTodos();
    
        s1.addObserver(ob1, "esportes");
        s2.addObserver(ob1, "esportes");
        s2.addObserver(ob2, "musica");
        s2.addObserver(ob3);
        
        s1.setDataDoJogo(new Date());
        s2.setDataDoJogo(new Date());
        s2.setDataDoShow(new Date());
    }
}
