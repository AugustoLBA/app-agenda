package com.appagenda.ui.janelas;

import com.appagenda.controller.ContatoController;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;

public abstract class JanelaPadrao extends JFrame {
    @Autowired
    public ContatoController controller;

    public JanelaPadrao(){
        this.setTitle("Janela");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBackground(Color.BLACK);

        // Métodos que toda classe que herda deverá
        // implementar de acordo com sua necessidade
        addJLabel();
        addJTextField();
        addJButton();
        addImg();

        this.setVisible(true);

    }
    public abstract void addImg();

    public abstract void addJButton();

    public abstract void addJTextField();

    public abstract void addJLabel();

}
