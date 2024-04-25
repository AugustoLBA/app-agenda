package com.appagenda.ui.janelas;

import com.appagenda.ui.ouvintes.OuvinteJanelaInicial;
import com.appagenda.ui.utils.JButtonPadrao;
import com.appagenda.ui.utils.JLabelPadrao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
@Component("JanelaInicial")
public class JanelaInicial extends JanelaPadrao {

    private JButton novoContato;

    private JButton visualizarContatos;

    private JButton sair;
    @Override
    public void addImg() {

    }

    @Override
    public void addJButton() {

        OuvinteJanelaInicial ouvinte = new OuvinteJanelaInicial(this);

        novoContato = JButtonPadrao.criarJbutton("Novo Contato",275,250,150,30, Color.YELLOW);
        novoContato.addActionListener(ouvinte);
        this.add(novoContato);

        visualizarContatos = JButtonPadrao.criarJbutton("Visualizar Contatos",275,300,150,30,Color.YELLOW);
        visualizarContatos.addActionListener(ouvinte);
        this.add(visualizarContatos);

        sair = JButtonPadrao.criarJbutton("Sair",275,350,150,30,Color.YELLOW);
        sair.addActionListener(ouvinte);
        this.add(sair);

    }

    @Override
    public void addJTextField() {

    }

    @Override
    public void addJLabel() {
        JLabel titulo = JLabelPadrao.criarJlabel("Bem Vindo",275,20,130,30,25);
        this.add(titulo);

    }
}
