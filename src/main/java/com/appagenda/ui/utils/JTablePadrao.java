package com.appagenda.ui.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTablePadrao {

    public static JTable cirarTable(DefaultTableModel linha){
        return new JTable(linha);
    }
}
