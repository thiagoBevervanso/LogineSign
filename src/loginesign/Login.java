
package loginesign;

import javax.swing.JOptionPane;
import view.TelaCadastro;


public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jAmongo = new javax.swing.JLabel();
        jAmongo_Invertido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JL_nomeLogin = new javax.swing.JLabel();
        jL_NomeEmail = new javax.swing.JLabel();
        jTF_email = new javax.swing.JTextField();
        jL_NomeSenha = new javax.swing.JLabel();
        jPF_Senha = new javax.swing.JPasswordField();
        jB_Login = new javax.swing.JButton();
        jL_Cadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(820, 530));

        Left.setBackground(new java.awt.Color(204, 204, 204));
        Left.setPreferredSize(new java.awt.Dimension(800, 500));
        Left.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("NO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("SEU SISTEMA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("HÁ UM");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 65)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("IMPOSTOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jAmongo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(90, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAmongo_Invertido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(139, 139, 139))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAmongo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAmongo_Invertido))
        );

        Left.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        JL_nomeLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JL_nomeLogin.setForeground(new java.awt.Color(0, 102, 102));
        JL_nomeLogin.setText("LOGIN");
        Left.add(JL_nomeLogin);
        JL_nomeLogin.setBounds(530, 50, 110, 48);

        jL_NomeEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jL_NomeEmail.setForeground(new java.awt.Color(0, 0, 0));
        jL_NomeEmail.setText("Email");
        Left.add(jL_NomeEmail);
        jL_NomeEmail.setBounds(450, 150, 50, 22);

        jTF_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Left.add(jTF_email);
        jTF_email.setBounds(450, 180, 330, 30);

        jL_NomeSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jL_NomeSenha.setForeground(new java.awt.Color(0, 0, 0));
        jL_NomeSenha.setText("Senha");
        Left.add(jL_NomeSenha);
        jL_NomeSenha.setBounds(450, 240, 50, 22);
        Left.add(jPF_Senha);
        jPF_Senha.setBounds(450, 270, 330, 30);

        jB_Login.setBackground(new java.awt.Color(0, 102, 102));
        jB_Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jB_Login.setForeground(new java.awt.Color(51, 51, 51));
        jB_Login.setText("Entrar");
        jB_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LoginActionPerformed(evt);
            }
        });
        Left.add(jB_Login);
        jB_Login.setBounds(680, 440, 100, 40);

        jL_Cadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jL_Cadastro.setForeground(new java.awt.Color(0, 0, 0));
        jL_Cadastro.setText("Não tenho uma conta");
        jL_Cadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_Cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_CadastroMouseClicked(evt);
            }
        });
        Left.add(jL_Cadastro);
        jL_Cadastro.setBounds(520, 450, 150, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LoginActionPerformed
        
        System.out.println("Email: " + jTF_email.getText());
        System.out.println("Senha: " + jPF_Senha.getText());
        if(jPF_Senha.getText().equalsIgnoreCase("senha")&& jTF_email.getText().equalsIgnoreCase("bevervansothiago@gmail.com")){
            JOptionPane.showMessageDialog(this, "Bem vindo! ");
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Email ou senha incorreta! ","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jB_LoginActionPerformed

    private void jL_CadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_CadastroMouseClicked
        TelaCadastro FrameCad = new TelaCadastro();
        FrameCad.setVisible(true);
        Login telaLogin = new Login();
        telaLogin.setVisible(false);
        JOptionPane.showMessageDialog(this, "Preencha os campas para efetuar o cadastro! ");
    }//GEN-LAST:event_jL_CadastroMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_nomeLogin;
    private javax.swing.JPanel Left;
    private javax.swing.JLabel jAmongo;
    private javax.swing.JLabel jAmongo_Invertido;
    private javax.swing.JButton jB_Login;
    private javax.swing.JLabel jL_Cadastro;
    private javax.swing.JLabel jL_NomeEmail;
    private javax.swing.JLabel jL_NomeSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPF_Senha;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_email;
    // End of variables declaration//GEN-END:variables
}
