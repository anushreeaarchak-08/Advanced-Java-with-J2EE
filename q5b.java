 package swingLab;

import javax.swing.*;
import java.awt.*;

public class q5b {

    public static void main(String[] args) {

        JFrame frame = new JFrame("5b Tabbed Pane RGB");

        JTabbedPane tab = new JTabbedPane();

        JPanel red = new JPanel();
        JPanel blue = new JPanel();
        JPanel green = new JPanel();

        red.setBackground(Color.RED);
        blue.setBackground(Color.BLUE);
        green.setBackground(Color.GREEN);

        tab.add("RED", red);
        tab.add("BLUE", blue);
        tab.add("GREEN", green);

        tab.addChangeListener(e -> {
            System.out.println(tab.getTitleAt(tab.getSelectedIndex()) + " selected");
        });

        frame.add(tab);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}