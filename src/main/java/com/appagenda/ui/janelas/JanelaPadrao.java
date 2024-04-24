package com.appagenda.ui.janelas;

import javax.swing.*;

public abstract class JanelaPadrao extends JFrame {

    public JanelaPadrao(){
        this.setTitle("Janela");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Métodos que toda classe que herda deverá
        // implementar de acordo com sua necessidade
        addJLbel();
        addJTextField();
        addJButton();
        addImg();

        this.setVisible(true);

    }
    public abstract void addImg();

    public abstract void addJButton();

    public abstract void addJTextField();

    public abstract void addJLbel();

}
