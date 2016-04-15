package principal;

import java.util.Date;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    
    public static void main(String args[]) {
        
        DataEventos s1 = new DataEventos("Subject1");
        DataEventos s2 = new DataEventos("Subject2");
    
        Observador ob1 = new Observador("Observer 1");
        Observador ob2 = new Observador("Observer 2");
        Observador ob3 = new Observador("Observer 3");
    
        s1.addObserver(ob1, "esportes");
        s2.addObserver(ob1, "esportes");
        s2.addObserver(ob2, "musica");
        s2.addObserver(ob3);
        
        s1.setDataDoJogo(new Date());
        s2.setDataDoJogo(new Date());
        s2.setDataDoShow(new Date());
    }
}
