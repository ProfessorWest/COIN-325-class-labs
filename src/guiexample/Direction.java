/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import javax.swing.JFrame;

/**
 *
 * @author pwest
 */
public class Direction {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Directional test!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new DirectionPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
}
