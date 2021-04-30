
package modulos;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NuevaFactura extends javax.swing.JDialog {

    Factura factura;
    ArrayList<classes.Detalle> temp;
    DefaultTableModel modelo;
    
    public NuevaFactura(java.awt.Frame parent, boolean modal, Factura factura) {
        super(parent, modal);
        initComponents();
        this.factura = factura;
        setLocationRelativeTo(null);
        temp = new ArrayList();
                
        tfFecha.setText(factura.obtenerFechaFormateada(new Date())); //Fehca
        lbNoFactura.setText("No. de Factura: 000" + (factura.registro.size()+1)); //Numero de Factura
        
        /* Prodcutos agregados - prueba*/
        classes.Producto p1 = new classes.Producto(1, "Sacapuntas Facela Skin Avenguers", 1.50);
        classes.Producto p2 = new classes.Producto(2, "Libro Scribe Matematicas - 500 pags", 4);
        
        classes.Detalle d1 = new classes.Detalle(p1, 5);
        classes.Detalle d2 = new classes.Detalle(p2, 3);
        
        temp.add(d1);
        temp.add(d2);
        
        mostrarProductosFactura();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfVendedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTelefonoClient = new javax.swing.JTextField();
        tfTelefonoVendedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfDui = new javax.swing.JFormattedTextField();
        lbNoFactura = new javax.swing.JLabel();
        btnAddProductos = new javax.swing.JLabel();
        totalFactura = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductosFactura = new rojerusan.RSTableMetro();
        descIVA = new javax.swing.JLabel();
        subTotalFactura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("    Nueva Factura");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 102, 204));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 2, true));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        tfCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfCliente.setToolTipText("");
        tfCliente.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfCliente.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        tfCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfClienteFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Vendedor:");

        tfVendedor.setBackground(new java.awt.Color(255, 255, 255));
        tfVendedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono");

        tfTelefonoClient.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefonoClient.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        tfTelefonoVendedor.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefonoVendedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Teléfono");

        tfDireccion.setBackground(new java.awt.Color(255, 255, 255));
        tfDireccion.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("DUI:");

        tfDui.setBackground(new java.awt.Color(255, 255, 255));
        tfDui.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        try {
            tfDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbNoFactura.setText("No. de Factura: 0001");

        btnAddProductos.setBackground(new java.awt.Color(43, 50, 65));
        btnAddProductos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAddProductos.setForeground(new java.awt.Color(242, 242, 242));
        btnAddProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_25px.png"))); // NOI18N
        btnAddProductos.setText("Agregar Productos");
        btnAddProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProductos.setOpaque(true);
        btnAddProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductosMouseClicked(evt);
            }
        });

        totalFactura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalFactura.setText("TOTAL $");

        tfFecha.setBackground(new java.awt.Color(255, 255, 255));
        tfFecha.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar_32px.png"))); // NOI18N
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        tablaProductosFactura.setBackground(new java.awt.Color(255, 255, 255));
        tablaProductosFactura.setForeground(new java.awt.Color(255, 255, 255));
        tablaProductosFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cantidad", "Descripción", "Precio Unitario", "Precio Total", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductosFactura.setAltoHead(40);
        tablaProductosFactura.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        tablaProductosFactura.setColorBordeFilas(new java.awt.Color(232, 232, 232));
        tablaProductosFactura.setColorBordeHead(new java.awt.Color(232, 232, 232));
        tablaProductosFactura.setColorFilasBackgound2(new java.awt.Color(232, 232, 232));
        tablaProductosFactura.setColorFilasForeground1(new java.awt.Color(0, 0, 51));
        tablaProductosFactura.setColorFilasForeground2(new java.awt.Color(0, 0, 51));
        tablaProductosFactura.setColorForegroundHead(new java.awt.Color(51, 51, 51));
        tablaProductosFactura.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tablaProductosFactura.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaProductosFactura.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaProductosFactura.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tablaProductosFactura.setGridColor(new java.awt.Color(255, 255, 255));
        tablaProductosFactura.setGrosorBordeFilas(0);
        tablaProductosFactura.setRowHeight(25);
        tablaProductosFactura.getTableHeader().setResizingAllowed(false);
        tablaProductosFactura.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaProductosFactura);
        if (tablaProductosFactura.getColumnModel().getColumnCount() > 0) {
            tablaProductosFactura.getColumnModel().getColumn(0).setResizable(false);
            tablaProductosFactura.getColumnModel().getColumn(1).setResizable(false);
            tablaProductosFactura.getColumnModel().getColumn(2).setResizable(false);
            tablaProductosFactura.getColumnModel().getColumn(2).setPreferredWidth(350);
            tablaProductosFactura.getColumnModel().getColumn(3).setResizable(false);
            tablaProductosFactura.getColumnModel().getColumn(4).setResizable(false);
            tablaProductosFactura.getColumnModel().getColumn(5).setResizable(false);
            tablaProductosFactura.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        descIVA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descIVA.setText("IVA (13%) $");

        subTotalFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subTotalFactura.setText("SUBTOTAL $");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subTotalFactura)
                            .addComponent(descIVA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalFactura, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(145, 145, 145))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCliente)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfTelefonoClient, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfTelefonoVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addGap(21, 21, 21)
                                .addComponent(lbNoFactura))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfDui, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(811, 811, 811)
                        .addComponent(btnAddProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addGap(56, 56, 56)))
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                    .addGap(30, 30, 30)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tfTelefonoClient, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTelefonoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfDui)))))
                .addGap(39, 39, 39)
                .addComponent(btnAddProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(subTotalFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descIVA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalFactura)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(297, 297, 297)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void mostrarProductosFactura(){
        modelo = (DefaultTableModel)tablaProductosFactura.getModel();
        modelo.setRowCount(0); //Limpia la tabla
        DecimalFormat format = new DecimalFormat("0.00");
        double subtotal = 0;
        double iva = 0;
        double total = 0;
        
        for(classes.Detalle d : temp){
            
            d.setSubTotal(d.calcularSubTotal(d.getProducto().getPrecio()));
            
            modelo.addRow(new Object []{
                d.getProducto().getCodigo(),
                d.getCantidad(),
                d.getProducto().getDescripcion(),
                "$ " + format.format(d.getProducto().getPrecio()),
                "$ " + format.format(d.getSubTotal())
            });
            
            subtotal += d.getSubTotal();
        }
        
        iva = 0.13 * subtotal;
        total = subtotal + iva;
        
        subTotalFactura.setText("SUBTOTAL $ " + subtotal);
        descIVA.setText("IVA (%) $ " + iva);
        totalFactura.setText("TOTAL $ " + total);
        tablaProductosFactura.setModel(modelo);
        
    }
    
    public void limpiarFormulario(){
        tfCliente.setText("");
        tfTelefonoClient.setText("");
        tfDireccion.setText("");
        lbNoFactura.setText("No. de Factura: 000" + (factura.registro.size()+1));
        tfVendedor.setText("");
        tfTelefonoVendedor.setText("");
        tfDui.setText("");
        tfFecha.setText(factura.obtenerFechaFormateada(new Date())); //Fecha
        modelo.setRowCount(0);
        tablaProductosFactura.setModel(modelo);
        subTotalFactura.setText("SUBTOTAL $ ");
        descIVA.setText("IVA (%) $ ");
        totalFactura.setText("TOTAL $ ");
        tablaProductosFactura.setModel(modelo);
    }
    
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tfClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteFocusGained
        //jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0,102,204)));
    }//GEN-LAST:event_tfClienteFocusGained

    private void tfClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteFocusLost
        //jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_tfClienteFocusLost

    private void btnAddProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductosMouseClicked
        AgregarProducto agregar = new AgregarProducto(new JFrame(), true, this, temp);
        agregar.setVisible(true); 
    }//GEN-LAST:event_btnAddProductosMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if(!tfCliente.getText().isEmpty() && 
                !tfVendedor.getText().isEmpty() && 
                !tfTelefonoClient.getText().isEmpty() &&
                !tfTelefonoVendedor.getText().isEmpty() &&
                !tfDireccion.getText().isEmpty() &&
                !tfDui.getText().isEmpty() &&
                !tfFecha.getText().isEmpty()
                ){
            if(temp.isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe agregar 1 o mas productos", "Productos", JOptionPane.WARNING_MESSAGE);
            }else{
                classes.Factura nueva = new classes.Factura(Factura.ParseFecha(tfFecha.getText()), factura.registro.size() + 1); //Nueva Factura(fecha, No. de Factura)
                nueva.addCliente(tfCliente.getText(), tfTelefonoClient.getText(), tfDireccion.getText()); //Se agrega la información del cliente
                nueva.addVendedor(tfDui.getText(), tfVendedor.getText(), tfTelefonoVendedor.getText()); //Se agrega la informacion del Vendedor
                
                for(classes.Detalle p : temp){
                    nueva.addDetalle(p); //Con el bucle se agregan todos los detalles a la factura
                }
                
                temp.clear(); // Se limpia el arraylist para no dejar detalles
                factura.registro.add(nueva); //Se agrega la factura al arraylist de facturas
                factura.mostrarDatos();
                limpiarFormulario();
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static Date ParseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try{
            fechaDate = formato.parse(fecha);
        } 
        catch(ParseException ex){
            System.out.println(ex);
        }
        
        return fechaDate;
    }
   
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                NuevaFactura dialog = new NuevaFactura(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddProductos;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel descIVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNoFactura;
    private javax.swing.JLabel subTotalFactura;
    private rojerusan.RSTableMetro tablaProductosFactura;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JFormattedTextField tfDui;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfTelefonoClient;
    private javax.swing.JTextField tfTelefonoVendedor;
    private javax.swing.JTextField tfVendedor;
    private javax.swing.JLabel totalFactura;
    // End of variables declaration//GEN-END:variables
}
