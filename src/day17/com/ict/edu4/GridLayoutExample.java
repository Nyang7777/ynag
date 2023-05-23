package day17.com.ict.edu4;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setTitle("GridLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // GridLayout with 2 rows and 2 columns
        GridLayout grid = new GridLayout(2, 2);
        setLayout(grid);

        // Adding components
        add(new JLabel("Label 1"));
        add(new JTextField());

        add(new JLabel("Label 2"));
        add(new JTextField());

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GridLayoutExample());
    }
}
