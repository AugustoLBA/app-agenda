package com.appagenda.ui.janelas;

import com.appagenda.ui.utils.JLabelPadrao;


import javax.swing.*;
public class JanelaNovoContato extends JanelaPadrao{
    @Override
    public void addImg() {

    }

    @Override
    public void addJButton() {

    }

    @Override
    public void addJTextField() {

    }

    @Override
    public void addJLabel() {

        JLabel titulo = JLabelPadrao.criarJlabel("Novo Contato",175,20,160,30,25);
        this.add(titulo);

    }
}
