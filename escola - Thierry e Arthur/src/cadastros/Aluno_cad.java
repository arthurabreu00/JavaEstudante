/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import aluno.Alunos;
import dao.Aluno_dao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Aluno_cad extends javax.swing.JFrame {
    
   private Alunos aluno = null;
   private Aluno_dao alunodao = new Aluno_dao();
   
   public int matricula;
   
    public Aluno_cad() throws ClassNotFoundException, Exception {
        initComponents();
  
       matricula = alunodao.recuperarcodigo();
       txt_matricula.setText(String.valueOf(matricula) ); 
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        txt_cpf = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        txt_rg = new javax.swing.JTextField();
        txt_nm_mae = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_dt_nas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome ");

        jLabel2.setText("Data de nascimento");

        jLabel3.setText("Endereço");

        jLabel4.setText("CPF");

        jLabel5.setText("RG");

        jLabel6.setText("Nome da Mãe");

        jLabel7.setText("Matricula");

        jLabel8.setText("Telefone");

        txt_matricula.setEnabled(false);
        txt_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculaActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_dt_nas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dt_nasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nm_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txt_dt_nas))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dt_nas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nm_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    if (validarForm()) {
        
         aluno = new Alunos();
         
            aluno.setNomeAluno(txt_nome.getText().trim());
            aluno.setDataNascimento(txt_dt_nas.getText().trim());
            aluno.setEnderecoAluno(txt_endereco.getText().trim());
            aluno.setCpf(txt_cpf.getText().trim());
            aluno.setRg(txt_rg.getText().trim());
            aluno.setNomeMae(txt_nm_mae.getText().trim());
            aluno.setTelefone(txt_tel.getText().trim());

          
                try {
                    alunodao.inserir(aluno);
                    
                    JOptionPane.showMessageDialog(this,"Aluno cadastrado com êxito");
                    
                    matricula += matricula ; 
                    
                     txt_matricula.setText(String.valueOf(matricula));
                    
                        txt_nome.setText("");
                        txt_dt_nas.setText("");
                        txt_endereco.setText("");
                        txt_nm_mae.setText("");
                        txt_rg.setText("");
                        txt_cpf.setText("");
                        txt_tel.setText("");
                     
                  
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar ao aluno.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }    
          
         }

// TODO add your handling code here:
    }                                        

    private void txt_precoKeyTyped(java.awt.event.KeyEvent evt) {                                   
// definindo quais caracteres podem ser digitados pelo usuário 
       String caracteres="0987654321.";
       if(!caracteres.contains(evt.getKeyChar()+"")){
       evt.consume();
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_dt_nasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dt_nasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dt_nasActionPerformed

     private boolean validarForm() {
        
    
        if ( txt_matricula.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Preencha o campo de Matricula.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_matricula.requestFocus();
            return false;
        }
        
        
        if (txt_endereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o endereço do produto.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_endereco.requestFocus();
            return false;
        }
        
        
        if ( txt_dt_nas.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Preencha o  ano de nascimento do aluno", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_dt_nas.requestFocus();
            return false;
        }
        
        
        if (txt_cpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o CPF do aluno.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_cpf.requestFocus();
            return false;
        }
        
        if ( txt_rg.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Preencha o RG do aluno.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_rg.requestFocus();
            return false;
        }
        
        
        if (txt_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o nome do Aluno.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_nome.requestFocus();
            return false;
        }
        
           if (txt_tel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o telefone do Aluno.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_tel.requestFocus();
            return false;
        }
        
       
   
    
        
        if (txt_cpf.getText().trim().length() < 11||txt_cpf.getText().trim().length() >15) {
            JOptionPane.showMessageDialog(this, "Numero de cpf inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_cpf.requestFocus();
            return false;
        }
        
      
        
       if (txt_rg.getText().trim().length() <11||txt_rg.getText().trim().length()>15 ) {
            JOptionPane.showMessageDialog(this, "Numero de RG inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_rg.requestFocus();
            return false;
        }
      
        return true;
     }
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
            java.util.logging.Logger.getLogger(Aluno_cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluno_cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluno_cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluno_cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Aluno_cad().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Aluno_cad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_dt_nas;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nm_mae;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
