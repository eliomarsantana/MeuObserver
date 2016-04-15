package principal;

import java.util.Date;

/**
 *
 * @author Eliomar Santana
 */
public class Eventos extends Subject {

    public void setDataDoJogo(Date dataJogo) {
        this.dataEvento = dataJogo;        
        notifyObservers("esportes");
        
    }
    
    public void setDataDoShow(Date dataShow) {
        this.dataEvento = dataShow;      
        notifyObservers("musica");
    }
    
    private Date dataEvento;
}
