package org.example.Package;

import javax.swing.*;

public class JLabel_Class extends JPanel {
    public static void JLabel (){
        JFrame a = new JFrame("example");
        JLabel b1;
        b1 = new JLabel("edureka"); //Используется для размещения текста в контейнере. Он также наследует класс JComponent.
        b1.setBounds(40,40,90,20);
        a.add(b1);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);
    }
}
