package com.appagenda.ui.ouvintes;

import com.appagenda.dto.ContatoDTO;
import com.appagenda.ui.janelas.JanelaInicial;
import com.appagenda.ui.janelas.JanelaNovoContato;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuvinteJanelaNovoContato implements ActionListener {

    private JanelaNovoContato janelaNovoContato;

    public OuvinteJanelaNovoContato(JanelaNovoContato janelaNovoContato){
        this.janelaNovoContato = janelaNovoContato;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == janelaNovoContato.getSalvar()){
            String nome = janelaNovoContato.getNome().getText();
            String numero = janelaNovoContato.getNumero().getText();

            if(nome.isEmpty() || numero.isEmpty()){
                JOptionPane.showMessageDialog(janelaNovoContato,"Preencha todos os campos!");
                janelaNovoContato.getNome().setText("");
                janelaNovoContato.getNumero().setText("");
            }else{
                ContatoDTO dto = new ContatoDTO(nome,numero);
                janelaNovoContato.controller.saveContato(dto);
                janelaNovoContato.getNome().setText("");
                janelaNovoContato.getNumero().setText("");
            }
        }
        if(e.getSource() == janelaNovoContato.getVoltar()){
            janelaNovoContato.dispose();
            new JanelaInicial().controller = janelaNovoContato.controller;
        }
    }
}
