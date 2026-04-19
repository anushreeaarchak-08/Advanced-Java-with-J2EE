package swingLab;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q4b extends JFrame implements ActionListener {

    JButton india, srilanka;
    JLabel label;

    q4b() {

        setTitle("4b Country Buttons");

        india = new JButton("India");
        srilanka = new JButton("SriLanka");

        label = new JLabel("Click a button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));

        india.addActionListener(this);
        srilanka.addActionListener(this);

        setLayout(new FlowLayout());
        add(india);
        add(srilanka);
        add(label);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == india)
            label.setText("India is pressed");
        else
            label.setText("Srilanka is pressed");
    }

    public static void main(String[] args) {
        new q4b();
    }
}