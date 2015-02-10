/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pwest
 */
public class PushCounterPanel extends JPanel{
    public int mSum;
    public JButton mPush;
    public JLabel mCount;
    public PushCounterPanel() {
        mSum = 0;
        mPush = new JButton("Push me!");
        mCount = new JLabel("Count: " + mSum);
        mPush.addActionListener(new ButtonListener());
        
        this.add(mCount);
        this.add(mPush);
        
        this.setBackground(Color.MAGENTA);
        this.setPreferredSize(new Dimension(300, 100));
    }
    
    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            mSum++;
            mCount.setText("Count: " + mSum);
        }
        
    }
}
