/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicio02variables;

/**
 *
 * @author santa
 */
public class Orden_Compra extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio02_01
     */
    public Orden_Compra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        clienteLabel = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        productoLabel = new javax.swing.JLabel();
        productoTxt01 = new javax.swing.JTextField();
        productoTxt02 = new javax.swing.JTextField();
        productoTxt03 = new javax.swing.JTextField();
        jValorUnitario = new javax.swing.JLabel();
        valorUnitario01 = new javax.swing.JTextField();
        valorUnitario02 = new javax.swing.JTextField();
        valorUnitario03 = new javax.swing.JTextField();
        cantidadLabel = new javax.swing.JLabel();
        cantidad01 = new javax.swing.JTextField();
        cantidad02 = new javax.swing.JTextField();
        cantidad03 = new javax.swing.JTextField();
        valorTotalLabel01 = new javax.swing.JLabel();
        valorTotal01 = new javax.swing.JTextField();
        valorTotal02 = new javax.swing.JTextField();
        valorTotal03 = new javax.swing.JTextField();
        ValorTotal = new javax.swing.JLabel();
        totalGeneral = new javax.swing.JTextField();
        jLogo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        mostraValor1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        tituloLabel.setText("ORDEN DE COMPRA");
        tituloLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clienteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clienteLabel.setText("Cliente: ");
        clienteLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clienteLabel.setMaximumSize(new java.awt.Dimension(165, 25));
        clienteLabel.setMinimumSize(new java.awt.Dimension(165, 25));
        clienteLabel.setPreferredSize(new java.awt.Dimension(165, 25));

        cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        cliente.setMaximumSize(new java.awt.Dimension(165, 25));
        cliente.setMinimumSize(new java.awt.Dimension(165, 25));
        cliente.setPreferredSize(new java.awt.Dimension(165, 25));

        productoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productoLabel.setText("Producto");
        productoLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productoLabel.setMaximumSize(new java.awt.Dimension(165, 25));
        productoLabel.setMinimumSize(new java.awt.Dimension(165, 25));
        productoLabel.setPreferredSize(new java.awt.Dimension(165, 25));

        productoTxt01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        productoTxt01.setMaximumSize(new java.awt.Dimension(165, 25));
        productoTxt01.setMinimumSize(new java.awt.Dimension(165, 25));
        productoTxt01.setPreferredSize(new java.awt.Dimension(165, 25));
        productoTxt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoTxt01ActionPerformed(evt);
            }
        });

        productoTxt02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        productoTxt02.setMaximumSize(new java.awt.Dimension(165, 25));
        productoTxt02.setMinimumSize(new java.awt.Dimension(165, 25));
        productoTxt02.setPreferredSize(new java.awt.Dimension(165, 25));

        productoTxt03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        productoTxt03.setMaximumSize(new java.awt.Dimension(165, 25));
        productoTxt03.setMinimumSize(new java.awt.Dimension(165, 25));
        productoTxt03.setPreferredSize(new java.awt.Dimension(165, 25));

        jValorUnitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jValorUnitario.setText("Valor Unitario");
        jValorUnitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jValorUnitario.setMaximumSize(new java.awt.Dimension(140, 25));
        jValorUnitario.setMinimumSize(new java.awt.Dimension(140, 25));
        jValorUnitario.setPreferredSize(new java.awt.Dimension(140, 25));

        valorUnitario01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        valorUnitario01.setMaximumSize(new java.awt.Dimension(140, 25));
        valorUnitario01.setMinimumSize(new java.awt.Dimension(140, 25));
        valorUnitario01.setPreferredSize(new java.awt.Dimension(140, 25));
        valorUnitario01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorUnitario01ActionPerformed(evt);
            }
        });

        valorUnitario02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        valorUnitario02.setMaximumSize(new java.awt.Dimension(140, 25));
        valorUnitario02.setMinimumSize(new java.awt.Dimension(140, 25));
        valorUnitario02.setPreferredSize(new java.awt.Dimension(140, 25));

        valorUnitario03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        valorUnitario03.setMaximumSize(new java.awt.Dimension(140, 25));
        valorUnitario03.setMinimumSize(new java.awt.Dimension(140, 25));
        valorUnitario03.setPreferredSize(new java.awt.Dimension(140, 25));

        cantidadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadLabel.setText("Cantidad");
        cantidadLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cantidadLabel.setMaximumSize(new java.awt.Dimension(140, 25));
        cantidadLabel.setMinimumSize(new java.awt.Dimension(140, 25));
        cantidadLabel.setPreferredSize(new java.awt.Dimension(140, 25));

        cantidad01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        cantidad01.setMaximumSize(new java.awt.Dimension(140, 25));
        cantidad01.setMinimumSize(new java.awt.Dimension(140, 25));
        cantidad01.setPreferredSize(new java.awt.Dimension(140, 25));
        cantidad01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad01ActionPerformed(evt);
            }
        });

        cantidad02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        cantidad02.setMaximumSize(new java.awt.Dimension(140, 25));
        cantidad02.setMinimumSize(new java.awt.Dimension(140, 25));
        cantidad02.setPreferredSize(new java.awt.Dimension(140, 25));

        cantidad03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        cantidad03.setMaximumSize(new java.awt.Dimension(140, 25));
        cantidad03.setMinimumSize(new java.awt.Dimension(140, 25));
        cantidad03.setPreferredSize(new java.awt.Dimension(140, 25));

        valorTotalLabel01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorTotalLabel01.setText("Valor total");
        valorTotalLabel01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        valorTotalLabel01.setMaximumSize(new java.awt.Dimension(140, 25));
        valorTotalLabel01.setMinimumSize(new java.awt.Dimension(140, 25));
        valorTotalLabel01.setPreferredSize(new java.awt.Dimension(140, 25));

        valorTotal01.setEditable(false);
        valorTotal01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        valorTotal01.setMaximumSize(new java.awt.Dimension(140, 25));
        valorTotal01.setMinimumSize(new java.awt.Dimension(140, 25));
        valorTotal01.setPreferredSize(new java.awt.Dimension(140, 25));
        valorTotal01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTotal01ActionPerformed(evt);
            }
        });

        valorTotal02.setEditable(false);
        valorTotal02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        valorTotal02.setMaximumSize(new java.awt.Dimension(140, 25));
        valorTotal02.setMinimumSize(new java.awt.Dimension(140, 25));
        valorTotal02.setPreferredSize(new java.awt.Dimension(140, 25));

        valorTotal03.setEditable(false);
        valorTotal03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        valorTotal03.setMaximumSize(new java.awt.Dimension(140, 25));
        valorTotal03.setMinimumSize(new java.awt.Dimension(140, 25));
        valorTotal03.setPreferredSize(new java.awt.Dimension(140, 25));
        valorTotal03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTotal03ActionPerformed(evt);
            }
        });

        ValorTotal.setText("Valor total");
        ValorTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ValorTotal.setMaximumSize(new java.awt.Dimension(140, 25));
        ValorTotal.setMinimumSize(new java.awt.Dimension(140, 25));
        ValorTotal.setPreferredSize(new java.awt.Dimension(140, 25));

        totalGeneral.setEditable(false);
        totalGeneral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        totalGeneral.setMaximumSize(new java.awt.Dimension(140, 25));
        totalGeneral.setMinimumSize(new java.awt.Dimension(140, 25));
        totalGeneral.setPreferredSize(new java.awt.Dimension(140, 25));

        jLogo.setIcon(new javax.swing.ImageIcon("D:\\Pablo\\OneDrive\\Im??genes\\Logo.jpg")); // NOI18N
        jLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setMaximumSize(new java.awt.Dimension(75, 25));
        btnCalcular.setMinimumSize(new java.awt.Dimension(75, 25));
        btnCalcular.setPreferredSize(new java.awt.Dimension(75, 25));
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        mostraValor1.setBackground(java.awt.SystemColor.control);
        mostraValor1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostraValor1)
                        .addGap(67, 67, 67)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productoTxt02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productoTxt03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productoTxt01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jValorUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorUnitario02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorUnitario03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorUnitario01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cantidad02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(cantidad01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(cantidadLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidad03, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(valorTotal02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(valorTotal01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(valorTotalLabel01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorTotal03, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(clienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tituloLabel)
                                .addGap(0, 118, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productoTxt01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorUnitario02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productoTxt02, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorUnitario03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productoTxt03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorUnitario01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cantidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidad01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valorTotalLabel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorTotal01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cantidad02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidad03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(valorTotal02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valorTotal03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(mostraValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoTxt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoTxt01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoTxt01ActionPerformed

    private void valorUnitario01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorUnitario01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUnitario01ActionPerformed

    private void cantidad01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad01ActionPerformed

    private void valorTotal01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotal01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTotal01ActionPerformed

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
        //Creamos las variables a usar
        int Num01, Num02, Num03, Num04, Num05, Num06, Total1, Total2, Total3, Total4;
        //parseamos los textos a numeros
        Num01 = Integer.parseInt(valorUnitario01.getText());
        Num02 = Integer.parseInt(valorUnitario02.getText());
        Num03 = Integer.parseInt(valorUnitario03.getText());
        Num04 = Integer.parseInt(cantidad01.getText());
        Num05 = Integer.parseInt(cantidad02.getText());
        Num06 = Integer.parseInt(cantidad03.getText());

        //Operaciones
        Total1 = Num01 * Num04;
        Total2 = Num02 * Num05;
        Total3 = Num03 * Num06;
        Total4 = Total1 + Total2 + Total3;

        //mostrar valores
        valorTotal01.setText(String.valueOf(Total1));
        valorTotal02.setText(String.valueOf(Total2));
        valorTotal03.setText(String.valueOf(Total3));
        totalGeneral.setText(String.valueOf(Total4));
        mostraValor1.setText(("Estimado cliente: " + cliente.getText() + ",") + " el valor de compra fue de $"
                + (totalGeneral.getText()));
    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void valorTotal03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotal03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTotal03ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Orden_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orden_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orden_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orden_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orden_Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValorTotal;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField cantidad01;
    private javax.swing.JTextField cantidad02;
    private javax.swing.JTextField cantidad03;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JTextField cliente;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JLabel jLogo;
    private javax.swing.JLabel jValorUnitario;
    private javax.swing.JTextField mostraValor1;
    private javax.swing.JLabel productoLabel;
    private javax.swing.JTextField productoTxt01;
    private javax.swing.JTextField productoTxt02;
    private javax.swing.JTextField productoTxt03;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField totalGeneral;
    private javax.swing.JTextField valorTotal01;
    private javax.swing.JTextField valorTotal02;
    private javax.swing.JTextField valorTotal03;
    private javax.swing.JLabel valorTotalLabel01;
    private javax.swing.JTextField valorUnitario01;
    private javax.swing.JTextField valorUnitario02;
    private javax.swing.JTextField valorUnitario03;
    // End of variables declaration//GEN-END:variables
}
