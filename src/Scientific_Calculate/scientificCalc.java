/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scientific_Calculate;

/**
 *
 * @author user
 */
public class scientificCalc extends javax.swing.JFrame {
        double firstnum;
        double secondnum;
        double result;
        String operations;
        private Object math;
    /**
     * Creates new form scientificCalc
     */
    public scientificCalc() {
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

        jbtn2 = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jtxtDisplay = new javax.swing.JTextField();
        jbtn3 = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnSub = new javax.swing.JButton();
        jbtnPlusMinus = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnMult = new javax.swing.JButton();
        jbtn = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtnBackspace.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnBackspace.setText("←");
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnDiv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDiv.setText("/");
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtnSub.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnSub.setText("-");
        jbtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubActionPerformed(evt);
            }
        });

        jbtnPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPlusMinus.setText("±");
        jbtnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusMinusActionPerformed(evt);
            }
        });

        jbtnEquals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnEquals.setText("=");
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        jbtnMult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnMult.setText("*");
        jbtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultActionPerformed(evt);
            }
        });

        jbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn.setText("√");
        jbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnAdd.setText("+");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnBackspace)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnC)
                        .addComponent(jbtn)
                        .addComponent(jbtnAdd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn8)
                    .addComponent(jbtn9)
                    .addComponent(jbtnSub)
                    .addComponent(jbtn7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn5)
                    .addComponent(jbtn6)
                    .addComponent(jbtnMult)
                    .addComponent(jbtn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn2)
                    .addComponent(jbtn3)
                    .addComponent(jbtnDiv)
                    .addComponent(jbtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDot)
                    .addComponent(jbtnPlusMinus)
                    .addComponent(jbtnEquals)
                    .addComponent(jbtn0))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn2.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
        String bsp=null;

        if(jtxtDisplay.getText().length()>0)
        {
            StringBuilder strB=new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() -1);
            bsp=strB.toString();
            jtxtDisplay.setText(bsp);
        }
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn3.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("/");
    }//GEN-LAST:event_jbtnDivActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String iNum=jtxtDisplay.getText() + jbtn8.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn1.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn9.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        if(!jtxtDisplay.getText().contains("."))
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubActionPerformed
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("-");
    }//GEN-LAST:event_jbtnSubActionPerformed

    private void jbtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusMinusActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=ops *(-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnPlusMinusActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed
        String answer;
        secondnum=Double.parseDouble(jtxtDisplay.getText());
        if(operations=="+")
        {
            result=firstnum + secondnum;
            answer=String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations=="-")
        {
            result=firstnum - secondnum;
            answer=String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations=="*")
        {
            result=firstnum * secondnum;
            answer=String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations=="/")
        {
            result=firstnum / secondnum;
            answer=String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }    

    }//GEN-LAST:event_jbtnEqualsActionPerformed
    
    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn5.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn0.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn6.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultActionPerformed
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("*");
    }//GEN-LAST:event_jbtnMultActionPerformed

    private void jbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn4.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations=("+");
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(true);
        this.setSize(250, 420);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(true);
        this.setSize(438, 420);
        jtxtDisplay.setSize(438, 39);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String iNum=jtxtDisplay.getText()+ jbtn7.getText();
        jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn7ActionPerformed

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
            java.util.logging.Logger.getLogger(scientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scientificCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbtn;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMult;
    private javax.swing.JButton jbtnPlusMinus;
    private javax.swing.JButton jbtnSub;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables

   
}
