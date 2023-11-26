
package view;

import java.time.LocalDate;
import javax.swing.JOptionPane;


public class TelaCadastro extends javax.swing.JFrame {

    
    public TelaCadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jL_Icon = new javax.swing.JLabel();
        jL_IconInvertido = new javax.swing.JLabel();
        jL_Quem = new javax.swing.JLabel();
        jL_Matou = new javax.swing.JLabel();
        jL_O = new javax.swing.JLabel();
        jL_Azul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jL_Nome = new javax.swing.JLabel();
        jTF_CadastroNome = new javax.swing.JTextField();
        jL_Email = new javax.swing.JLabel();
        jTF_CadastroEmail = new javax.swing.JTextField();
        jL_Senha = new javax.swing.JLabel();
        jPF_CadastroSenha = new javax.swing.JPasswordField();
        jL_SenhaConfirm = new javax.swing.JLabel();
        JPF_CadastroSenhaConfirm = new javax.swing.JPasswordField();
        jL_DataNascimento = new javax.swing.JLabel();
        jS_dia = new javax.swing.JSpinner();
        jS_mes = new javax.swing.JSpinner();
        jS_ano = new javax.swing.JSpinner();
        jB_Cadastro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jL_Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\thiago.bevervanso\\Documents\\Java_GUI\\amongoVede.png")); // NOI18N

        jL_IconInvertido.setIcon(new javax.swing.ImageIcon("C:\\Users\\thiago.bevervanso\\Documents\\Java_GUI\\amongoVede.png")); // NOI18N

        jL_Quem.setFont(new java.awt.Font("Segoe UI", 1, 59)); // NOI18N
        jL_Quem.setForeground(new java.awt.Color(0, 204, 0));
        jL_Quem.setText("QUEM");

        jL_Matou.setFont(new java.awt.Font("Segoe UI", 1, 59)); // NOI18N
        jL_Matou.setForeground(new java.awt.Color(0, 204, 0));
        jL_Matou.setText("MATOU");

        jL_O.setFont(new java.awt.Font("Segoe UI", 1, 59)); // NOI18N
        jL_O.setForeground(new java.awt.Color(0, 204, 0));
        jL_O.setText("O");

        jL_Azul.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jL_Azul.setForeground(new java.awt.Color(0, 0, 204));
        jL_Azul.setText("AZUL?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jL_Quem, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jL_Matou))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jL_O)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jL_IconInvertido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jL_Icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jL_Azul, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_IconInvertido)
                    .addComponent(jL_Quem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_Matou)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jL_O)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jL_Azul)
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_Icon)
                        .addContainerGap())))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 430, 500);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CADASTRO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(520, 30, 220, 30);

        jL_Nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jL_Nome.setForeground(new java.awt.Color(0, 0, 0));
        jL_Nome.setText("Nome");
        jPanel1.add(jL_Nome);
        jL_Nome.setBounds(480, 120, 37, 20);
        jPanel1.add(jTF_CadastroNome);
        jTF_CadastroNome.setBounds(480, 140, 260, 22);

        jL_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jL_Email.setForeground(new java.awt.Color(0, 0, 0));
        jL_Email.setText("Email");
        jPanel1.add(jL_Email);
        jL_Email.setBounds(480, 170, 32, 20);
        jPanel1.add(jTF_CadastroEmail);
        jTF_CadastroEmail.setBounds(480, 190, 260, 22);

        jL_Senha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jL_Senha.setForeground(new java.awt.Color(0, 0, 0));
        jL_Senha.setText("Senha");
        jPanel1.add(jL_Senha);
        jL_Senha.setBounds(480, 280, 50, 20);
        jPanel1.add(jPF_CadastroSenha);
        jPF_CadastroSenha.setBounds(480, 300, 170, 22);

        jL_SenhaConfirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jL_SenhaConfirm.setForeground(new java.awt.Color(0, 0, 0));
        jL_SenhaConfirm.setText("Repita a senha");
        jPanel1.add(jL_SenhaConfirm);
        jL_SenhaConfirm.setBounds(480, 330, 110, 20);
        jPanel1.add(JPF_CadastroSenhaConfirm);
        JPF_CadastroSenhaConfirm.setBounds(480, 350, 170, 22);

        jL_DataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jL_DataNascimento.setForeground(new java.awt.Color(0, 0, 0));
        jL_DataNascimento.setText("Data de nascimento");
        jPanel1.add(jL_DataNascimento);
        jL_DataNascimento.setBounds(480, 220, 130, 20);

        jS_dia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel1.add(jS_dia);
        jS_dia.setBounds(484, 240, 50, 22);

        jS_mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(jS_mes);
        jS_mes.setBounds(540, 240, 50, 22);

        jS_ano.setModel(new javax.swing.SpinnerNumberModel(1972, 1972, 2023, 1));
        jPanel1.add(jS_ano);
        jS_ano.setBounds(600, 240, 89, 22);

        jB_Cadastro.setBackground(new java.awt.Color(0, 102, 102));
        jB_Cadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jB_Cadastro.setForeground(new java.awt.Color(0, 0, 0));
        jB_Cadastro.setText("Cadastrar");
        jB_Cadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CadastroActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Cadastro);
        jB_Cadastro.setBounds(680, 440, 100, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\thiago.bevervanso\\Documents\\Java_GUI\\34955_pig_icon.png")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 130, 42, 39);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CadastroActionPerformed
        System.out.println("Nome: " + jTF_CadastroNome.getText());
        System.out.println("Email: " + jTF_CadastroEmail.getText());
        
       int dia = (int) jS_dia.getValue();
        int mes = (int) jS_mes.getValue();
        int ano = (int) jS_ano.getValue();
        LocalDate d = LocalDate.of(ano, mes, dia);
        
        System.out.println("senha: " + jPF_CadastroSenha.getText());
        System.out.println("Confirma Senha: " + JPF_CadastroSenhaConfirm.getText());
        
        if(jPF_CadastroSenha.equals(JPF_CadastroSenhaConfirm)){
             JOptionPane.showMessageDialog(this, "Cadastro Efetuado! ");
             
        }else{
            JOptionPane.showMessageDialog(this, "Senhas incompativeis", "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jB_CadastroActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPF_CadastroSenhaConfirm;
    private javax.swing.JButton jB_Cadastro;
    private javax.swing.JLabel jL_Azul;
    private javax.swing.JLabel jL_DataNascimento;
    private javax.swing.JLabel jL_Email;
    private javax.swing.JLabel jL_Icon;
    private javax.swing.JLabel jL_IconInvertido;
    private javax.swing.JLabel jL_Matou;
    private javax.swing.JLabel jL_Nome;
    private javax.swing.JLabel jL_O;
    private javax.swing.JLabel jL_Quem;
    private javax.swing.JLabel jL_Senha;
    private javax.swing.JLabel jL_SenhaConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPF_CadastroSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jS_ano;
    private javax.swing.JSpinner jS_dia;
    private javax.swing.JSpinner jS_mes;
    private javax.swing.JTextField jTF_CadastroEmail;
    private javax.swing.JTextField jTF_CadastroNome;
    // End of variables declaration//GEN-END:variables
}
