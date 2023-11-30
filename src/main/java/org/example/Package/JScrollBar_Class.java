package org.example.Package;

import javax.swing.*;

public class JScrollBar_Class extends JPanel {
    JScrollBar_Class() {

        JFrame a = new JFrame("example");
        JScrollBar b = new JScrollBar(); //Он используется для добавления полосы прокрутки, как горизонтальной, так и вертикальной.
        b.setBounds(90, 90, 40, 90);
        a.add(b);
        a.setSize(300, 300);
        a.setLayout(null);
        a.setVisible(true);
    }

    public static void main(String[] args) {
        new JButton_Class();
    }
}


