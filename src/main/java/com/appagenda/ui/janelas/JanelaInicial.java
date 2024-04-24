package com.appagenda.ui.janelas;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Getter
@Setter
@Component("JanelaInicial")
public class JanelaInicial extends JanelaPadrao{

    private JButton novoContato;

    private JButton visualizarContatos;

    private JButton editarContato;

    private JButton sair;
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
    public void addJLbel() {

    }
}
