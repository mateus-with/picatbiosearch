/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

import DAO.GatoDAO;
import DTO.GatoDTO;
import java.awt.FontFormatException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dsm2
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public Relatorio() throws SQLException {
        initComponents();
        listarValoresGatos();
        // dadosComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JLabel();
        btnEstatistica = new javax.swing.JLabel();
        btnCfg = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRacaGatoRecebe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtIdRecebe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNomeGatoRecebe = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();
        btnCarregarCampos1 = new javax.swing.JButton();
        btnAlterarCampos = new javax.swing.JButton();
        btnApagarDados = new javax.swing.JButton();
        btnAlterarCampos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(382, 1120));

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Relatorioclicked.png"))); // NOI18N
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png"))); // NOI18N
        btnEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseExited(evt);
            }
        });

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/configuraçaoNotClicked.png"))); // NOI18N
        btnCfg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCfgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCfgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCfgMouseExited(evt);
            }
        });

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/cadastroNotClicked.png"))); // NOI18N
        btnCadastro.setText("jLabel2");
        btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastroMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_branca(1) 1(2).png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/homeNotClicked.png"))); // NOI18N
        btnHome.setToolTipText("");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeHomeClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCfg, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addGap(101, 101, 101)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastro)
                .addGap(13, 13, 13)
                .addComponent(btnPerfil)
                .addGap(18, 18, 18)
                .addComponent(btnEstatistica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCfg)
                .addContainerGap(468, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 1080));

        jPanel1.setBackground(new java.awt.Color(10, 10, 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Raça do gato:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 260, -1));

        txtRacaGatoRecebe.setBackground(new java.awt.Color(10, 10, 10));
        txtRacaGatoRecebe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRacaGatoRecebe.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtRacaGatoRecebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 260, 260, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 191, 27));
        jLabel3.setText("Avaliações");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        tabelaGatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabelaGatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Raça"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaGatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 560, 380));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID do gato:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        txtIdRecebe.setEditable(false);
        txtIdRecebe.setBackground(new java.awt.Color(10, 10, 10));
        txtIdRecebe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtIdRecebe.setForeground(new java.awt.Color(255, 255, 255));
        txtIdRecebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRecebeActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdRecebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 50, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome do gato:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 170, -1));

        txtNomeGatoRecebe.setBackground(new java.awt.Color(10, 10, 10));
        txtNomeGatoRecebe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNomeGatoRecebe.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNomeGatoRecebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 260, 30));

        btnLimparCampos.setBackground(new java.awt.Color(10, 10, 10));
        btnLimparCampos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimparCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparCampos.setText("Limpar campos");
        btnLimparCampos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        btnLimparCampos.setContentAreaFilled(false);
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimparCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 160, -1));

        btnCarregarCampos1.setBackground(new java.awt.Color(10, 10, 10));
        btnCarregarCampos1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCarregarCampos1.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregarCampos1.setText("Ver gato selecionado");
        btnCarregarCampos1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        btnCarregarCampos1.setContentAreaFilled(false);
        btnCarregarCampos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCampos1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarregarCampos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 220, 30));

        btnAlterarCampos.setBackground(new java.awt.Color(10, 10, 10));
        btnAlterarCampos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlterarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarCampos.setText("Alterar campos");
        btnAlterarCampos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        btnAlterarCampos.setContentAreaFilled(false);
        btnAlterarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 160, -1));

        btnApagarDados.setBackground(new java.awt.Color(10, 10, 10));
        btnApagarDados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnApagarDados.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarDados.setText("Excluir");
        btnApagarDados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        btnApagarDados.setContentAreaFilled(false);
        btnApagarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarDadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnApagarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 120, 30));

        btnAlterarCampos1.setBackground(new java.awt.Color(10, 10, 10));
        btnAlterarCampos1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlterarCampos1.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarCampos1.setText("Ordenar");
        btnAlterarCampos1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        btnAlterarCampos1.setContentAreaFilled(false);
        btnAlterarCampos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCampos1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterarCampos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1570, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited


    private void btnHomeHomeClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeHomeClicked
        // TODO add your handling code here:

        dispose();
        PaginaInicial pg = new PaginaInicial();
        pg.setVisible(true);
    }//GEN-LAST:event_btnHomeHomeClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/homeClicked.png")));
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/homeNotClicked.png")));
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseClicked
        // TODO add your handling code here:
        dispose();
        Cadastro cad = null;
        try {
            cad = new Cadastro();
        } catch (FontFormatException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        cad.setVisible(true);
    }//GEN-LAST:event_btnCadastroMouseClicked

    private void btnCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseEntered
        // TODO add your handling code here:

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastro.png")));
    }//GEN-LAST:event_btnCadastroMouseEntered

    private void btnCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseExited
        // TODO add your handling code here:

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastroNotClicked.png")));
    }//GEN-LAST:event_btnCadastroMouseExited

    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPerfilMouseExited

    private void btnEstatisticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseEntered
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/estatisticasClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseEntered

    private void btnEstatisticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseExited
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseExited

    private void btnCfgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseEntered
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/configuraçao.png")));
    }//GEN-LAST:event_btnCfgMouseEntered

    private void btnCfgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseExited
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/configuraçaoNotClicked.png")));
    }//GEN-LAST:event_btnCfgMouseExited

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // TODO add your handling code here:

        limparCampos();

    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void txtIdRecebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRecebeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRecebeActionPerformed

    private void btnCarregarCampos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCampos1ActionPerformed
        // TODO add your handling code here:

        carregarCamposGato();

    }//GEN-LAST:event_btnCarregarCampos1ActionPerformed

    private void btnAlterarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCamposActionPerformed
        // TODO add your handling code here:

        alterarGato();
        listarValoresGatos();
        limparCampos();

    }//GEN-LAST:event_btnAlterarCamposActionPerformed

    private void btnApagarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarDadosActionPerformed
        // TODO add your handling code here:

        excluirGato();
        listarValoresGatos();
        limparCampos();

    }//GEN-LAST:event_btnApagarDadosActionPerformed

    private void preencheTabela(ArrayList<GatoDTO> lista) {
        try {

            GatoDAO objgatodao = new GatoDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaGatos.getModel();
            model.setNumRows(0);

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdGato(),
                    lista.get(num).getNome(),
                    lista.get(num).getRaça()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores VIEW: " + erro);
        }
    }

    private void btnAlterarCampos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCampos1ActionPerformed
        // TODO add your handling code here:
        GatoDAO objgatodao = new GatoDAO();

        ArrayList<GatoDTO> lista = objgatodao.PesquisarGato();
        System.out.println("" + lista.size());
        lista = objgatodao.ordenaDadosGato(lista, 0, lista.size() - 1);
        for (GatoDTO lista1 : lista) {
            System.out.println("" + lista1.getNome());
        }
        preencheTabela(lista);
    }//GEN-LAST:event_btnAlterarCampos1ActionPerformed

    private void btnEstatisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseClicked
        // TODO add your handling code here:

        dispose();
        new Estatistica().setVisible(true);

    }//GEN-LAST:event_btnEstatisticaMouseClicked

    private void btnCfgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseClicked
        // TODO add your handling code here:
        dispose();
        Config conf = new Config();
        conf.setVisible(true);
    }//GEN-LAST:event_btnCfgMouseClicked

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Relatorio().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCampos;
    private javax.swing.JButton btnAlterarCampos1;
    private javax.swing.JButton btnApagarDados;
    private javax.swing.JLabel btnCadastro;
    private javax.swing.JButton btnCarregarCampos1;
    private javax.swing.JLabel btnCfg;
    private javax.swing.JLabel btnEstatistica;
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaGatos;
    private javax.swing.JTextField txtIdRecebe;
    private javax.swing.JTextField txtNomeGatoRecebe;
    private javax.swing.JTextField txtRacaGatoRecebe;
    // End of variables declaration//GEN-END:variables

    /*
     classe ordenação
     no gato dao
    
    
    
     */
    private void listarValoresGatos() {
        try {

            GatoDAO objgatodao = new GatoDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaGatos.getModel();
            model.setNumRows(0);
            ArrayList<GatoDTO> lista = objgatodao.PesquisarGato();

            for (int num = 0; num < lista.size(); num++) {
                System.out.println("Cor do Gato: " + lista.get(num).getCor());
                model.addRow(new Object[]{
                    lista.get(num).getIdGato(),
                    lista.get(num).getNome(),
                    lista.get(num).getRaça(),
                    lista.get(num).getCor(),
                    lista.get(num).getIdade(),
                    lista.get(num).getObs()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores VIEW: " + erro);
        }
    }

    private void carregarCamposGato() {
        int setar = tabelaGatos.getSelectedRow();

        txtIdRecebe.setText(tabelaGatos.getModel().getValueAt(setar, 0).toString());
        txtNomeGatoRecebe.setText(tabelaGatos.getModel().getValueAt(setar, 1).toString());
        txtRacaGatoRecebe.setText(tabelaGatos.getModel().getValueAt(setar, 2).toString());
        //txtIdadeRecebe.setText(tabelaGatos.getModel().getValueAt(setar, 4).toString());
        //txtCorRecebe.setText(tabelaGatos.getModel().getValueAt(setar, 3).toString());
        //txtObsRecebe.setText(tabelaGatos.getModel().getValueAt(setar, 5).toString());
    }

    private void limparCampos() {
        txtIdRecebe.setText("");
        txtNomeGatoRecebe.setText("");
        txtRacaGatoRecebe.setText("");
        //txtIdadeRecebe.setText("");
        //txtCorRecebe.setText("");
        //txtObsRecebe.setText("");

    }

    private void alterarGato() {
        int idGato;
        int idadeGato;
        String corGato;
        String obsGato;
        String nomeGato;
        String racaGato;

        idGato = Integer.parseInt(txtIdRecebe.getText());
        // idadeGato = Integer.parseInt(txtIdadeRecebe.getText());
        nomeGato = txtNomeGatoRecebe.getText();
        racaGato = txtRacaGatoRecebe.getText();
        // corGato = txtCorRecebe.getText();
        // obsGato = txtObsRecebe.getText();

        GatoDTO objGatoDTO = new GatoDTO();
        objGatoDTO.setIdGato(idGato);
        objGatoDTO.setNome(nomeGato);
        objGatoDTO.setRaça(racaGato);
        //objGatoDTO.setCor(corGato);
        //objGatoDTO.setIdade(idadeGato);
        //objGatoDTO.setObs(obsGato);

        GatoDAO objgatodao = new GatoDAO();
        objgatodao.alterarGato(objGatoDTO);

    }

    private void excluirGato() {
        int idGato;

        idGato = Integer.parseInt(txtIdRecebe.getText());

        GatoDTO objgatodto = new GatoDTO();
        objgatodto.setIdGato(idGato);

        GatoDAO objgatodao = new GatoDAO();
        objgatodao.excluirGato(objgatodto);

    }

    Vector<Integer> idGato = new Vector<Integer>();

    /* 
     public void dadosComboBox(){
     try {
     GatoDAO objgatodao = new GatoDAO();
     ResultSet rs = objgatodao.listarGatos();
            
     while(rs.next()){
     idGato.addElement(rs.getInt(1));
     cbxDono.addItem(rs.getString(2));
     }
     } catch (Exception erro) {
     JOptionPane.showMessageDialog(null, "Erro no cbx: " + erro.getMessage());
            
     }
     }
     */
}
