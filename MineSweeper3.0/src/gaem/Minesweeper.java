package gaem;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;

/**
 * Java Minesweeper Game
 *
 * Author: Jan Bodnar
 * Website: http://zetcode.com
 */

public class Minesweeper extends JFrame {

    private JLabel statusbar;

    public Minesweeper() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar));

        setResizable(false);
        pack();

        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JOptionPane.showMessageDialog(null, "Welcome to minesweeper");
            JOptionPane.showMessageDialog(null, "Click the squares to reveal numbers or open spaces");
            JOptionPane.showMessageDialog(null, "Upon clicking on a square containing a mine the game will be lost and restart when you click again");
            JOptionPane.showMessageDialog(null, "Right click to place down a flag where you  think a mine is");
            JOptionPane.showMessageDialog(null, "Have Fun");

            Minesweeper ex = new Minesweeper();
            ex.setVisible(true);
        });
    }
}