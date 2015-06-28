/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.models;

/**
 *
 * @author ericgaldino
 */
public class Item {
    
    private String descricao;
    private String quantidade;
    private Participante responsavel;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Participante getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Participante responsavel) {
        this.responsavel = responsavel;
    }
}
