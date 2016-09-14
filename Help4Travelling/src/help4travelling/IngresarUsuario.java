/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Agustin
 */
public class IngresarUsuario extends javax.swing.JFrame {
    File fileUsuario;
    private IControladorUsuario ICUsuario;
    
    /**
     * Creates new form AltaUsuario
     */
    public IngresarUsuario() {
        initComponents();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txt_nickname = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_avatar = new javax.swing.JLabel();
        lbl_nombreEmpresa = new javax.swing.JLabel();
        txt_nombreEmpresa = new javax.swing.JTextField();
        txt_linkEmpresa = new javax.swing.JTextField();
        lbl_linkEmpresa = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        cmb_mes = new javax.swing.JComboBox<>();
        cmb_dia = new javax.swing.JComboBox<>();
        jLabel161 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        chk_cliente = new javax.swing.JRadioButton();
        chk_proveedor = new javax.swing.JRadioButton();
        cmb_anio_u = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1218, 707));
        setMaximumSize(new java.awt.Dimension(1218, 707));
        setMinimumSize(new java.awt.Dimension(1218, 707));
        setPreferredSize(new java.awt.Dimension(1218, 707));
        setResizable(false);
        setSize(new java.awt.Dimension(1218, 707));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1220, 10));

        jLabel82.setBackground(java.awt.Color.darkGray);
        jLabel82.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel82.setForeground(java.awt.Color.darkGray);
        jLabel82.setText("Fecha Nacimiento");
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txt_nickname.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        getContentPane().add(txt_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 280, -1));

        jLabel86.setBackground(java.awt.Color.darkGray);
        jLabel86.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel86.setForeground(java.awt.Color.darkGray);
        jLabel86.setText("Contraseña");
        getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 280, -1));

        jLabel87.setBackground(java.awt.Color.darkGray);
        jLabel87.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel87.setForeground(java.awt.Color.darkGray);
        jLabel87.setText("Apellido");
        getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txt_apellido.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 280, -1));

        jLabel88.setBackground(java.awt.Color.darkGray);
        jLabel88.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel88.setForeground(java.awt.Color.darkGray);
        jLabel88.setText("E-mail");
        getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txt_email.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 280, -1));

        jLabel89.setBackground(java.awt.Color.darkGray);
        jLabel89.setFont(new java.awt.Font("Liberation Sans", 3, 16)); // NOI18N
        jLabel89.setForeground(java.awt.Color.darkGray);
        jLabel89.setText("¿Qué deseas ingresar?");
        getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jButton1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jButton1.setText("Imagen");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));
        getContentPane().add(lbl_avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        lbl_nombreEmpresa.setBackground(java.awt.Color.darkGray);
        lbl_nombreEmpresa.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lbl_nombreEmpresa.setForeground(java.awt.Color.darkGray);
        lbl_nombreEmpresa.setText("Nombre empresa");
        getContentPane().add(lbl_nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));
        lbl_nombreEmpresa.setVisible(false);

        txt_nombreEmpresa.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        getContentPane().add(txt_nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 280, -1));
        txt_nombreEmpresa.setVisible(false);

        txt_linkEmpresa.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        getContentPane().add(txt_linkEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 280, -1));
        txt_linkEmpresa.setVisible(false);

        lbl_linkEmpresa.setBackground(java.awt.Color.darkGray);
        lbl_linkEmpresa.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lbl_linkEmpresa.setForeground(java.awt.Color.darkGray);
        lbl_linkEmpresa.setText("Link empresa");
        getContentPane().add(lbl_linkEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));
        lbl_linkEmpresa.setVisible(false);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel71.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel71.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel71.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        jLabel71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel71KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 630, 43, 43));

        jLabel159.setBackground(java.awt.Color.darkGray);
        jLabel159.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel159.setForeground(java.awt.Color.darkGray);
        jLabel159.setText("año");
        getContentPane().add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        cmb_mes.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        getContentPane().add(cmb_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 70, -1));
        cmb_mes.removeAllItems();
        for(int x = 1; x <= 12; x++){
            cmb_mes.addItem(""+x);
        }

        cmb_dia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_dia.setAutoscrolls(true);
        getContentPane().add(cmb_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 80, -1));
        cmb_dia.removeAllItems();
        for(int x = 1; x <= 31; x++){
            cmb_dia.addItem(""+x);
        }

        jLabel161.setBackground(java.awt.Color.darkGray);
        jLabel161.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel161.setForeground(java.awt.Color.darkGray);
        jLabel161.setText("Nickname");
        getContentPane().add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel209.setBackground(java.awt.Color.darkGray);
        jLabel209.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel209.setForeground(java.awt.Color.darkGray);
        jLabel209.setText("dia");
        getContentPane().add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jLabel210.setBackground(java.awt.Color.darkGray);
        jLabel210.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel210.setForeground(java.awt.Color.darkGray);
        jLabel210.setText("/");
        getContentPane().add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jLabel211.setBackground(java.awt.Color.darkGray);
        jLabel211.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel211.setForeground(java.awt.Color.darkGray);
        jLabel211.setText("mes");
        getContentPane().add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        jLabel212.setBackground(java.awt.Color.darkGray);
        jLabel212.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel212.setForeground(java.awt.Color.darkGray);
        jLabel212.setText("/");
        getContentPane().add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        chk_cliente.setBackground(java.awt.Color.white);
        buttonGroup1.add(chk_cliente);
        chk_cliente.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        chk_cliente.setSelected(true);
        chk_cliente.setText("Cliente");
        chk_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chk_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_clienteMouseClicked(evt);
            }
        });
        chk_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(chk_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        chk_proveedor.setBackground(java.awt.Color.white);
        buttonGroup1.add(chk_proveedor);
        chk_proveedor.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        chk_proveedor.setText("Proveedor");
        chk_proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_proveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chk_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_proveedorMouseClicked(evt);
            }
        });
        chk_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(chk_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        cmb_anio_u.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        getContentPane().add(cmb_anio_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 70, -1));
        for(int x = 1950; x <= 2020; x++){
            cmb_anio_u.addItem(""+x);
        }

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Ingreso de usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        jLabel4.setFocusable(false);
        jLabel4.setMaximumSize(new java.awt.Dimension(540, 240));
        jLabel4.setMinimumSize(new java.awt.Dimension(540, 240));
        jLabel4.setPreferredSize(new java.awt.Dimension(540, 240));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 580, 270));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/error.png"))); // NOI18N
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 630, 42, 42));

        jLabel90.setBackground(java.awt.Color.darkGray);
        jLabel90.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel90.setForeground(java.awt.Color.darkGray);
        jLabel90.setText("Nombre");
        getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 280, -1));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1218, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        fileUsuario = fc.getSelectedFile();
        String ruta = fileUsuario.getAbsolutePath();
        Rectangle t = jLabel4.getBounds();
        jLabel4.setIcon(new ImageIcon(ruta));
        jLabel4.setBounds(t);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        //String nick,nomb,apell,empr,emai,link;
        if(chk_cliente.isSelected())
        chk_cliente.setSelected(true);
        else
        chk_proveedor.setSelected(true);
        
        if (chk_cliente.isSelected() && !txt_nickname.getText().isEmpty() && !txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty()  && !txt_email.getText().isEmpty() && txt_pass.getPassword().length != 0){
            //Es un cliente
            
            String hashtext ="";
            try {
               
                try {
                    String pass = new String(txt_pass.getPassword());
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    byte[] clave = md.digest(pass.getBytes("UTF-8"));
                    BigInteger bigInt = new BigInteger(1,clave);
                    hashtext = bigInt.toString(16);
                    //System.out.println(hashtext);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }   
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DtFecha nacimiento = new DtFecha(Integer.valueOf(cmb_anio_u.getSelectedItem().toString().trim()),Integer.valueOf(cmb_mes.getSelectedItem().toString().trim()),Integer.valueOf(cmb_dia.getSelectedItem().toString().trim()));
            ICUsuario.AltaCliente(new DtCliente (txt_nickname.getText(), txt_nombre.getText(), txt_apellido.getText(), txt_email.getText(), nacimiento,null,null,hashtext));
            try {
                ManejadorSQL.GetInstance().insertImgUsuario(fileUsuario, txt_nickname.getText().trim());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(IngresarServicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            //procedimiento
            txt_nickname.setText("");
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_email.setText("");
            txt_pass.setText("");
            JOptionPane.showMessageDialog(null, "Usuario ingresado");
        }
        else if(chk_proveedor.isSelected() && !txt_nickname.getText().isEmpty() && !txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_email.getText().isEmpty() && !txt_linkEmpresa.getText().isEmpty() && !txt_nombreEmpresa.getText().isEmpty() && txt_pass.getPassword().length != 0){
            
            String hashtext ="";
            try {
                try {
                    String pass = new String(txt_pass.getPassword());
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    byte[] clave = md.digest(pass.getBytes("UTF-8"));
                    BigInteger bigInt = new BigInteger(1,clave);
                    hashtext = bigInt.toString(16);
                    //System.out.println(hashtext);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }   
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DtFecha nacimiento = new DtFecha(Integer.valueOf(cmb_anio_u.getSelectedItem().toString().trim()),Integer.valueOf(cmb_mes.getSelectedItem().toString().trim()),Integer.valueOf(cmb_dia.getSelectedItem().toString().trim()));
            ICUsuario.AltaProveedor(new DtProveedor (txt_nickname.getText(), txt_nombre.getText(), txt_apellido.getText(), txt_email.getText(),nacimiento,null,txt_nombreEmpresa.getText(),txt_linkEmpresa.getText(), null, hashtext));
            try {
                ManejadorSQL.GetInstance().insertImgUsuario(fileUsuario, txt_nickname.getText().trim());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(IngresarServicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            txt_nickname.setText("");
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_nombreEmpresa.setText("");
            txt_email.setText("");
            txt_linkEmpresa.setText("");
            jLabel4.setIcon(null);
            JOptionPane.showMessageDialog(null, "Usuario ingresado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Faltan atributos sin completar, verifique y vuelva a intentar.","Compos sin completar",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel71KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel71KeyPressed

    }//GEN-LAST:event_jLabel71KeyPressed

    private void chk_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_clienteMouseClicked
        txt_nombreEmpresa.setVisible(false);
        txt_linkEmpresa.setVisible(false);
        lbl_nombreEmpresa.setVisible(false);
        lbl_linkEmpresa.setVisible(false);
    }//GEN-LAST:event_chk_clienteMouseClicked

    private void chk_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_clienteActionPerformed
        txt_nombreEmpresa.setVisible(false);
        txt_linkEmpresa.setVisible(false);
        lbl_nombreEmpresa.setVisible(false);
        lbl_linkEmpresa.setVisible(false);
    }//GEN-LAST:event_chk_clienteActionPerformed

    private void chk_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_proveedorMouseClicked
        txt_nombreEmpresa.setVisible(true);
        txt_linkEmpresa.setVisible(true);
        lbl_nombreEmpresa.setVisible(true);
        lbl_linkEmpresa.setVisible(true);
    }//GEN-LAST:event_chk_proveedorMouseClicked

    private void chk_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_proveedorActionPerformed
        txt_nombreEmpresa.setVisible(true);
        txt_linkEmpresa.setVisible(true);
        lbl_nombreEmpresa.setVisible(true);
        lbl_linkEmpresa.setVisible(true);
    }//GEN-LAST:event_chk_proveedorActionPerformed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chk_cliente;
    private javax.swing.JRadioButton chk_proveedor;
    private javax.swing.JComboBox<String> cmb_anio_u;
    private javax.swing.JComboBox<String> cmb_dia;
    private javax.swing.JComboBox<String> cmb_mes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel lbl_avatar;
    private javax.swing.JLabel lbl_linkEmpresa;
    private javax.swing.JLabel lbl_nombreEmpresa;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_linkEmpresa;
    private javax.swing.JTextField txt_nickname;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreEmpresa;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
