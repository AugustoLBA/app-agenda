package com.appagenda.ui.ouvintes;

import com.appagenda.ui.janelas.JanelaInicial;
import com.appagenda.ui.janelas.JanelaNovoContato;
import com.appagenda.ui.janelas.JanelaVisualizarContato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuvinteJanelaInicial implements ActionListener {

    private JanelaInicial janelaInicial;

    public OuvinteJanelaInicial(JanelaInicial janelaInicial){
        this.janelaInicial = janelaInicial;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == janelaInicial.getNovoContato()){
            janelaInicial.dispose();
            new JanelaNovoContato().controller = janelaInicial.controller;
        }
        if(e.getSource() == janelaInicial.getVisualizarContatos()){
            janelaInicial.dispose();
            new JanelaVisualizarContato(janelaInicial.controller.findAll()).controller = janelaInicial.controller;

        }

    }
}
