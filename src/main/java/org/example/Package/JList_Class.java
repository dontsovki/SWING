package org.example.Package;

import javax.swing.*;

public class JList_Class extends JPanel {
    JList_Class(){
        JFrame a  = new JFrame("example");
        DefaultListModel<String> l = new DefaultListModel< >(); //Он наследует класс JComponent, объект класса JList представляет список текстовых элементов.
        l.addElement("first item");
        l.addElement("second item");
        JList<String> b = new JList< >(l);
        b.setBounds(100,100,75,75);
        a.add(b);
        a.setSize(400,400);
        a.setVisible(true);
        a.setLayout(null);
    }

    public static void main(String[] args) {
        new JList_Class();

    }

}
