/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author pwest
 */
public class DirectionPanel extends JPanel implements ActionListener, MouseListener{
    private int mXpos, mYpos;
    ImageIcon mArrowUp, mCurrentImage;
    public DirectionPanel() {
        this.addKeyListener(new DirectionListener());
        this.addMouseListener(this);
        mArrowUp = new ImageIcon("res/arrowup.jpg");
        mCurrentImage = mArrowUp;
        mXpos = mYpos = 10;
        
        Timer timer = new Timer(200, this);
        timer.start();
        
        setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(640, 480));
        setFocusable(true);
    }
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        
        mCurrentImage.paintIcon(this, page, mXpos, mYpos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.moveImage(KeyEvent.VK_DOWN);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mXpos = e.getX();
        mYpos = e.getY();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    class DirectionListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            moveImage(e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
    private int mJump = 10;
    public void moveImage(int keyCode) {
        switch(keyCode){
            case KeyEvent.VK_UP:
                mYpos -= mJump;
                break;
            case KeyEvent.VK_DOWN:
                mYpos += mJump;
                break;
            case KeyEvent.VK_LEFT:
                mXpos -= mJump;
                break;
            case KeyEvent.VK_RIGHT:
                mXpos += mJump;
                break;
        }
        
        repaint();
    }
}