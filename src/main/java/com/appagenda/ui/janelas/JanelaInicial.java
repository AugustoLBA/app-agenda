package com.appagenda.ui.janelas;

import com.appagenda.ui.utils.JButtonPadrao;
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

        novoContato = JButtonPadrao.criarJbutton("Novo Contato",275,250,150,30, Color.YELLOW);
        this.add(novoContato);

        visualizarContatos = JButtonPadrao.criarJbutton("Visualizar Contatos",275,300,150,30,Color.YELLOW);
        this.add(visualizarContatos);

        sair = JButtonPadrao.criarJbutton("Sair",275,350,150,30,Color.YELLOW);
        this.add(sair);

    }

    @Override
    public void addJTextField() {

    }

    @Override
    public void addJLbel() {

    }
}
