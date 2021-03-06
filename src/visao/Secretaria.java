
package visao;


public class Secretaria extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public Secretaria() {
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

        jAreaTrabalho = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jmbMenuPrincipal = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadProduto = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmManutencao = new javax.swing.JMenu();
        jmiManProduto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretaria");

        jAreaTrabalho.setDoubleBuffered(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo.png"))); // NOI18N
        jAreaTrabalho.add(jLabel1);
        jLabel1.setBounds(170, 130, 391, 210);

        jmCadastro.setText("Hospede");

        jmiCadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiCadProduto.setText("Cadatrar Hospede");
        jmiCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadProdutoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadProduto);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Hospedes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmCadastro.add(jMenuItem4);

        jmbMenuPrincipal.add(jmCadastro);

        jmManutencao.setText("Reserva");

        jmiManProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmiManProduto.setText("Reservar");
        jmiManProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManProdutoActionPerformed(evt);
            }
        });
        jmManutencao.add(jmiManProduto);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Reservas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmManutencao.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Formas de Pagamento");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmManutencao.add(jMenuItem5);

        jmbMenuPrincipal.add(jmManutencao);

        jMenu1.setText("Quarto");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Quartos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Alocar Hospede");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jmbMenuPrincipal.add(jMenu1);

        jmSair.setText("sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jmbMenuPrincipal.add(jmSair);

        setJMenuBar(jmbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaTrabalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadProduto(){
         CadastrarHospede gcp = new  CadastrarHospede();
        jAreaTrabalho.add(gcp);
        gcp.setVisible(true);
    }//fecha método
    
    private void abrirManProduto(){
        TabelaHospede gmp = new TabelaHospede();
        jAreaTrabalho.add(gmp);
        gmp.setVisible(true);
    }//fecha método
      private void abrirQuarto(){
        QuartoAdd qt = new QuartoAdd();
        jAreaTrabalho.add(qt);
        qt.setVisible(true);
    }//fecha método
    private void abrirReserva(){
        Reservar rr = new Reservar();
        jAreaTrabalho.add(rr);
        rr.setVisible(true);
    }//fecha método  
    private void alocarHospede(){
        Alocar ah = new Alocar();
        jAreaTrabalho.add(ah);
        ah.setVisible(true);
    }//fecha método 
     private void Reservas(){
        VisuReservas vr = new VisuReservas();
        jAreaTrabalho.add(vr);
        vr.setVisible(true);
    }//fecha método 
     private void Paga(){
         Pagamentos pg = new Pagamentos();
           jAreaTrabalho.add(pg);
        pg.setVisible(true);
     }
    
    private void jmiCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadProdutoActionPerformed
        abrirCadProduto();
    }//GEN-LAST:event_jmiCadProdutoActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jmSairMouseClicked

    private void jmiManProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManProdutoActionPerformed
abrirReserva();       
    }//GEN-LAST:event_jmiManProdutoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
abrirQuarto();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       abrirManProduto();  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     alocarHospede();   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Reservas();  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
Paga();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secretaria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jAreaTrabalho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmManutencao;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuBar jmbMenuPrincipal;
    private javax.swing.JMenuItem jmiCadProduto;
    private javax.swing.JMenuItem jmiManProduto;
    // End of variables declaration//GEN-END:variables
}
