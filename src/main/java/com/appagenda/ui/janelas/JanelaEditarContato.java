package com.appagenda.ui.janelas;

import com.appagenda.ui.ouvintes.OuvinteJanelaEditarContato;
import com.appagenda.ui.utils.JButtonPadrao;
import com.appagenda.ui.utils.JLabelPadrao;
import com.appagenda.ui.utils.JTextFieldPadrao;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class JanelaEditarContato extends JanelaPadrao{

    private Long id;

    private JTextField nome;

    private JTextField numero;

    private JButton salvar;

    private JButton voltar;
    @Override
    public void addImg() {

    }

    @Override
    public void addJButton() {

        OuvinteJanelaEditarContato ouvinte = new OuvinteJanelaEditarContato(this);

        salvar = JButtonPadrao.criarJbutton("Salvar",70,300,80,30, Color.YELLOW);
        salvar.addActionListener(ouvinte);
        this.add(salvar);

        voltar = JButtonPadrao.criarJbutton("Voltar", 200, 300, 80, 30, Color.YELLOW);
        voltar.addActionListener(ouvinte);
        this.add(voltar);

    }

    @Override
    public void addJTextField() {

        nome = JTextFieldPadrao.criarJtextField(180,150, 80,30,Color.WHITE);
        this.numero = getNome();
        this.add(nome);

        numero = JTextFieldPadrao.criarJtextField(180, 200, 80,30, Color.WHITE);
        this.numero = getNumero();
        this.add(numero);

    }

    @Override
    public void addJLabel() {
        JLabel titulo = JLabelPadrao.criarJlabel("Editar Contato",250,20,200,30,25);
        this.add(titulo);

        JLabel nome = JLabelPadrao.criarJlabel("Nome",70,150,80,30,20);
        this.add(nome);

        JLabel numero = JLabelPadrao.criarJlabel("Numero", 70, 200, 80, 30,20);
        this.add(numero);

    }

    public JanelaEditarContato(Long id, String nome, String  numero) {
        this.id = id;
        this.nome.setText(nome);
        this.numero.setText(numero);
    }
}
