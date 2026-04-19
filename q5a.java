 package swingLab;

import javax.swing.*;
import javax.swing.event.*;

public class q5a {

    public static void main(String[] args) {

        JFrame frame = new JFrame("5a Countries List");

        String countries[] = {
                "USA","India","Vietnam","Canada","Denmark",
                "France","Great Britain","Japan","Africa",
                "Greenland","Singapore"
        };

        JList<String> list = new JList<>(countries);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                System.out.println("Selected Country: " + list.getSelectedValue());
            }
        });

        frame.add(new JScrollPane(list));

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}