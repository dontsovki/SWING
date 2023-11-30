package org.example.Package;

import javax.swing.*;

public class JTextField_Class extends JPanel {
    public static void JTextField (){
        JFrame a = new JFrame("example");
        JTextField b = new JTextField("edureka");
        b.setBounds(50,100,200,30); //устанавливают положение фрейма
        a.add(b);
        a.setSize(300,300); // устанавливает размеры окна
        a.setLayout(null); //метод установки менеджера расположения
        a.setVisible(true);
    }

}
