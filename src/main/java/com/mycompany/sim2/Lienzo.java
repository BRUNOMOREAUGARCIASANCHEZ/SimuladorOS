package com.mycompany.sim2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class Lienzo extends Canvas{
    //private Particiones parts[];
    public ArrayList<archivo> hd;
    public ArrayList<bloque> bloques;
    
    public void Dibujar(){
        setBackground(Color.WHITE);
        setSize(520,600);
        
    }
    
    public void setMemoria(){  //MAX 80
        String mS=JOptionPane.showInputDialog("Ingrese el total de memoria");
        int m=Integer.parseInt(mS);
        this.bloques=new ArrayList<bloque>();
        
        
        for(int i=0;i<m;i++)
            bloques.add(new bloque(i));
            
        bloques.get(0).setOcupado(true);    //BLOQUE DEL SO
        
        this.hd=new ArrayList<archivo>();
    }
    
    @Override
    public void paint(Graphics g){
        //g.setColor(Color.ORANGE);
        //g.setColor(new Color(0,180,0));
        //INICIO(X,Y), FIN(X,Y), HEAD SIZE,ANGLE
        //drawArrow(g,60,70,170,170,20,30);
        //dibujarFlecha(g,bloques.get(32),bloques.get(15));
        g.setColor(Color.BLACK);
        g.drawOval(50, 10, 420, 50);
        g.drawLine(50, 35, 50, 530);
        g.drawLine(470, 35, 470, 530);
        //g.drawLine(50, 550, 470, 550);
        
        g.drawArc(50, 510, 420, 50, 180, 180);
        //DIB MEMORIA
        int x=70,y=80;
        for(int i=0;i<bloques.size();i++){
            g.drawRect(x, y, 30, 30);   //RECTANGULOS DE 30x30
            dibCad(" "+i,x+10,y+15,10,g);       //SE REINICIA EL COLOR A NEGRO
            x+=50;
            if((i+1)%8==0){
                y+=50;
                x=70;
            }
            
        }
        g.setColor(Color.BLUE);
        x=70;
        y=80;
        //DIBUJAR BLOQUES OCUPADOS
        for(archivo a:hd){
        
        }
        
        bloque b;
        for(int i=0;i<bloques.size();i++){
            b=bloques.get(i);
            g.setColor(Color.CYAN);
            
            //g.setColor(new Color(230,0,46));
            //g.drawRect(x, y, 30, 30);   //RECTANGULOS DE 30x30
            if(b.isOcupado()){
                g.setColor(new Color(b.r,b.g,b.b));
                g.fillRect(x, y, 30, 30);
                //SI EL BLOQUE NO FUE ASIGNADO DE FORMA CONTIGUA
                if(!b.enlace.isEmpty()){
                    //SI EL BLOQUE TIENE MAS DE UN ENLACE (INDICES)
                    if(b.enlace.size()>1){
                        //FLECHA ?
                        
                        
                    }else{  //SI EL BLOQUE TIENE UN SOLO ENLACE (LISTA)
                        //ETIQUETA
                        dibCad("sig>"+bloques.get(i).enlace.get(0).No+" ",x,y+25,10,g);
                        
                    }
                }else{
                    //g.fillRect(x, y, 30, 30);
                }
                dibCad(" "+i,x+10,y+15,10,g);       //SE REINICIA EL COLOR A NEGRO

            }
            x+=50;
            if((i+1)%8==0){
                y+=50;
                x=70;
            }
            
        }
        
        for(archivo a:hd){
            System.out.println(a.getTipoAsignacion()+" ");
            if(a.getTipoAsignacion()==3){
                b=a.getPrimerBloque();
                System.out.println(b.getEnlace().size()+" ");
                for(bloque v:b.getEnlace()){
                    //drawArrow(g,80,80,170,170,20,30);
                    dibujarFlecha(g,b,v);
                }
            }
        }
        //g.fillRect(10, 10, 20, 20);
        //dibCad("CADENA",150,150,20,g);
    }
    
    
    public void dibCad(String cad,int posx, int posy,int tam, Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.setFont(new Font("Arial", Font.ITALIC, tam));
        g2.drawString(cad, posx, posy);
    }

    public void agregarArchivo(String nombre, int tipoAsignacion, int tam, int primerBloque){
       hd.add(new archivo(nombre,tipoAsignacion,tam,bloques.get(primerBloque)));
    }
    
    public void dibujarFlecha(Graphics g, bloque inicio,bloque fin){
        int x1,x2,y1,y2;
        int b1,b2;
         g.setColor(Color.BLACK);
        b1=inicio.No;
        b2=fin.No;
        x1=(b1%8)*50+70+15;
        y1=((int)b1/8)*50+80+15;
        x2=(b2%8)*50+70+15;
        y2=((int)b2/8)*50+80+15;
        
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
