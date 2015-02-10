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
public class PushCounter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Count Window!");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PushCounterPanel pbp = new PushCounterPanel();
        frame.add(pbp);
        
        frame.pack();
        frame.setVisible(true);
    }
}
