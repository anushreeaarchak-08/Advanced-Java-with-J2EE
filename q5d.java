 package swingLab;

import javax.swing.*;
import java.awt.*;

public class q5d {

    public static void main(String[] args) {

        JFrame frame = new JFrame("5d CMY Tabs");

        JTabbedPane tab = new JTabbedPane();

        JPanel cyan = new JPanel();
        JPanel magenta = new JPanel();
        JPanel yellow = new JPanel();

        cyan.setBackground(Color.CYAN);
        magenta.setBackground(Color.MAGENTA);
        yellow.setBackground(Color.YELLOW);

        tab.add("CYAN", cyan);
        tab.add("MAGENTA", magenta);
        tab.add("YELLOW", yellow);

        tab.addChangeListener(e -> {
            System.out.println(tab.getTitleAt(tab.getSelectedIndex()) + " selected");
        });

        frame.add(tab);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}