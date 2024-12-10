/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.nba_excel;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author algua
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jugador1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jugador = new javax.swing.JTextField();
        SpinnerRealizados = new javax.swing.JSpinner();
        SpinnerTiros2 = new javax.swing.JSpinner();
        SpinnerTiros3 = new javax.swing.JSpinner();
        BotonCalcular = new javax.swing.JButton();
        valoracionIngreso = new javax.swing.JTextField();
        ValoracionTXT = new javax.swing.JLabel();

        Jugador1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setText("Tiros metidos de 2:");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NBA ESTADÍSTICAS");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del Jugador:");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Tiros Realizados: ");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Tiros metidos de 3:");

        Jugador.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BotonCalcular.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        BotonCalcular.setText("CALCULAR");
        BotonCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });

        valoracionIngreso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ValoracionTXT.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ValoracionTXT.setText("Valoración");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ValoracionTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SpinnerRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SpinnerTiros3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SpinnerTiros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valoracionIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerTiros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerTiros3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valoracionIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValoracionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
        // TODO add your handling code here:
        procesarYGenerarExcel();
    }//GEN-LAST:event_BotonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    // Metodo que procesa los datos y genera el archivo Excel
     private void procesarYGenerarExcel() {
        try {
            // Obtiene datos de la interfaz
            String nombreJugador = Jugador.getText();
            int tirosRealizados = (int) SpinnerRealizados.getValue();
            int tirosMetidos2 = (int) SpinnerTiros2.getValue();
            int tirosMetidos3 = (int) SpinnerTiros3.getValue();
            String valor = valoracionIngreso.getText();
            
            
              if (nombreJugador.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del jugador.");
                return;
            }

            if (tirosRealizados == 0) {
                JOptionPane.showMessageDialog(null, "Los tiros realizados no pueden ser 0.");
                return;
            }
            
            if (valor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la valoración del jugador.");
                return;
            }

            // Calcular %FG y %eFG
            double porcentajeFG = ((double) (tirosMetidos2 + tirosMetidos3) / tirosRealizados) * 100;
            double porcentajeEFG = ((double) (tirosMetidos2 + 1.5 * tirosMetidos3) / tirosRealizados) * 100;

            // Crear archivo Excel
            crearInformeExcel("C:\\Users\\algua\\OneDrive\\Documentos\\NetBeansProjects\\NBA_Excel\\ExcelNBA.xlsx", nombreJugador, tirosRealizados, tirosMetidos2, tirosMetidos3, porcentajeFG, porcentajeEFG, valor);

            // Confirmación
            JOptionPane.showMessageDialog(null, "Informe generado exitosamente: EstadisticasNBA.xlsx");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar los datos: " + ex.getMessage());
        }
    }
    
    //Metodo para crear el archivo Excel
    private void crearInformeExcel(String nombreArchivo, String nombreJugador, int tirosRealizados, int tirosMetidos2, int tirosMetidos3, double porcentajeFG, double porcentajeEFG, String valor) throws IOException {
        // Crear referencias para Workbook y Sheet
       Workbook libroExcel;
       Sheet hoja;

       File archivoExcel = new File(nombreArchivo);

       if (archivoExcel.exists()) {
           // Si el archivo existe, cargarlo
           FileInputStream fis = new FileInputStream(archivoExcel);
           libroExcel = new XSSFWorkbook(fis);
           hoja = libroExcel.getSheetAt(0); // Obtener la primera hoja
           fis.close();
       } else {
           // Si el archivo no existe, crear uno nuevo
           libroExcel = new XSSFWorkbook();
           hoja = libroExcel.createSheet("Estadísticas");

           // Crear encabezados
           Row encabezado = hoja.createRow(0);
           encabezado.createCell(0).setCellValue("Nombre del Jugador");
           encabezado.createCell(1).setCellValue("Tiros Realizados");
           encabezado.createCell(2).setCellValue("Tiros Metidos de 2");
           encabezado.createCell(3).setCellValue("Tiros Metidos de 3");
           encabezado.createCell(4).setCellValue("% FG");
           encabezado.createCell(5).setCellValue("% eFG");
           encabezado.createCell(6).setCellValue("Valoración");
       }

       // Buscar la siguiente fila vacía
       int filaNueva = hoja.getLastRowNum() + 1;

       // Crear una nueva fila para agregar los datos
       Row fila = hoja.createRow(filaNueva);
       fila.createCell(0).setCellValue(nombreJugador);
       fila.createCell(1).setCellValue(tirosRealizados);
       fila.createCell(2).setCellValue(tirosMetidos2);
       fila.createCell(3).setCellValue(tirosMetidos3);
       fila.createCell(4).setCellValue(porcentajeFG);
       fila.createCell(5).setCellValue(porcentajeEFG);
       fila.createCell(6).setCellValue(valor);

       // Autoajustar columnas
       for (int i = 0; i <= 6; i++) {
           hoja.autoSizeColumn(i);
       }

       // Guardar archivo Excel
       try (FileOutputStream archivo = new FileOutputStream(nombreArchivo)) {
           libroExcel.write(archivo);
       }
       libroExcel.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JTextField Jugador;
    private javax.swing.JTextField Jugador1;
    private javax.swing.JSpinner SpinnerRealizados;
    private javax.swing.JSpinner SpinnerTiros2;
    private javax.swing.JSpinner SpinnerTiros3;
    private javax.swing.JLabel ValoracionTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField valoracionIngreso;
    // End of variables declaration//GEN-END:variables
}
