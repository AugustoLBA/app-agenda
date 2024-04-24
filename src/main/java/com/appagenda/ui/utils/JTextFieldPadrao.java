package com.appagenda.ui.utils;

import javax.swing.*;
import java.awt.*;

public class JTextFieldPadrao {

    public static JTextField criarJtextField(int x, int y, int z, int w, Color color){
        JTextField textField = new JTextField();
        textField.setBackground(color);
        textField.setBounds(x,y,z,w);
        return textField;
    }
}
