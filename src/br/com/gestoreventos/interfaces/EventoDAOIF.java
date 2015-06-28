/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.interfaces;

import br.com.gestoreventos.models.Evento;
import java.util.List;

/**
 *
 * @author ericgaldino
 */
public interface EventoDAOIF {
    
    public List<Evento> listarEventos();
    public List<Evento> listarEventoPorDescricao(String descricao);
    public void salvarEvento(Evento evento);
    public void excluirEvento(Evento evento);
}
