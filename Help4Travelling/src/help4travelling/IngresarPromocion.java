/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Agustin
 */
public class IngresarPromocion extends javax.swing.JFrame {
    DefaultListModel<String> list2 = new DefaultListModel<>();
    DefaultListModel<String> list3 = new DefaultListModel<>();
    private IControladorArticulo ICArticulo;
    private IControladorUsuario ICUsuario;
    /**
     * Creates new form AltaUsuario
     */
    public IngresarPromocion() {
        initComponents();
        ICArticulo = Factory.GetInstance().getIControladorArticulo();
        ICUsuario = Factory.GetInstance().getIControladorUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        cmb_ing_prom = new javax.swing.JComboBox<>();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        lbl_precioN = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        list_serviciosProv = new javax.swing.JList<>();
        lbl_precioProm = new javax.swing.JLabel();
        btn_rmP = new javax.swing.JLabel();
        btn_addP = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        lbl_precio1 = new javax.swing.JLabel();
        lbl_precioFinal = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_serviciosInc = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1218, 707));
        setMinimumSize(new java.awt.Dimension(1218, 707));
        setResizable(false);
        setSize(new java.awt.Dimension(1218, 707));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1220, 10));

        jLabel108.setBackground(java.awt.Color.darkGray);
        jLabel108.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel108.setForeground(java.awt.Color.darkGray);
        jLabel108.setText("SERVICIOS INCLUÍDOS");
        getContentPane().add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        jTextField15.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 240, -1));

        jLabel111.setBackground(java.awt.Color.darkGray);
        jLabel111.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel111.setForeground(java.awt.Color.darkGray);
        jLabel111.setText("Proveedor");
        getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel75.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel75.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel75.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, 43, 43));

        cmb_ing_prom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_ing_prom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_ing_promItemStateChanged(evt);
            }
        });
        getContentPane().add(cmb_ing_prom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 240, -1));

        jLabel115.setBackground(java.awt.Color.darkGray);
        jLabel115.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel115.setForeground(java.awt.Color.darkGray);
        jLabel115.setText("SERVICIOS DEL PROVEEDOR");
        getContentPane().add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel116.setBackground(java.awt.Color.darkGray);
        jLabel116.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel116.setForeground(java.awt.Color.darkGray);
        jLabel116.setText("Nombre");
        getContentPane().add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_precioN.setBackground(java.awt.Color.darkGray);
        lbl_precioN.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        lbl_precioN.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_precioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel118.setBackground(java.awt.Color.darkGray);
        jLabel118.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel118.setForeground(java.awt.Color.darkGray);
        jLabel118.setText("Descuento");
        getContentPane().add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel119.setBackground(java.awt.Color.darkGray);
        jLabel119.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel119.setForeground(java.awt.Color.darkGray);
        jLabel119.setText("%");
        getContentPane().add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 20, 30));

        list_serviciosProv.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        list_serviciosProv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(list_serviciosProv);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 240, 420));

        lbl_precioProm.setBackground(java.awt.Color.darkGray);
        lbl_precioProm.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        lbl_precioProm.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_precioProm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        btn_rmP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_rmP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/back.png"))); // NOI18N
        btn_rmP.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_rmP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rmP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rmPMouseClicked(evt);
            }
        });
        getContentPane().add(btn_rmP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 36, 36));

        btn_addP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_addP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/next.png"))); // NOI18N
        btn_addP.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_addP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addPMouseClicked(evt);
            }
        });
        getContentPane().add(btn_addP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 36, 36));

        jLabel192.setBackground(java.awt.Color.darkGray);
        jLabel192.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(0, 51, 153));
        jLabel192.setText("Precio final");
        getContentPane().add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, -1, -1));

        jButton11.setBackground(java.awt.Color.white);
        jButton11.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jButton11.setText("Limpiar");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/error.png"))); // NOI18N
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 650, 42, 42));

        lbl_precio.setBackground(java.awt.Color.darkGray);
        lbl_precio.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        lbl_precio.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, 100, 20));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Ingreso de promoción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        jLabel193.setBackground(java.awt.Color.darkGray);
        jLabel193.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel193.setText("Precio sin descuento");
        getContentPane().add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, -1, -1));

        lbl_precio1.setBackground(java.awt.Color.darkGray);
        lbl_precio1.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        lbl_precio1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 630, 90, 20));

        lbl_precioFinal.setBackground(java.awt.Color.darkGray);
        lbl_precioFinal.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        lbl_precioFinal.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_precioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 660, 100, 20));

        jTextField16.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField16KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 50, 30));

        jScrollPane1.setViewportView(list_serviciosInc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 250, 420));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1218, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
        if(cmb_ing_prom.getModel().getSize() > 0){
            if(!jTextField15.getText().isEmpty() && !jTextField16.getText().isEmpty()){
                if(list_serviciosInc.getModel().getSize() > 0){
                    ArrayList<String> s = new ArrayList();
                    for(int x = 0; x < list_serviciosInc.getModel().getSize(); x++){
                        s.add(list_serviciosInc.getModel().getElementAt(x).trim());
                    }
                    DtPromocion dataProm = new DtPromocion(jTextField15.getText().trim(), cmb_ing_prom.getModel().getSelectedItem().toString().trim(), Float.valueOf(jTextField16.getText().trim()), Float.valueOf(lbl_precioFinal.getText().trim()), s);
                    boolean ret = ICArticulo.insertarPromocion(dataProm);
                    if(ret){
                        JOptionPane.showMessageDialog(null, "Promoción ingresada correctamente!.");
                        ((DefaultListModel)list_serviciosInc.getModel()).setSize(0);
                        lbl_precio.setText("");
                        lbl_precioFinal.setText("");
                        jTextField15.setText("");
                        jTextField16.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "No se pudo ingresar la promocion datos repetidos.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La promoción debe tener al menos un servicio asociado.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La promoción debe tener un nombre, y un descuento.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor.");
        }
    }//GEN-LAST:event_jLabel75MouseClicked

    private void cmb_ing_promItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_ing_promItemStateChanged
        if(cmb_ing_prom.getSelectedItem()!= null){
            ArrayList<DtServicio> s = ICArticulo.ListarServiciosProv(cmb_ing_prom.getSelectedItem().toString().trim());
            DefaultListModel lm = new DefaultListModel();
            lbl_precio.setText("");
            lbl_precioFinal.setText("");
            list2.clear();
            for(int x = 0; x < s.size(); x++){
                lm.addElement(s.get(x).getNombre());
            }
            list_serviciosProv.setModel(lm);
        }
    }//GEN-LAST:event_cmb_ing_promItemStateChanged

    private void btn_rmPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rmPMouseClicked
        if((list_serviciosInc.getSelectedValue() != null) && (!list_serviciosInc.getSelectedValue().isEmpty())){
            DtServicio a = ICArticulo.datosServicio(list_serviciosInc.getSelectedValue().trim(), cmb_ing_prom.getSelectedItem().toString().trim());
            if(!lbl_precio.getText().isEmpty() && !lbl_precio.getText().trim().equals("0.0")){
                lbl_precio.setText(""+(Float.valueOf(lbl_precio.getText().trim())-a.getPrecio()));
                lbl_precioFinal.setText(""+(Float.valueOf(lbl_precio.getText().trim())-(Float.valueOf(lbl_precio.getText().trim())*Float.valueOf(jTextField16.getText().trim()))/100));
                ((DefaultListModel)list_serviciosInc.getModel()).removeElement(list_serviciosInc.getSelectedValue());
            }
        }
    }//GEN-LAST:event_btn_rmPMouseClicked

    private void btn_addPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addPMouseClicked
        ListModel<String> lista1 = list_serviciosProv.getModel();
        //DefaultListModel<String> lista2 = new DefaultListModel<String>();

        if(list_serviciosProv.getModel().getSize() != 0){
            if(list_serviciosProv.getSelectedValue() != null){
                if(!list_serviciosProv.getSelectedValue().isEmpty()){
                    if(!list2.contains(list_serviciosProv.getSelectedValue())){
                        try{
                            Float.valueOf(jTextField16.getText().trim());
                            list2.addElement(list_serviciosProv.getSelectedValue());
                            list_serviciosInc.setModel(list2);
                            DtServicio a = ICArticulo.datosServicio(list_serviciosProv.getSelectedValue().trim(), cmb_ing_prom.getSelectedItem().toString().trim());

                            if(lbl_precio.getText().isEmpty())
                                lbl_precio.setText(""+a.getPrecio());
                            else
                                lbl_precio.setText(""+(Float.valueOf(lbl_precio.getText().trim())+a.getPrecio()));
                            lbl_precioFinal.setText(""+(Float.valueOf(lbl_precio.getText().trim())-(Float.valueOf(lbl_precio.getText().trim())*Float.valueOf(jTextField16.getText().trim()))/100));
                        }catch(Exception ex){
                            jTextField16.setText("");
                            JOptionPane.showMessageDialog(null, "Descuento ingresado incorrecto.");
                        }
                    }else{
                        //System.out.println("banderarequeteloca3 ");
                    }

                    //list_serviciosInc.setModel(lista1);

                    /*if(!l1.contains(list_serviciosProv.getSelectedValue())){
                        list_serviciosInc.getModel().addElement(list_serviciosProv.getSelectedValue());
                        lis_categoriaS.setModel(list2);
                    }

                    if(!list2.contains(lis_categoria.getSelectedValue())){
                        list2.addElement(lis_categoria.getSelectedValue());
                        lis_categoriaS.setModel(list2);
                    }

                    if((l1.contains(list_serviciosProv.getSelectedValue().toString())){
                        System.out.println("banderarequeteloca1");
                        //((DefaultListModel)list_serviciosInc.getModel()).addElement(list_serviciosProv.getSelectedValue());
                    }

                    ArrayList<DtCategoria> categorias = ICCategoria.listarCategorias();
                    DefaultListModel<String> list = new DefaultListModel<>();

                    int max =0;
                    for (int i = 0; i < categorias.size(); i++){
                        list.addElement(categorias.get(i).getNombre());
                        if (max < categorias.get(i).getNivel()){
                            max =categorias.get(i).getNivel();
                        }
                    }

                    */
                }
            }
        }
    }//GEN-LAST:event_btn_addPMouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        ((DefaultListModel)list_serviciosInc.getModel()).setSize(0);
        lbl_precio.setText("");
        lbl_precioFinal.setText("");
    }//GEN-LAST:event_jButton11MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cmb_ing_prom.setModel(new DefaultComboBoxModel(ICUsuario.listarProveedores().toArray()));
    }//GEN-LAST:event_formWindowOpened

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        if (!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != KeyEvent.VK_PERIOD) && (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE)) {
            jTextField16.removeAll();
        }
    }//GEN-LAST:event_jTextField16KeyPressed

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
            java.util.logging.Logger.getLogger(IngresarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarPromocion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_addP;
    private javax.swing.JLabel btn_rmP;
    private javax.swing.JComboBox<String> cmb_ing_prom;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_precio1;
    private javax.swing.JLabel lbl_precioFinal;
    private javax.swing.JLabel lbl_precioN;
    private javax.swing.JLabel lbl_precioProm;
    private javax.swing.JList<String> list_serviciosInc;
    private javax.swing.JList<String> list_serviciosProv;
    // End of variables declaration//GEN-END:variables
}
