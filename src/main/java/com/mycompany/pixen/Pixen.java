/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pixen;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.swing.JFrame;

/**
 *
 * @author froym
 */
public class Pixen {
    public static void imprimirHistograma(int[] hist) {
        int max = 0;
        for (int v : hist) max = Math.max(max, v);
        if (max == 0) return;

        int anchoMax = 120; // longitud máxima de la barra en caracteres

        for (int i = 0; i < hist.length; i++) {
            int largo = (int) Math.round((double) hist[i] / max * anchoMax);
            System.out.printf("%3d | %s %d%n", i, "#".repeat(largo), hist[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        
        
        Image miImagen = HerramientasImagen.abrirImagen();
        JFrame aaa = new JFrameImage(miImagen);
       
        BufferedImage buffered = HerramientasImagen.toBufferedImage(miImagen);
        /*
      
        int rojo = new Color(206,17,38).getRGB();
        int verde = new Color(0,104,71).getRGB();
        int Blanco= new Color(255,255,255).getRGB();
        int cafe = new Color(69,48,37).getRGB();
        for (int y = 0; y < buffered.getWidth()/3; y++) {
            for (int x = 0; x < buffered.getHeight(); x++){
                buffered.setRGB(y, x, verde); // asignar el nuevo color
            }
        }
        for (int y = buffered.getWidth()/3;  y < 2*(buffered.getWidth()/3); y++) {
            for (int x = 0; x < buffered.getHeight(); x++){
                buffered.setRGB(y, x, Blanco); // asignar el nuevo color
            }
        }
        for (int y = 2*(buffered.getWidth()/3);  y <buffered.getWidth(); y++) {
            for (int x = 0; x < buffered.getHeight(); x++){
                buffered.setRGB(y, x, rojo); // asignar el nuevo color
            }
        }
        int cx = buffered.getWidth() / 2;   // centro X
        int cy = buffered.getHeight() / 2;  // centro Y
        int r = buffered.getWidth()/9;                         // radio

        for (int x = 0; x < buffered.getWidth(); x++) {
            for (int y = 0; y < buffered.getHeight(); y++) {
                int dx = x - cx;
                int dy = y - cy;
                if (dx * dx + dy * dy <= r * r) {
                    buffered.setRGB(x, y, cafe);
                }
            }
        }
        Image imagenAzul = HerramientasImagen.toImage(buffered);
        JFrame aa = new JFrameImage(imagenAzul);
        
        for (int x = 0; x < buffered.getWidth(); x++) {
            for (int y = 0; y < buffered.getHeight(); y++) {
                int emp = buffered.getRGB(x, y); // extraer color
                Color aux = new Color(emp);
                int r =aux.getRed();
                int g = aux.getGreen();
                int b = aux.getBlue();
                Color aux1 = new Color(r,0,0);
                buffered.setRGB(x, y, aux1.getRGB());
                
            }
        
        }
        Image imagenAzul = HerramientasImagen.toImage(buffered);
        JFrame aa = new JFrameImage(imagenAzul);
        */
        
        /*/ CALIDO FRIO
        int t=-75;
        for (int y = 0; y < buffered.getHeight(); y++) {
            for (int x = 0; x < buffered.getWidth(); x++) {
                int emp = buffered.getRGB(x, y); // extraer color
                Color aux = new Color(emp);
                int r =aux.getRed()+t;
                int g = aux.getGreen();
                int b = aux.getBlue()-t;
                if(r<0){
                    r=0;
                }
                if (r>255){
                    r=255;
                    
                }
                if(b<0){
                    b=0;
                }
                if(b>255){
                    b=255;
                }
                Color aux1 = new Color(r,g,b);
                buffered.setRGB(x, y, aux1.getRGB());
                
            }
        
        }
        Image imagenAzul = HerramientasImagen.toImage(buffered);
        JFrame aa = new JFrameImage(imagenAzul);
        */
        int[] rHist= new int[256];
        int[] gHist= new int[256];
        int[] bHist= new int[256];
        for (int y = 0; y < buffered.getHeight(); y++) {
            for (int x = 0; x < buffered.getWidth(); x++) {
                int emp = buffered.getRGB(x, y); // extraer color
                Color aux = new Color(emp);
                int r =aux.getRed();
                int g = aux.getGreen();
                int b = aux.getBlue();
                rHist[r]+=1;
                gHist[g]+=1;
                bHist[b]+=1;
            }
            
            
            
        }
        System.out.printf("ROJO%n");
        imprimirHistograma(rHist);
        System.out.printf("VERDE%n");
        imprimirHistograma(gHist);
        System.out.printf("AZUL%n");
        imprimirHistograma(bHist);
        
      
    }
}
