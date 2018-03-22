package View;

import Controller.EquipoController;
import Model.EquipoModel;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import serializable.Persistencia;

public class View extends javax.swing.JFrame {

    private EquipoController Equipos = new EquipoController();
    private Persistencia Persistencia = new Persistencia();
    private final DefaultTableModel Table;
    private Object Index;

    public View() {
        initComponents();
        setLocationRelativeTo(null);
        this.Table = (DefaultTableModel) TableEquipos.getModel();
        Equipos.setEquipos((ArrayList<EquipoModel>) Persistencia.cargar_datos("Array.dat"));
        Listar(Equipos.getEquipos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableEquipos = new javax.swing.JTable();
        tboxsNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tboxsEstadio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tboxuEstadio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tboxuEscudo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        tboxsbuscar = new javax.swing.JTextField();
        pbEscudo = new javax.swing.JLabel();
        pbEstadio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        TableEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nombre Estadio", "Url Estadio", "Url Escudo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableEquipos.getTableHeader().setReorderingAllowed(false);
        TableEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableEquipos);
        if (TableEquipos.getColumnModel().getColumnCount() > 0) {
            TableEquipos.getColumnModel().getColumn(0).setResizable(false);
            TableEquipos.getColumnModel().getColumn(1).setResizable(false);
            TableEquipos.getColumnModel().getColumn(2).setResizable(false);
            TableEquipos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Nombre Del Equipo:");

        jLabel2.setText("Nombre Del Estadio:");

        jLabel3.setText("Url Del Estadio:");

        jLabel4.setText("Url Del Escudo:");

        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Update.png"))); // NOI18N
        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btnReg.setText("Registrar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        btnElim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        btnElim.setText("Eliminar");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Find.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        pbEscudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pbEscudo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        pbEstadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pbEstadio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel7.setText("Imagen Del Estadio");

        jLabel8.setText("Imagen Del Escudo");

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(pbEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pbEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tboxsbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tboxsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tboxsEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tboxuEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel4))
                                    .addComponent(tboxuEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tboxsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tboxsEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tboxuEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(31, 31, 31))
                        .addComponent(tboxuEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnReg)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMod)
                        .addGap(18, 18, 18)
                        .addComponent(btnElim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pbEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pbEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(tboxsbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        if (ValEquipos()) {
            try {
                Equipos.Post(new EquipoModel(tboxsNombre.getText(), tboxsEstadio.getText(), new URL(tboxuEscudo.getText()), new URL(tboxuEstadio.getText())));
                Listar(Equipos.getEquipos());
                Vaciar();
                Persistencia.Escribir("Array.dat", Equipos.getEquipos());
                JOptionPane.showMessageDialog(null, "Se ha registrado satisfactoriamente", "Registrado", 1);
            } catch (MalformedURLException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido algun error intente de nuevo", "Error", 0);
            }
        }
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        if (ValEquipos() && Index != null) {
            try {
                Equipos.Put(Integer.parseInt(Index.toString()), new EquipoModel(tboxsNombre.getText(), tboxsEstadio.getText(), new URL(tboxuEscudo.getText()), new URL(tboxuEstadio.getText())));
                Listar(Equipos.getEquipos());
                Vaciar();
                JOptionPane.showMessageDialog(null, "Se ha modificado satisfactoriamente", "Modificado", 1);
            } catch (MalformedURLException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido algun error intente de nuevo", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar alguna fila de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btnModActionPerformed

    private void TableEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableEquiposMouseClicked
        Index = TableEquipos.getSelectedRow();
        tboxsNombre.setText(Equipos.getEquipos().get(Integer.parseInt(Index.toString())).getsNombre());
        tboxsEstadio.setText(Equipos.getEquipos().get(Integer.parseInt(Index.toString())).getsEstadio());
        tboxuEscudo.setText(Equipos.getEquipos().get(Integer.parseInt(Index.toString())).getuEscudo().toString());
        tboxuEstadio.setText(Equipos.getEquipos().get(Integer.parseInt(Index.toString())).getuEstadio().toString());
        try {
            pbEstadio.setIcon(new ImageIcon(ImageIO.read(Equipos.getEquipos().get(Integer.parseInt(Index.toString())).getuEstadio()).getScaledInstance(pbEstadio.getWidth(), pbEstadio.getHeight(), Image.SCALE_SMOOTH)));
            pbEscudo.setIcon(new ImageIcon(ImageIO.read(Equipos.getEquipos().get(Integer.parseInt(Index.toString())).getuEscudo()).getScaledInstance(pbEstadio.getWidth(), pbEstadio.getHeight(), Image.SCALE_SMOOTH)));
        } catch (MalformedURLException ex) {
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_TableEquiposMouseClicked

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        if (Index != null) {
            Equipos.Delete(Integer.parseInt(Index.toString()));
            Vaciar();
            Listar(Equipos.getEquipos());
            JOptionPane.showMessageDialog(null, "Se ha eliminado satisfactoriamente", "Eliminado", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar alguna fila de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (tboxsbuscar.getText() != null && !tboxsbuscar.getText().equals("")) {
            Listar(Equipos.Get(tboxsbuscar.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar algun filtro", "Error", 0);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Vaciar();
        Listar(Equipos.getEquipos());
    }//GEN-LAST:event_btnCancelActionPerformed

    public void Listar(ArrayList<EquipoModel> Equipos) {
        while (Table.getRowCount() != 0) {
            Table.removeRow(0);
        }
        Equipos.forEach((Equipo) -> {
            Table.addRow(Equipo.Tabla());
        });
    }

    private boolean ValEquipos() {
        if (tboxsNombre.getText().equals("") || tboxsNombre.getText() == null || tboxsEstadio.getText().equals("") || tboxsEstadio.getText() == null
                || tboxuEscudo.getText().equals("") || tboxuEscudo.getText() == null || tboxuEstadio.getText().equals("") || tboxuEstadio.getText() == null) {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos requeridos", "Error", 0);
            return false;
        } else if (!Equipos.ValUrl(tboxuEscudo.getText()) || !Equipos.ValUrl(tboxuEstadio.getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo url de imagen", "Error", 0);
            return false;
        } else {
            return true;
        }
    }

    private void Vaciar() {
        tboxsEstadio.setText(null);
        tboxsNombre.setText(null);
        tboxsbuscar.setText(null);
        tboxuEscudo.setText(null);
        tboxuEstadio.setText(null);
        Index = null;
        pbEscudo.setIcon(null);
        pbEstadio.setIcon(null);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableEquipos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pbEscudo;
    private javax.swing.JLabel pbEstadio;
    private javax.swing.JTextField tboxsEstadio;
    private javax.swing.JTextField tboxsNombre;
    private javax.swing.JTextField tboxsbuscar;
    private javax.swing.JTextField tboxuEscudo;
    private javax.swing.JTextField tboxuEstadio;
    // End of variables declaration//GEN-END:variables
}
