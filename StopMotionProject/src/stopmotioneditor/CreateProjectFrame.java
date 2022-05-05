/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stopmotioneditor;

/**
 *
 * @author Burak Oruk
 */
public class CreateProjectFrame extends javax.swing.JFrame {

    /**
     * Creates new form CreateProjectFrame
     */
    public CreateProjectFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cpBackgroundPanel = new javax.swing.JPanel();
        cpCreateProjectLabel = new javax.swing.JLabel();
        cpForegroundLabel = new javax.swing.JPanel();
        cpEnterProjectLabel = new javax.swing.JLabel();
        cpEnterProjectTextField = new javax.swing.JTextField();
        cpSelectFileButton = new javax.swing.JButton();
        cpDoneButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        cpBackgroundPanel.setBackground(new java.awt.Color(153, 153, 0));

        cpCreateProjectLabel.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        cpCreateProjectLabel.setForeground(new java.awt.Color(255, 255, 102));
        cpCreateProjectLabel.setText("CREATE PROJECT");

        cpForegroundLabel.setBackground(new java.awt.Color(204, 204, 0));

        cpEnterProjectLabel.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        cpEnterProjectLabel.setForeground(new java.awt.Color(51, 51, 0));
        cpEnterProjectLabel.setText("ENTER PROJECT NAME");

        cpEnterProjectTextField.setBackground(new java.awt.Color(153, 153, 0));
        cpEnterProjectTextField.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        cpEnterProjectTextField.setForeground(new java.awt.Color(255, 255, 102));
        cpEnterProjectTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpEnterProjectTextFieldActionPerformed(evt);
            }
        });

        cpSelectFileButton.setBackground(new java.awt.Color(171, 153, 0));
        cpSelectFileButton.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        cpSelectFileButton.setForeground(new java.awt.Color(51, 51, 0));
        cpSelectFileButton.setText("CLICK TO SELECT FILE PATH");
        cpSelectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpSelectFileButtonActionPerformed(evt);
            }
        });

        cpDoneButton.setBackground(new java.awt.Color(224, 186, 11));
        cpDoneButton.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        cpDoneButton.setForeground(new java.awt.Color(255, 255, 102));
        cpDoneButton.setText("DONE! ");
        cpDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDoneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cpForegroundLabelLayout = new javax.swing.GroupLayout(cpForegroundLabel);
        cpForegroundLabel.setLayout(cpForegroundLabelLayout);
        cpForegroundLabelLayout.setHorizontalGroup(
            cpForegroundLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpForegroundLabelLayout.createSequentialGroup()
                .addGroup(cpForegroundLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cpForegroundLabelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(cpEnterProjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cpForegroundLabelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(cpEnterProjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cpForegroundLabelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(cpSelectFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cpForegroundLabelLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(cpDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        cpForegroundLabelLayout.setVerticalGroup(
            cpForegroundLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpForegroundLabelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cpEnterProjectLabel)
                .addGap(18, 18, 18)
                .addComponent(cpEnterProjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cpSelectFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cpDoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout cpBackgroundPanelLayout = new javax.swing.GroupLayout(cpBackgroundPanel);
        cpBackgroundPanel.setLayout(cpBackgroundPanelLayout);
        cpBackgroundPanelLayout.setHorizontalGroup(
            cpBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpBackgroundPanelLayout.createSequentialGroup()
                .addGroup(cpBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cpBackgroundPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(cpCreateProjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cpBackgroundPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(cpForegroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        cpBackgroundPanelLayout.setVerticalGroup(
            cpBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpBackgroundPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cpCreateProjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cpForegroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpEnterProjectTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpEnterProjectTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpEnterProjectTextFieldActionPerformed

    private void cpSelectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpSelectFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpSelectFileButtonActionPerformed

    private void cpDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDoneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDoneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateProjectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cpBackgroundPanel;
    private javax.swing.JLabel cpCreateProjectLabel;
    private javax.swing.JButton cpDoneButton;
    private javax.swing.JLabel cpEnterProjectLabel;
    private javax.swing.JTextField cpEnterProjectTextField;
    private javax.swing.JPanel cpForegroundLabel;
    private javax.swing.JButton cpSelectFileButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
