/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import javax.swing.JButton;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Bruna Leonel
 */
public class TelaLogin extends javax.swing.JFrame {
public String nome;
    /**
     * Creates new form TelaLogin2
     */
    public TelaLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxLogin = new javax.swing.JTextField();
        TxSenha = new javax.swing.JPasswordField();
        BtEntrar = new javax.swing.JButton();
        BtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Identificação");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/locky_1016554.png"))); // NOI18N

        jLabel2.setText("Login:");

        jLabel3.setText("Senha:");

        TxSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxSenhaActionPerformed(evt);
            }
        });
        TxSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxSenhaKeyPressed(evt);
            }
        });

        BtEntrar.setText("Entrar");
        BtEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEntrarActionPerformed(evt);
            }
        });

        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxSenha)
                    .addComponent(TxLogin))
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(BtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(BtCancelar)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxLogin))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtEntrar)
                    .addComponent(BtCancelar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(513, 267));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEntrarActionPerformed
             
        if((TxLogin.getText().equals("gerente.c01") && TxSenha.getText().equals("121"))){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            TelaInicial Tela = new TelaInicial();
            Tela.GerenteLogin();
            Tela.show();
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }
        else if(TxLogin.getText().equals("atendente.c02")&& TxSenha.getText().equals("122")){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            TelaInicial Tela = new TelaInicial();
            Tela.setVisible(true);
            
            Tela.AtendenteLogin();
            Tela.setVisible(true);
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }
       
        else if(TxLogin.getText().equals("mecanico.c03") && TxSenha.getText().equals("123")){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            TelaInicial Tela = new TelaInicial();
            Tela.setVisible(true);
            Tela.MecanicoLogin();
            Tela.setVisible(true);
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }
        
        else if(TxLogin.getText().equals("pecas.c04") && TxSenha.getText().equals("124")){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
           TelaInicial tela = new TelaInicial();
            tela.setVisible(true);  
            tela.PecasLogin();
            tela.setVisible(true);
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }

        else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        }
        getRootPane().setDefaultButton(BtEntrar);
        UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
    }//GEN-LAST:event_BtEntrarActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed



    


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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }}
    private void TxSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxSenhaKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            getRootPane().setDefaultButton(BtEntrar);
        }
    }//GEN-LAST:event_TxSenhaKeyPressed

    private void TxSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxSenhaActionPerformed
         if((TxLogin.getText().equals("gerente.c01") && TxSenha.getText().equals("121"))){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            TelaInicial Tela = new TelaInicial();
            Tela.GerenteLogin();
            Tela.show();
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }
        else if(TxLogin.getText().equals("atendente.c02")&& TxSenha.getText().equals("122")){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            TelaInicial Tela = new TelaInicial();
            Tela.setVisible(true);
            
            Tela.AtendenteLogin();
            Tela.setVisible(true);
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }
       
        else if(TxLogin.getText().equals("mecanico.c03") && TxSenha.getText().equals("123")){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }
        
        else if(TxLogin.getText().equals("pecas.c04") && TxSenha.getText().equals("124")){
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
           TelaPeças telapecas = new TelaPeças();
            telapecas.setVisible(true);  
            getRootPane().setDefaultButton(BtEntrar);
            this.dispose();
        }

        else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        }
        getRootPane().setDefaultButton(BtEntrar);
        UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
    }//GEN-LAST:event_TxSenhaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtEntrar;
    private javax.swing.JTextField TxLogin;
    private javax.swing.JPasswordField TxSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    boolean setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
