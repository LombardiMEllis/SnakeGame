
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

import michele.lombardi.mytimer.MyTimer;
import michele.lombardi.mytimer.TimerPanel;


public class SnakeGame extends JFrame {
	

    public SnakeGame() {      
    	add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new SnakeGame();
                ex.setVisible(true);                
            }
        });
    }
}