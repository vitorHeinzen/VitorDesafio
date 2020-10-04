/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }
     //Variaveis utilizadas para preenchimento a tabela
       int minimoTemporada = 1001, maximoTemporada = 0, quebraMin = -1, quebraMax = -1, pontTotal = 0;
       int jogo = 1;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbJogo = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtPlacar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbMaiorPont = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMenorPont = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbQuebraMax = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbQuebraMin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbPontTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbJogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogo", "Placar", "Mínimo da temporada", "Máximo da temporada", "Quebra recorde min.", "Quebra recode max."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbJogo);

        btnAdd.setText("Adicionar novo jogo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Placar do Jogo");

        jLabel2.setText("Maior Pontuação:");

        lbMaiorPont.setText("0");

        jLabel3.setText("Menor Pontução:");

        lbMenorPont.setText("0");

        jLabel4.setText("Quebras de recordes máximo:");

        lbQuebraMax.setText("0");

        jLabel5.setText("Quebras de recordes mínimo:");

        lbQuebraMin.setText("0");

        jLabel6.setText("Pontuação Total:");

        lbPontTotal.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbPontTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbMaiorPont)))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbMenorPont)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbQuebraMax)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbQuebraMin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(txtPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbMaiorPont)
                    .addComponent(jLabel3)
                    .addComponent(lbMenorPont)
                    .addComponent(jLabel4)
                    .addComponent(lbQuebraMax)
                    .addComponent(jLabel5)
                    .addComponent(lbQuebraMin))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbPontTotal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       //Busca Modelo da Tabela Principal
        DefaultTableModel dtmJogo = (DefaultTableModel) tbJogo.getModel();
       //Verificação se o placar maximo da temporada é maior que o placar do ultimo jogo
        if ( Integer.parseInt(txtPlacar.getText()) > maximoTemporada) {
           //se o valor for menor ele recebe o valor do ultimo jogo
            maximoTemporada = Integer.parseInt(txtPlacar.getText());
           //se o placar maximo da temporada for menor que o placar do ultimo jogo é adicionado uma quebra de recorde maximo 
            quebraMax = quebraMax + 1;
            
        }
        //Verificação se o placar minimo da temporada é menor que o placar do ultimo jogo
        if ( Integer.parseInt(txtPlacar.getText()) < minimoTemporada) {
            //se o valor for maior ele recebe o valor do ultimo jogo
            minimoTemporada = Integer.parseInt(txtPlacar.getText());
            //se o placar minimo da temporada for maior que o placar do ultimo jogo é adicionado uma quebra de recorde minimo 
            quebraMin = quebraMin + 1;
        }
       //Array que recebe os dados pra serem inseridos na tabela 
       Object[] dados = {jogo, txtPlacar.getText(), minimoTemporada, maximoTemporada, quebraMin, quebraMax};
       //insere os dados na tabela
       dtmJogo.addRow(dados);
       //variavel soma o valor dos placares de todos os jogos
       pontTotal = pontTotal + Integer.parseInt(txtPlacar.getText());
       //varivel para contagem dos jogos, cada vez que os dados são inseridso na tabela ele recebe mais 1 
       jogo = jogo + 1;
       //zera o valor do campo de texto
       txtPlacar.setText("");
       //label recebe a maior pontuacao da temporada
       lbMaiorPont.setText(Integer.toString(maximoTemporada));
       //label recebe a menor pontuacao da temporada
       lbMenorPont.setText(Integer.toString(minimoTemporada));
       //label recebe a quantidade de quebra de recorde maximo 
       lbQuebraMax.setText(Integer.toString(quebraMax));
       //label recebe a quantidade de quebra de recorde minimo 
       lbQuebraMin.setText(Integer.toString(quebraMin));
       //label recebe a variavel de pontuaçao total
       lbPontTotal.setText(Integer.toString(pontTotal));
       
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMaiorPont;
    private javax.swing.JLabel lbMenorPont;
    private javax.swing.JLabel lbPontTotal;
    private javax.swing.JLabel lbQuebraMax;
    private javax.swing.JLabel lbQuebraMin;
    private javax.swing.JTable tbJogo;
    private javax.swing.JTextField txtPlacar;
    // End of variables declaration//GEN-END:variables
}
