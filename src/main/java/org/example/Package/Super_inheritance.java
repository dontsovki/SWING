package org.example.Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Видео с ютуб https://yandex.ru/video/preview/12922103155291670168
public class Super_inheritance extends JFrame {

    private JTextField name_fild;
    private JTextField email_fild;
    private JRadioButton male;
    private JRadioButton female;
    private JCheckBox check;

    Super_inheritance () { //Создали конструктор
        super("Контактная форма"); //унаследовались от родительского класса JFrame
        super.setBounds(200, 100, 300, 230); //указывакм местоположение окна
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //указываем какое произойдёт действие при нажатии на кремтик(закрытие окна)
        //Создаём контейнер для размещения объектов
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,10));  //настройки контейнера

        JLabel name = new JLabel("Введите имя"); // Создали текстовое поле
        name_fild = new JTextField("", 1); //Создали поле для ввода данных
        JLabel email = new JLabel("Введите email"); // Создали текстовое поле
        email_fild = new JTextField("@", 1); //Создали поле для ввода данных

        //заполняем окно данными
        container.add(name);
        container.add(name_fild);
        container.add(email);
        container.add(email_fild);

        male = new JRadioButton("Мужской");
        female = new JRadioButton("Женский");
        check = new JCheckBox("Согласен?", false);//кнопка с галочкой
        JButton sent_butten = new JButton("Отправить");

        male.setSelected(true); //Для радиоботона указываем какой изночально будет выбран пораметр

        container.add(male);
        container.add(female);

        //объеденяем в группу радиобатоны
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(sent_butten);

        //Создаём действие при нажатии на кнопку sent_butten
        //Создаём обработчик событий
        sent_butten.addActionListener(new ButtonEventManeger()); //ButtonEventManeger-Класс который обрабатывает событие


    }
    //Создаём вложенный класс для обработки события "нажатие на кнопку"
    class ButtonEventManeger implements ActionListener{ //наследуемся от интерфейса ActionListener
        @Override
        public void actionPerformed(ActionEvent e) { // внутри метода
            String name = name_fild.getText(); //методом getText() получаем значения введенные в поле name_fild
            String email = email_fild.getText(); //методом getText() получаем значения введенные в поле email_fild
            String isMail = "Мужской"; //
            if(!male.isSelected())
                isMail = "Женский";

            boolean checkBox = check.isSelected();

            //Чтобы показать пользователю введеный ресультат, создадим окно JOptionPane
            JOptionPane.showConfirmDialog(null,"Ваша почта: " + email + "\nВаш пол: " + isMail +
                    "\nВы согласны: " + checkBox,"Hello" + name, JOptionPane.PLAIN_MESSAGE);




        }

    }



    public static void main(String[] args) {
        Super_inheritance form = new Super_inheritance();
        form.setVisible(true); //Делаем окно видимым
    }
}
