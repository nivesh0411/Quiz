import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame("BRAINUP");
    JButton button1 = new JButton("EASY ");
    JButton button2 = new JButton("MEDIUM ");
    JButton button3 = new JButton("HARD ");

    LaunchPage() {

        button1.setBounds(200, 150, 200, 40);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2.setBounds(200, 200, 200, 40);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3.setBounds(200, 250, 200, 40);
        button3.setFocusable(false);
        button3.addActionListener(this);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            frame.dispose();
            Quiz quiz = new Quiz();
        }

        if (e.getSource() == button2) {
            frame.dispose();
            Quiz1 quiz = new Quiz1();
        }

        if (e.getSource() == button3) {
            frame.dispose();
            Quiz2 quiz = new Quiz2();
        }

    }
}