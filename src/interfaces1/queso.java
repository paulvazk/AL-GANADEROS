package interfaces1;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class queso extends javax.swing.JFrame {
            DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form queso
     */
    public queso() {
 this.setUndecorated(true);
                
        initComponents();
        this.setLocationRelativeTo(null);
        
         try {
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Ganaderia conn = new Ganaderia();
            java.sql.Connection con = Ganaderia.getConection();

            String sql = "Select id_reg, tipo_queso, precio_publico, precio, fecha_p, unidades_p, fecha_c FROM queso";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("tipo");
            modelo.addColumn("precio publico");
            modelo.addColumn("mayoreo");
            modelo.addColumn("fecha produccion");
            modelo.addColumn("produccidas");
            modelo.addColumn("caducidad");
           
           // modelo.addColumn("");             int[] ancho=(100,100,100,100,100,100,100,100,100,100,100,100,100,100,100);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "¡Error !!"+ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipo_queso1 = new javax.swing.JComboBox<>();
        preciom1 = new javax.swing.JComboBox<>();
        precio_publico1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        unidades_p = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        fecha_p = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        fecha_c = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 1120, 230));

        jPanel2.setBackground(new java.awt.Color(175, 119, 59));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control de venta y producción", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(196, 149, 95));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel de acciones"));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/90GUARDAR.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/90GUARDAR.png"))); // NOI18N
        jButton1.setRolloverEnabled(true);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/45GUARDAR.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HOME.png"))); // NOI18N
        jButton5.setText("Menu Principal");
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HOME.png"))); // NOI18N
        jButton5.setRolloverEnabled(true);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HOME50.png"))); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AAAAAAA90.png"))); // NOI18N
        jButton3.setText("Mostrar Todo y Actualizar");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AAAAAAA90.png"))); // NOI18N
        jButton3.setRolloverEnabled(true);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AAAA45.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(196, 149, 95));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacíon de producto"));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel1.setText("Tipo de queso");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel2.setText("Precio al público");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel3.setText("Precio al mayoreo");

        tipo_queso1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOUDA", "PANELA", "CREMA" }));
        tipo_queso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_queso1ActionPerformed(evt);
            }
        });

        preciom1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "430", "256", "346" }));

        precio_publico1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "475", "290", "396" }));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel11.setText("Unidades producidas");

        unidades_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unidades_pKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(196, 149, 95));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de producción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel18.setText("AÑO-MES-DIA");

        jLabel20.setText("0000-00-00");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel21.setText("Formato de ingreso");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_p, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(fecha_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel6.setBackground(new java.awt.Color(196, 149, 95));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de caducidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel14.setText("AÑO-MES-DIA");

        jLabel15.setText("0000-00-00");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setText("Formato de ingreso");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(fecha_c, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel15))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fecha_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(preciom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tipo_queso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(precio_publico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(unidades_p, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tipo_queso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_publico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(preciom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(unidades_p, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1120, 480));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iu-14.jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

              try{
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/bd_ganaderos","root","");
            PreparedStatement pst = cn.prepareStatement("insert into queso value(?,?,?,?,?,?,?)");
            pst.setString(1,"0");
            pst.setString(2, tipo_queso1.getSelectedItem().toString());
            pst.setString(3, precio_publico1.getSelectedItem().toString());
            pst.setString(4, preciom1.getSelectedItem().toString());
            pst.setDate(5, Date.valueOf(fecha_p.getText().trim()));
            pst.setString(6, unidades_p.getText().trim());
            pst.setDate(7, Date.valueOf(fecha_c.getText().trim()));
            pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO,"
                    + "");

            Object[] fila = new Object[7];
//                        fila[1] = nombre.getText();

            fila[1] = tipo_queso1.getSelectedItem().toString();
            fila[2] = precio_publico1.getSelectedItem().toString();
            fila[3] = preciom1.getSelectedItem().toString();
            fila[4] =Date.valueOf(fecha_p.getText());
            fila[5] =  unidades_p.getText();
            fila[6] = Date.valueOf(fecha_c.getText());

            modelo.addRow(fila);



        }catch(Exception e){
            System.out.println(""+e);
            JOptionPane.showMessageDialog(null, "REVISE LOS DATOS");
        }




    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                this.dispose(); 

            menuinv p1= new menuinv();
            p1.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void unidades_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unidades_pKeyTyped
char c=evt.getKeyChar();
 if((c<'0'||c>'9')) evt.consume(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_unidades_pKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        /*
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Ganaderia objCon = new Ganaderia();
            Connection conn = Ganaderia.getConection();
            int Fila = tabla.getSelectedRow();
            String id = tabla.getValueAt(Fila, 1).toString();
            ps = conn.prepareStatement("id_reg, tipo_queso, precio_publico, precio, fecha_p, unidades_p, fecha_c from queso where");
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                .setText(rs.getString(""));
                .setText(rs.getString(""));
                .setText(rs.getString(""));
                edad.setText(rs.getString(""));
                jComboBox1.setSelectedIndex(0);
                .setText(rs.getString(""));
                fecha.setText(rs.getString("fecha"));

            }

        }catch(SQLException ex){
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "¡Error al hacer el evento !! "+ex);
            
                
            }
        */
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);

            PreparedStatement ps=null;
            ResultSet rs=null;
            Ganaderia conn= new Ganaderia();
            Connection con=Ganaderia.getConection();
            String sql = "Select id_reg, tipo_queso, precio_publico, precio, fecha_p, unidades_p, fecha_c  FROM queso ";
            System.out.println(""+sql);
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();

            ResultSetMetaData rsmd=rs.getMetaData();
            int ccolumnas=rsmd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("tipo");
            modelo.addColumn("precio publico");
            modelo.addColumn("mayoreo");
            modelo.addColumn("fecha produccion");
            modelo.addColumn("produccidas");
            modelo.addColumn("caducidad");           
            while(rs.next()){
                Object[] filas = new Object[ccolumnas];
                for(int i=0;i<ccolumnas;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
            JOptionPane.showMessageDialog(null, "¡Error al hacer el evento !!  "+ex);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tipo_queso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_queso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_queso1ActionPerformed

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
            java.util.logging.Logger.getLogger(queso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(queso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(queso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(queso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new queso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fecha_c;
    private javax.swing.JTextField fecha_p;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> precio_publico1;
    private javax.swing.JComboBox<String> preciom1;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipo_queso1;
    private javax.swing.JTextField unidades_p;
    // End of variables declaration//GEN-END:variables
}