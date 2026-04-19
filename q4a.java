 package swingLab;

import javax.swing.*;
import java.awt.*;

public class q4a {
    public static void main(String[] args) {

        JFrame frame = new JFrame("4a Hello Swing");

        JLabel label = new JLabel(
                "Hello! VI C , Welcome to Swing Programming",
                JLabel.CENTER
        );

        label.setFont(new Font("Serif", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        frame.add(label);

        frame.setSize(900, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}