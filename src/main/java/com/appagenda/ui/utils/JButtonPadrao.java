package com.appagenda.ui.utils;

import javax.swing.*;
import java.awt.*;

public class JButtonPadrao {

    public static JButton criarJbutton(String txt, int x, int y, int z, int w, Color color){
        JButton button = new JButton();
        button.setText(txt);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(color);
        button.setBounds(x,y,z,w);
        return button;
    }
}
