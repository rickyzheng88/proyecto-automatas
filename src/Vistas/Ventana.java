package Vistas;
import ClasesAutomatas.*;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class Ventana extends javax.swing.JFrame {
    public MovimientoAutomata ma;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        pedido.setEnabled(false);
        abastecer.setEnabled(true);
        Pedido.setVisible(true);
        Inventario.setVisible(false);
        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("src/Imagenes/cursor.png").getImage(), new Point(0, 0), "custom cursor"));
        galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automata2.png"))); 
        this.ma = new MovimientoAutomata(this.robot, this.flecha_a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pedido = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        base_fondo_flechas = new javax.swing.JPanel();
        giro1 = new javax.swing.JLabel();
        avanzar = new javax.swing.JLabel();
        giro2 = new javax.swing.JLabel();
        fondo_flechas = new javax.swing.JLabel();
        buscar_pedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        titulo1 = new javax.swing.JLabel();
        Inventario = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        colocar_mercancia = new javax.swing.JButton();
        tipo_mercancia = new javax.swing.JComboBox<>();
        tipo_mercan = new javax.swing.JLabel();
        titulo_columnas = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        Botones = new javax.swing.JPanel();
        pedido = new javax.swing.JButton();
        abastecer = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        fondo_botones = new javax.swing.JLabel();
        Automata = new javax.swing.JPanel();
        robot = new javax.swing.JLabel();
        flecha_a = new javax.swing.JLabel();
        galpon = new javax.swing.JLabel();
        Leyenda = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lavadora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nevera = new javax.swing.JLabel();
        micro = new javax.swing.JLabel();
        tv = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo_leyenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pedido.setBackground(new java.awt.Color(144, 118, 74));
        Pedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Pedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Seleccione la Mercancía");
        Pedido.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 30));

        base_fondo_flechas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/giro1_gris.png"))); // NOI18N
        base_fondo_flechas.add(giro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        avanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/avanzar_gris.png"))); // NOI18N
        base_fondo_flechas.add(avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        giro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/giro2_gris.png"))); // NOI18N
        base_fondo_flechas.add(giro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        fondo_flechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_flechas.jpg"))); // NOI18N
        fondo_flechas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        base_fondo_flechas.add(fondo_flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 120));

        Pedido.add(base_fondo_flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 270, 120));

        buscar_pedido.setBackground(new java.awt.Color(0, 0, 0));
        buscar_pedido.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        buscar_pedido.setForeground(new java.awt.Color(255, 255, 255));
        buscar_pedido.setText("Buscar pedido");
        buscar_pedido.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
            new ImageIcon("src/Imagenes/mano.png").getImage(),
            new Point(0, 0), "mano_cursor"));
    buscar_pedido.setFocusPainted(false);
    buscar_pedido.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buscar_pedidoActionPerformed(evt);
        }
    });
    Pedido.add(buscar_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

    jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane2.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));

jPanel1.setBackground(new java.awt.Color(204, 204, 204));
jPanel1.setLayout(new java.awt.GridLayout(5, 1));

jCheckBox1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
jCheckBox1.setText("Lavadora (C3)");
jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox1ActionPerformed(evt);
    }
    });
    jPanel1.add(jCheckBox1);

    jCheckBox2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    jCheckBox2.setText("Microondas (B7)");
    jPanel1.add(jCheckBox2);

    jCheckBox3.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    jCheckBox3.setText("Televisor (E5)");
    jPanel1.add(jCheckBox3);

    jCheckBox4.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    jCheckBox4.setText("Nevera (I4)");
    jPanel1.add(jCheckBox4);

    jCheckBox5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    jCheckBox5.setText("Computador (H10)");
    jPanel1.add(jCheckBox5);

    jScrollPane2.setViewportView(jPanel1);

    Pedido.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 210, 120));

    titulo1.setBackground(new java.awt.Color(255, 255, 255));
    titulo1.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
    titulo1.setForeground(new java.awt.Color(255, 255, 255));
    titulo1.setText("a Buscar");
    Pedido.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

    getContentPane().add(Pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

    Inventario.setBackground(new java.awt.Color(144, 118, 74));
    Inventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    Inventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    titulo2.setBackground(new java.awt.Color(255, 255, 255));
    titulo2.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
    titulo2.setForeground(new java.awt.Color(255, 255, 255));
    titulo2.setText("Inventario");
    Inventario.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 30));

    colocar_mercancia.setBackground(new java.awt.Color(0, 0, 0));
    colocar_mercancia.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
    colocar_mercancia.setForeground(new java.awt.Color(255, 255, 255));
    colocar_mercancia.setText("Colocar Mercancia");
    colocar_mercancia.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
