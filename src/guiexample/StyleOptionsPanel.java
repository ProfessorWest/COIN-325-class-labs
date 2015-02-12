/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pwest
 */
public class StyleOptionsPanel extends JPanel{
    public JLabel mStyleLabel;
    public JCheckBox mBoldCB, mItalicCB;
    public JSlider mFontSize;
    
    public StyleOptionsPanel() {
        mStyleLabel = new JLabel("Say it with Style!");
        mBoldCB = new JCheckBox("Bold");
        mItalicCB = new JCheckBox();
        mFontSize = new JSlider(JSlider.HORIZONTAL);
        
        mFontSize.setBounds(new Rectangle(8, 96));
        mItalicCB.setText("Italic");
        StyleListener listener = new StyleListener();
        mBoldCB.addItemListener(listener);
        mItalicCB.addItemListener(listener);
        mFontSize.addChangeListener(new FontSizeListener());
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel checkBoxes = new JPanel();
        checkBoxes.add(mBoldCB);
        checkBoxes.add(mItalicCB);
        checkBoxes.setLayout(new BoxLayout(checkBoxes, BoxLayout.X_AXIS));
        /*
        GridLayout gl = new GridLayout();
        gl.setColumns(1);
        gl.setRows(4);
        setLayout(gl);
        */
        
        this.add(mStyleLabel);
        //this.add(mBoldCB);
        //add(mItalicCB);
        this.add(checkBoxes);
        this.add(mFontSize);
    }
    
    public class FontSizeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            //JSlider slider = (JSlider)e.getSource();
            //System.out.println(mFontSize.getValue());
            Font cFont = mStyleLabel.getFont();
            mStyleLabel.setFont(new Font (cFont.getFontName(), cFont.getStyle(),
                    mFontSize.getValue()));;
        }
        
    }
    
    public class StyleListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            JCheckBox checkBox = (JCheckBox) e.getItem();
            //int style = mStyleLabel.getFont().getStyle();
            int style = Font.PLAIN;
            if (mBoldCB.isSelected()) {
                style = Font.BOLD;
            }
            if (mItalicCB.isSelected()) {
                style += Font.ITALIC;
            }
            mStyleLabel.setFont(new Font ("Helvetica", style, mFontSize.getValue()));
        }
    }
}
