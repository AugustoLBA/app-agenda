package com.appagenda.ui.ouvintes;

import com.appagenda.ui.janelas.JanelaEditarContato;
import com.appagenda.ui.janelas.JanelaInicial;
import com.appagenda.ui.janelas.JanelaVisualizarContato;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuvinteJanelaVisualizarContatos implements ActionListener {

    private JanelaVisualizarContato janelaVisualizarContato;

    public OuvinteJanelaVisualizarContatos(JanelaVisualizarContato janelaVisualizarContato){
        this.janelaVisualizarContato = janelaVisualizarContato;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == janelaVisualizarContato.getVoltar()){
            janelaVisualizarContato.dispose();
            new JanelaInicial().controller = janelaVisualizarContato.controller;
        }
        if(e.getSource() == janelaVisualizarContato.getEditar()){
            int index = janelaVisualizarContato.getTabela().getSelectedRow();
            if(index == -1){
                JOptionPane.showMessageDialog(janelaVisualizarContato,"Selecione uma linha -> (contato)");
            }else{
                DefaultTableModel modelo = (DefaultTableModel) janelaVisualizarContato.getTabela().getModel();

                Object objcId = modelo.getValueAt(index,0);
                String objcNome = (String) modelo.getValueAt(index,1);
                String objcNumero = (String) modelo.getValueAt(index,2);

                janelaVisualizarContato.dispose();

                new JanelaEditarContato((Long) objcId, objcNome, objcNumero)
                        .controller = janelaVisualizarContato.controller;
            }

        }
        if(e.getSource() == janelaVisualizarContato.getExcluir()){

            int index = janelaVisualizarContato.getTabela().getSelectedRow();
            if(index < 0){
                JOptionPane.showMessageDialog(janelaVisualizarContato,"Selecione uma linha -> (Contato)!");
            }
            else {
                int resposta = JOptionPane.showConfirmDialog(janelaVisualizarContato, "Tem certeza que quer excluir esse contato?"
                        ,"Remover contato?",JOptionPane.YES_NO_OPTION);
                if(resposta == JOptionPane.YES_OPTION){
                    try {
                        // Excluindo da tabela da janela
                        DefaultTableModel modelo = (DefaultTableModel) janelaVisualizarContato.getTabela().getModel();

                        Long objc = (Long) modelo.getValueAt(index, 0);

                        janelaVisualizarContato.controller.deleteById(objc);
                        modelo.removeRow(index);
                        janelaVisualizarContato.getTabela().repaint();
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(janelaVisualizarContato,ex.getMessage());
                    }

                }


            }

        }
    }
}
