package com.appagenda.ui.ouvintes;

import com.appagenda.dto.ContatoDTO;
import com.appagenda.ui.janelas.JanelaEditarContato;
import com.appagenda.ui.janelas.JanelaVisualizarContato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuvinteJanelaEditarContato implements ActionListener {

    private JanelaEditarContato janelaEditarContato;

    public OuvinteJanelaEditarContato(JanelaEditarContato janelaEditarContato) {
        this.janelaEditarContato = janelaEditarContato;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == janelaEditarContato.getSalvar()){

            String nome = janelaEditarContato.getNome().getText();
            String numero = janelaEditarContato.getNumero().getText();
            Long id = janelaEditarContato.getId();

            ContatoDTO dto = new ContatoDTO(nome, numero);
            janelaEditarContato.controller.updateContato(id,dto);
            janelaEditarContato.dispose();
            new JanelaVisualizarContato(janelaEditarContato.controller.findAll())
                    .controller = janelaEditarContato.controller;

        }if(e.getSource() == janelaEditarContato.getVoltar()){
            janelaEditarContato.dispose();
            new JanelaVisualizarContato(janelaEditarContato.controller.findAll())
                    .controller = janelaEditarContato.controller;
        }

    }
}
