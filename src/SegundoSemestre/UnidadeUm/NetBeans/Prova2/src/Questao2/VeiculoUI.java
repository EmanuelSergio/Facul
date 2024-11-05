/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Questao2;

import Questao1.Categoria;
import Questao1.Veiculo;

/**
 *
 * @author esgirardi
 */
public class VeiculoUI extends javax.swing.JFrame {

    Veiculo veiculo = new Veiculo();
   // Categoria categoria;
    
    /**
     * Creates new form Veiculo
     */
    public VeiculoUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        entradaPlacaVeiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entradaKmVeiculo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entradaValorDiariaVeiculo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entradaCategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        gerarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículo"));

        jLabel2.setText("Placa:");

        jLabel3.setText("KM:");

        jLabel4.setText("Valor diária:");

        jLabel5.setText("Categoria:");

        entradaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("OFF_ROAD, FURGAO, HATCH, HATCH_PREMIUM, SEDAN, SEDAN_PREMIUM, SUV, SUV_HIBRIDO, VAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(entradaCategoria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(entradaKmVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addComponent(entradaPlacaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(15, 15, 15)
                            .addComponent(entradaValorDiariaVeiculo)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(entradaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(entradaPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(entradaKmVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(entradaValorDiariaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        gerarRelatorio.setText("Gerar relatório");
        gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Confirmar)
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gerarRelatorio)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar)
                    .addComponent(Cancelar)
                    .addComponent(gerarRelatorio))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioActionPerformed
        
        RelatorioVeiculo relatorioVeiculo = new RelatorioVeiculo();
        relatorioVeiculo.setVisible(true);
        
        veiculo.setPlaca(entradaPlacaVeiculo.getText());
        veiculo.setKm(Integer.parseInt(entradaKmVeiculo.getText()));
        veiculo.setPrecoDiaria(Double.parseDouble(entradaValorDiariaVeiculo.getText()));
        
        if(entradaCategoria.getText().equalsIgnoreCase("van")){
            veiculo.setCategoria(Categoria.VAN);
        }else if(entradaCategoria.getText().equalsIgnoreCase("off_road")){
            veiculo.setCategoria(Categoria.OFF_ROAD);
        }else if(entradaCategoria.getText().equalsIgnoreCase("furgao")){
            veiculo.setCategoria(Categoria.FURGAO);
        }else if(entradaCategoria.getText().equalsIgnoreCase("hatch")){
            veiculo.setCategoria(Categoria.HATCH);
        }else if(entradaCategoria.getText().equalsIgnoreCase("hatch_premium")){
            veiculo.setCategoria(Categoria.HATCH_PREMIUM);
        }else if(entradaCategoria.getText().equalsIgnoreCase("sedan")){
            veiculo.setCategoria(Categoria.SEDAN);
        }else if(entradaCategoria.getText().equalsIgnoreCase("sedan_premium")){
            veiculo.setCategoria(Categoria.SEDAN_PREMIUM);
        }else if(entradaCategoria.getText().equalsIgnoreCase("suv")){
            veiculo.setCategoria(Categoria.SUV);
        }else if(entradaCategoria.getText().equalsIgnoreCase("suv_hibrido")){
            veiculo.setCategoria(Categoria.SUV_HIBRIDO);
        }
        
        relatorioVeiculo.criarRelatorio(veiculo);
        
    }//GEN-LAST:event_gerarRelatorioActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        veiculo.setPlaca(entradaPlacaVeiculo.getText());
        veiculo.setKm(Integer.parseInt(entradaKmVeiculo.getText()));
        veiculo.setPrecoDiaria(Double.parseDouble(entradaValorDiariaVeiculo.getText()));
        
        if(entradaCategoria.getText().equalsIgnoreCase("van")){
            veiculo.setCategoria(Categoria.VAN);
        }else if(entradaCategoria.getText().equalsIgnoreCase("off_road")){
            veiculo.setCategoria(Categoria.OFF_ROAD);
        }else if(entradaCategoria.getText().equalsIgnoreCase("furgao")){
            veiculo.setCategoria(Categoria.FURGAO);
        }else if(entradaCategoria.getText().equalsIgnoreCase("hatch")){
            veiculo.setCategoria(Categoria.HATCH);
        }else if(entradaCategoria.getText().equalsIgnoreCase("hatch_premium")){
            veiculo.setCategoria(Categoria.HATCH_PREMIUM);
        }else if(entradaCategoria.getText().equalsIgnoreCase("sedan")){
            veiculo.setCategoria(Categoria.SEDAN);
        }else if(entradaCategoria.getText().equalsIgnoreCase("sedan_premium")){
            veiculo.setCategoria(Categoria.SEDAN_PREMIUM);
        }else if(entradaCategoria.getText().equalsIgnoreCase("suv")){
            veiculo.setCategoria(Categoria.SUV);
        }else if(entradaCategoria.getText().equalsIgnoreCase("suv_hibrido")){
            veiculo.setCategoria(Categoria.SUV_HIBRIDO);
        }
        setVisible(false);
        
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void entradaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(VeiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField entradaCategoria;
    private javax.swing.JTextField entradaKmVeiculo;
    private javax.swing.JTextField entradaPlacaVeiculo;
    private javax.swing.JTextField entradaValorDiariaVeiculo;
    private javax.swing.JButton gerarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public Veiculo getVeiculo(){
        return veiculo;
    }

}
