/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import View.Login;
import java.util.Arrays;
import Entity.Empleado;
import Model.ModelEmp;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Patty
 */
public class Backend extends javax.swing.JFrame {

    /**
     * Creates new form Backend
     */
    public Backend() {
        
        initComponents();
    }
    
    public double dscto(){
        if(rbDesc10.isSelected()) return 0.1;
        else return 0.05;
    }
    
    public double[] arrayBonif(){
        double bonif[] = {0,0,0};
        if(chbBonif2.isSelected()) bonif[0] = 0.02;
        if(chbBonif4.isSelected()) bonif[1] = 0.04;
        if(chbBonif7.isSelected()) bonif[2] = 0.07;
        return bonif;
    }
    
    public void limpiarCampos(){
        txtNombre.setText("");
        cbCargo.setSelectedIndex(0);
        txtSueldo.setText("");
        rbDesc10.setSelected(true);
        rbDesc5.setSelected(false);
        chbBonif2.setSelected(false);
        chbBonif4.setSelected(false);
        chbBonif7.setSelected(false);
        
    }
    public Empleado getEmpPanel(){
        
        String nombre = txtNombre.getText();
        int cargoId = cbCargo.getSelectedIndex();
        double sueldo = Double.parseDouble(txtSueldo.getText());
        double dscto = dscto();
        double bonif[] = arrayBonif();
        ModelEmp me = new ModelEmp();
        Empleado e = new Empleado(nombre, cargoId, sueldo, dscto, bonif);
        return e;
    }
    
