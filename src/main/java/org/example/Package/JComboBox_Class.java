package org.example.Package;

import javax.swing.*;

public class JComboBox_Class extends JPanel_Class{
    JFrame a;
    JComboBox_Class(){
        a = new JFrame("example");
        String[] courses = { "core java","advance java", "java servlet"};
        JComboBox c = new JComboBox(courses); //Он наследует класс JComponent и используется для отображения всплывающего меню выбора.
        c.setBounds(90,90,90,20);
        a.add(c);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBox_Class();
    }
}
