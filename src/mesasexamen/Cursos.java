package mesasexamen;//GEN-FIRST:event_TablaMouseClicked
//GEN-LAST:event_TablaMouseClicked

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cursos extends javax.swing.JFrame {

    Conexion con1= new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    String orden = "";
    String aod = "asc ";
    String especif = "";
    public Cursos() {
        initComponents();
        setLocationRelativeTo(null);
        
        Seleccionar();
        consultar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        materiatxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cursotxt = new javax.swing.JTextField();
        profesorestxt = new javax.swing.JTextField();
        horariotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        IPmateriastxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        buscartxt = new javax.swing.JTextField();
        Combo = new javax.swing.JComboBox<>();
        AoD = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        especificador = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        materiatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiatxtActionPerformed(evt);
            }
        });

        jLabel1.setText("materia");

        cursotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursotxtActionPerformed(evt);
            }
        });

        jLabel2.setText("curso");

        jLabel3.setText("profesores");

        jLabel4.setText("horario");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        nuevo.setText("Limpiar");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        IPmateriastxt.setEditable(false);
        IPmateriastxt.setForeground(new java.awt.Color(140, 140, 140));
        IPmateriastxt.setCaretColor(new java.awt.Color(140, 140, 140));

        jLabel5.setText("IPmateria");

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(horariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profesorestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(materiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IPmateriastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(agregar)
                                .addGap(18, 18, 18)
                                .addComponent(modificar)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar)
                                .addGap(18, 18, 18)
                                .addComponent(nuevo))
                            .addComponent(volver))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IPmateriastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(materiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cursotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(profesorestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(modificar)
                    .addComponent(eliminar)
                    .addComponent(nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IPmaterias", "materia", "curso", "profesores", "horario"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setMaxWidth(75);
            Tabla.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        buscartxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                buscartxtCaretUpdate(evt);
            }
        });

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "IPmaterias", "materia", "curso", "profesores", "horario" }));
        Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboItemStateChanged(evt);
            }
        });

        AoD.setText("Ascendente");
        AoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AoDActionPerformed(evt);
            }
        });

        jLabel6.setText("Especificamente:");

        especificador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "IPmaterias", "materia", "curso", "profesores", "horario" }));
        especificador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                especificadorItemStateChanged(evt);
            }
        });

        jLabel7.setText("Ordenado por:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(especificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AoD)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AoD)
                    .addComponent(jLabel6)
                    .addComponent(especificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void materiatxtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void cursotxtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Agregar();
        Nuevo();
        buscar();
    }                                       

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Eliminar();
        Nuevo();
        buscar();
    }                                        

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Modificar();
        Nuevo();
        buscar();
    }                                         

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Nuevo();
    }                                     

    private void AoDActionPerformed(java.awt.event.ActionEvent evt) {                                    
        Cambio();
        Seleccionar();
        buscar();
    }                                   

    private void buscartxtCaretUpdate(javax.swing.event.CaretEvent evt) {                                      
        if(especif.equals("")){
            buscar();
        }else{
            buscarestricto();    
        }
    }                                     

    private void ComboItemStateChanged(java.awt.event.ItemEvent evt) {                                       
        Seleccionar();
        limpiasegura();
        buscar();   
    }                                      

    private void especificadorItemStateChanged(java.awt.event.ItemEvent evt) {                                               
        Especificar();
        limpiasegura();
        if(especif.equals("")){
            buscar();
        }else{
            buscarestricto();    
        }
    }                                              

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {                                   
        int fila = Tabla.getSelectedRow();
            
            if(fila==-1){
                
            JOptionPane.showMessageDialog(null, "No se selecciono fila");
            }else{
                int IPmaterias = Integer.parseInt((String)Tabla.getValueAt(fila, 0) .toString());
                String materia = Tabla.getValueAt(fila, 1) .toString();
                String curso = Tabla.getValueAt(fila, 2) .toString();
                String profesores = Tabla.getValueAt(fila, 3) .toString();
                String horario = Tabla.getValueAt(fila, 4) .toString();
                
                IPmateriastxt.setText(""+IPmaterias);
                materiatxt.setText(""+materia);
                cursotxt.setText(""+curso);
                profesorestxt.setText(""+profesores);
                horariotxt.setText(""+horario);
                
            }
    }                                  

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                       
        jtable administrar = new jtable();
        administrar.setVisible(true);
        this.setVisible(false);
    }                                      

    void Agregar(){
        
        String materia = materiatxt.getText();
        String curso = cursotxt.getText();
        String profesores = profesorestxt.getText();
        String horario = horariotxt.getText();
        
        try {
            if (materia.equals("")||curso.equals("")||profesores.equals("")||horario.equals("")){
                JOptionPane.showMessageDialog(null, "Falta algun dato");
                limpiarTabla();
            } else{
                String sql = "insert into materias(IPmaterias, materia, curso, profesores, horario) values (NULL,'"+materia+"','"+curso+"','"+profesores+"','"+horario+"')";
                conet = con1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Maeteria agregada");
                limpiarTabla();
            }
        }catch (Exception e){
            
        }
        
        
    }
    
    void Modificar(){
        
        String IPmaterias = IPmateriastxt.getText();
        String materia = materiatxt.getText();
        String curso = cursotxt.getText();
        String profesores = profesorestxt.getText();
        String horario = horariotxt.getText();
        
        
        try {
            if (materia.equals("")||curso.equals("")||profesores.equals("")||horario.equals("")){
                JOptionPane.showMessageDialog(null, "Falta algun dato");
                limpiarTabla();
            } else{
                
                String sql = "Update materias set materia='"+materia+"', curso='"+curso+"', profesores='"+profesores+"', horario='"+horario+"' where IPmaterias="+IPmaterias;
                conet = con1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Materia modificada");
                limpiarTabla();
            }
        }catch (Exception e){
            
        }
          
    }
    
    
    void Especificar(){
        
        if(especificador.getSelectedItem().equals("---")){
            especif= "";
        }else{
        especif = (String) especificador.getSelectedItem();
        }
        
    }
    
    void buscarestricto(){
        String busqueda = buscartxt.getText();
        String sql= "SELECT * FROM `materias` WHERE "+especif+" LIKE '"+busqueda+"' "+orden;
        if(especif.equals(" ")){
            sql= "SELECT * FROM `materias` WHERE IPmaterias LIKE '"+busqueda+"' or materia LIKE '"+busqueda+"' or curso LIKE '"+busqueda+"' or profesores LIKE '"+busqueda+"' or horario LIKE '"+busqueda+"' ORDER BY `materia`";
    
        }
        if (busqueda.equals("")){
            limpiasegura();
            consultar();
        }else{
            limpiasegura();
            
            
            try{
                conet = con1.getConnection();
                st = conet.createStatement();
                rs = st.executeQuery(sql);
                Object[] muestra = new Object [5];
                modelo= (DefaultTableModel) Tabla.getModel();
                while (rs.next()){
                    muestra [0] = rs.getInt("IPmaterias");
                    muestra [1] = rs.getString("materia");
                    muestra [2] = rs.getString("curso");
                    muestra [3] = rs.getString("profesores");
                    muestra [4] = rs.getString("horario");
                
                    modelo.addRow(muestra);
                
                    }
                Tabla.setModel(modelo);
                
        
            } catch (Exception e){
            }    
        }
    }
     
    void limpiarTabla(){
        for (int i = 0; i <=Tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
        
    }
      
    void limpiasegura(){
        try {
            limpiarTabla();
        }catch (Exception e){
        }
    }
    
    void Seleccionar(){
        
        if(Combo.getSelectedItem().equals("---")){
            orden= " ";
        }else{
            orden = "order by "+(String) Combo.getSelectedItem()+" "+aod;
        }
        
    }
    
    void Cambio(){
       aod = AoD.getText();
        
        if ("Ascendente".equals(aod)){
            aod = "desc ";
            AoD.setText("Descendente");   
        }else{
            aod = "asc ";
            AoD.setText("Ascendente");    
        } 
    }  
      
    void buscar(){
        String busqueda = buscartxt.getText();
        String sql= "SELECT * FROM `materias` WHERE IPmaterias LIKE '%"+busqueda+"%' or materia LIKE '%"+busqueda+"%' or curso LIKE '%"+busqueda+"%' or profesores LIKE '%"+busqueda+"%' or horario LIKE '%"+busqueda+"%' "+orden;
              
        if (busqueda.equals("")){
            limpiasegura();
            consultar();
        }else{
            limpiasegura();
            try{
                conet = con1.getConnection();
                st = conet.createStatement();
                rs = st.executeQuery(sql);
                Object[] muestra = new Object [5];
                modelo= (DefaultTableModel) Tabla.getModel();
                while (rs.next()){
                    muestra [0] = rs.getInt("IPmaterias");
                    muestra [1] = rs.getString("materia");
                    muestra [2] = rs.getString("curso");
                    muestra [3] = rs.getString("profesores");
                    muestra [4] = rs.getString("horario");
                
                    modelo.addRow(muestra);
                
                    }
                Tabla.setModel(modelo);
                
        
            } catch (Exception e){
            }    
        }
    }
     
     
     
     
     
     
     
     
     
     
     
    void consultar(){
        String sql= "select * from materias "+orden ;
        
        try{
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] muestra = new Object [5];
            modelo= (DefaultTableModel) Tabla.getModel();
            while (rs.next()){
                    muestra [0] = rs.getInt("IPmaterias");
                    muestra [1] = rs.getString("materia");
                    muestra [2] = rs.getString("curso");
                    muestra [3] = rs.getString("profesores");
                    muestra [4] = rs.getString("horario");
                    
                modelo.addRow(muestra);
                
            }
            Tabla.setModel(modelo);
        } catch (Exception e){
            
        }
    }
    
     
     
     
     
     
    void Eliminar(){
        int fila=Tabla.getSelectedRow();
        try{
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Materia no seleccionada");
                limpiarTabla();
            }else{
                String sql= "delete from materias where IPmaterias="+IPmateriastxt.getText();
                conet = con1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Materia eliminada");
                limpiarTabla();
            }
        }catch(Exception e){
            
        }
    }
    
    void Nuevo(){
        materiatxt.requestFocus();
        
        IPmateriastxt.setText("");
        materiatxt.setText("");
        cursotxt.setText("");
        profesorestxt.setText("");
        horariotxt.setText("");
    }
     
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
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AoD;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JTextField IPmateriastxt;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField buscartxt;
    private javax.swing.JTextField cursotxt;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> especificador;
    private javax.swing.JTextField horariotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField materiatxt;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField profesorestxt;
    private javax.swing.JButton volver;
    // End of variables declaration                   
}
