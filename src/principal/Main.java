package principal;

import java.util.Date;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    
    public static void main(String args[]) {
        
        Subject s1 = new Subject("Subject1");
        Subject s2 = new Subject("Subject2");
    
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
