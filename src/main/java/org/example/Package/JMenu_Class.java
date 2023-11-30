package org.example.Package;

import javax.swing.*;

public class JMenu_Class extends JPanel_Class{
    JMenu menu;
    JMenuItem a1,a2;
    JMenu_Class(){
        JFrame a = new JFrame("Example");
        menu = new JMenu("options");
        JMenuBar m1 = new JMenuBar(); //Он наследует класс JMenuItem и является компонентом выпадающего меню, которое отображается из строки меню.
        a1 = new JMenuItem("example");
        a2 = new JMenuItem("example1");
        menu.add(a1);
        menu.add(a2);
        m1.add(menu);
        a.setJMenuBar(m1);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);
    }

    public static void main(String[] args) {
        new JMenu_Class();
    }

}
