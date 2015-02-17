/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import javax.swing.JOptionPane;

/**
 *
 * @author pwest
 */
public class EvenOdd {
    public static void main(String[] args){
        String numStr, result;
        int again, num;
        do {
            numStr = JOptionPane.showInputDialog("Enter an Integer:");
            num = Integer.parseInt(numStr);
            result = "That number is " + ((num%2 == 0) ? "even" : "odd");
            JOptionPane.showMessageDialog(null, result);
            again = JOptionPane.showConfirmDialog(null, "Do Another?");
        } while (again == JOptionPane.YES_OPTION);
    }
}
