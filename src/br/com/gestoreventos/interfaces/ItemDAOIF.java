/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.interfaces;

import br.com.gestoreventos.models.Evento;
import br.com.gestoreventos.models.Item;

/**
 *
 * @author ericgaldino
 */
public interface ItemDAOIF {
    
    public void salvarItem(Evento evento, Item item);
    public void excluirItem(Evento evento, Item item);
}
