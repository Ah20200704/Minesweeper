package gaem;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;


public class Minesweeper extends JFrame {

    private JLabel statusbar;
//runs initUI
    public Minesweeper() {

        initUI();
    }
//Creates a new board using status bar
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
//This is the main method, it begins by telling you about the game, then it creates a new instance of minesweeper
//and makes it so that the player can see it 
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
