package org.example.Package;

import javax.swing.*;

public class JButton_Class extends JPanel {
    public static void JButton (){
        JFrame a = new JFrame("example");
        JButton b = new JButton("click me");
        b.setBounds(40,90,85,20); //устанавливают положение фрейма
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
    }
}
