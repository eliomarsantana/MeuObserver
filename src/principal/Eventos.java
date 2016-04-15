package principal;

import java.util.Date;

/**
 *
 * @author Eliomar Santana
 */
public class Eventos extends Subject{
    private Date dataEvento;
    
    public void setDataDoJogo(Date dataJogo) {
        this.dataEvento = dataJogo;
        System.out.println("Nova data para esportes: "+ dataJogo);
        notifyObservers("esportes");
        
    }
    
    public void setDataDoShow(Date dataShow) {
        this.dataEvento = dataShow;
        System.out.println("Nova data para musica: "+ dataShow);
        notifyObservers("musica");
    }
}
