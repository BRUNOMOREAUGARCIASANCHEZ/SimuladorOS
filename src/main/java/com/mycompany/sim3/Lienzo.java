/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sim3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;


/**
 *
 * @author HP
 */
public class Lienzo extends Canvas{ 
    //private Particiones parts[];
    public ArrayList<Integer> peticiones=new ArrayList<Integer>();
    int cabeza=0;
    public ArrayList<Integer> resultado=new ArrayList<Integer>();
    public ArrayList<Double> promedio=new ArrayList<Double>();
    
    public void Dibujar(){
        setBackground(Color.WHITE);
        setSize(460,330);   
    }
    
    public void setResultado(ArrayList<Integer> r){
        this.resultado=r;
    }
    
    public void setCabezal(int c){
        this.cabeza=c;
    }
  
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(30, 20, 400, 30);
        g.setColor(Color.BLACK);
        int y=65;
        int actual=cabeza;
        dibCad(""+cabeza,(cabeza*2)+30,60,10,g);
        //g.drawLine(30, 50, 430, 50);
        for(int x: resultado){
            g.drawLine((actual*2)+30,y,(actual*2)+30,y+10);
            drawArrow(g,(actual*2)+30,y+10,(x*2)+30,y+10,5,30);
            dibCad(""+x,(x*2)+30,y+5,10,g);
            actual=x;
            y+=20;
        }
    }
    
    
    public void dibCad(String cad,int posx, int posy,int tam, Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.setFont(new Font("Arial", Font.ITALIC, tam));
        g2.drawString(cad, posx, posy);
    }
    
    public void dibujarFlecha(Graphics g,int x1,int y1,int x2,int y2){
         g.setColor(Color.BLACK);
        drawArrow(g,x1,y1,x2,y2,15,30);
    }
    
    public void drawArrow(Graphics g, int x0, int y0, int x1,int y1, int headLength, int headAngle) {
        double offs = headAngle * Math.PI / 180.0;
        double angle = Math.atan2(y0 - y1, x0 - x1);
        int[] xs = { x1 + (int) (headLength * Math.cos(angle + offs)), x1,
                x1 + (int) (headLength * Math.cos(angle - offs)) };
        int[] ys = { y1 + (int) (headLength * Math.sin(angle + offs)), y1,
                y1 + (int) (headLength * Math.sin(angle - offs)) };
        g.drawLine(x0, y0, x1, y1);
        g.drawPolyline(xs, ys, 3);
    }
}
