package com.appagenda.ui.janelas;

import com.appagenda.dto.ContatoResponseDTO;
import com.appagenda.ui.utils.JButtonPadrao;
import com.appagenda.ui.utils.JScrollPanePadrao;
import com.appagenda.ui.utils.JTablePadrao;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class JanelaVisualizarContato extends JanelaPadrao{

    private JButton voltar;

    private JButton excluir;

    private JButton editar;

    private JTable tabela;

    private DefaultTableModel linha;

    private JScrollPane scrollPane;

    private List<ContatoResponseDTO> dto = new ArrayList<>();

    private List<ContatoResponseDTO> listaDeContatos = new ArrayList<>();
    @Override
    public void addImg() {

    }

    @Override
    public void addJButton() {

        voltar = JButtonPadrao.criarJbutton("Voltar",100,400,80,30, Color.YELLOW);
        this.add(voltar);

        editar = JButtonPadrao.criarJbutton("Editar",310,400,80,30,Color.YELLOW);
        this.add(editar);

        excluir = JButtonPadrao.criarJbutton("Excluir",500,400,80,30,Color.YELLOW);
        this.add(excluir);

    }

    @Override
    public void addJTextField() {

    }

    @Override
    public void addJLabel() {

    }
    public void addTable() {
        linha = new DefaultTableModel();

        linha.addColumn("Id");
        linha.addColumn("Nome");
        linha.addColumn("Numero");

        for (ContatoResponseDTO aux : this.listaDeContatos) {
            addLinha(linha, aux);
        }
        tabela = JTablePadrao.cirarTable(linha);
        scrollPane = JScrollPanePadrao.criarJscrollPane(tabela,100,80,500,300);
        this.add(scrollPane);
    }
    private void addLinha(DefaultTableModel linha, ContatoResponseDTO responseDTO) {
        Object[] dados = new Object[3];

        dados[0] = responseDTO.getId();
        dados[1] = responseDTO.getNome();
        dados[2] = responseDTO.getNumero();

        linha.addRow(dados);
        dto.add(responseDTO);
    }

    public JanelaVisualizarContato(List<ContatoResponseDTO> listaDeContatos){
        this.listaDeContatos.addAll(listaDeContatos);
        addTable();

    }
}

