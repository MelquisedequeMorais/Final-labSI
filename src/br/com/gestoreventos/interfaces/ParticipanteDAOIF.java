/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.interfaces;

import br.com.gestoreventos.models.Participante;
import java.util.List;

/**
 *
 * @author ericgaldino
 */
public interface ParticipanteDAOIF {
    
    public List<Participante> listarParticipantes();
    public void salvarParticipante(Participante participante);
    public void excluirParticipante(Participante participante);
}
