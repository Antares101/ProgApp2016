package help4travelling;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Help4Travelling extends javax.swing.JFrame {

    private IControladorArticulo ICArticulo;
    private IControladorCategoria ICCategoria;
    private IControladorReserva ICReserva;
    private IControladorUsuario ICUsuario;   
    
    public Help4Travelling() {
        initComponents();
        ICArticulo = Factory.GetInstance().getIControladorArticulo();
        ICCategoria = Factory.GetInstance().getIControladorCategoria();
        ICReserva = Factory.GetInstance().getIControladorReserva();
        ICUsuario = Factory.GetInstance().getIControladorUsuario();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_mostrar_modificaciones = new javax.swing.JLabel();
        lbl_mostrar_eliminaciones = new javax.swing.JLabel();
        lbl_acercaDe = new javax.swing.JLabel();
        lbl_cerrar = new javax.swing.JLabel();
        lbl_mostrar_registros = new javax.swing.JLabel();
        lbl_mostrar_consultas = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_ingreso_usuarios = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txt_nickname = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        lbl_nombreEmpresa = new javax.swing.JLabel();
        txt_nombreEmpresa = new javax.swing.JTextField();
        txt_linkEmpresa = new javax.swing.JTextField();
        lbl_linkEmpresa = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        cmb_mes = new javax.swing.JComboBox<>();
        cmb_anio = new javax.swing.JComboBox<>();
        cmb_dia = new javax.swing.JComboBox<>();
        jLabel161 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        chk_cliente = new javax.swing.JRadioButton();
        chk_proveedor = new javax.swing.JRadioButton();
        lbl_mostrar_acercaDe = new javax.swing.JLabel();
        lbl_mostrar_cerrar = new javax.swing.JLabel();
        panel_ingreso_servicios = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel103 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        panel_izq = new javax.swing.JPanel();
        ingreso_reservas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ingreso_categorias = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ingreso_usuarios = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ingreso_servicios = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ingreso_promociones = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panel_izq_acerca_de = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        panel_izq_eliminaciones = new javax.swing.JPanel();
        eliminacion_reservas = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panel_izq_actualizaciones = new javax.swing.JPanel();
        actualizacion_reservas = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        actualizacion_servicios = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        panel_izq_consultas = new javax.swing.JPanel();
        consultar_proveedores = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        consultar_clientes = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        consultar_servicios = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        consultar_promociones = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        consultar_reservas = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        panel_ingreso_categorias = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        panel_ingreso_promociones = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel115 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel116 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        panel_ingreso_reservas = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel123 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel126 = new javax.swing.JLabel();
        panel_consultas_proveedores = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel203 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        panel_actualizar_servicio = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel130 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel131 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel199 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel206 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        panel_actualizar_reserva = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panel_eliminar_reserva = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel140 = new javax.swing.JLabel();
        panel_consultas_reservas = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel145 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_consultas_servicios = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel153 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jTextField17 = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel160 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        panel_consultas_promociones = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel164 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel165 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel176 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        panel_consultas_clientes = new javax.swing.JPanel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jLabel214 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jLabel215 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jLabel217 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help4Travelling");
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1210, 680));
        setMaximumSize(new java.awt.Dimension(1210, 680));
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 1500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 144, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/Help4Travelling-logo.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setIconTextGap(8);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 78, 77));

        jLabel2.setBackground(new java.awt.Color(255, 128, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 198, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-1.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setName("jLabel11"); // NOI18N
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 40));

        jLabel5.setBackground(new java.awt.Color(51, 54, 56));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1212, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-2.png"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setName("jLabel12"); // NOI18N
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-4.png"))); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setName("jLabel13"); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-3.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setName("jLabel9"); // NOI18N
        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel9FocusGained(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 40, 40));

        lbl_mostrar_modificaciones.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_modificaciones.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_modificaciones.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_modificaciones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_modificaciones.setText("Modificaciones   ");
        lbl_mostrar_modificaciones.setName("lbl_mostrar_modificaciones"); // NOI18N
        lbl_mostrar_modificaciones.setOpaque(true);
        getContentPane().add(lbl_mostrar_modificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));
        lbl_mostrar_modificaciones.setVisible(false);

        lbl_mostrar_eliminaciones.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_eliminaciones.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_eliminaciones.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_eliminaciones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_eliminaciones.setText("Eliminaciones   ");
        lbl_mostrar_eliminaciones.setName("lbl_mostrar_eliminaciones"); // NOI18N
        lbl_mostrar_eliminaciones.setOpaque(true);
        getContentPane().add(lbl_mostrar_eliminaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 30));
        lbl_mostrar_eliminaciones.setVisible(false);

        lbl_acercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/info.png"))); // NOI18N
        lbl_acercaDe.setText("jLabel20");
        lbl_acercaDe.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_acercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_acercaDe.setName("lbl_info"); // NOI18N
        lbl_acercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_acercaDeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_acercaDeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_acercaDeMouseExited(evt);
            }
        });
        getContentPane().add(lbl_acercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 605, 30, 30));

        lbl_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        lbl_cerrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_cerrar.setName("lbl_salir"); // NOI18N
        lbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseExited(evt);
            }
        });
        getContentPane().add(lbl_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 643, 30, 30));

        lbl_mostrar_registros.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_registros.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_registros.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_registros.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_registros.setText("Registros   ");
        lbl_mostrar_registros.setName("lbl_mostrar_registros"); // NOI18N
        lbl_mostrar_registros.setVisible(false);
        lbl_mostrar_registros.setOpaque(true);
        getContentPane().add(lbl_mostrar_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 30));

        lbl_mostrar_consultas.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_consultas.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_consultas.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_consultas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_consultas.setText("Consultas   ");
        lbl_mostrar_consultas.setName("lbl_mostrar_consultas"); // NOI18N
        lbl_mostrar_consultas.setOpaque(true);
        getContentPane().add(lbl_mostrar_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, 30));
        lbl_mostrar_consultas.setVisible(false);

        lbl_menu.setBackground(new java.awt.Color(1, 82, 160));
        lbl_menu.setFont(new java.awt.Font("FreeSans", 0, 36)); // NOI18N
        lbl_menu.setForeground(java.awt.Color.white);
        lbl_menu.setText("                                           ");
        lbl_menu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_menu.setOpaque(true);
        getContentPane().add(lbl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 1120, 80));

        jLabel7.setBackground(new java.awt.Color(51, 54, 56));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 50, 590));

        panel_ingreso_usuarios.setBackground(java.awt.Color.lightGray);
        panel_ingreso_usuarios.setLayout(null);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel81.setText("jLabel4");
        jLabel81.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel81.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });
        panel_ingreso_usuarios.add(jLabel81);
        jLabel81.setBounds(995, 5, 30, 30);

        jLabel82.setBackground(java.awt.Color.darkGray);
        jLabel82.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel82.setForeground(java.awt.Color.darkGray);
        jLabel82.setText("Fecha Nacimiento");
        panel_ingreso_usuarios.add(jLabel82);
        jLabel82.setBounds(30, 320, 130, 20);

        jLabel84.setBackground(new java.awt.Color(33, 33, 33));
        jLabel84.setOpaque(true);
        panel_ingreso_usuarios.add(jLabel84);
        jLabel84.setBounds(-2, 0, 1310, 40);

        jLabel85.setBackground(java.awt.Color.darkGray);
        jLabel85.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel85.setForeground(java.awt.Color.darkGray);
        jLabel85.setText("Imagen(opcional)");
        panel_ingreso_usuarios.add(jLabel85);
        jLabel85.setBounds(460, 150, 150, 40);

        txt_nickname.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_nickname);
        txt_nickname.setBounds(170, 160, 270, 25);

        jLabel86.setBackground(java.awt.Color.darkGray);
        jLabel86.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel86.setForeground(java.awt.Color.darkGray);
        jLabel86.setText("Nombre");
        panel_ingreso_usuarios.add(jLabel86);
        jLabel86.setBounds(30, 210, 80, 20);

        txt_nombre.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_nombre);
        txt_nombre.setBounds(170, 210, 270, 25);

        jLabel87.setBackground(java.awt.Color.darkGray);
        jLabel87.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel87.setForeground(java.awt.Color.darkGray);
        jLabel87.setText("Apellido");
        panel_ingreso_usuarios.add(jLabel87);
        jLabel87.setBounds(30, 260, 80, 20);

        txt_apellido.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_apellido);
        txt_apellido.setBounds(170, 260, 270, 25);

        jLabel88.setBackground(java.awt.Color.darkGray);
        jLabel88.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel88.setForeground(java.awt.Color.darkGray);
        jLabel88.setText("E-mail");
        panel_ingreso_usuarios.add(jLabel88);
        jLabel88.setBounds(30, 380, 50, 20);

        txt_email.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_email);
        txt_email.setBounds(170, 380, 270, 25);

        jLabel89.setBackground(java.awt.Color.darkGray);
        jLabel89.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel89.setForeground(java.awt.Color.darkGray);
        jLabel89.setText("¿Qué deseas ingresar?");
        panel_ingreso_usuarios.add(jLabel89);
        jLabel89.setBounds(20, 50, 190, 40);

        jButton1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_ingreso_usuarios.add(jButton1);
        jButton1.setBounds(590, 160, 150, 20);

        jLabel37.setText("Aqui se mostrara imagen");
        panel_ingreso_usuarios.add(jLabel37);
        jLabel37.setBounds(460, 200, 540, 280);

        lbl_nombreEmpresa.setBackground(java.awt.Color.darkGray);
        lbl_nombreEmpresa.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lbl_nombreEmpresa.setForeground(java.awt.Color.darkGray);
        lbl_nombreEmpresa.setText("Nombre empresa");
        panel_ingreso_usuarios.add(lbl_nombreEmpresa);
        lbl_nombreEmpresa.setBounds(30, 430, 120, 20);
        lbl_nombreEmpresa.setVisible(false);

        txt_nombreEmpresa.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_nombreEmpresa);
        txt_nombreEmpresa.setBounds(170, 430, 270, 25);
        txt_nombreEmpresa.setVisible(false);

        txt_linkEmpresa.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_linkEmpresa);
        txt_linkEmpresa.setBounds(170, 480, 270, 25);
        txt_linkEmpresa.setVisible(false);

        lbl_linkEmpresa.setBackground(java.awt.Color.darkGray);
        lbl_linkEmpresa.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lbl_linkEmpresa.setForeground(java.awt.Color.darkGray);
        lbl_linkEmpresa.setText("Link empresa");
        panel_ingreso_usuarios.add(lbl_linkEmpresa);
        lbl_linkEmpresa.setBounds(30, 480, 100, 19);
        lbl_linkEmpresa.setVisible(false);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel71.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel71.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel71.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel71.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_ingreso_usuarios.add(jLabel71);
        jLabel71.setBounds(980, 540, 45, 46);

        jLabel159.setBackground(java.awt.Color.darkGray);
        jLabel159.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel159.setForeground(java.awt.Color.darkGray);
        jLabel159.setText("año");
        panel_ingreso_usuarios.add(jLabel159);
        jLabel159.setBounds(390, 300, 30, 20);

        cmb_mes.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_usuarios.add(cmb_mes);
        cmb_mes.setBounds(270, 320, 60, 20);
        cmb_mes.removeAllItems();
        for(int x = 1; x <= 12; x++){
            cmb_mes.addItem(""+x);
        }

        cmb_anio.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_usuarios.add(cmb_anio);
        cmb_anio.setBounds(370, 320, 60, 20);
        cmb_anio.removeAllItems();
        for(int x = 2016; x >= 1950; x--){
            cmb_anio.addItem(""+x);
        }

        cmb_dia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_dia.setAutoscrolls(true);
        panel_ingreso_usuarios.add(cmb_dia);
        cmb_dia.setBounds(170, 320, 60, 20);
        cmb_dia.removeAllItems();
        for(int x = 1; x <= 31; x++){
            cmb_dia.addItem(""+x);
        }

        jLabel161.setBackground(java.awt.Color.darkGray);
        jLabel161.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel161.setForeground(java.awt.Color.darkGray);
        jLabel161.setText("Nickname");
        panel_ingreso_usuarios.add(jLabel161);
        jLabel161.setBounds(30, 160, 80, 20);

        jLabel209.setBackground(java.awt.Color.darkGray);
        jLabel209.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel209.setForeground(java.awt.Color.darkGray);
        jLabel209.setText("dia");
        panel_ingreso_usuarios.add(jLabel209);
        jLabel209.setBounds(190, 300, 30, 20);

        jLabel210.setBackground(java.awt.Color.darkGray);
        jLabel210.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel210.setForeground(java.awt.Color.darkGray);
        jLabel210.setText("/");
        panel_ingreso_usuarios.add(jLabel210);
        jLabel210.setBounds(350, 320, 10, 20);

        jLabel211.setBackground(java.awt.Color.darkGray);
        jLabel211.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel211.setForeground(java.awt.Color.darkGray);
        jLabel211.setText("mes");
        panel_ingreso_usuarios.add(jLabel211);
        jLabel211.setBounds(290, 300, 30, 20);

        jLabel212.setBackground(java.awt.Color.darkGray);
        jLabel212.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel212.setForeground(java.awt.Color.darkGray);
        jLabel212.setText("/");
        panel_ingreso_usuarios.add(jLabel212);
        jLabel212.setBounds(250, 320, 10, 20);

        chk_cliente.setBackground(java.awt.Color.lightGray);
        buttonGroup1.add(chk_cliente);
        chk_cliente.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
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
        panel_ingreso_usuarios.add(chk_cliente);
        chk_cliente.setBounds(70, 90, 69, 23);

        chk_proveedor.setBackground(java.awt.Color.lightGray);
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
        panel_ingreso_usuarios.add(chk_proveedor);
        chk_proveedor.setBounds(170, 90, 100, 20);

        getContentPane().add(panel_ingreso_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, 150, 110));
        getContentPane().remove(panel_ingreso_usuarios);
        getContentPane().add(panel_ingreso_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_usuarios.setVisible(false);

        lbl_mostrar_acercaDe.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_acercaDe.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_acercaDe.setForeground(java.awt.Color.white);
        lbl_mostrar_acercaDe.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_acercaDe.setText("Acerca de   ");
        lbl_mostrar_acercaDe.setOpaque(true);
        getContentPane().add(lbl_mostrar_acercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 130, 30));
        lbl_mostrar_acercaDe.setVisible(false);

        lbl_mostrar_cerrar.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_cerrar.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_cerrar.setForeground(java.awt.Color.white);
        lbl_mostrar_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_cerrar.setText("Salir   ");
        lbl_mostrar_cerrar.setOpaque(true);
        getContentPane().add(lbl_mostrar_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 130, 30));
        lbl_mostrar_cerrar.setVisible(false);

        panel_ingreso_servicios.setBackground(java.awt.Color.lightGray);
        panel_ingreso_servicios.setLayout(null);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel92.setText("jLabel4");
        jLabel92.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });
        panel_ingreso_servicios.add(jLabel92);
        jLabel92.setBounds(995, 5, 30, 30);

        jLabel94.setBackground(new java.awt.Color(33, 33, 33));
        jLabel94.setOpaque(true);
        panel_ingreso_servicios.add(jLabel94);
        jLabel94.setBounds(-2, 0, 1310, 40);

        jLabel95.setBackground(java.awt.Color.darkGray);
        jLabel95.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel95.setForeground(java.awt.Color.darkGray);
        jLabel95.setText("Imagen(opcional)");
        panel_ingreso_servicios.add(jLabel95);
        jLabel95.setBounds(520, 50, 150, 40);
        panel_ingreso_servicios.add(jTextField11);
        jTextField11.setBounds(190, 228, 310, 20);

        jLabel96.setBackground(java.awt.Color.darkGray);
        jLabel96.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel96.setForeground(java.awt.Color.darkGray);
        jLabel96.setText("Nombre");
        panel_ingreso_servicios.add(jLabel96);
        jLabel96.setBounds(10, 100, 80, 40);
        panel_ingreso_servicios.add(jTextField12);
        jTextField12.setBounds(100, 110, 400, 20);

        jLabel97.setBackground(java.awt.Color.darkGray);
        jLabel97.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel97.setForeground(java.awt.Color.darkGray);
        jLabel97.setText("- Destino(opcional)");
        panel_ingreso_servicios.add(jLabel97);
        jLabel97.setBounds(30, 220, 160, 40);

        jLabel98.setBackground(java.awt.Color.darkGray);
        jLabel98.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel98.setForeground(java.awt.Color.darkGray);
        jLabel98.setText("Descripcion");
        panel_ingreso_servicios.add(jLabel98);
        jLabel98.setBounds(10, 280, 100, 40);

        jLabel99.setBackground(java.awt.Color.darkGray);
        jLabel99.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel99.setForeground(java.awt.Color.darkGray);
        jLabel99.setText("Proveedor");
        panel_ingreso_servicios.add(jLabel99);
        jLabel99.setBounds(10, 50, 90, 40);

        jButton2.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_ingreso_servicios.add(jButton2);
        jButton2.setBounds(640, 50, 140, 30);

        jLabel59.setText("Aqui se mostrara imagen");
        panel_ingreso_servicios.add(jLabel59);
        jLabel59.setBounds(520, 110, 420, 210);

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel72.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel72.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel72.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_ingreso_servicios.add(jLabel72);
        jLabel72.setBounds(980, 540, 45, 46);

        jLabel102.setBackground(java.awt.Color.darkGray);
        jLabel102.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel102.setForeground(java.awt.Color.darkGray);
        jLabel102.setText("Ciudad");
        panel_ingreso_servicios.add(jLabel102);
        jLabel102.setBounds(10, 150, 60, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_servicios.add(jComboBox1);
        jComboBox1.setBounds(110, 55, 390, 20);

        jLabel103.setBackground(java.awt.Color.darkGray);
        jLabel103.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel103.setForeground(java.awt.Color.darkGray);
        jLabel103.setText("- Origen");
        panel_ingreso_servicios.add(jLabel103);
        jLabel103.setBounds(30, 180, 80, 40);
        panel_ingreso_servicios.add(jTextField19);
        jTextField19.setBounds(190, 185, 310, 20);

        jScrollPane1.setViewportView(jTextPane1);

        panel_ingreso_servicios.add(jScrollPane1);
        jScrollPane1.setBounds(120, 290, 380, 150);

        getContentPane().add(panel_ingreso_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, 160, 110));
        getContentPane().remove(panel_ingreso_servicios);
        getContentPane().add(panel_ingreso_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_servicios.setVisible(false);

        panel_izq.setBackground(java.awt.Color.darkGray);
        panel_izq.setLayout(null);

        ingreso_reservas.setBackground(java.awt.Color.darkGray);
        ingreso_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_reservasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_reservasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_reservasMouseEntered(evt);
            }
        });
        ingreso_reservas.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_reservas.add(jLabel15);
        jLabel15.setBounds(90, 35, 50, 50);

        jLabel20.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("RESERVAS");
        ingreso_reservas.add(jLabel20);
        jLabel20.setBounds(65, 80, 100, 40);

        panel_izq.add(ingreso_reservas);
        ingreso_reservas.setBounds(215, 40, 215, 150);

        ingreso_categorias.setBackground(java.awt.Color.darkGray);
        ingreso_categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_categoriasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_categoriasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_categoriasMouseEntered(evt);
            }
        });
        ingreso_categorias.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/list.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_categorias.add(jLabel10);
        jLabel10.setBounds(90, 30, 40, 50);

        jLabel18.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("CATEGORIAS");
        ingreso_categorias.add(jLabel18);
        jLabel18.setBounds(50, 80, 120, 40);

        panel_izq.add(ingreso_categorias);
        ingreso_categorias.setBounds(0, 340, 215, 150);

        ingreso_usuarios.setBackground(java.awt.Color.darkGray);
        ingreso_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_usuariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_usuariosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_usuariosMouseEntered(evt);
            }
        });
        ingreso_usuarios.setLayout(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/usuarios.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_usuarios.add(jLabel19);
        jLabel19.setBounds(90, 40, 50, 50);

        jLabel8.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("USUARIOS");
        ingreso_usuarios.add(jLabel8);
        jLabel8.setBounds(65, 80, 100, 40);

        panel_izq.add(ingreso_usuarios);
        ingreso_usuarios.setBounds(75, 80, 140, 110);
        ingreso_usuarios.setBounds(0, 40, 215, 150);

        ingreso_servicios.setBackground(java.awt.Color.darkGray);
        ingreso_servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_serviciosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_serviciosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_serviciosMouseEntered(evt);
            }
        });
        ingreso_servicios.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/serviciosYpromos.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_servicios.add(jLabel17);
        jLabel17.setBounds(90, 35, 50, 50);

        jLabel22.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("SERVICIOS");
        ingreso_servicios.add(jLabel22);
        jLabel22.setBounds(65, 80, 120, 40);

        panel_izq.add(ingreso_servicios);
        ingreso_servicios.setBounds(0, 190, 215, 150);

        ingreso_promociones.setBackground(java.awt.Color.darkGray);
        ingreso_promociones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_promociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_promocionesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_promocionesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_promocionesMouseEntered(evt);
            }
        });
        ingreso_promociones.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/tag.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_promociones.add(jLabel21);
        jLabel21.setBounds(90, 30, 40, 60);

        jLabel16.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("PROMOCIONES");
        ingreso_promociones.add(jLabel16);
        jLabel16.setBounds(40, 80, 150, 40);

        panel_izq.add(ingreso_promociones);
        ingreso_promociones.setBounds(215, 190, 215, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setFocusable(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panel_izq.add(jLabel4);
        jLabel4.setBounds(395, 5, 30, 30);

        jLabel14.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Ingreso de...");
        panel_izq.add(jLabel14);
        jLabel14.setBounds(10, 0, 180, 40);

        jLabel30.setBackground(new java.awt.Color(33, 33, 33));
        jLabel30.setOpaque(true);
        panel_izq.add(jLabel30);
        jLabel30.setBounds(0, 0, 430, 40);

        getContentPane().add(panel_izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 170, 130));
        getContentPane().remove(panel_izq);
        getContentPane().add(panel_izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq.setVisible(false);

        panel_izq_acerca_de.setBackground(java.awt.Color.darkGray);
        panel_izq_acerca_de.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panel_izq_acerca_deComponentShown(evt);
            }
        });
        panel_izq_acerca_de.setLayout(null);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel33.setText("jLabel4");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        panel_izq_acerca_de.add(jLabel33);
        jLabel33.setBounds(395, 5, 30, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/Help4Travelling-logo.png"))); // NOI18N
        jLabel25.setText("jLabel25");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel_izq_acerca_de.add(jLabel25);
        jLabel25.setBounds(10, 47, 80, 80);

        jLabel41.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel41.setForeground(java.awt.Color.white);
        jLabel41.setText("Version 0.1");
        panel_izq_acerca_de.add(jLabel41);
        jLabel41.setBounds(270, 80, 90, 24);

        jLabel40.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel40.setForeground(java.awt.Color.gray);
        jLabel40.setText("Moretto Pedro");
        panel_izq_acerca_de.add(jLabel40);
        jLabel40.setBounds(30, 560, 460, 21);

        jLabel36.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabel36.setForeground(java.awt.Color.white);
        jLabel36.setText("Help4Travelling");
        panel_izq_acerca_de.add(jLabel36);
        jLabel36.setBounds(110, 50, 290, 40);

        jLabel27.setBackground(new java.awt.Color(33, 33, 33));
        jLabel27.setOpaque(true);
        panel_izq_acerca_de.add(jLabel27);
        jLabel27.setBounds(0, 0, 430, 40);

        jLabel26.setBackground(new java.awt.Color(48, 48, 48));
        jLabel26.setOpaque(true);
        panel_izq_acerca_de.add(jLabel26);
        jLabel26.setBounds(100, 0, 330, 120);

        jLabel53.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel53.setForeground(java.awt.Color.gray);
        jLabel53.setText("Integrantes del grupo:");
        panel_izq_acerca_de.add(jLabel53);
        jLabel53.setBounds(10, 430, 460, 24);

        jLabel54.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel54.setForeground(java.awt.Color.gray);
        jLabel54.setText("Drago Enzo");
        panel_izq_acerca_de.add(jLabel54);
        jLabel54.setBounds(30, 480, 460, 21);

        jLabel55.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel55.setForeground(java.awt.Color.gray);
        jLabel55.setText("García José Ignacio");
        panel_izq_acerca_de.add(jLabel55);
        jLabel55.setBounds(30, 500, 460, 21);

        jLabel56.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel56.setForeground(java.awt.Color.gray);
        jLabel56.setText("Maidana Agustín");
        panel_izq_acerca_de.add(jLabel56);
        jLabel56.setBounds(30, 520, 460, 21);

        jLabel57.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel57.setForeground(java.awt.Color.gray);
        jLabel57.setText("Mancebo Alejandro");
        panel_izq_acerca_de.add(jLabel57);
        jLabel57.setBounds(30, 540, 460, 21);

        jLabel58.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel58.setForeground(java.awt.Color.gray);
        jLabel58.setText("Carballido Bruno");
        panel_izq_acerca_de.add(jLabel58);
        jLabel58.setBounds(30, 460, 460, 21);

        getContentPane().add(panel_izq_acerca_de, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 110, 160));
        getContentPane().remove(panel_izq_acerca_de);
        getContentPane().add(panel_izq_acerca_de, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_acerca_de.setVisible(false);

        panel_izq_eliminaciones.setBackground(java.awt.Color.darkGray);
        panel_izq_eliminaciones.setLayout(null);

        eliminacion_reservas.setBackground(java.awt.Color.darkGray);
        eliminacion_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminacion_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminacion_reservasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminacion_reservasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminacion_reservasMouseEntered(evt);
            }
        });
        eliminacion_reservas.setLayout(null);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel23.setText("jLabel15");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        eliminacion_reservas.add(jLabel23);
        jLabel23.setBounds(83, 37, 50, 50);

        jLabel24.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("RESERVAS");
        eliminacion_reservas.add(jLabel24);
        jLabel24.setBounds(60, 80, 100, 40);

        panel_izq_eliminaciones.add(eliminacion_reservas);
        eliminacion_reservas.setBounds(50, 70, 215, 150);
        eliminacion_reservas.setBounds(0, 40, 215, 150);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel34.setText("jLabel4");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        panel_izq_eliminaciones.add(jLabel34);
        jLabel34.setBounds(395, 5, 30, 30);

        jLabel35.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel35.setForeground(java.awt.Color.white);
        jLabel35.setText("Eliminacion de...");
        panel_izq_eliminaciones.add(jLabel35);
        jLabel35.setBounds(10, 0, 210, 40);

        jLabel29.setBackground(new java.awt.Color(33, 33, 33));
        jLabel29.setOpaque(true);
        panel_izq_eliminaciones.add(jLabel29);
        jLabel29.setBounds(0, 0, 430, 40);

        getContentPane().add(panel_izq_eliminaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 160, 100));
        getContentPane().remove(panel_izq_eliminaciones);
        getContentPane().add(panel_izq_eliminaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_eliminaciones.setVisible(false);

        panel_izq_actualizaciones.setBackground(java.awt.Color.darkGray);
        panel_izq_actualizaciones.setLayout(null);

        actualizacion_reservas.setBackground(java.awt.Color.darkGray);
        actualizacion_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizacion_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizacion_reservasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizacion_reservasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizacion_reservasMouseEntered(evt);
            }
        });
        actualizacion_reservas.setLayout(null);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel38.setText("jLabel15");
        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        actualizacion_reservas.add(jLabel38);
        jLabel38.setBounds(80, 35, 50, 50);

        jLabel39.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel39.setForeground(java.awt.Color.white);
        jLabel39.setText("ESTADO DE RESERVA");
        actualizacion_reservas.add(jLabel39);
        jLabel39.setBounds(13, 70, 200, 60);

        panel_izq_actualizaciones.add(actualizacion_reservas);
        actualizacion_reservas.setBounds(215, 40, 215, 150);

        actualizacion_servicios.setBackground(java.awt.Color.darkGray);
        actualizacion_servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizacion_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizacion_serviciosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizacion_serviciosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizacion_serviciosMouseEntered(evt);
            }
        });
        actualizacion_servicios.setLayout(null);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/serviciosYpromos.png"))); // NOI18N
        jLabel44.setText("jLabel17");
        jLabel44.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        actualizacion_servicios.add(jLabel44);
        jLabel44.setBounds(90, 37, 50, 50);

        jLabel45.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel45.setForeground(java.awt.Color.white);
        jLabel45.setText("SERVICIOS");
        actualizacion_servicios.add(jLabel45);
        jLabel45.setBounds(63, 80, 100, 40);

        panel_izq_actualizaciones.add(actualizacion_servicios);
        actualizacion_servicios.setBounds(40, 130, 215, 150);
        actualizacion_servicios.setBounds(0, 40, 215, 150);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel48.setText("jLabel4");
        jLabel48.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        panel_izq_actualizaciones.add(jLabel48);
        jLabel48.setBounds(395, 5, 30, 30);

        jLabel49.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel49.setForeground(java.awt.Color.white);
        jLabel49.setText("Actualizacion de...");
        panel_izq_actualizaciones.add(jLabel49);
        jLabel49.setBounds(10, 0, 220, 40);

        jLabel28.setBackground(new java.awt.Color(33, 33, 33));
        jLabel28.setOpaque(true);
        panel_izq_actualizaciones.add(jLabel28);
        jLabel28.setBounds(0, 0, 430, 40);

        getContentPane().add(panel_izq_actualizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 160, 110));
        getContentPane().remove(panel_izq_actualizaciones);
        getContentPane().add(panel_izq_actualizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_actualizaciones.setVisible(false);

        panel_izq_consultas.setBackground(java.awt.Color.darkGray);
        panel_izq_consultas.setLayout(null);

        consultar_proveedores.setBackground(java.awt.Color.darkGray);
        consultar_proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_proveedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_proveedoresMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_proveedoresMouseEntered(evt);
            }
        });
        consultar_proveedores.setLayout(null);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/proveedor.png"))); // NOI18N
        jLabel31.setText("jLabel15");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_proveedores.add(jLabel31);
        jLabel31.setBounds(77, 35, 80, 60);

        jLabel32.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel32.setForeground(java.awt.Color.white);
        jLabel32.setText("PROVEEDORES");
        consultar_proveedores.add(jLabel32);
        jLabel32.setBounds(40, 85, 140, 40);

        panel_izq_consultas.add(consultar_proveedores);
        consultar_proveedores.setBounds(215, 40, 215, 150);

        consultar_clientes.setBackground(java.awt.Color.darkGray);
        consultar_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_clientesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_clientesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_clientesMouseEntered(evt);
            }
        });
        consultar_clientes.setLayout(null);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/clientes.png"))); // NOI18N
        jLabel60.setText("jLabel19");
        jLabel60.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_clientes.add(jLabel60);
        jLabel60.setBounds(80, 35, 70, 60);

        jLabel61.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel61.setForeground(java.awt.Color.white);
        jLabel61.setText("CLIENTES");
        consultar_clientes.add(jLabel61);
        jLabel61.setBounds(65, 85, 90, 40);

        panel_izq_consultas.add(consultar_clientes);
        consultar_clientes.setBounds(150, 340, 215, 150);
        consultar_clientes.setBounds(0, 40, 215, 150);

        consultar_servicios.setBackground(java.awt.Color.darkGray);
        consultar_servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_serviciosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_serviciosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_serviciosMouseEntered(evt);
            }
        });
        consultar_servicios.setLayout(null);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/serviciosYpromos.png"))); // NOI18N
        jLabel62.setText("jLabel17");
        jLabel62.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_servicios.add(jLabel62);
        jLabel62.setBounds(85, 43, 50, 50);

        jLabel63.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel63.setForeground(java.awt.Color.white);
        jLabel63.setText("SERVICIOS");
        consultar_servicios.add(jLabel63);
        jLabel63.setBounds(57, 85, 100, 40);

        panel_izq_consultas.add(consultar_servicios);
        consultar_servicios.setBounds(0, 190, 215, 150);

        consultar_promociones.setBackground(java.awt.Color.darkGray);
        consultar_promociones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_promociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_promocionesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_promocionesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_promocionesMouseEntered(evt);
            }
        });
        consultar_promociones.setLayout(null);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/tag.png"))); // NOI18N
        jLabel64.setText("jLabel21");
        jLabel64.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_promociones.add(jLabel64);
        jLabel64.setBounds(93, 35, 40, 60);

        jLabel65.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel65.setForeground(java.awt.Color.white);
        jLabel65.setText("PROMOCIONES");
        consultar_promociones.add(jLabel65);
        jLabel65.setBounds(37, 85, 150, 40);

        panel_izq_consultas.add(consultar_promociones);
        consultar_promociones.setBounds(215, 190, 215, 150);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel66.setText("jLabel4");
        jLabel66.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        panel_izq_consultas.add(jLabel66);
        jLabel66.setBounds(395, 5, 30, 30);

        jLabel67.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel67.setForeground(java.awt.Color.white);
        jLabel67.setText("Ver información de...");
        panel_izq_consultas.add(jLabel67);
        jLabel67.setBounds(10, 0, 230, 40);

        jLabel68.setBackground(new java.awt.Color(33, 33, 33));
        jLabel68.setOpaque(true);
        panel_izq_consultas.add(jLabel68);
        jLabel68.setBounds(0, 0, 500, 40);

        consultar_reservas.setBackground(java.awt.Color.darkGray);
        consultar_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_reservasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_reservasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_reservasMouseEntered(evt);
            }
        });
        consultar_reservas.setLayout(null);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel69.setText("jLabel15");
        jLabel69.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_reservas.add(jLabel69);
        jLabel69.setBounds(85, 40, 50, 50);

        jLabel70.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel70.setForeground(java.awt.Color.white);
        jLabel70.setText("RESERVAS");
        consultar_reservas.add(jLabel70);
        jLabel70.setBounds(60, 85, 100, 40);

        panel_izq_consultas.add(consultar_reservas);
        consultar_reservas.setBounds(0, 340, 215, 150);

        getContentPane().add(panel_izq_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 170, 120));
        getContentPane().remove(panel_izq_consultas);
        getContentPane().add(panel_izq_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_consultas.setVisible(false);

        jLabel83.setBackground(new java.awt.Color(33, 33, 33));
        jLabel83.setOpaque(true);
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 590));

        panel_ingreso_categorias.setBackground(java.awt.Color.lightGray);
        panel_ingreso_categorias.setLayout(null);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel93.setText("jLabel4");
        jLabel93.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel93.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
        });
        panel_ingreso_categorias.add(jLabel93);
        jLabel93.setBounds(995, 5, 30, 30);

        jLabel100.setBackground(new java.awt.Color(33, 33, 33));
        jLabel100.setOpaque(true);
        panel_ingreso_categorias.add(jLabel100);
        jLabel100.setBounds(-2, 0, 1310, 40);

        jLabel104.setBackground(java.awt.Color.darkGray);
        jLabel104.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel104.setForeground(java.awt.Color.darkGray);
        jLabel104.setText("Nombre");
        panel_ingreso_categorias.add(jLabel104);
        jLabel104.setBounds(20, 50, 80, 40);
        panel_ingreso_categorias.add(jTextField14);
        jTextField14.setBounds(110, 60, 400, 20);

        jLabel107.setBackground(java.awt.Color.darkGray);
        jLabel107.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel107.setForeground(java.awt.Color.darkGray);
        jLabel107.setText("Categoria Padre");
        panel_ingreso_categorias.add(jLabel107);
        jLabel107.setBounds(20, 110, 160, 40);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel74.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel74.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel74.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_ingreso_categorias.add(jLabel74);
        jLabel74.setBounds(970, 530, 45, 46);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_categorias.add(jComboBox2);
        jComboBox2.setBounds(160, 117, 350, 20);

        getContentPane().add(panel_ingreso_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 140, 100));
        getContentPane().remove(panel_ingreso_categorias);
        getContentPane().add(panel_ingreso_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_categorias.setVisible(false);

        panel_ingreso_promociones.setBackground(java.awt.Color.lightGray);
        panel_ingreso_promociones.setLayout(null);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel101.setText("jLabel4");
        jLabel101.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel101.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel101MouseClicked(evt);
            }
        });
        panel_ingreso_promociones.add(jLabel101);
        jLabel101.setBounds(995, 5, 30, 30);

        jLabel105.setBackground(new java.awt.Color(33, 33, 33));
        jLabel105.setOpaque(true);
        panel_ingreso_promociones.add(jLabel105);
        jLabel105.setBounds(-2, 0, 1310, 40);

        jLabel108.setBackground(java.awt.Color.darkGray);
        jLabel108.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel108.setForeground(java.awt.Color.darkGray);
        jLabel108.setText("Servicios a incluir:");
        panel_ingreso_promociones.add(jLabel108);
        jLabel108.setBounds(10, 290, 150, 40);
        panel_ingreso_promociones.add(jTextField15);
        jTextField15.setBounds(110, 210, 60, 20);

        jLabel111.setBackground(java.awt.Color.darkGray);
        jLabel111.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel111.setForeground(java.awt.Color.darkGray);
        jLabel111.setText("Proveedor");
        panel_ingreso_promociones.add(jLabel111);
        jLabel111.setBounds(10, 50, 90, 40);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel75.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel75.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel75.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel75.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_ingreso_promociones.add(jLabel75);
        jLabel75.setBounds(970, 530, 45, 46);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_promociones.add(jComboBox3);
        jComboBox3.setBounds(210, 105, 290, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_promociones.add(jComboBox4);
        jComboBox4.setBounds(110, 55, 390, 20);

        jLabel115.setBackground(java.awt.Color.darkGray);
        jLabel115.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel115.setForeground(java.awt.Color.darkGray);
        jLabel115.setText("Servicios del proveedor:");
        panel_ingreso_promociones.add(jLabel115);
        jLabel115.setBounds(10, 100, 200, 40);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        panel_ingreso_promociones.add(jScrollPane3);
        jScrollPane3.setBounds(160, 300, 340, 280);

        jLabel116.setBackground(java.awt.Color.darkGray);
        jLabel116.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel116.setForeground(java.awt.Color.darkGray);
        jLabel116.setText("Nombre");
        panel_ingreso_promociones.add(jLabel116);
        jLabel116.setBounds(10, 150, 80, 40);
        panel_ingreso_promociones.add(jTextField16);
        jTextField16.setBounds(100, 160, 400, 20);

        jLabel117.setBackground(java.awt.Color.darkGray);
        jLabel117.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel117.setForeground(java.awt.Color.darkGray);
        jLabel117.setText("Precio total");
        panel_ingreso_promociones.add(jLabel117);
        jLabel117.setBounds(10, 250, 90, 40);

        jLabel118.setBackground(java.awt.Color.darkGray);
        jLabel118.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel118.setForeground(java.awt.Color.darkGray);
        jLabel118.setText("Descuento");
        panel_ingreso_promociones.add(jLabel118);
        jLabel118.setBounds(10, 200, 90, 40);

        jLabel119.setBackground(java.awt.Color.darkGray);
        jLabel119.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel119.setForeground(java.awt.Color.darkGray);
        jLabel119.setText("%");
        panel_ingreso_promociones.add(jLabel119);
        jLabel119.setBounds(180, 200, 20, 40);

        getContentPane().add(panel_ingreso_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 220, 140, 110));
        getContentPane().remove(panel_ingreso_promociones);
        getContentPane().add(panel_ingreso_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_promociones.setVisible(false);

        panel_ingreso_reservas.setBackground(java.awt.Color.lightGray);
        panel_ingreso_reservas.setLayout(null);

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel106.setText("jLabel4");
        jLabel106.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel106.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel106MouseClicked(evt);
            }
        });
        panel_ingreso_reservas.add(jLabel106);
        jLabel106.setBounds(995, 5, 30, 30);

        jLabel109.setBackground(new java.awt.Color(33, 33, 33));
        jLabel109.setOpaque(true);
        panel_ingreso_reservas.add(jLabel109);
        jLabel109.setBounds(-2, 0, 1310, 40);

        jLabel112.setBackground(java.awt.Color.darkGray);
        jLabel112.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel112.setForeground(java.awt.Color.darkGray);
        jLabel112.setText("Precio total");
        panel_ingreso_reservas.add(jLabel112);
        jLabel112.setBounds(540, 410, 120, 40);

        jLabel120.setBackground(java.awt.Color.darkGray);
        jLabel120.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel120.setForeground(java.awt.Color.darkGray);
        jLabel120.setText("Cliente");
        panel_ingreso_reservas.add(jLabel120);
        jLabel120.setBounds(10, 50, 90, 40);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel76.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel76.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel76.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel76.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_ingreso_reservas.add(jLabel76);
        jLabel76.setBounds(980, 540, 45, 46);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_reservas.add(jComboBox5);
        jComboBox5.setBounds(110, 55, 390, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_reservas.add(jComboBox6);
        jComboBox6.setBounds(110, 110, 390, 20);

        jLabel123.setBackground(java.awt.Color.darkGray);
        jLabel123.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel123.setForeground(java.awt.Color.darkGray);
        jLabel123.setText("Proveedor");
        panel_ingreso_reservas.add(jLabel123);
        jLabel123.setBounds(10, 100, 90, 40);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_reservas.add(jComboBox7);
        jComboBox7.setBounds(10, 190, 310, 20);

        jLabel124.setBackground(java.awt.Color.darkGray);
        jLabel124.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel124.setForeground(java.awt.Color.darkGray);
        jLabel124.setText("Fecha de Creacion");
        panel_ingreso_reservas.add(jLabel124);
        jLabel124.setBounds(540, 370, 160, 40);

        jLabel125.setBackground(java.awt.Color.darkGray);
        jLabel125.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel125.setForeground(java.awt.Color.darkGray);
        jLabel125.setText("Servicios y promociones del proveedor");
        panel_ingreso_reservas.add(jLabel125);
        jLabel125.setBounds(10, 150, 310, 40);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        panel_ingreso_reservas.add(jScrollPane4);
        jScrollPane4.setBounds(540, 90, 460, 260);

        jLabel126.setBackground(java.awt.Color.darkGray);
        jLabel126.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel126.setForeground(java.awt.Color.darkGray);
        jLabel126.setText("Incluidos actualmente en la reserva");
        panel_ingreso_reservas.add(jLabel126);
        jLabel126.setBounds(540, 50, 310, 40);

        getContentPane().add(panel_ingreso_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 150, 100));
        getContentPane().remove(panel_ingreso_reservas);
        getContentPane().add(panel_ingreso_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_reservas.setVisible(false);

        panel_consultas_proveedores.setBackground(java.awt.Color.lightGray);
        panel_consultas_proveedores.setLayout(null);

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel179.setText("jLabel4");
        jLabel179.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel179.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel179.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel179MouseClicked(evt);
            }
        });
        panel_consultas_proveedores.add(jLabel179);
        jLabel179.setBounds(995, 5, 40, 40);

        jLabel180.setBackground(new java.awt.Color(33, 33, 33));
        jLabel180.setOpaque(true);
        panel_consultas_proveedores.add(jLabel180);
        jLabel180.setBounds(-2, 0, 1310, 40);

        jLabel181.setBackground(java.awt.Color.darkGray);
        jLabel181.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel181.setForeground(java.awt.Color.darkGray);
        jLabel181.setText("Servicios vinculados al proveedor");
        panel_consultas_proveedores.add(jLabel181);
        jLabel181.setBounds(10, 360, 280, 40);

        jLabel182.setBackground(java.awt.Color.darkGray);
        jLabel182.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel182.setForeground(java.awt.Color.darkGray);
        jLabel182.setText("Proveedores");
        panel_consultas_proveedores.add(jLabel182);
        jLabel182.setBounds(10, 50, 80, 20);

        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel183.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel183.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel183.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel183.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel183.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel183MouseClicked(evt);
            }
        });
        panel_consultas_proveedores.add(jLabel183);
        jLabel183.setBounds(970, 530, 45, 46);

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_consultas_proveedores.add(jComboBox15);
        jComboBox15.setBounds(100, 50, 280, 20);

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane11.setViewportView(jList5);

        panel_consultas_proveedores.add(jScrollPane11);
        jScrollPane11.setBounds(10, 400, 370, 180);

        jLabel189.setBackground(java.awt.Color.darkGray);
        jLabel189.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel189.setForeground(java.awt.Color.darkGray);
        jLabel189.setText("- Destino");
        panel_consultas_proveedores.add(jLabel189);
        jLabel189.setBounds(410, 150, 160, 40);

        jLabel190.setBackground(java.awt.Color.darkGray);
        jLabel190.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel190.setForeground(java.awt.Color.darkGray);
        jLabel190.setText("Descripcion");
        panel_consultas_proveedores.add(jLabel190);
        jLabel190.setBounds(390, 210, 100, 40);

        jLabel191.setBackground(java.awt.Color.darkGray);
        jLabel191.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel191.setForeground(java.awt.Color.darkGray);
        jLabel191.setText("Imagenes");
        panel_consultas_proveedores.add(jLabel191);
        jLabel191.setBounds(390, 340, 90, 40);

        jLabel192.setBackground(java.awt.Color.darkGray);
        jLabel192.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel192.setForeground(java.awt.Color.darkGray);
        jLabel192.setText("Nombre");
        panel_consultas_proveedores.add(jLabel192);
        jLabel192.setBounds(390, 50, 80, 40);

        jLabel193.setBackground(java.awt.Color.darkGray);
        jLabel193.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel193.setForeground(java.awt.Color.darkGray);
        jLabel193.setText("- Origen");
        panel_consultas_proveedores.add(jLabel193);
        jLabel193.setBounds(410, 120, 80, 40);
        panel_consultas_proveedores.add(jTextField30);
        jTextField30.setBounds(460, 60, 310, 20);

        jScrollPane12.setViewportView(jTextPane5);

        panel_consultas_proveedores.add(jScrollPane12);
        jScrollPane12.setBounds(390, 250, 630, 90);

        jLabel194.setBackground(java.awt.Color.gray);
        jLabel194.setText("Aqui se mostrara imagen");
        jLabel194.setOpaque(true);
        panel_consultas_proveedores.add(jLabel194);
        jLabel194.setBounds(820, 380, 200, 120);

        jLabel195.setBackground(java.awt.Color.gray);
        jLabel195.setText("Aqui se mostrara imagen");
        jLabel195.setOpaque(true);
        panel_consultas_proveedores.add(jLabel195);
        jLabel195.setBounds(410, 380, 190, 120);

        jLabel196.setBackground(java.awt.Color.gray);
        jLabel196.setText("Aqui se mostrara imagen");
        jLabel196.setOpaque(true);
        panel_consultas_proveedores.add(jLabel196);
        jLabel196.setBounds(610, 380, 200, 120);

        jLabel197.setBackground(java.awt.Color.darkGray);
        jLabel197.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel197.setForeground(java.awt.Color.darkGray);
        jLabel197.setText("Ciudad");
        panel_consultas_proveedores.add(jLabel197);
        jLabel197.setBounds(390, 90, 60, 40);

        jLabel198.setBackground(java.awt.Color.darkGray);
        jLabel198.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel198.setForeground(java.awt.Color.darkGray);
        jLabel198.setText("Fecha Nacimiento");
        panel_consultas_proveedores.add(jLabel198);
        jLabel198.setBounds(10, 210, 120, 19);
        panel_consultas_proveedores.add(jTextField10);
        jTextField10.setBounds(290, 210, 50, 20);
        panel_consultas_proveedores.add(jTextField31);
        jTextField31.setBounds(100, 90, 280, 20);

        jLabel200.setBackground(java.awt.Color.darkGray);
        jLabel200.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel200.setForeground(java.awt.Color.darkGray);
        jLabel200.setText("Nombre");
        panel_consultas_proveedores.add(jLabel200);
        jLabel200.setBounds(10, 130, 50, 20);
        panel_consultas_proveedores.add(jTextField32);
        jTextField32.setBounds(100, 130, 280, 20);

        jLabel201.setBackground(java.awt.Color.darkGray);
        jLabel201.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel201.setForeground(java.awt.Color.darkGray);
        jLabel201.setText("Apellido");
        panel_consultas_proveedores.add(jLabel201);
        jLabel201.setBounds(10, 170, 60, 19);
        panel_consultas_proveedores.add(jTextField33);
        jTextField33.setBounds(100, 170, 280, 20);
        panel_consultas_proveedores.add(jTextField34);
        jTextField34.setBounds(150, 210, 50, 20);
        panel_consultas_proveedores.add(jTextField35);
        jTextField35.setBounds(220, 210, 50, 20);

        jLabel202.setBackground(java.awt.Color.darkGray);
        jLabel202.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel202.setForeground(java.awt.Color.darkGray);
        jLabel202.setText("E-mail");
        panel_consultas_proveedores.add(jLabel202);
        jLabel202.setBounds(10, 240, 50, 40);
        panel_consultas_proveedores.add(jTextField36);
        jTextField36.setBounds(100, 250, 280, 20);

        jLabel203.setBackground(java.awt.Color.darkGray);
        jLabel203.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel203.setForeground(java.awt.Color.darkGray);
        jLabel203.setText("Nickname");
        panel_consultas_proveedores.add(jLabel203);
        jLabel203.setBounds(10, 90, 70, 20);

        jLabel73.setText("Aqui se mostrara imagen de usuario");
        panel_consultas_proveedores.add(jLabel73);
        jLabel73.setBounds(790, 60, 220, 140);

        jLabel204.setBackground(java.awt.Color.darkGray);
        jLabel204.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel204.setForeground(java.awt.Color.darkGray);
        jLabel204.setText("Nombre empresa");
        panel_consultas_proveedores.add(jLabel204);
        jLabel204.setBounds(10, 290, 110, 30);
        panel_consultas_proveedores.add(jTextField37);
        jTextField37.setBounds(140, 290, 240, 20);
        panel_consultas_proveedores.add(jTextField38);
        jTextField38.setBounds(140, 330, 240, 20);

        jLabel205.setBackground(java.awt.Color.darkGray);
        jLabel205.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel205.setForeground(java.awt.Color.darkGray);
        jLabel205.setText("Link empresa");
        panel_consultas_proveedores.add(jLabel205);
        jLabel205.setBounds(10, 330, 150, 30);

        getContentPane().add(panel_consultas_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, 180, 90));
        getContentPane().remove(panel_consultas_proveedores);
        getContentPane().add(panel_consultas_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_proveedores.setVisible(false);

        panel_actualizar_servicio.setBackground(java.awt.Color.lightGray);
        panel_actualizar_servicio.setLayout(null);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel110.setText("jLabel4");
        jLabel110.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel110.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel110MouseClicked(evt);
            }
        });
        panel_actualizar_servicio.add(jLabel110);
        jLabel110.setBounds(995, 5, 30, 30);

        jLabel113.setBackground(new java.awt.Color(33, 33, 33));
        jLabel113.setOpaque(true);
        panel_actualizar_servicio.add(jLabel113);
        jLabel113.setBounds(-2, 0, 1310, 40);
        panel_actualizar_servicio.add(jTextField13);
        jTextField13.setBounds(170, 170, 300, 20);

        jLabel122.setBackground(java.awt.Color.darkGray);
        jLabel122.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel122.setForeground(java.awt.Color.darkGray);
        jLabel122.setText("- Destino(opcional)");
        panel_actualizar_servicio.add(jLabel122);
        jLabel122.setBounds(30, 160, 160, 40);

        jLabel127.setBackground(java.awt.Color.darkGray);
        jLabel127.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel127.setForeground(java.awt.Color.darkGray);
        jLabel127.setText("Descripcion");
        panel_actualizar_servicio.add(jLabel127);
        jLabel127.setBounds(10, 200, 100, 40);

        jLabel128.setBackground(java.awt.Color.darkGray);
        jLabel128.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel128.setForeground(java.awt.Color.darkGray);
        jLabel128.setText("Imagenes");
        panel_actualizar_servicio.add(jLabel128);
        jLabel128.setBounds(490, 50, 90, 40);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel77.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel77.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel77.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel77.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_actualizar_servicio.add(jLabel77);
        jLabel77.setBounds(820, 440, 45, 46);

        jLabel129.setBackground(java.awt.Color.darkGray);
        jLabel129.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel129.setForeground(java.awt.Color.darkGray);
        jLabel129.setText("Ciudad");
        panel_actualizar_servicio.add(jLabel129);
        jLabel129.setBounds(10, 90, 60, 40);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_actualizar_servicio.add(jComboBox8);
        jComboBox8.setBounds(80, 60, 390, 20);

        jLabel130.setBackground(java.awt.Color.darkGray);
        jLabel130.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel130.setForeground(java.awt.Color.darkGray);
        jLabel130.setText("- Origen");
        panel_actualizar_servicio.add(jLabel130);
        jLabel130.setBounds(30, 120, 80, 40);
        panel_actualizar_servicio.add(jTextField20);
        jTextField20.setBounds(170, 130, 300, 20);

        jScrollPane2.setViewportView(jTextPane2);

        panel_actualizar_servicio.add(jScrollPane2);
        jScrollPane2.setBounds(10, 240, 460, 150);

        jLabel131.setBackground(java.awt.Color.darkGray);
        jLabel131.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel131.setForeground(java.awt.Color.darkGray);
        jLabel131.setText("Servicio");
        panel_actualizar_servicio.add(jLabel131);
        jLabel131.setBounds(10, 50, 90, 40);

        jLabel79.setBackground(java.awt.Color.gray);
        jLabel79.setText("Aqui se mostrara imagen");
        jLabel79.setOpaque(true);
        panel_actualizar_servicio.add(jLabel79);
        jLabel79.setBounds(570, 60, 150, 100);

        jButton3.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton3.setText("Seleccionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel_actualizar_servicio.add(jButton3);
        jButton3.setBounds(740, 90, 120, 30);

        jLabel199.setBackground(java.awt.Color.gray);
        jLabel199.setText("Aqui se mostrara imagen");
        jLabel199.setOpaque(true);
        panel_actualizar_servicio.add(jLabel199);
        jLabel199.setBounds(570, 170, 150, 100);

        jButton6.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton6.setText("Seleccionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel_actualizar_servicio.add(jButton6);
        jButton6.setBounds(740, 200, 120, 30);

        jLabel206.setBackground(java.awt.Color.gray);
        jLabel206.setText("Aqui se mostrara imagen");
        jLabel206.setOpaque(true);
        panel_actualizar_servicio.add(jLabel206);
        jLabel206.setBounds(570, 280, 150, 100);

        jButton7.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton7.setText("Seleccionar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel_actualizar_servicio.add(jButton7);
        jButton7.setBounds(740, 310, 120, 30);

        getContentPane().add(panel_actualizar_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, 140, 100));
        getContentPane().remove(panel_actualizar_servicio);
        getContentPane().add(panel_actualizar_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_actualizar_servicio.setVisible(false);

        panel_actualizar_reserva.setBackground(java.awt.Color.lightGray);
        panel_actualizar_reserva.setLayout(null);

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel114.setText("jLabel4");
        jLabel114.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel114.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
        });
        panel_actualizar_reserva.add(jLabel114);
        jLabel114.setBounds(995, 5, 30, 30);

        jLabel121.setBackground(new java.awt.Color(33, 33, 33));
        jLabel121.setOpaque(true);
        panel_actualizar_reserva.add(jLabel121);
        jLabel121.setBounds(-2, 0, 1310, 40);

        jLabel136.setBackground(java.awt.Color.darkGray);
        jLabel136.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel136.setForeground(java.awt.Color.darkGray);
        jLabel136.setText("Estado Nuevo");
        panel_actualizar_reserva.add(jLabel136);
        jLabel136.setBounds(630, 100, 130, 40);

        jLabel139.setBackground(java.awt.Color.darkGray);
        jLabel139.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel139.setForeground(java.awt.Color.darkGray);
        jLabel139.setText("Reservas \"registradas\"");
        panel_actualizar_reserva.add(jLabel139);
        jLabel139.setBounds(30, 70, 190, 40);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList3);

        panel_actualizar_reserva.add(jScrollPane6);
        jScrollPane6.setBounds(740, 110, 110, 150);

        jButton5.setText("Aceptar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel_actualizar_reserva.add(jButton5);
        jButton5.setBounds(880, 520, 100, 20);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(jTable3);

        panel_actualizar_reserva.add(jScrollPane14);
        jScrollPane14.setBounds(30, 120, 452, 402);

        getContentPane().add(panel_actualizar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 160, 110));
        getContentPane().remove(panel_actualizar_reserva);
        getContentPane().add(panel_actualizar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_actualizar_reserva.setVisible(false);

        panel_eliminar_reserva.setBackground(java.awt.Color.lightGray);
        panel_eliminar_reserva.setLayout(null);

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel132.setText("jLabel4");
        jLabel132.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel132.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel132MouseClicked(evt);
            }
        });
        panel_eliminar_reserva.add(jLabel132);
        jLabel132.setBounds(995, 5, 30, 30);

        jLabel133.setBackground(new java.awt.Color(33, 33, 33));
        jLabel133.setOpaque(true);
        panel_eliminar_reserva.add(jLabel133);
        jLabel133.setBounds(-2, 0, 1310, 40);

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel137.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel137.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel137.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel137.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_eliminar_reserva.add(jLabel137);
        jLabel137.setBounds(970, 530, 45, 46);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_eliminar_reserva.add(jComboBox10);
        jComboBox10.setBounds(110, 60, 390, 20);

        jLabel140.setBackground(java.awt.Color.darkGray);
        jLabel140.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel140.setForeground(java.awt.Color.darkGray);
        jLabel140.setText("Reservas");
        panel_eliminar_reserva.add(jLabel140);
        jLabel140.setBounds(10, 50, 190, 40);

        getContentPane().add(panel_eliminar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 160, 110));
        getContentPane().remove(panel_eliminar_reserva);
        getContentPane().add(panel_eliminar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_eliminar_reserva.setVisible(false);

        panel_consultas_reservas.setBackground(java.awt.Color.lightGray);
        panel_consultas_reservas.setLayout(null);

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel134.setText("jLabel4");
        jLabel134.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel134.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel134MouseClicked(evt);
            }
        });
        panel_consultas_reservas.add(jLabel134);
        jLabel134.setBounds(995, 5, 30, 30);

        jLabel138.setBackground(new java.awt.Color(33, 33, 33));
        jLabel138.setOpaque(true);
        panel_consultas_reservas.add(jLabel138);
        jLabel138.setBounds(-2, 0, 1310, 40);

        jLabel141.setBackground(java.awt.Color.darkGray);
        jLabel141.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel141.setForeground(java.awt.Color.darkGray);
        jLabel141.setText("Precio total");
        panel_consultas_reservas.add(jLabel141);
        jLabel141.setBounds(10, 150, 120, 40);

        jLabel142.setBackground(java.awt.Color.darkGray);
        jLabel142.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel142.setForeground(java.awt.Color.darkGray);
        jLabel142.setText("Reservas");
        panel_consultas_reservas.add(jLabel142);
        jLabel142.setBounds(10, 50, 90, 40);

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel143.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel143.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel143.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel143.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });
        panel_consultas_reservas.add(jLabel143);
        jLabel143.setBounds(970, 530, 45, 46);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_consultas_reservas.add(jComboBox11);
        jComboBox11.setBounds(90, 60, 390, 20);

        jLabel145.setBackground(java.awt.Color.darkGray);
        jLabel145.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel145.setForeground(java.awt.Color.darkGray);
        jLabel145.setText("Fecha de Creacion");
        panel_consultas_reservas.add(jLabel145);
        jLabel145.setBounds(10, 100, 160, 40);

        jLabel147.setBackground(java.awt.Color.darkGray);
        jLabel147.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel147.setForeground(java.awt.Color.darkGray);
        jLabel147.setText("Servicios y promociones asociados");
        panel_consultas_reservas.add(jLabel147);
        jLabel147.setBounds(10, 200, 310, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable1);

        panel_consultas_reservas.add(jScrollPane7);
        jScrollPane7.setBounds(10, 240, 420, 340);

        getContentPane().add(panel_consultas_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 180, 110));
        getContentPane().remove(panel_consultas_reservas);
        getContentPane().add(panel_consultas_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_reservas.setVisible(false);

        panel_consultas_servicios.setBackground(java.awt.Color.lightGray);
        panel_consultas_servicios.setLayout(null);

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel144.setText("jLabel4");
        jLabel144.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel144.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel144MouseClicked(evt);
            }
        });
        panel_consultas_servicios.add(jLabel144);
        jLabel144.setBounds(995, 5, 30, 30);

        jLabel146.setBackground(new java.awt.Color(33, 33, 33));
        jLabel146.setOpaque(true);
        panel_consultas_servicios.add(jLabel146);
        jLabel146.setBounds(-2, 0, 1310, 40);

        jLabel149.setBackground(java.awt.Color.darkGray);
        jLabel149.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel149.setForeground(java.awt.Color.darkGray);
        jLabel149.setText("Servicios de esa categoria");
        panel_consultas_servicios.add(jLabel149);
        jLabel149.setBounds(280, 40, 220, 40);

        jScrollPane5.setViewportView(jTree1);

        panel_consultas_servicios.add(jScrollPane5);
        jScrollPane5.setBounds(10, 80, 260, 500);

        jLabel153.setBackground(java.awt.Color.darkGray);
        jLabel153.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel153.setForeground(java.awt.Color.darkGray);
        jLabel153.setText("Servicios por categoria");
        panel_consultas_servicios.add(jLabel153);
        jLabel153.setBounds(20, 50, 150, 30);

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_consultas_servicios.add(jComboBox12);
        jComboBox12.setBounds(460, 50, 390, 20);
        panel_consultas_servicios.add(jTextField17);
        jTextField17.setBounds(340, 130, 310, 20);

        jLabel154.setBackground(java.awt.Color.darkGray);
        jLabel154.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel154.setForeground(java.awt.Color.darkGray);
        jLabel154.setText("- Destino(opcional)");
        panel_consultas_servicios.add(jLabel154);
        jLabel154.setBounds(300, 190, 120, 30);

        jLabel155.setBackground(java.awt.Color.darkGray);
        jLabel155.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel155.setForeground(java.awt.Color.darkGray);
        jLabel155.setText("Descripcion");
        panel_consultas_servicios.add(jLabel155);
        jLabel155.setBounds(280, 230, 100, 20);

        jLabel156.setBackground(java.awt.Color.darkGray);
        jLabel156.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel156.setForeground(java.awt.Color.darkGray);
        jLabel156.setText("Imagenes");
        panel_consultas_servicios.add(jLabel156);
        jLabel156.setBounds(280, 350, 90, 40);

        jLabel157.setBackground(java.awt.Color.darkGray);
        jLabel157.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel157.setForeground(java.awt.Color.darkGray);
        jLabel157.setText("Nombre");
        panel_consultas_servicios.add(jLabel157);
        jLabel157.setBounds(280, 90, 60, 20);

        jLabel158.setBackground(java.awt.Color.darkGray);
        jLabel158.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel158.setForeground(java.awt.Color.darkGray);
        jLabel158.setText("- Origen");
        panel_consultas_servicios.add(jLabel158);
        jLabel158.setBounds(300, 160, 60, 20);
        panel_consultas_servicios.add(jTextField21);
        jTextField21.setBounds(340, 90, 310, 20);

        jScrollPane9.setViewportView(jTextPane3);

        panel_consultas_servicios.add(jScrollPane9);
        jScrollPane9.setBounds(360, 230, 650, 120);

        jLabel160.setBackground(java.awt.Color.gray);
        jLabel160.setText("Aqui se mostrara imagen");
        jLabel160.setOpaque(true);
        panel_consultas_servicios.add(jLabel160);
        jLabel160.setBounds(500, 380, 200, 120);

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel162.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel162.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel162.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel162.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel162.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel162MouseClicked(evt);
            }
        });
        panel_consultas_servicios.add(jLabel162);
        jLabel162.setBounds(970, 530, 45, 46);

        jLabel169.setBackground(java.awt.Color.darkGray);
        jLabel169.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel169.setForeground(java.awt.Color.darkGray);
        jLabel169.setText("Ciudad");
        panel_consultas_servicios.add(jLabel169);
        jLabel169.setBounds(280, 120, 60, 20);

        jLabel175.setBackground(java.awt.Color.gray);
        jLabel175.setText("Aqui se mostrara imagen");
        jLabel175.setOpaque(true);
        panel_consultas_servicios.add(jLabel175);
        jLabel175.setBounds(720, 380, 200, 120);

        jLabel177.setBackground(java.awt.Color.gray);
        jLabel177.setText("Aqui se mostrara imagen");
        jLabel177.setOpaque(true);
        panel_consultas_servicios.add(jLabel177);
        jLabel177.setBounds(280, 380, 200, 120);

        getContentPane().add(panel_consultas_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 170, 90));
        getContentPane().remove(panel_consultas_servicios);
        getContentPane().add(panel_consultas_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_servicios.setVisible(false);

        panel_consultas_promociones.setBackground(java.awt.Color.lightGray);
        panel_consultas_promociones.setLayout(null);

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel148.setText("jLabel4");
        jLabel148.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel148.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel148.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel148MouseClicked(evt);
            }
        });
        panel_consultas_promociones.add(jLabel148);
        jLabel148.setBounds(995, 5, 30, 30);

        jLabel150.setBackground(new java.awt.Color(33, 33, 33));
        jLabel150.setOpaque(true);
        panel_consultas_promociones.add(jLabel150);
        jLabel150.setBounds(-2, 0, 1310, 40);

        jLabel151.setBackground(java.awt.Color.darkGray);
        jLabel151.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel151.setForeground(java.awt.Color.darkGray);
        jLabel151.setText("Servicios asociados");
        panel_consultas_promociones.add(jLabel151);
        jLabel151.setBounds(10, 250, 170, 40);
        panel_consultas_promociones.add(jTextField18);
        jTextField18.setBounds(100, 170, 60, 20);

        jLabel152.setBackground(java.awt.Color.darkGray);
        jLabel152.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel152.setForeground(java.awt.Color.darkGray);
        jLabel152.setText("Promociones");
        panel_consultas_promociones.add(jLabel152);
        jLabel152.setBounds(10, 50, 80, 20);

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel163.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel163.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel163.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel163.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel163.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel163MouseClicked(evt);
            }
        });
        panel_consultas_promociones.add(jLabel163);
        jLabel163.setBounds(970, 530, 45, 46);

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_consultas_promociones.add(jComboBox14);
        jComboBox14.setBounds(100, 50, 280, 20);

        jLabel164.setBackground(java.awt.Color.darkGray);
        jLabel164.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel164.setForeground(java.awt.Color.darkGray);
        jLabel164.setText("Proveedor:");
        panel_consultas_promociones.add(jLabel164);
        jLabel164.setBounds(10, 90, 80, 20);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jList4);

        panel_consultas_promociones.add(jScrollPane8);
        jScrollPane8.setBounds(10, 290, 370, 290);

        jLabel165.setBackground(java.awt.Color.darkGray);
        jLabel165.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel165.setForeground(java.awt.Color.darkGray);
        jLabel165.setText("Nombre");
        panel_consultas_promociones.add(jLabel165);
        jLabel165.setBounds(10, 130, 60, 20);
        panel_consultas_promociones.add(jTextField22);
        jTextField22.setBounds(100, 90, 280, 20);

        jLabel166.setBackground(java.awt.Color.darkGray);
        jLabel166.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel166.setForeground(java.awt.Color.darkGray);
        jLabel166.setText("Precio total");
        panel_consultas_promociones.add(jLabel166);
        jLabel166.setBounds(10, 220, 80, 20);

        jLabel167.setBackground(java.awt.Color.darkGray);
        jLabel167.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel167.setForeground(java.awt.Color.darkGray);
        jLabel167.setText("Descuento");
        panel_consultas_promociones.add(jLabel167);
        jLabel167.setBounds(10, 170, 70, 30);

        jLabel168.setBackground(java.awt.Color.darkGray);
        jLabel168.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel168.setForeground(java.awt.Color.darkGray);
        jLabel168.setText("%");
        panel_consultas_promociones.add(jLabel168);
        jLabel168.setBounds(170, 160, 20, 40);
        panel_consultas_promociones.add(jTextField23);
        jTextField23.setBounds(100, 130, 280, 20);
        panel_consultas_promociones.add(jTextField24);
        jTextField24.setBounds(480, 160, 310, 20);

        jLabel170.setBackground(java.awt.Color.darkGray);
        jLabel170.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel170.setForeground(java.awt.Color.darkGray);
        jLabel170.setText("- Destino");
        panel_consultas_promociones.add(jLabel170);
        jLabel170.setBounds(410, 150, 60, 19);

        jLabel171.setBackground(java.awt.Color.darkGray);
        jLabel171.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel171.setForeground(java.awt.Color.darkGray);
        jLabel171.setText("Descripcion");
        panel_consultas_promociones.add(jLabel171);
        jLabel171.setBounds(390, 190, 100, 40);

        jLabel172.setBackground(java.awt.Color.darkGray);
        jLabel172.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel172.setForeground(java.awt.Color.darkGray);
        jLabel172.setText("Imagenes");
        panel_consultas_promociones.add(jLabel172);
        jLabel172.setBounds(390, 320, 90, 40);

        jLabel173.setBackground(java.awt.Color.darkGray);
        jLabel173.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel173.setForeground(java.awt.Color.darkGray);
        jLabel173.setText("Nombre");
        panel_consultas_promociones.add(jLabel173);
        jLabel173.setBounds(390, 50, 70, 19);

        jLabel174.setBackground(java.awt.Color.darkGray);
        jLabel174.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel174.setForeground(java.awt.Color.darkGray);
        jLabel174.setText("- Origen");
        panel_consultas_promociones.add(jLabel174);
        jLabel174.setBounds(410, 120, 60, 20);
        panel_consultas_promociones.add(jTextField25);
        jTextField25.setBounds(480, 120, 310, 20);

        jScrollPane10.setViewportView(jTextPane4);

        panel_consultas_promociones.add(jScrollPane10);
        jScrollPane10.setBounds(390, 230, 620, 80);

        jLabel176.setBackground(java.awt.Color.gray);
        jLabel176.setText("Aqui se mostrara imagen");
        jLabel176.setOpaque(true);
        panel_consultas_promociones.add(jLabel176);
        jLabel176.setBounds(630, 360, 180, 140);

        jLabel178.setBackground(java.awt.Color.darkGray);
        jLabel178.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel178.setForeground(java.awt.Color.darkGray);
        jLabel178.setText("Ciudad");
        panel_consultas_promociones.add(jLabel178);
        jLabel178.setBounds(390, 90, 60, 20);

        jLabel207.setBackground(java.awt.Color.gray);
        jLabel207.setText("Aqui se mostrara imagen");
        jLabel207.setOpaque(true);
        panel_consultas_promociones.add(jLabel207);
        jLabel207.setBounds(830, 360, 180, 140);

        jLabel208.setBackground(java.awt.Color.gray);
        jLabel208.setText("Aqui se mostrara imagen");
        jLabel208.setOpaque(true);
        panel_consultas_promociones.add(jLabel208);
        jLabel208.setBounds(430, 360, 180, 140);

        getContentPane().add(panel_consultas_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 160, 120));
        getContentPane().remove(panel_consultas_promociones);
        getContentPane().add(panel_consultas_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_promociones.setVisible(false);

        panel_consultas_clientes.setBackground(java.awt.Color.lightGray);
        panel_consultas_clientes.setLayout(null);

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel184.setText("jLabel4");
        jLabel184.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel184.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel184.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel184MouseClicked(evt);
            }
        });
        panel_consultas_clientes.add(jLabel184);
        jLabel184.setBounds(995, 5, 30, 30);

        jLabel185.setBackground(new java.awt.Color(33, 33, 33));
        jLabel185.setOpaque(true);
        panel_consultas_clientes.add(jLabel185);
        jLabel185.setBounds(-2, 0, 1310, 40);

        jLabel186.setBackground(java.awt.Color.darkGray);
        jLabel186.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel186.setForeground(java.awt.Color.darkGray);
        jLabel186.setText("Reservas vinculadas al cliente");
        panel_consultas_clientes.add(jLabel186);
        jLabel186.setBounds(10, 290, 280, 30);

        jLabel187.setBackground(java.awt.Color.darkGray);
        jLabel187.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel187.setForeground(java.awt.Color.darkGray);
        jLabel187.setText("Clientes");
        panel_consultas_clientes.add(jLabel187);
        jLabel187.setBounds(10, 50, 60, 30);

        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel188.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel188.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel188.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel188.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel188.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel188MouseClicked(evt);
            }
        });
        panel_consultas_clientes.add(jLabel188);
        jLabel188.setBounds(980, 530, 45, 46);

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_consultas_clientes.add(jComboBox16);
        jComboBox16.setBounds(80, 50, 280, 20);

        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane13.setViewportView(jList6);

        panel_consultas_clientes.add(jScrollPane13);
        jScrollPane13.setBounds(10, 330, 350, 250);

        jLabel214.setBackground(java.awt.Color.darkGray);
        jLabel214.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel214.setForeground(java.awt.Color.darkGray);
        jLabel214.setText("Fecha Nacimiento");
        panel_consultas_clientes.add(jLabel214);
        jLabel214.setBounds(10, 210, 110, 19);
        panel_consultas_clientes.add(jTextField26);
        jTextField26.setBounds(280, 210, 50, 20);
        panel_consultas_clientes.add(jTextField41);
        jTextField41.setBounds(80, 90, 280, 20);

        jLabel215.setBackground(java.awt.Color.darkGray);
        jLabel215.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel215.setForeground(java.awt.Color.darkGray);
        jLabel215.setText("Nombre");
        panel_consultas_clientes.add(jLabel215);
        jLabel215.setBounds(10, 130, 60, 20);
        panel_consultas_clientes.add(jTextField42);
        jTextField42.setBounds(80, 130, 280, 20);

        jLabel216.setBackground(java.awt.Color.darkGray);
        jLabel216.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel216.setForeground(java.awt.Color.darkGray);
        jLabel216.setText("Apellido");
        panel_consultas_clientes.add(jLabel216);
        jLabel216.setBounds(10, 170, 60, 19);
        panel_consultas_clientes.add(jTextField43);
        jTextField43.setBounds(80, 170, 280, 20);
        panel_consultas_clientes.add(jTextField44);
        jTextField44.setBounds(140, 210, 50, 20);
        panel_consultas_clientes.add(jTextField45);
        jTextField45.setBounds(210, 210, 50, 20);

        jLabel217.setBackground(java.awt.Color.darkGray);
        jLabel217.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel217.setForeground(java.awt.Color.darkGray);
        jLabel217.setText("E-mail");
        panel_consultas_clientes.add(jLabel217);
        jLabel217.setBounds(10, 250, 40, 20);
        panel_consultas_clientes.add(jTextField46);
        jTextField46.setBounds(80, 250, 280, 20);

        jLabel218.setBackground(java.awt.Color.darkGray);
        jLabel218.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel218.setForeground(java.awt.Color.darkGray);
        jLabel218.setText("Nickname");
        panel_consultas_clientes.add(jLabel218);
        jLabel218.setBounds(10, 90, 80, 20);

        jLabel219.setText("Aqui se mostrara imagen");
        panel_consultas_clientes.add(jLabel219);
        jLabel219.setBounds(380, 50, 330, 220);

        jLabel222.setBackground(java.awt.Color.darkGray);
        jLabel222.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel222.setForeground(java.awt.Color.darkGray);
        jLabel222.setText("Precio total");
        panel_consultas_clientes.add(jLabel222);
        jLabel222.setBounds(370, 330, 120, 20);

        jLabel223.setBackground(java.awt.Color.darkGray);
        jLabel223.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel223.setForeground(java.awt.Color.darkGray);
        jLabel223.setText("Fecha de Creacion");
        panel_consultas_clientes.add(jLabel223);
        jLabel223.setBounds(370, 300, 130, 20);

        jLabel224.setBackground(java.awt.Color.darkGray);
        jLabel224.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel224.setForeground(java.awt.Color.darkGray);
        jLabel224.setText("Servicios y promociones asociados");
        panel_consultas_clientes.add(jLabel224);
        jLabel224.setBounds(370, 360, 220, 20);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane15.setViewportView(jTable2);

        panel_consultas_clientes.add(jScrollPane15);
        jScrollPane15.setBounds(370, 390, 470, 190);

        getContentPane().add(panel_consultas_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 160, 110));
        getContentPane().remove(panel_consultas_clientes);
        getContentPane().add(panel_consultas_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_clientes.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                        ImageIcon img = new ImageIcon("Help4Travelling.jpg");
                this.setIconImage(img.getImage());
                
    }//GEN-LAST:event_formWindowOpened

    private void jLabel9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusGained
       
    }//GEN-LAST:event_jLabel9FocusGained

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        panel_izq_acerca_de.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq.setVisible(true);
        lbl_menu.setText("          Registros");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained
        
    }//GEN-LAST:event_jLabel11FocusGained

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        lbl_mostrar_registros.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        lbl_mostrar_consultas.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        lbl_mostrar_modificaciones.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        lbl_mostrar_eliminaciones.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        lbl_mostrar_registros.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        lbl_mostrar_consultas.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        lbl_mostrar_modificaciones.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        lbl_mostrar_eliminaciones.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        lbl_menu.setText(" ");
        panel_izq.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void ingreso_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_usuariosMouseEntered
        ingreso_usuarios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_usuariosMouseEntered

    private void ingreso_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_usuariosMouseExited
        ingreso_usuarios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_usuariosMouseExited

    private void ingreso_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_reservasMouseEntered
        ingreso_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_reservasMouseEntered

    private void ingreso_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_reservasMouseExited
        ingreso_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_reservasMouseExited

    private void ingreso_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_serviciosMouseEntered
        ingreso_servicios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_serviciosMouseEntered

    private void ingreso_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_serviciosMouseExited
        ingreso_servicios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_serviciosMouseExited

    private void ingreso_promocionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_promocionesMouseEntered
        ingreso_promociones.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_promocionesMouseEntered

    private void ingreso_promocionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_promocionesMouseExited
        ingreso_promociones.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_promocionesMouseExited

    private void ingreso_categoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_categoriasMouseEntered
        ingreso_categorias.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_categoriasMouseEntered

    private void ingreso_categoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_categoriasMouseExited
        ingreso_categorias.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_categoriasMouseExited

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        lbl_menu.setText(" ");
        panel_izq_acerca_de.setVisible(false);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void panel_izq_acerca_deComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panel_izq_acerca_deComponentShown

    }//GEN-LAST:event_panel_izq_acerca_deComponentShown

    private void eliminacion_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminacion_reservasMouseExited
        eliminacion_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_eliminacion_reservasMouseExited

    private void eliminacion_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminacion_reservasMouseEntered
        eliminacion_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_eliminacion_reservasMouseEntered

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        panel_izq_eliminaciones.setVisible(false);
        lbl_menu.setText(" ");
    }//GEN-LAST:event_jLabel34MouseClicked

    private void actualizacion_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_reservasMouseExited
        actualizacion_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_actualizacion_reservasMouseExited

    private void actualizacion_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_reservasMouseEntered
        actualizacion_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_actualizacion_reservasMouseEntered

    private void actualizacion_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_serviciosMouseExited
        actualizacion_servicios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_actualizacion_serviciosMouseExited

    private void actualizacion_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_serviciosMouseEntered
        actualizacion_servicios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_actualizacion_serviciosMouseEntered

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        panel_izq_actualizaciones.setVisible(false);
        lbl_menu.setText(" ");
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        panel_izq.setVisible(false);
        panel_izq_acerca_de.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq_actualizaciones.setVisible(true);
        lbl_menu.setText("          Modificaciones");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        panel_izq.setVisible(false);
        panel_izq_acerca_de.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq_eliminaciones.setVisible(true);
        lbl_menu.setText("          Eliminaciones");
    }//GEN-LAST:event_jLabel13MouseClicked

    private void consultar_proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_proveedoresMouseExited
        consultar_proveedores.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_proveedoresMouseExited

    private void consultar_proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_proveedoresMouseEntered
        consultar_proveedores.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_proveedoresMouseEntered

    private void consultar_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_clientesMouseExited
        consultar_clientes.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_clientesMouseExited

    private void consultar_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_clientesMouseEntered
        consultar_clientes.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_clientesMouseEntered

    private void consultar_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_serviciosMouseExited
        consultar_servicios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_serviciosMouseExited

    private void consultar_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_serviciosMouseEntered
        consultar_servicios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_serviciosMouseEntered

    private void consultar_promocionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_promocionesMouseExited
        consultar_promociones.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_promocionesMouseExited

    private void consultar_promocionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_promocionesMouseEntered
        consultar_promociones.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_promocionesMouseEntered

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        panel_izq_consultas.setVisible(false);
        lbl_menu.setText(" ");
    }//GEN-LAST:event_jLabel66MouseClicked

    private void consultar_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_reservasMouseExited
        consultar_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_reservasMouseExited

    private void consultar_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_reservasMouseEntered
        consultar_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_reservasMouseEntered

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        panel_izq.setVisible(false);
        panel_izq_acerca_de.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_consultas.setVisible(true);
        lbl_menu.setText("          Consultas");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void ingreso_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_usuariosMouseClicked
        panel_ingreso_usuarios.setVisible(true);
        lbl_menu.setText("          Registrar usuario");
        panel_izq.setVisible(false);
        panel_ingreso_usuarios.setVisible(true);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_ingreso_usuariosMouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_usuarios.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_servicios.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel92MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ingreso_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_serviciosMouseClicked
        panel_ingreso_servicios.setVisible(true);
        lbl_menu.setText("          Registrar servicio");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_ingreso_serviciosMouseClicked

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_categorias.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel93MouseClicked

    private void ingreso_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_categoriasMouseClicked
        panel_ingreso_categorias.setVisible(true);
        lbl_menu.setText("          Registrar categoria");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_ingreso_categoriasMouseClicked

    private void jLabel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_promociones.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel101MouseClicked

    private void ingreso_promocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_promocionesMouseClicked
        panel_ingreso_promociones.setVisible(true);
        lbl_menu.setText("          Registrar promocion");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_ingreso_promocionesMouseClicked

    private void jLabel106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel106MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_reservas.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel106MouseClicked

    private void ingreso_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_reservasMouseClicked
        panel_ingreso_reservas.setVisible(true);
        lbl_menu.setText("          Registrar reserva");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_ingreso_reservasMouseClicked

    private void jLabel110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseClicked
        lbl_menu.setText("          Modificaciones");
        panel_actualizar_servicio.setVisible(false);
        panel_izq_actualizaciones.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel110MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void actualizacion_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_serviciosMouseClicked
        panel_actualizar_servicio.setVisible(true);
        lbl_menu.setText("          Modificar servicio");
        panel_izq_actualizaciones.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_actualizacion_serviciosMouseClicked

    private void actualizacion_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_reservasMouseClicked
        panel_actualizar_reserva.setVisible(true);
        lbl_menu.setText("          Modificar reserva");
        panel_izq_actualizaciones.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        
        //bruno llenar datos
        /*ArrayList<DtReserva> arrayReservas = ICReserva.listarReservas();
        //String datos[] = new String[5]
          	for(int j = 0; j < arrayReservas.size(); j++){
                    datos[0] = Integer.toString(arrayReservas.get(i).getNumero());
                    datos[1] = arrayReservas.get(i).getFecha().getDia() +  arrayReservas.get(i).getFecha().getMes() + arrayReservas.get(i).getFecha().getAnio();
                    datos[2] = Emun.toString(arrayReservas.get(i).getEstado());
                    datos[3] = Float.toString(arrayReservas.get(i).getPrecioTotal());
                    datos[4] = arrayReservas.get(i).getCliente())
                    jTable3.addRow(datos);
                }	  
        */
        
    }//GEN-LAST:event_actualizacion_reservasMouseClicked

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        lbl_menu.setText("          Modificaciones");
        panel_actualizar_reserva.setVisible(false);
        panel_izq_actualizaciones.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
      
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel132MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel132MouseClicked
        lbl_menu.setText("          Eliminaciones");
        panel_eliminar_reserva.setVisible(false);
        panel_izq_eliminaciones.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel132MouseClicked

    private void eliminacion_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminacion_reservasMouseClicked
        panel_eliminar_reserva.setVisible(true);
        lbl_menu.setText("          Eliminar reserva");
        panel_izq_eliminaciones.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_eliminacion_reservasMouseClicked

    private void jLabel134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_reservas.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel134MouseClicked

    private void consultar_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_clientesMouseClicked
        panel_consultas_clientes.setVisible(true);
        lbl_menu.setText("          Consultar cliente");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_consultar_clientesMouseClicked

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel143MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_reservas.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel143MouseClicked

    private void jLabel144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel144MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_servicios.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel144MouseClicked

    private void consultar_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_serviciosMouseClicked
        panel_consultas_servicios.setVisible(true);
        lbl_menu.setText("          Consultar servicio");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        
        //bruno llenar datos
      
        ArrayList<DtCategoria> categorias = ICCategoria.listarCategorias();
        HashMap<String, DefaultMutableTreeNode> nodes = new HashMap<String, DefaultMutableTreeNode>();
        nodes.put("todo",new DefaultMutableTreeNode("todo"));
        //DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("todo");
        
        DefaultTreeModel modeloArbol = new DefaultTreeModel(nodes.get("todo"));
        
        int max =0;
        for (int i = 0; i < categorias.size(); i++){
            if (max < categorias.get(i).getNivel()){
                max =categorias.get(i).getNivel();
            }
        }
        
        for (int j = 0; j < max; j++){
            for (int i = 0; i < categorias.size(); i++){
                if(categorias.get(i).getNivel() == j){
                   nodes.put(categorias.get(i).getNombre(),new DefaultMutableTreeNode(categorias.get(i).getNombre()));
                   modeloArbol.insertNodeInto(nodes.get(categorias.get(i).getNombrePadre()),nodes.get(categorias.get(i).getNombre()),i);
                }
            }
        }
       
        //modeloArbol.insertNodeInto(new DefaultMutableTreeNode(categorias.get(i).getNombrePadre()),new DefaultMutableTreeNode(categorias.get(i).getNombre()),i);
            /*DefaultMutableTreeNode nodo = new DefaultMutableTreeNode();
            nodo.setUserObject(categorias.get(i).getNombre());
            raiz.add(nodo);
            //nodo.insertNodeInto(categorias.get(i).getNombrePadre(),categorias.get(i).getNombre(),i);
            */
        
       this.jTree1.setModel(modeloArbol);
       
    }//GEN-LAST:event_consultar_serviciosMouseClicked

    private void jLabel162MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel162MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_servicios.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel162MouseClicked

    private void consultar_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_reservasMouseClicked
        panel_consultas_reservas.setVisible(true);
        lbl_menu.setText("          Consultar reserva");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_consultar_reservasMouseClicked

    private void jLabel148MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel148MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_promociones.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel148MouseClicked

    private void consultar_promocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_promocionesMouseClicked
        panel_consultas_promociones.setVisible(true);
        lbl_menu.setText("          Consultar promocion");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_consultar_promocionesMouseClicked

    private void jLabel163MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel163MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_promociones.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel163MouseClicked

    private void jLabel179MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel179MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_proveedores.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel179MouseClicked

    private void jLabel183MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel183MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_proveedores.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel183MouseClicked

    private void consultar_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_proveedoresMouseClicked
        panel_consultas_proveedores.setVisible(true);
        lbl_menu.setText("          Consultar proveedor");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_consultar_proveedoresMouseClicked

    private void jLabel188MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel188MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_clientes.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel188MouseClicked

    private void jLabel184MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel184MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_clientes.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel184MouseClicked

    private void lbl_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseEntered
        lbl_mostrar_cerrar.setVisible(true);
    }//GEN-LAST:event_lbl_cerrarMouseEntered

    private void lbl_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseExited
        lbl_mostrar_cerrar.setVisible(false);
    }//GEN-LAST:event_lbl_cerrarMouseExited

    private void lbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_cerrarMouseClicked

    private void lbl_acercaDeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_acercaDeMouseEntered
        lbl_mostrar_acercaDe.setVisible(true);
    }//GEN-LAST:event_lbl_acercaDeMouseEntered

    private void lbl_acercaDeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_acercaDeMouseExited
        lbl_mostrar_acercaDe.setVisible(false);
        panel_izq_acerca_de.setLocation(220, 90);
        panel_izq_acerca_de.repaint();
    }//GEN-LAST:event_lbl_acercaDeMouseExited

    private void lbl_acercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_acercaDeMouseClicked
        panel_izq_acerca_de.setLocation(220, 90);
        panel_izq_acerca_de.repaint();
        panel_izq.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq_acerca_de.setVisible(true);
        lbl_menu.setText("          Acerca de");
    }//GEN-LAST:event_lbl_acercaDeMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ICReserva.actualizarEstado(Estado.valueOf( jList3.getSelectedValue()),jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0).toString());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        ICReserva.actualizarEstado(Estado.valueOf( jList3.getSelectedValue()),jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0).toString());
    }//GEN-LAST:event_jButton5MouseClicked

    private void chk_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_clienteActionPerformed
        txt_nombreEmpresa.setVisible(false);
        txt_linkEmpresa.setVisible(false);
        lbl_nombreEmpresa.setVisible(false);
        lbl_linkEmpresa.setVisible(false);
    }//GEN-LAST:event_chk_clienteActionPerformed

    private void chk_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_proveedorActionPerformed
        txt_nombreEmpresa.setVisible(true);
        txt_linkEmpresa.setVisible(true);
        lbl_nombreEmpresa.setVisible(true);
        lbl_linkEmpresa.setVisible(true);
    }//GEN-LAST:event_chk_proveedorActionPerformed

    private void chk_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_clienteMouseClicked
        txt_nombreEmpresa.setVisible(false);
        txt_linkEmpresa.setVisible(false);
        lbl_nombreEmpresa.setVisible(false);
        lbl_linkEmpresa.setVisible(false);
    }//GEN-LAST:event_chk_clienteMouseClicked

    private void chk_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_proveedorMouseClicked
        txt_nombreEmpresa.setVisible(true);
        txt_linkEmpresa.setVisible(true);
        lbl_nombreEmpresa.setVisible(true);
        lbl_linkEmpresa.setVisible(true);
    }//GEN-LAST:event_chk_proveedorMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(() -> {
            new Help4Travelling().setVisible(true);
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizacion_reservas;
    private javax.swing.JPanel actualizacion_servicios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chk_cliente;
    private javax.swing.JRadioButton chk_proveedor;
    private javax.swing.JComboBox<String> cmb_anio;
    private javax.swing.JComboBox<String> cmb_dia;
    private javax.swing.JComboBox<String> cmb_mes;
    private javax.swing.JPanel consultar_clientes;
    private javax.swing.JPanel consultar_promociones;
    private javax.swing.JPanel consultar_proveedores;
    private javax.swing.JPanel consultar_reservas;
    private javax.swing.JPanel consultar_servicios;
    private javax.swing.JPanel eliminacion_reservas;
    private javax.swing.JPanel ingreso_categorias;
    private javax.swing.JPanel ingreso_promociones;
    private javax.swing.JPanel ingreso_reservas;
    private javax.swing.JPanel ingreso_servicios;
    private javax.swing.JPanel ingreso_usuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lbl_acercaDe;
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JLabel lbl_linkEmpresa;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_mostrar_acercaDe;
    private javax.swing.JLabel lbl_mostrar_cerrar;
    private javax.swing.JLabel lbl_mostrar_consultas;
    private javax.swing.JLabel lbl_mostrar_eliminaciones;
    private javax.swing.JLabel lbl_mostrar_modificaciones;
    private javax.swing.JLabel lbl_mostrar_registros;
    private javax.swing.JLabel lbl_nombreEmpresa;
    private javax.swing.JPanel panel_actualizar_reserva;
    private javax.swing.JPanel panel_actualizar_servicio;
    private javax.swing.JPanel panel_consultas_clientes;
    private javax.swing.JPanel panel_consultas_promociones;
    private javax.swing.JPanel panel_consultas_proveedores;
    private javax.swing.JPanel panel_consultas_reservas;
    private javax.swing.JPanel panel_consultas_servicios;
    private javax.swing.JPanel panel_eliminar_reserva;
    private javax.swing.JPanel panel_ingreso_categorias;
    private javax.swing.JPanel panel_ingreso_promociones;
    private javax.swing.JPanel panel_ingreso_reservas;
    private javax.swing.JPanel panel_ingreso_servicios;
    private javax.swing.JPanel panel_ingreso_usuarios;
    private javax.swing.JPanel panel_izq;
    private javax.swing.JPanel panel_izq_acerca_de;
    private javax.swing.JPanel panel_izq_actualizaciones;
    private javax.swing.JPanel panel_izq_consultas;
    private javax.swing.JPanel panel_izq_eliminaciones;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_linkEmpresa;
    private javax.swing.JTextField txt_nickname;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreEmpresa;
    // End of variables declaration//GEN-END:variables
}
