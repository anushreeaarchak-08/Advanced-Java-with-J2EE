 package swingLab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q4c extends JFrame implements ActionListener {

    JButton digital, hourglass;
    JLabel msgLabel, img1, img2;

    q4c() {

        setTitle("4c Image Buttons");

        digital = new JButton("Digital Clock");
        hourglass = new JButton("Hour Glass");

        msgLabel = new JLabel("Click a button", JLabel.CENTER);

        // Resize images
        ImageIcon dIcon = resizeImage("digital.png");
        ImageIcon hIcon = resizeImage("hourglass.jpg");

        img1 = new JLabel(dIcon);
        img2 = new JLabel(hIcon);

        digital.addActionListener(this);
        hourglass.addActionListener(this);

        // Main layout
        setLayout(new BorderLayout());

        // Top panel for buttons
        JPanel topPanel = new JPanel();
        topPanel.add(digital);
        topPanel.add(hourglass);

        // Center panel for images side-by-side
        JPanel imagePanel = new JPanel(new GridLayout(1, 2, 20, 20));
        imagePanel.add(img1);
        imagePanel.add(img2);

        // Add components
        add(topPanel, BorderLayout.NORTH);
        add(msgLabel, BorderLayout.SOUTH);
        add(imagePanel, BorderLayout.CENTER);

        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public ImageIcon resizeImage(String path) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == digital) {
            msgLabel.setText("Digital Clock is pressed");

        } else if (e.getSource() == hourglass) {
            msgLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new q4c();
    }
}