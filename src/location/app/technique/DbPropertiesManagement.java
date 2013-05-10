/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.technique;

import location.app.technique.XmlDbParameters;
import java.util.Map;

/**
 *
 * @author esprit
 */
public class DbPropertiesManagement extends javax.swing.JFrame {

    /**
     * Creates new form DbPropertiesManagement
     */
    public DbPropertiesManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        dataBasePropertiesPanel = new javax.swing.JPanel();
        servernameLabel = new javax.swing.JLabel();
        servernameField = new javax.swing.JTextField();
        dbSchemaLabel = new javax.swing.JLabel();
        databaseschemaField = new javax.swing.JTextField();
        DataBaseAuthenticationPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        actionPanel = new javax.swing.JPanel();
        loadButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        datasourcePanel = new javax.swing.JPanel();
        datasourcelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dataBasePropertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Base Properties"));

        servernameLabel.setText("Server Name");

        dbSchemaLabel.setText("Data Base Schema");

        javax.swing.GroupLayout dataBasePropertiesPanelLayout = new javax.swing.GroupLayout(dataBasePropertiesPanel);
        dataBasePropertiesPanel.setLayout(dataBasePropertiesPanelLayout);
        dataBasePropertiesPanelLayout.setHorizontalGroup(
            dataBasePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBasePropertiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataBasePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBasePropertiesPanelLayout.createSequentialGroup()
                        .addComponent(servernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(servernameField))
                    .addGroup(dataBasePropertiesPanelLayout.createSequentialGroup()
                        .addComponent(dbSchemaLabel)
                        .addGap(10, 10, 10)
                        .addComponent(databaseschemaField)))
                .addContainerGap())
        );
        dataBasePropertiesPanelLayout.setVerticalGroup(
            dataBasePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBasePropertiesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dataBasePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servernameLabel)
                    .addComponent(servernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dataBasePropertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbSchemaLabel)
                    .addComponent(databaseschemaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        DataBaseAuthenticationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Base Authentication"));

        loginLabel.setText("Login");

        passwordLabel.setText("Password");

        javax.swing.GroupLayout DataBaseAuthenticationPanelLayout = new javax.swing.GroupLayout(DataBaseAuthenticationPanel);
        DataBaseAuthenticationPanel.setLayout(DataBaseAuthenticationPanelLayout);
        DataBaseAuthenticationPanelLayout.setHorizontalGroup(
            DataBaseAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataBaseAuthenticationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataBaseAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataBaseAuthenticationPanelLayout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginField))
                    .addGroup(DataBaseAuthenticationPanelLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField)))
                .addContainerGap())
        );
        DataBaseAuthenticationPanelLayout.setVerticalGroup(
            DataBaseAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataBaseAuthenticationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataBaseAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataBaseAuthenticationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadButton)
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(updateButton))
                .addContainerGap())
        );

        datasourcelabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        datasourcelabel.setText("Data Source");

        javax.swing.GroupLayout datasourcePanelLayout = new javax.swing.GroupLayout(datasourcePanel);
        datasourcePanel.setLayout(datasourcePanelLayout);
        datasourcePanelLayout.setHorizontalGroup(
            datasourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datasourcePanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(datasourcelabel)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        datasourcePanelLayout.setVerticalGroup(
            datasourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datasourcePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datasourcelabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataBasePropertiesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DataBaseAuthenticationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datasourcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datasourcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataBasePropertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(DataBaseAuthenticationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Map<String,String> map = XmlDbParameters.getDBProperties();
        servernameField.setText(map.get("servername"));
        databaseschemaField.setText(map.get("schema"));
        loginField.setText(map.get("username"));
        passwordField.setText(map.get("password"));    
    }                                          

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
      
        XmlDbParameters.updateDBProperty("servername", servernameField.getText());
        XmlDbParameters.updateDBProperty("schema", databaseschemaField.getText());
        XmlDbParameters.updateDBProperty("username", loginField.getText());
        XmlDbParameters.updateDBProperty("password", passwordField.getText());
     
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DbPropertiesManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DbPropertiesManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DbPropertiesManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DbPropertiesManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DbPropertiesManagement().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel DataBaseAuthenticationPanel;
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel dataBasePropertiesPanel;
    private javax.swing.JTextField databaseschemaField;
    private javax.swing.JPanel datasourcePanel;
    private javax.swing.JLabel datasourcelabel;
    private javax.swing.JLabel dbSchemaLabel;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField servernameField;
    private javax.swing.JLabel servernameLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration                   
}
