/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sim1;
import java.awt.*;
import javax.swing.*; 
import java.util.*;
/**
 *
 * @author HP
 */
public class ParticionFija extends javax.swing.JFrame{
    public int FIMA = 0;
public int FIPA = 0;
public int FIPE = 0;
    public ParticionFija() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Particiones Fijas");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(900, 670));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 370, 140, 60);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(222, 222, 232));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Proceso", "Tamaño (Kb)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 20, 290, 150);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(199, 211, 217));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "N° Partición", "Tamaño (Kb)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 20, 300, 150);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel1.setText("Particiones:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 30, 110, 25);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Procesos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 60, 101, 17);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSpinner1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(760, 30, 93, 22);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Ingresar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(690, 110, 130, 60);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(760, 60, 93, 22);

        jPanel3.setBackground(new java.awt.Color(88, 152, 152));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Peor Ajuste", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(255, 255, 204))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(199, 504));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(650, 190, 210, 310);

        jPanel1.setBackground(new java.awt.Color(233, 208, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Primer Ajuste", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14), new java.awt.Color(102, 0, 51))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(199, 504));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 190, 205, 310);
        jPanel1.getAccessibleContext().setAccessibleName("Primer ajuste.");

        jPanel2.setBackground(new java.awt.Color(153, 186, 89));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Mejor Ajuste", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(199, 504));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(420, 190, 205, 310);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.setActionCommand("Limpiar Todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 280, 140, 60);
        jButton3.getAccessibleContext().setAccessibleName("Limpiar Paneles");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 510, 200, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(430, 510, 190, 22);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(650, 510, 200, 22);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Procesos pendientes y FI:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 500, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int Nparticiones() {
        return Integer.parseInt(String.valueOf(jSpinner1.getValue()));

    }

    public int Nprocesos() {
        return Integer.parseInt(String.valueOf(jSpinner2.getValue()));
    }

    public void PrimerAjuste() {
        Vector<Integer> v_part = new Vector<Integer>();
        Vector<Integer> v_proc = new Vector<Integer>();
        for (int i = 1; i < Nparticiones(); i++) {
            v_part.add(Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 1))));
        }

        for (int j = 0; j < Nprocesos(); j++) {
            v_proc.add(Integer.parseInt(String.valueOf(jTable1.getValueAt(j, 1))));
        }

        int v = 0;
        int acum_y = 45;//posision y desde donde se ubicaran los procesos en las particiones
        for (int j = 0; j < v_part.size(); j++) {
            v = 0;
            for (int i = 0; i < v_proc.size(); i++) {
                if (v == 0) {
                    if (v_proc.get(i) < v_part.get(j) && !v_proc.get(i).equals(new Integer(0))) {
                        acum_y = 67 + 45 * (j);
                        InsertarProcesos("Proceso " + (i + 1) + ": " + v_proc.get(i) + "Kb", acum_y, false, jPanel1);
                        System.out.println(v);
                        v_part.set(j, new Integer(0));
                        v = 1;
                    } else if (v_proc.get(i) - v_part.get(j) == new Integer(0) && !v_proc.get(i).equals(new Integer(0))) {
                        acum_y = 67 + 45 * (j);
                        InsertarProcesos("Proceso " + (i + 1) + ": " + v_proc.get(i) + "Kb", acum_y, true, jPanel1);
                        System.out.println(v);
                        v_part.set(j, new Integer(0));
                        v = 1;
                        
                    }
                    if (v == 1) {
                        System.out.println(v);
                        v_proc.set(i, new Integer(0));
                    }
                }
            }
        }

//////////Verificando las particiones q no se ocuparon(q no son cero) y los procesos pendientes(q no spn cero)
      ProcPendientes_PartVacias(v_proc, v_part, jTextField1, jPanel1,FIPA);
