package com.appagenda.ui.utils;

import javax.swing.*;

public class JScrollPanePadrao {

    public static JScrollPane criarJscrollPane(JTable table, int x, int y, int z, int w){
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(x,y,z,w);
        return scrollPane;
    }
}