colocar_mercancia.setFocusPainted(false);
Inventario.add(colocar_mercancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

tipo_mercancia.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
tipo_mercancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavadora", "Nevera", "Microondas", "Televisor", "Computador" }));
tipo_mercancia.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
    new ImageIcon("src/Imagenes/mano.png").getImage(),
    new Point(0, 0), "mano_cursor"));
    Inventario.add(tipo_mercancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 180, -1));

    tipo_mercan.setBackground(new java.awt.Color(255, 255, 255));
    tipo_mercan.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
    tipo_mercan.setText("Tipo de Mercancia");
    Inventario.add(tipo_mercan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

    titulo_columnas.setBackground(new java.awt.Color(255, 255, 255));
    titulo_columnas.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
    titulo_columnas.setText("Cantidad de Mercancia");
    Inventario.add(titulo_columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

    jSpinner1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
    jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
    jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    Inventario.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 180, -1));

    getContentPane().add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

    Botones.setBackground(new java.awt.Color(255, 255, 255));
    Botones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pedido.setBackground(new java.awt.Color(0, 0, 0));
    pedido.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
    pedido.setForeground(new java.awt.Color(255, 255, 255));
    pedido.setText("Pedido");
    pedido.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
pedido.setFocusPainted(false);
pedido.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        pedidoActionPerformed(evt);
    }
    });
    Botones.add(pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

    abastecer.setBackground(new java.awt.Color(0, 0, 0));
    abastecer.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
    abastecer.setForeground(new java.awt.Color(255, 255, 255));
    abastecer.setText("Abastecer inventario");
    abastecer.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
abastecer.setFocusPainted(false);
abastecer.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        abastecerActionPerformed(evt);
    }
    });
    Botones.add(abastecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

    cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
    cerrar.setContentAreaFilled(false);
    cerrar.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
cerrar.setFocusPainted(false);
cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
cerrar.setRolloverEnabled(false);
cerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
cerrar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarActionPerformed(evt);
    }
    });
    Botones.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, -1));

    fondo_botones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_flechas.jpg"))); // NOI18N
    fondo_botones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
    Botones.add(fondo_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -6, 500, 60));

    getContentPane().add(Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 490, 50));

    Automata.setBackground(new java.awt.Color(0, 0, 0));
    Automata.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    Automata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    robot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/robot.png"))); // NOI18N
    Automata.add(robot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 30, -1));

    flecha_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N
    Automata.add(flecha_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 10, 10));

    galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pruebas/Automata1.png"))); // NOI18N
    Automata.add(galpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 490, 450));

    Leyenda.setBackground(new java.awt.Color(255, 255, 255));
    Leyenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Leyenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    Automata.add(Leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, 490, 110));

    getContentPane().add(Automata, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 490, 470));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lavadora.png"))); // NOI18N
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

    lavadora.setBackground(new java.awt.Color(204, 255, 255));
    lavadora.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    lavadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lavadora.setText("Lavadora");
    lavadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    lavadora.setOpaque(true);
    getContentPane().add(lavadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 80, -1));

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nevera.png"))); // NOI18N
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/micro.png"))); // NOI18N
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/televisor.png"))); // NOI18N
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pc.png"))); // NOI18N
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, -1));

    nevera.setBackground(new java.awt.Color(204, 255, 204));
    nevera.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    nevera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    nevera.setText("Nevera");
    nevera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    nevera.setOpaque(true);
    getContentPane().add(nevera, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 60, -1));

    micro.setBackground(new java.awt.Color(255, 255, 204));
    micro.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    micro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    micro.setText("Microondas");
    micro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    micro.setOpaque(true);
    getContentPane().add(micro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 90, -1));

    tv.setBackground(new java.awt.Color(255, 102, 102));
    tv.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    tv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    tv.setText("Televisor");
    tv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    tv.setOpaque(true);
    getContentPane().add(tv, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 80, -1));

    pc.setBackground(new java.awt.Color(204, 204, 204));
    pc.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    pc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pc.setText("Computador");
    pc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    pc.setOpaque(true);
    getContentPane().add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 100, -1));

    jLabel1.setBackground(new java.awt.Color(255, 153, 102));
    jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("70 Kg");
    jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel1.setOpaque(true);
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, -1));

    jLabel10.setBackground(new java.awt.Color(255, 153, 102));
    jLabel10.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setText("20 Kg");
    jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel10.setOpaque(true);
    getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 50, -1));

    jLabel9.setBackground(new java.awt.Color(255, 153, 102));
    jLabel9.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9.setText("30 Kg");
    jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel9.setOpaque(true);
    getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 50, -1));

    jLabel8.setBackground(new java.awt.Color(255, 153, 102));
    jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("10 Kg");
    jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel8.setOpaque(true);
    getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 50, -1));

    jLabel2.setBackground(new java.awt.Color(255, 153, 102));
    jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("80 Kg");
    jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel2.setOpaque(true);
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 40, -1));

    fondo_leyenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_flechas.jpg"))); // NOI18N
    fondo_leyenda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
    getContentPane().add(fondo_leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 500, 110));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed

        System.exit(0);

    }//GEN-LAST:event_cerrarActionPerformed

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed

        pedido.setEnabled(false);
        abastecer.setEnabled(true);
        Pedido.setVisible(true);
        Inventario.setVisible(false);
        galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automata2.png")));
        
    }//GEN-LAST:event_pedidoActionPerformed

    private void abastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abastecerActionPerformed

        pedido.setEnabled(true);
        abastecer.setEnabled(false);
        Pedido.setVisible(false);
        Inventario.setVisible(true);
        galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automata2.png")));
    }//GEN-LAST:event_abastecerActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void buscar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_pedidoActionPerformed
        //robot.setLocation(robot.getX() + 45, robot.getY() + 39); // X + 45; Y + 39 movimiento automata
         // flecha derecha senalar abajo -30 +20
        
        
        Timer timer = new Timer("Timer");

        int delay = 1000;
        timer.schedule(this.ma.irDerecha(3), delay);
        try {
            Thread.sleep(300);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        timer.schedule(this.ma.derechaAbajo(), delay);
        try {
            Thread.sleep(300);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        timer.schedule(this.ma.irAbajo(5), delay);
        try {
            Thread.sleep(300);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        timer.schedule(this.ma.abajoIzquierda(), delay);
        //codigo para delay
        /*Timer timer = new Timer(200, e -> {
            flecha_a.setLocation(flecha_a.getX()+20 , flecha_a.getY() + 20);
        });
        timer.setRepeats(false);
        timer.start();*/
        
    }//GEN-LAST:event_buscar_pedidoActionPerformed

    public void correr() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Automata;
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Inventario;
    private javax.swing.JPanel Leyenda;
    private javax.swing.JPanel Pedido;
    private javax.swing.JButton abastecer;
    private javax.swing.JLabel avanzar;
    private javax.swing.JPanel base_fondo_flechas;
    private javax.swing.JButton buscar_pedido;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton colocar_mercancia;
    private javax.swing.JLabel flecha_a;
    private javax.swing.JLabel fondo_botones;
    private javax.swing.JLabel fondo_flechas;
    private javax.swing.JLabel fondo_leyenda;
    private javax.swing.JLabel galpon;
    private javax.swing.JLabel giro1;
    private javax.swing.JLabel giro2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lavadora;
    private javax.swing.JLabel micro;
    private javax.swing.JLabel nevera;
    private javax.swing.JLabel pc;
    private javax.swing.JButton pedido;
    private javax.swing.JLabel robot;
    private javax.swing.JLabel tipo_mercan;
    private javax.swing.JComboBox<String> tipo_mercancia;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo_columnas;
    private javax.swing.JLabel tv;
    // End of variables declaration//GEN-END:variables
}