//////////
    }

    public void MejorAjuste() {
        Vector<Integer> v_part = new Vector<Integer>();
        Vector<Integer> v_proc = new Vector<Integer>();
        Hashtable<Integer, Integer> resta = new Hashtable<Integer, Integer>();
        for (int i = 1; i < Nparticiones(); i++) {
            v_part.add(Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 1))));
        }
        for (int j = 0; j < Nprocesos(); j++) {
            v_proc.add(Integer.parseInt(String.valueOf(jTable1.getValueAt(j, 1))));
        }

        int pos = -1;
        int acum_y = 45;//posision y desde donde se ubicaran los procesos en las particiones
        for (int j = 0; j < v_proc.size(); j++) {
            for (int i = 0; i < v_part.size(); i++) {
                if (!v_part.get(i).equals(new Integer(0)) && !v_proc.get(j).equals(new Integer(0))) {
                    resta.put(i, v_part.get(i) - v_proc.get(j));//guardamos  la resta y el indice dela particion q' tiene el espacio mas pequeno disponible
                }

            }
            Enumeration<Integer> e = resta.keys();//guardamos en "e" los indice dela particion q' tiene el espacio mas pequeno disponible
            Integer min = new Integer(100000);
            while (e.hasMoreElements()) {
                Integer indice = e.nextElement();
                //no colocamos <= porque sera la primera particion espacio mas grande encontrada
                if (resta.get(indice) < min && resta.get(indice) >= new Integer(0)) {
                    min = resta.get(indice);
                    pos = indice;//posision toma el valor del indice dela particion q' tiene el pequeno disponible
                }
            }
            ///////////////enviando parametros
            if (!min.equals(new Integer(100000))) {
                acum_y = 67 + 45 * (pos);
                if (!min.equals(new Integer(0))) {
                    InsertarProcesos("Proceso " + (j + 1) + ": " + v_proc.get(j) + "Kb FI "+min, acum_y, false, jPanel2);
                    FIMA+=min;
                } else {
                    InsertarProcesos("Proceso " + (j + 1) + ": " + v_proc.get(j) + "Kb"+min, acum_y, true, jPanel2);
                    FIMA+=min;
                }
                v_proc.set(j, new Integer(0));
            }
            resta.clear();//limpiamos el vestor resta
            if (pos != -1) {
                v_part.set(pos, new Integer(0));
            }
        }
        //////////Verificando las particiones q no se ocuparon(q no son cero) y los procesos pendientes
       ProcPendientes_PartVacias(v_proc, v_part, jTextField2, jPanel2,FIMA);
