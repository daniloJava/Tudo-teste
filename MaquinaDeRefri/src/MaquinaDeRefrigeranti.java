
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAn Dan
 */
public class MaquinaDeRefrigeranti extends javax.swing.JFrame {
     RegistroDeVenda compra = new RegistroDeVenda();
    /**
     * Creates new form MaquinaDeRefrigeranti
     */
    public MaquinaDeRefrigeranti() {
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

        redbull = new java.awt.Button();
        Pepis = new java.awt.Button();
        conveção = new java.awt.Button();
        agua = new java.awt.Button();
        CocaCola = new java.awt.Button();
        doly = new java.awt.Button();
        comprar = new javax.swing.JButton();
        label2 = new java.awt.Label();
        valorDinheiro1 = new java.awt.Label();
        dinheiro = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        redbull.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        redbull.setLabel("RedBull");
        redbull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redbullActionPerformed(evt);
            }
        });

        Pepis.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Pepis.setLabel("Peps");
        Pepis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepisActionPerformed(evt);
            }
        });

        conveção.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        conveção.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        conveção.setLabel("Convenção");
        conveção.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conveçãoActionPerformed(evt);
            }
        });

        agua.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        agua.setLabel("Água");
        agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguaActionPerformed(evt);
            }
        });

        CocaCola.setActionCommand("CocaCola");
        CocaCola.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CocaCola.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        CocaCola.setLabel("CocaCola");
        CocaCola.setName("CocaCola"); // NOI18N
        CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocaColaActionPerformed(evt);
            }
        });

        doly.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        doly.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        doly.setLabel("Dolly");
        doly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dolyActionPerformed(evt);
            }
        });

        comprar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        label2.setText("Maquina");

        valorDinheiro1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        valorDinheiro1.setText("Valor:");

        dinheiro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valorDinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CocaCola, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(doly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redbull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conveção, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pepis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pepis, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(CocaCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agua, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doly, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redbull, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conveção, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valorDinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        doly.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaActionPerformed
       
        String mensagem = compra.setOpcaoDeEscolha(0);
        JOptionPane.showMessageDialog(null, mensagem);
        
    }//GEN-LAST:event_CocaColaActionPerformed

    private void PepisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepisActionPerformed
       
        String mensagem = compra.setOpcaoDeEscolha(1);
        JOptionPane.showMessageDialog(null, mensagem); // TODO add your handling code here:
    }//GEN-LAST:event_PepisActionPerformed

    private void dolyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dolyActionPerformed
       
        String mensagem = compra.setOpcaoDeEscolha(2);
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_dolyActionPerformed

    private void aguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguaActionPerformed
        
        String mensagem = compra.setOpcaoDeEscolha(3);
        JOptionPane.showMessageDialog(null, mensagem);        // TODO add your handling code here:
    }//GEN-LAST:event_aguaActionPerformed

    private void redbullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redbullActionPerformed
        
        String mensagem = compra.setOpcaoDeEscolha(4);
        JOptionPane.showMessageDialog(null, mensagem);// TODO add your handling code here:
    }//GEN-LAST:event_redbullActionPerformed

    private void conveçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conveçãoActionPerformed
        
        String mensagem = compra.setOpcaoDeEscolha(5);
        JOptionPane.showMessageDialog(null, mensagem);// TODO add your handling code here:
    }//GEN-LAST:event_conveçãoActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        String input = JOptionPane.showInputDialog(null, "Coleque moedas");
        String inputValor = dinheiro.getName();
       
        
        double valorInserido = Double.parseDouble(inputValor);
        double valorComp = Double.parseDouble(input);
        compra.setInserirMaisValor(valorComp);
        
        double resultado = valorComp + valorInserido;
        String resul = String.valueOf(resultado);
        dinheiro.setText(resul);
        
       
        
        
    }//GEN-LAST:event_comprarActionPerformed

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
            java.util.logging.Logger.getLogger(MaquinaDeRefrigeranti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaquinaDeRefrigeranti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaquinaDeRefrigeranti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaquinaDeRefrigeranti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaquinaDeRefrigeranti().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button CocaCola;
    private java.awt.Button Pepis;
    private java.awt.Button agua;
    private javax.swing.JButton comprar;
    private java.awt.Button conveção;
    private java.awt.Label dinheiro;
    private java.awt.Button doly;
    private java.awt.Label label2;
    private java.awt.Button redbull;
    private java.awt.Label valorDinheiro1;
    // End of variables declaration//GEN-END:variables
}
