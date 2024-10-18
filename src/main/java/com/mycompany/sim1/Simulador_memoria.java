/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sim1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.practicab.Form;
import com.mycompany.practicab.PracticaB;
import com.mycompany.sim2.FormSIM2;
import com.mycompany.sim3.FORM_SIM3;
import com.mycompany.proyecto_v01.PROYECTO_v01;

     
/**
 *
 * @author HP
 */
public class Simulador_memoria extends JFrame{
    private JMenu menu;
    private JMenuBar barramenu;
    private JMenuItem im1, im2, im3, im4,im5;
    private JPanel panelIzquierdo, panelSuperior, panelCentro;
    private JButton aceptar;
    private JLabel etiquetaMem = new JLabel("  Memoria Total:  ");
    private JLabel etiquetaProc = new JLabel("No. de Procesos:  ");
    private JLabel etiquetaPart = new JLabel("No. de Particiones:  ");
    private JLabel etiquetaInfo = new JLabel("   Informacion:       ");
    private JTextField campoMem = new JTextField("", 5);
    private JTextField campoProc = new JTextField("", 5);
    private JTextField campoPart = new JTextField("", 5);
    private Dibujar dibujo = new Dibujar();
    private JFrame ventana= new JFrame("Formulario");
    private int numProc, numPart,tamT,ban=0;

    public Simulador_memoria(){
        super();
        contruyePanelSuperior();
        contruyePanelIzquierdo();
        contruyeVentana();

    }

    public void contruyePanelSuperior(){
        panelSuperior = new JPanel();
        aceptar=new JButton("Aceptar");

        panelSuperior.add(etiquetaMem); panelSuperior.add(campoMem);
        panelSuperior.add(etiquetaProc); panelSuperior.add(campoProc);
        panelSuperior.add(etiquetaPart); panelSuperior.add(campoPart);
        
        aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (campoMem.getText().length()==0 ||
                        campoProc.getText().length()==0 ||
                        campoPart.getText().length()==0 ){
                    JOptionPane.showMessageDialog(ventana,
                            "Todos los campos son requeridos",
                            "ERROR",JOptionPane.ERROR_MESSAGE);
                }else{
                    try{
                        tamT=Integer.parseInt(campoMem.getText());
                        numProc=Integer.parseInt(campoProc.getText());
                        numPart=Integer.parseInt(campoPart.getText());
                        if(tamT<0 || numProc<0 || numPart<0){
                            JOptionPane.showMessageDialog(ventana,
                                    "Ingrese numeros positivos",
                                    "ERROR",JOptionPane.ERROR_MESSAGE);
                        }else{
                            dibujo.particionar(numPart,tamT);
                            if(!dibujo.compara())
                                dibujo.agregarProc(numProc);
                        }
                    }catch(Exception e){ //tratamiento a errores
                        JOptionPane.showMessageDialog(ventana,
                                "Solo se aceptan numeros ",
                                "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }});

        panelSuperior.add(aceptar);
        panelSuperior.setBackground(Color.green);

    }

    public void contruyePanelIzquierdo(){
        panelIzquierdo = new JPanel();
        panelIzquierdo.add(etiquetaInfo);

        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo,BoxLayout.X_AXIS));
        panelIzquierdo.setBackground(Color.LIGHT_GRAY);
    }

    public void contruyeVentana(){
        JFrame frame = new JFrame();

        //Construimos el menu 
        //*******************************************************************************
        menu= new JMenu("Opciones");
        barramenu = new JMenuBar();
        setJMenuBar(barramenu);
        barramenu.add(menu);
        im1= new JMenuItem("MENU LRU/FIFO");
        im2= new JMenuItem("MENU ASIGNACION DISCO");
        im3= new JMenuItem("Salir");
        im4= new JMenuItem("Informacion...");
        im5= new JMenuItem("MENU ASIGNACION DE ARCHIVOS");
        im1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                Form lruMenu=new Form();
                lruMenu.setVisible(true);
                */
                PracticaB aux=new PracticaB();
                aux.interfaz.setVisible(true);
                frame.dispose();
                
            }
        });
        im2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FORM_SIM3 menu=new FORM_SIM3();
                menu.setVisible(true);
                frame.dispose();
            }
        });
        im3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
        im4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana," Sistemas Operativos 2" );
            }
        });
        im5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FormSIM2 lruMenu=new FormSIM2();
                lruMenu.setVisible(true);
                frame.dispose();
            }
        });
        menu.add(im1);
        menu.add(im5);
        menu.add(im2);
        menu.add(im4);
        menu.add(im3);

        //agregamos el menu
        frame.add(barramenu);

        //agregamos los paneles al frame principal
        frame.add(dibujo);
        frame.add(panelIzquierdo,BorderLayout.WEST);
        frame.add(panelSuperior,BorderLayout.NORTH);

        //Configuramos el frame
        pack();
        frame.setTitle("Simulador Particiones");
        frame.setSize(1000, 700);           // tamano a la ventana (ancho, alto)
        frame.setLocationRelativeTo(null);  // centrar la ventana en la pantalla
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    //public static void main(String[] args)
    public static void main(String[] args){
        Simulador_memoria simulador=new Simulador_memoria();
                 
    }

}
