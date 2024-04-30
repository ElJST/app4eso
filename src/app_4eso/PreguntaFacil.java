/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_4eso;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dam126
 */
public class PreguntaFacil extends javax.swing.JFrame {

    /**
     * Creates new form Preguntas
     */
    private PanelPrincipalApp panelPrinc = new PanelPrincipalApp();
    private PreguntasFacil p = new PreguntasFacil();
    private String numero1 = ""+p.getNum1();
    private String numero2 = ""+p.getNum2();
    
    private String numero3 = ""+p.getSumaN1();
    private String numero4 = ""+p.getSumaN2();
    
    private String numero5 = ""+p.getRestaN1();
    private String numero6 = ""+p.getRestaN2();
    
    private String numero7 = ""+p.getDivi1();
    private String numero8 = ""+p.getDivi2();
    
    private int acu = 0,puntaje = 0,nFacilAcu = 0;
    public PreguntaFacil() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciarLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAceptarPreguntas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRespuesta = new javax.swing.JTextField();
        signo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelnum1 = new javax.swing.JLabel();
        jLabelnum2 = new javax.swing.JLabel();
        jTextFieldRespuestaSuma = new javax.swing.JTextField();
        signo1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelnum3suma = new javax.swing.JLabel();
        jLabelnum4suma = new javax.swing.JLabel();
        jTextFieldRespuestaResta = new javax.swing.JTextField();
        signo2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelnum5resta = new javax.swing.JLabel();
        jLabelnum6resta = new javax.swing.JLabel();
        jTextFieldRespuestaDivision = new javax.swing.JTextField();
        signo3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelnum7division = new javax.swing.JLabel();
        jLabelnum8division = new javax.swing.JLabel();
        jLabelPuntos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelpuntaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculESO - Facil");
        setBackground(new java.awt.Color(204, 255, 204));

        jButtonAceptarPreguntas.setText("Aceptar");
        jButtonAceptarPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarPreguntasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Operaciones:");

        jTextFieldRespuesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaActionPerformed(evt);
            }
        });

        signo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signo.setText("x");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("=");

        jLabelnum1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelnum2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldRespuestaSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaSumaActionPerformed(evt);
            }
        });

        signo1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signo1.setText("+");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("=");

        jLabelnum3suma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelnum4suma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldRespuestaResta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaRestaActionPerformed(evt);
            }
        });

        signo2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signo2.setText("-");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("=");

        jLabelnum5resta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelnum6resta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldRespuestaDivision.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaDivisionActionPerformed(evt);
            }
        });

        signo3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signo3.setText("/");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("=");

        jLabelnum7division.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelnum8division.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelPuntos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPuntos.setText("Puntos:");

        jLabelpuntaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelpuntaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAceptarPreguntas)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelnum7division, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signo3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabelnum8division, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRespuestaDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelnum5resta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabelnum6resta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRespuestaResta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabelnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelnum3suma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabelnum4suma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRespuestaSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelnum4suma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(signo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelnum3suma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldRespuestaSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addComponent(jTextFieldRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelnum6resta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelnum5resta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldRespuestaResta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelnum8division, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(signo3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelnum7division, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldRespuestaDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAceptarPreguntas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPuntos)
                        .addComponent(jLabel2)
                        .addComponent(jLabelpuntaje)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarLabel(){
        jLabelnum1.setText(numero1);
        jLabelnum2.setText(numero2);
        
        jLabelnum3suma.setText(numero3);
        jLabelnum4suma.setText(numero4);
        
        jLabelnum5resta.setText(numero5);
        jLabelnum6resta.setText(numero6);
        
        jLabelnum7division.setText(numero7);
        jLabelnum8division.setText(numero8);
        
    }
    
    private void jButtonAceptarPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarPreguntasActionPerformed
        if(panelPrinc.validarNumeros(jTextFieldRespuesta.getText().trim())
            && panelPrinc.validarNumeros(jTextFieldRespuestaSuma.getText().trim())
                && panelPrinc.validarNumeros(jTextFieldRespuestaDivision.getText().trim())
                && panelPrinc.validarNumeros(jTextFieldRespuestaResta.getText().trim())){
            if(nFacilAcu == 10){
                CuantoX x = new CuantoX();
                setVisible(false);
                x.setVisible(true);
            }else{
                nFacilAcu++;
                String numero = jTextFieldRespuesta.getText();
                String numerosuma = jTextFieldRespuestaSuma.getText();
                String numeroresta = jTextFieldRespuestaResta.getText();
                String numerodivision = jTextFieldRespuestaDivision.getText();
                //para obtener el numero aleatorio
                String label1 = jLabelnum1.getText();
                String label2 = jLabelnum2.getText();

                String label1suma = jLabelnum3suma.getText();
                String label2suma = jLabelnum4suma.getText();

                String label3 = jLabelnum5resta.getText();
                String label4 = jLabelnum6resta.getText();

                String label5 = jLabelnum7division.getText();
                String label6 = jLabelnum8division.getText();
                //string a entero
                int p1 = Integer.parseInt(label1);
                int p2 = Integer.parseInt(label2);

                int p3 = Integer.parseInt(label1suma);
                int p4 = Integer.parseInt(label2suma);

                int p5 = Integer.parseInt(label3);
                int p6 = Integer.parseInt(label4);

                int p7 = Integer.parseInt(label5);
                int p8 = Integer.parseInt(label6);
                //obtener respuesta
                int respuesta = Integer.parseInt(numero);
                int respuestaSuma = Integer.parseInt(numerosuma);
                int respuestaResta = Integer.parseInt(numeroresta);
                int respuestaDivision = Integer.parseInt(numerodivision);
                //verificar
                int corrrecto = p1 * p2;
                int corrrectoSuma = p3 + p4;
                int corrrectoResta = p5 - p6;
                int corrrectoDivision = p7 / p8;

                if(respuesta == corrrecto && respuestaSuma == corrrectoSuma && 
                        respuestaResta == corrrectoResta && respuestaDivision == corrrectoDivision){
                    JOptionPane.showMessageDialog(this, "respuesta correcta");
                    puntaje+=10;
                    String puntajeLabel=puntaje+"";
                    jLabelpuntaje.setText(puntajeLabel);
                    actualizarLabel();
                }else{
                    JOptionPane.showMessageDialog(this, "Respuesta Incorrecta", "Error",JOptionPane.ERROR_MESSAGE);
                    acu++;
                    if(acu == 3){
                        actualizarLabel();
                        acu = 0;
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Parametro incorrecto, solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceptarPreguntasActionPerformed
 
    private void actualizarLabel(){
        Random r1 = new Random();
        boolean verificado = false;
        //multiplicacion
        int num = r1.nextInt(50)+1;
        int num2 = r1.nextInt(30)+1;
        String label1 = ""+num;
        String label2 = ""+num2;
        //suma
        int sumaN1 = r1.nextInt(1000)+1;
        int sumaN2 = r1.nextInt(1000)+1;
        String sumaLabel1 = sumaN1+"";
        String sumaLabel2 = sumaN2+"";
        //resta
        int restaN1 ;
        int restaN2 ;
        //division
        int divisionN1, divisionN2;
        do{
            restaN1 = r1.nextInt(1000)+1;
            restaN2 = r1.nextInt(1000)+1;
            divisionN1 = r1.nextInt(500)+1;
            divisionN2 = r1.nextInt(100)+1;
            if (divisionN1 % divisionN2 == 0 && restaN1 > restaN2) {
                verificado = true;
            }
        }while(!verificado);
        //resta
        String restaLabel1 = restaN1+"";
        String restaLabel2 = restaN2+"";
        //division
        String divisionLabel1 = divisionN1+"";
        String divisionLabel2 = divisionN2+"";
        //coversion de los label
        //multiplicacion
        jLabelnum1.setText(label1);
        jLabelnum2.setText(label2);
        //suma
        jLabelnum3suma.setText(sumaLabel1);
        jLabelnum4suma.setText(sumaLabel2);
        //resta
        jLabelnum5resta.setText(restaLabel1);
        jLabelnum6resta.setText(restaLabel2);
        //division
        jLabelnum7division.setText(divisionLabel1);
        jLabelnum8division.setText(divisionLabel2);
    }
    
    private void jTextFieldRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaActionPerformed
        
        
        
    }//GEN-LAST:event_jTextFieldRespuestaActionPerformed

    private void jTextFieldRespuestaSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaSumaActionPerformed

    private void jTextFieldRespuestaRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaRestaActionPerformed

    private void jTextFieldRespuestaDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaDivisionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarPreguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPuntos;
    private javax.swing.JLabel jLabelnum1;
    private javax.swing.JLabel jLabelnum2;
    private javax.swing.JLabel jLabelnum3suma;
    private javax.swing.JLabel jLabelnum4suma;
    private javax.swing.JLabel jLabelnum5resta;
    private javax.swing.JLabel jLabelnum6resta;
    private javax.swing.JLabel jLabelnum7division;
    private javax.swing.JLabel jLabelnum8division;
    private javax.swing.JLabel jLabelpuntaje;
    private javax.swing.JTextField jTextFieldRespuesta;
    private javax.swing.JTextField jTextFieldRespuestaDivision;
    private javax.swing.JTextField jTextFieldRespuestaResta;
    private javax.swing.JTextField jTextFieldRespuestaSuma;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel signo3;
    // End of variables declaration//GEN-END:variables
}