//////////
    }

    public void PeorAjuste() {
        Vector<Integer> v_part = new Vector<Integer>();
        Vector<Integer> v_proc = new Vector<Integer>();
        Hashtable<Integer, Integer> resta = new Hashtable<Integer, Integer>();


        for (int i = 1; i < Nparticiones(); i++) {
            
            v_part.add(Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 1))));
            
            
        }
        for (int j = 0; j < Nprocesos(); j++) {
            v_proc.add(Integer.parseInt(String.valueOf(jTable1.getValueAt(j, 1))));
        }
        int pos = -1;
        int acum_y = 45;//posision y desde donde se ubicaran los procesos en las particiones

        for (int j = 0; j < v_proc.size(); j++) {
            for (int i = 0; i < v_part.size(); i++) {
                if (!v_part.get(i).equals(new Integer(0)) && !v_proc.get(j).equals(new Integer(0))) {
                    resta.put(i, v_part.get(i) - v_proc.get(j));//guardamos  la resta y el indice dela particion q' tiene el espacio mas pequeño suficiente
                    //System.out.println(resta.put(i,j));
                }

            }
            Enumeration<Integer> e = resta.keys();//guardamos en "e" los indice dela particion q' tiene el espacio mas pequeño suficiente
            Integer max = new Integer(-1);
            while (e.hasMoreElements()) {
                Integer indice = e.nextElement();
                if (resta.get(indice) >= max && resta.get(indice) >= new Integer(0)) {
                    max = resta.get(indice);
                    pos = indice;//posision toma el valor del indice dela particion q' tiene el espacio mas grande suficiente
                   
                }
               //System.out.println(pos); 
            }
            
            ///////////////enviando parametros
            if (!max.equals(new Integer(-1))) {
                acum_y = 67 + 45 * (pos);
                if (!max.equals(new Integer(0))) {
                    InsertarProcesos("P" + (j + 1) + ": " + v_proc.get(j) + "Kb\n FI "+ max, acum_y, false, jPanel3);
                    FIPE+=max;
                } else {
                    InsertarProcesos("P" + (j + 1) + ": " + v_proc.get(j) + "Kb\n FI "+max, acum_y, true, jPanel3);
                     //System.out.println(max+" "+(j+1));

                }
                v_proc.set(j, new Integer(0));
            }
            
            resta.clear();//limpiamos el vestor resta
            if (pos != -1) {
                v_part.set(pos, new Integer(0));
            }
        }
        //////////Verificando las particiones q no se ocuparon(q no son cero) y los procesos pendientes
       ProcPendientes_PartVacias(v_proc, v_part, jTextField3, jPanel3, FIPE);
       System.out.println(FIPE);
        //for (int i = 0; i < Nparticiones(); i++) {    
          //  System.out.println(v_part.get(i));          
            
        //}
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setRowSelectionInterval(Nprocesos(), Nprocesos());
        jTable2.setRowSelectionInterval(Nparticiones(), Nparticiones());
        InsertarParticiones(35, 0, jPanel1);
        PrimerAjuste();
        InsertarParticiones(35, 0, jPanel2);
        MejorAjuste();
        InsertarParticiones(35, 0, jPanel3);
        PeorAjuste();
        jButton1.setEnabled(false);
        jButton3.setEnabled(true);
    }

    public void InsertarParticiones(int x, int y, JPanel jPanel) {
        int total;
        total = 0;
        for (int i = 0; i < Nparticiones(); i++) {
            y = y + 45;
            JTextField txt;
            JLabel lbl;
            JSeparator separador;
            txt = new JTextField();
            lbl = new JLabel();
            separador = new JSeparator();
            separador.setSize(105 + 10, 2);
            lbl.setSize(30, 10);
            if (i == 0) {//Particion del S.O
                txt.setBackground(Color.lightGray);
                txt.setSize(105, 43 - 25);
                separador.setLocation(x, y);
                txt.setLocation(x, y + 2);
                txt.setText("             S.O");
                lbl.setLocation(x + 105, y + 45 - 25 + 2);
                y = y - 25;
            } else {
                separador.setLocation(x, y);
                lbl.setLocation(x + 105, y + 45 + 2);
            }
            jPanel.add(separador);
            jPanel.add(lbl);
            jPanel.add(txt);
            separador.setBackground(Color.black);
            total = total + Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 1)));
            lbl.setText(String.valueOf(total));

        }
}//GEN-LAST:event_jButton1ActionPerformed
    public void InsertarProcesos(String proceso, int acum_y, boolean igual_o_menor, JPanel jPanel) {
        int x = 35;
        JTextField txtp, txt;
        txtp = new JTextField();
        txt = new JTextField();
        if (igual_o_menor == true) {
            txtp.setSize(105, 43);
        } else {
            txtp.setSize(105, 30);
            txt.setSize(105, 43 - 30);
            txt.setLocation(x, acum_y + 30);
        }
        txtp.setText(proceso);
        txtp.setLocation(x, acum_y);
        jPanel.add(txtp);
        jPanel.add(txt);
        txtp.setEditable(false);
        txt.setEditable(false);

    }

    void ProcPendientes_PartVacias(Vector<Integer> v_proc, Vector<Integer> v_part, JTextField jText, JPanel jPanel,int FIT) {
        int suma = 0, i = 1;
        int acum_y = 45;
        String texto = " ";
        for (Integer p : v_proc) {//for each
            if (!p.equals(new Integer(0))) {
                texto = texto + "P" + String.valueOf(i) + " + ";
                suma += p;
            }
            i += 1;
        }
        jText.setText(texto.substring(1, texto.length() - 2) + " = " + suma + " Kb --- FI TOTAL "+FIT);
        i = 0;
        for (Integer par : v_part) {//for each
            if (!par.equals(new Integer(0))) {
                acum_y = 67 + 45 * (i);
                InsertarProcesos("", acum_y, true, jPanel);
            }
            i += 1;
        }
    }
    private void jSpinner1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorAdded
    }//GEN-LAST:event_jSpinner1AncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Nparticiones() <= 0 || Nprocesos() <= 0) {
            JOptionPane.showMessageDialog(null, "Ingresar Procesos y Particiones", "Alerta", 1);
            return;
        }
        jTable1.setEnabled(true);
        jTable2.setEnabled(true);
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            jTable2.setValueAt(null, i, 0);
            jTable2.setValueAt(null, i, 1);
        }
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            jTable1.setValueAt(null, i, 0);
            jTable1.setValueAt(null, i, 1);
        }
        jButton1.setEnabled(true);
        insertartabla(jTable1, jTable2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jPanel1.removeAll();
        jPanel2.removeAll();
        jPanel3.removeAll();
        clear();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        //jTable1.removeAll();
        //jTable2.removeAll();
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
        jTable1.setEnabled(false);
        jTable2.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    private void insertartabla(JTable tabla1, JTable tabla2) {
        tabla2.setValueAt("Tamaño S.O", 0, 0);
        for (int i = 1; i < Nparticiones(); i++) {
            tabla2.setValueAt("Partición " + (i), i, 0);
        }
        for (int i = 0; i < Nprocesos(); i++) {
            tabla1.setValueAt("Proceso " + (i + 1), i, 0);
        }
    }

    public void clear() {
        if (jPanel1 != null) {
            Graphics gr = jPanel1.getGraphics();

            this.repaint();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
