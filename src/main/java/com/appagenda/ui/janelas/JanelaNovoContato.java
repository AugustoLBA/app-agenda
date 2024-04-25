package com.appagenda.ui.janelas;

import com.appagenda.ui.ouvintes.OuvinteJanelaNovoContato;
import com.appagenda.ui.utils.JButtonPadrao;
import com.appagenda.ui.utils.JLabelPadrao;
import com.appagenda.ui.utils.JTablePadrao;
import com.appagenda.ui.utils.JTextFieldPadrao;
import lombok.Getter;
import lombok.Setter;


import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class JanelaNovoContato extends JanelaPadrao{

    private JTextField nome;

    private JTextField numero;

    private JButton voltar;

    private JButton salvar;
    @Override
    public void addImg() {

    }

    @Override
    public void addJButton() {

        OuvinteJanelaNovoContato ouvinte = new OuvinteJanelaNovoContato(this);

        salvar = JButtonPadrao.criarJbutton("Salvar",70,300,80,30,Color.YELLOW);
        salvar.addActionListener(ouvinte);
        this.add(salvar);

        voltar = JButtonPadrao.criarJbutton("Voltar",170,300,80,30,Color.YELLOW);
        voltar.addActionListener(ouvinte);
        this.add(voltar);

    }

    @Override
    public void addJTextField() {

        nome = JTextFieldPadrao.criarJtextField(170,200,80,30, Color.white);
        this.add(nome);

        numero = JTextFieldPadrao.criarJtextField(170,250,80,30,Color.white);
        this.add(numero);

    }

    @Override
    public void addJLabel() {

        JLabel titulo = JLabelPadrao.criarJlabel("Novo Contato",175,20,160,30,25);
        this.add(titulo);

        JLabel nome = JLabelPadrao.criarJlabel("Nome",70,200,80,30,20);
        this.add(nome);

        JLabel numero = JLabelPadrao.criarJlabel("Numero",70, 250,80,30,20);
        this.add(numero);

    }
}
