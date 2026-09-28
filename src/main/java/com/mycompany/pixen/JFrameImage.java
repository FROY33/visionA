/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pixen;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author froym
 */
public class JFrameImage extends JFrame {
       public JFrameImage(Image aux) {
        JLabel etiqueta = new JLabel();
        ImageIcon ii = new ImageIcon(aux);
        etiqueta.setIcon(ii);
        add(etiqueta);

        pack();                         // Sizes the frame to fit the image
        setVisible(true);               // Makes the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes app on exit
    }
    
}
