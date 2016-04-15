/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Date;

/**
 *
 * @author flisol
 */
public class DataEventos extends Subject{
    
    public DataEventos(String nome) {
        super(nome);
    }
    
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
