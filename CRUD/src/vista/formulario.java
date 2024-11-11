package vista;

import Conexion.Conexiondb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formulario extends javax.swing.JFrame {

    Conexiondb con = new Conexiondb();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public formulario() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtpregunta = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnAVentana2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SpnEdad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        CmboSexo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 210, 240));

        jLabel1.setText("FORMULARIO");

        jLabel2.setText("CORREO:");

        jLabel3.setText("ID:");

        jLabel4.setText("TELEFONO:");

        jLabel5.setText("PREGUNTA:");

        txtid.setEditable(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        txtpregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreguntaActionPerformed(evt);
            }
        });

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(240, 220, 240));
        btnnuevo.setText("Limpiar");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel6.setText("NOMBRE: ");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        btnAVentana2.setText("Ventana 2");
        btnAVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAVentana2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Edad:");

        SpnEdad.setModel(new javax.swing.SpinnerNumberModel(0, null, 120, 1));

        jLabel8.setText("Sexo:");

        CmboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M", " " }));
        CmboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmboSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SpnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtpregunta))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAVentana2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SpnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CmboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAVentana2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(240, 220, 240));

        Tabla_Datos.setAutoCreateRowSorter(true);
        Tabla_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "Edad", "Sexo", "Correo", "Telefono", "Pregunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Datos);
        if (Tabla_Datos.getColumnModel().getColumnCount() > 0) {
            Tabla_Datos.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabla_Datos.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(3).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(4).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(5).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtpreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreguntaActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnAVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAVentana2ActionPerformed
        ventana2 v2 = new ventana2();
        v2.setV1(this);
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAVentana2ActionPerformed

    private void CmboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmboSexoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

   void listar() {
    String sql = "SELECT * FROM pregunta";
    try {
        cn = con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sql);

        Object[] usuario = new Object[7]; 
        modelo = (DefaultTableModel) Tabla_Datos.getModel();

        while (rs.next()) {
            usuario[0] = rs.getInt("identificador");
            usuario[1] = rs.getString("nombre");
            usuario[2] = rs.getInt("edad");       // Obtener edad
            usuario[3] = rs.getString("sexo");    // Obtener sexo
            usuario[4] = rs.getString("correo");
            usuario[5] = rs.getString("telefono");
            usuario[6] = rs.getString("pregunta");
            modelo.addRow(usuario);
        }

        Tabla_Datos.setModel(modelo);

    } catch (SQLException e) {
        System.out.println("Error en: " + e);
    }
}

void agregar() {
    String nombre = txtnombre.getText();
    String correo = txtcorreo.getText();
    String telefono = txttelefono.getText();
    String pregunta = txtpregunta.getText();
    String sexo = CmboSexo.getSelectedItem().toString(); // Obtener el valor de JComboBox
    int edad = (int) SpnEdad.getValue();               // Obtener el valor de JSpinner

    if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || pregunta.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Completar todos los campos");
        return;
    }

    String sql = "INSERT INTO pregunta (nombre, edad, sexo, correo, telefono, pregunta) "
               + "VALUES (?, ?, ?, ?, ?, ?)";

    try {
        cn = con.getConnection();
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, nombre);
        pst.setInt(2, edad);           // Asignar valor de edad
        pst.setString(3, sexo);        // Asignar valor de sexo
        pst.setString(4, correo);
        pst.setString(5, telefono);
        pst.setString(6, pregunta);

        int n = pst.executeUpdate();
        if (n > 0) {
            JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
            limpiar();
            listar();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en: " + e.getMessage());
    }
}

void limpiar() {
    while (Tabla_Datos.getRowCount() > 0) {
        modelo.removeRow(0);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmboSexo;
    private javax.swing.JSpinner SpnEdad;
    private javax.swing.JTable Tabla_Datos;
    private javax.swing.JButton btnAVentana2;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpregunta;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private void eliminar() {
        int fila = Tabla_Datos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona a alguien");
        } else {
            int identificador = Integer.parseInt(Tabla_Datos.getValueAt(fila, 0).toString());
            String sql = "DELETE FROM pregunta WHERE identificador = " + identificador;
            try {
                cn = Conexiondb.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Pregunta eliminada");
                limpiar();
                listar();
            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }
        }
    }

    private void nuevo() {
        txtid.setText("");
        txtnombre.setText("");
        txtcorreo.setText("");
        txttelefono.setText("");
        txtpregunta.setText("");
        CmboSexo.setSelectedIndex(0);
        SpnEdad.setValue(0);
    }

    private void editar() {
        int fila = Tabla_Datos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona a alguien para modificar.");
            return;
        }

        int identificador = (int) Tabla_Datos.getValueAt(fila, 0); // Suponiendo que el ID es la primera columna
        String nombre = txtnombre.getText();
        String correo = txtcorreo.getText();
        String telefono = txttelefono.getText();
        String pregunta = txtpregunta.getText();
        String sexo = CmboSexo.getSelectedItem().toString(); // Obtener el valor seleccionado de JComboBox
        int edad = (int) SpnEdad.getValue(); // Obtener el valor de JSpinner

        if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || pregunta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        String sql = "UPDATE pregunta SET nombre = ?, correo = ?, telefono = ?, pregunta = ?, sexo = ?, edad = ? WHERE identificador = ?";

        try {
            cn = Conexiondb.getConnection();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, correo);
            pst.setString(3, telefono);
            pst.setString(4, pregunta);
            pst.setString(5, sexo); // Asignar el valor de sexo
            pst.setInt(6, edad); // Asignar el valor de edad
            pst.setInt(7, identificador);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Actualización completada");
                limpiar();
                listar(); // Asumiendo que este método lista los datos en la tabla
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la entrada a modificar.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en: " + e.getMessage());
        }
    }
}
