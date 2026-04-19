 package swingLab;

import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class q5c {

    public static void main(String[] args) {

        JFrame frame = new JFrame("5c Country Capitals");

        String countries[] = {
                "USA","India","Vietnam","Canada","Denmark",
                "France","Great Britain","Japan","Africa",
                "Greenland","Singapore"
        };

        HashMap<String, String> cap = new HashMap<>();

        cap.put("USA", "Washington DC");
        cap.put("India", "New Delhi");
        cap.put("Vietnam", "Hanoi");
        cap.put("Canada", "Ottawa");
        cap.put("Denmark", "Copenhagen");
        cap.put("France", "Paris");
        cap.put("Great Britain", "London");
        cap.put("Japan", "Tokyo");
        cap.put("Africa", "Nairobi");
        cap.put("Greenland", "Nuuk");
        cap.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);

        // IMPORTANT FIX: prevent double execution
        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {   // runs only once after selection
                String c = list.getSelectedValue();
                if (c != null) {
                    System.out.println("Capital of " + c + " = " + cap.get(c));
                }
            }
        });

        frame.add(new JScrollPane(list));

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}