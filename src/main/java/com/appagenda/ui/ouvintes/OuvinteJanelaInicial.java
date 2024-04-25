package com.appagenda.ui.ouvintes;

import com.appagenda.ui.janelas.JanelaInicial;
import com.appagenda.ui.janelas.JanelaNovoContato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuvinteJanelaInicial implements ActionListener {

    private JanelaInicial janelaInicial;
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == janelaInicial.getNovoContato()){
            janelaInicial.dispose();
            new JanelaNovoContato().controller = janelaInicial.controller;
        }

    }
}
