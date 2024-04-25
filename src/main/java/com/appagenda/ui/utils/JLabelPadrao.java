package com.appagenda.ui.utils;

import javax.swing.*;
import java.awt.*;

public class JLabelPadrao {

    public static JLabel criarJlabel(String txt, int x,int y,int z, int w,int tamanhoFonte){
        JLabel label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD,tamanhoFonte));
        label.setText(txt);
        label.setForeground(Color.RED);
        label.setOpaque(true);
        label.setBounds(x,y,z,w);
        return label;
    }

    public static JLabel criarJlabelComImg(Icon img, int x, int y, int z, int w){
        JLabel label = new JLabel();
        label.setIcon(img);
        label.setOpaque(true);
        label.setBounds(x,y,z,w);
        return label;
    }
}
