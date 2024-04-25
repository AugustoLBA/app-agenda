package com.appagenda.ui.ouvintes;

import com.appagenda.ui.janelas.JanelaInicial;
import com.appagenda.ui.janelas.JanelaVisualizarContato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuvinteJanelaVisualizarContatos implements ActionListener {

    private JanelaVisualizarContato janelaVisualizarContato;

    public OuvinteJanelaVisualizarContatos(JanelaVisualizarContato janelaVisualizarContato){
        this.janelaVisualizarContato = janelaVisualizarContato;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == janelaVisualizarContato.getVoltar()){
            janelaVisualizarContato.dispose();
            new JanelaInicial().controller = janelaVisualizarContato.controller;
        }
    }
}
