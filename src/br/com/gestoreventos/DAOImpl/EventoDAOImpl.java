/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.DAOImpl;

import br.com.gestoreventos.interfaces.EventoDAOIF;
import br.com.gestoreventos.models.Evento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ericgaldino
 */
public class EventoDAOImpl implements EventoDAOIF{
    
    List<Evento> eventos;

    public EventoDAOImpl(){
        eventos = new ArrayList<>();
    }
    
    @Override
    public List<Evento> listarEventos() {
        return eventos;
    }

    @Override
    public List<Evento> listarEventoPorDescricao(String descricao) {
        List<Evento> eventosListados = null ;
        for(Evento e: eventos){
            if(e.getDescricao().contains(descricao));
            eventosListados.add(e);
        }
        return eventosListados;
    }

    @Override
    public void salvarEvento(Evento evento) {
        eventos.add(evento);
    }

    @Override
    public void excluirEvento(Evento evento) {
        for(Evento e: eventos){
            if(e.equals(evento)) eventos.remove(e);
        }
    }
}