    public void defineEmpPanel(Empleado e){
        txtNombre.setText(e.getNombre());
        cbCargo.setSelectedIndex(e.getCargoId());
        txtSueldo.setText(e.getSueldo()+"");
        if(e.getDscto() == 0.1){
            rbDesc10.setSelected(true);
            rbDesc5.setSelected(false);
        }else{
            rbDesc10.setSelected(false);
            rbDesc5.setSelected(true);
        }
        chbBonif2.setSelected(false);
        chbBonif4.setSelected(false);
        chbBonif7.setSelected(false);
        for(double i : e.getBonificacion()){
            if(i == 0.02)chbBonif2.setSelected(true);
            if(i == 0.04)chbBonif4.setSelected(true);
            if(i == 0.07)chbBonif7.setSelected(true);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbDescuento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rbDesc10 = new javax.swing.JRadioButton();
        rbDesc5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        chbBonif2 = new javax.swing.JCheckBox();
        chbBonif4 = new javax.swing.JCheckBox();
        chbBonif7 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPlanilla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLEADOS - PLANILLA DE EMPLEADOS");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setText("Nombre");

        jLabel3.setText("Cargo");

        jLabel4.setText("Sueldo");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Cargo", "Administrador", "Vendedor", "Empleado" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Descuento");

        rdbDescuento.add(rbDesc10);
        rbDesc10.setSelected(true);
        rbDesc10.setText("10% del Sueldo");
        rbDesc10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbDesc10MouseClicked(evt);
            }
        });
        rbDesc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDesc10ActionPerformed(evt);
            }
        });

        rdbDescuento.add(rbDesc5);
        rbDesc5.setText("5% del Sueldo");
        rbDesc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDesc5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Bonificación");

        chbBonif2.setText("2% del Sueldo");
        chbBonif2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbBonif2ActionPerformed(evt);
            }
        });

        chbBonif4.setText("4% del Sueldo");

        chbBonif7.setText("7% del Sueldo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtSueldo)
                            .addComponent(cbCargo, 0, 121, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbBonif7)
                            .addComponent(chbBonif4)
                            .addComponent(rbDesc5)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(rbDesc10)
                            .addComponent(chbBonif2))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDesc10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDesc5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbBonif2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbBonif4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbBonif7)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jtPlanilla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado", "Nombre", "Cargo", "Sueldo", "Dscto", "Bonif", "Neto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPlanilla.getTableHeader().setReorderingAllowed(false);
        jtPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPlanillaMouseClicked(evt);
            }
        });
        jtPlanilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPlanillaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtPlanilla);
        if (jtPlanilla.getColumnModel().getColumnCount() > 0) {
            jtPlanilla.getColumnModel().getColumn(0).setMinWidth(0);
            jtPlanilla.getColumnModel().getColumn(0).setPreferredWidth(0);
            jtPlanilla.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jMenu1.setText("System");

        jMenuItem1.setText("LogOut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void rbDesc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDesc10ActionPerformed

    }//GEN-LAST:event_rbDesc10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login l = new Login();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
            if(cbCargo.getSelectedIndex() != 0){
                Empleado e = getEmpPanel();
                ModelEmp me = new ModelEmp();
                DefaultTableModel model = (DefaultTableModel) jtPlanilla.getModel();
                model.addRow(new Object[]{e,e.getNombre(),cbCargo.getSelectedItem(),e.getSueldo(),me.getDescuento(e),me.getBonificacion(e),me.getNeto(e)});
                limpiarCampos();
            } else JOptionPane.showMessageDialog(null, "Defina cargo para empleado.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor llenar correctamente los campos.");
        }
        
        
        
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void rbDesc10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDesc10MouseClicked

    }//GEN-LAST:event_rbDesc10MouseClicked

    private void rbDesc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDesc5ActionPerformed

    }//GEN-LAST:event_rbDesc5ActionPerformed

    private void chbBonif2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbBonif2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbBonif2ActionPerformed

    private void jtPlanillaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPlanillaKeyReleased
        if(jtPlanilla.isEnabled()){
            if(jtPlanilla.getSelectedRow() != -1){
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
            }
            else{
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jtPlanillaKeyReleased

    private void jtPlanillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPlanillaMouseClicked
        if(jtPlanilla.isEnabled()){
            if(jtPlanilla.getSelectedRow() != -1){
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
            }
            else{
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
            }// TODO add your handling code here:
        }
    }//GEN-LAST:event_jtPlanillaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(btnEditar.getText().equals("EDITAR")){
            Empleado e = (Empleado) jtPlanilla.getValueAt(jtPlanilla.getSelectedRow(), 0);
            defineEmpPanel(e);
            btnAgregar.setEnabled(false);
            btnEliminar.setEnabled(false);
            jtPlanilla.setEnabled(false);
            btnEditar.setText("APLICAR CAMBIOS");
        }
        else{
            Empleado e = getEmpPanel();
            ModelEmp me = new ModelEmp();
            
            jtPlanilla.setValueAt(e,jtPlanilla.getSelectedRow(),0);
            jtPlanilla.setValueAt(e.getNombre(),jtPlanilla.getSelectedRow(),1);
            jtPlanilla.setValueAt(cbCargo.getSelectedItem(),jtPlanilla.getSelectedRow(),2);
            jtPlanilla.setValueAt(e.getSueldo(),jtPlanilla.getSelectedRow(),3);
            jtPlanilla.setValueAt(me.getDescuento(e),jtPlanilla.getSelectedRow(),4);
            jtPlanilla.setValueAt(me.getBonificacion(e),jtPlanilla.getSelectedRow(),5);
            jtPlanilla.setValueAt(me.getNeto(e),jtPlanilla.getSelectedRow(),6);
            
            btnAgregar.setEnabled(true);
            jtPlanilla.setEnabled(true);
            btnEditar.setText("EDITAR");
            btnEliminar.setEnabled(true);
            limpiarCampos();

        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtPlanilla.getModel();
        model.removeRow(jtPlanilla.getSelectedRow());
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JCheckBox chbBonif2;
    private javax.swing.JCheckBox chbBonif4;
    private javax.swing.JCheckBox chbBonif7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPlanilla;
    private javax.swing.JRadioButton rbDesc10;
    private javax.swing.JRadioButton rbDesc5;
    public static javax.swing.ButtonGroup rdbDescuento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
