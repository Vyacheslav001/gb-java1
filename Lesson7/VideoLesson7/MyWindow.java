package Lesson7.VideoLesson7;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Test Window");
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
//        JButton btn3 = new JButton("btn3");
//        JButton btn4 = new JButton("btn4");
//        JButton btn5 = new JButton("btn5");
//        JButton btn6 = new JButton("btn6");

        JPanel jPanel = new JPanel((new GridLayout(1, 2)));

        jPanel.add(btn1);
        jPanel.add(btn2);

        add(jPanel, BorderLayout.SOUTH);

//        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
//        setLayout(new FlowLayout());

//        btn1.setBounds(0,0,100,100);
//        btn2.setBounds(0,100,100,100);
//        btn1.setPreferredSize(new Dimension(200, 200));

//        add(btn1, BorderLayout.NORTH);
//        add(btn2, BorderLayout. SOUTH);

//        add(btn1);
//        add(btn2);
//        add(btn3);
//        add(btn4);
//        add(btn5);
//        add(btn6);

//        setResizable(false); //запрет изменения размера окна
        setVisible(true);
    }
}

class MainClassSwing {
    public static void main(String[] args) {
        new MyWindow();
    }
}