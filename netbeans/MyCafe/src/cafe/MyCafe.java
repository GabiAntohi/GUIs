/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe;

import java.awt.Color;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dsd10
 */
public class MyCafe extends javax.swing.JFrame {
    //global variable
private boolean appendToFile;
    /**
     * Creates new form MyCafe
     */
    public MyCafe() {
        initComponents();//first
      //  getContentPane().setBackground(Color.ORANGE);
        getContentPane().setBackground(new Color(255,228,181));
        cmbMealType.setSelectedIndex(0);//after init components
        rbAppendToFile.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbCoffee = new javax.swing.JRadioButton();
        rbCoke = new javax.swing.JRadioButton();
        rbFanta = new javax.swing.JRadioButton();
        rbSprite = new javax.swing.JRadioButton();
        rbTea = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnPlaceOrder = new javax.swing.JButton();
        rbSchweppes = new javax.swing.JRadioButton();
        cmbMealType = new javax.swing.JComboBox();
        cbButter = new javax.swing.JCheckBox();
        cbMayo = new javax.swing.JCheckBox();
        cbKetchup = new javax.swing.JCheckBox();
        cbVinegar = new javax.swing.JCheckBox();
        cbBread = new javax.swing.JCheckBox();
        cbSauce = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstOptions = new javax.swing.JList();
        btnLoadFromFile = new javax.swing.JButton();
        btnSaveToFile = new javax.swing.JButton();
        btnResetForm = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbOverwrite = new javax.swing.JRadioButton();
        rbAppendToFile = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 238));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(148, 82, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Café");

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel2.setText("Options");

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel3.setText("Meal Type");

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel4.setText("Drink");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel5.setText("Extras");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N

        buttonGroup1.add(rbCoffee);
        rbCoffee.setText("Coffee");

        buttonGroup1.add(rbCoke);
        rbCoke.setText("Coke");

        buttonGroup1.add(rbFanta);
        rbFanta.setText("Fanta");

        buttonGroup1.add(rbSprite);
        rbSprite.setText("Sprite");

        buttonGroup1.add(rbTea);
        rbTea.setText("Tea");

        txtArea.setColumns(20);
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtArea);

        btnPlaceOrder.setFont(new java.awt.Font("Maiandra GD", 0, 17)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(148, 82, 12));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSchweppes);
        rbSchweppes.setText("Schweppes");

        cmbMealType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Breakfast", "Lunch", "Dinner" }));
        cmbMealType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMealTypeActionPerformed(evt);
            }
        });

        cbButter.setText("Butter");

        cbMayo.setText("Mayo");

        cbKetchup.setText("Ketchup");

        cbVinegar.setText("Vinegar");

        cbBread.setText("Bread");

        cbSauce.setText("Sauce");

        jScrollPane2.setViewportView(lstOptions);

        btnLoadFromFile.setFont(new java.awt.Font("Maiandra GD", 0, 17)); // NOI18N
        btnLoadFromFile.setForeground(new java.awt.Color(148, 82, 12));
        btnLoadFromFile.setText("Load from File");
        btnLoadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFromFileActionPerformed(evt);
            }
        });

        btnSaveToFile.setFont(new java.awt.Font("Maiandra GD", 0, 17)); // NOI18N
        btnSaveToFile.setForeground(new java.awt.Color(148, 82, 12));
        btnSaveToFile.setText("Save to File");
        btnSaveToFile.setEnabled(false);
        btnSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToFileActionPerformed(evt);
            }
        });

        btnResetForm.setFont(new java.awt.Font("Maiandra GD", 0, 17)); // NOI18N
        btnResetForm.setForeground(new java.awt.Color(148, 82, 12));
        btnResetForm.setText("Reset");
        btnResetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFormActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 228, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("File Write Mode"));

        buttonGroup2.add(rbOverwrite);
        rbOverwrite.setText("Overwrite");
        rbOverwrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileWriteModeRadioButtonClicked(evt);
            }
        });

        buttonGroup2.add(rbAppendToFile);
        rbAppendToFile.setSelected(true);
        rbAppendToFile.setText("Append to File");
        rbAppendToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileWriteModeRadioButtonClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAppendToFile)
                    .addComponent(rbOverwrite))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAppendToFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOverwrite)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmbMealType, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rbCoke)
                        .addComponent(rbCoffee)
                        .addComponent(rbFanta)
                        .addComponent(rbSprite)
                        .addComponent(rbTea)
                        .addComponent(rbSchweppes)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbButter)
                    .addComponent(cbMayo)
                    .addComponent(cbKetchup)
                    .addComponent(cbVinegar)
                    .addComponent(cbBread)
                    .addComponent(cbSauce)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSaveToFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPlaceOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLoadFromFile, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbMealType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(cbButter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMayo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbKetchup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVinegar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbBread)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSauce))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(rbTea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoffee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoke)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFanta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbSprite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbSchweppes)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlaceOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSaveToFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLoadFromFile))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFromFileActionPerformed
        try (FileReader fr = new FileReader("order.txt");
                BufferedReader br = new BufferedReader(fr)) {
             
            String line = "";
            String wholeFile = "";
             
            while ( (line = br.readLine()) != null) {
                //txtArea.setText(line);
                wholeFile += line + "\n";
            }
             
            // Add the wholeFile to the textArea
            if (wholeFile.isEmpty()) {
                JOptionPane.showMessageDialog(this, "File is empty");
            } else {
                txtArea.setText(wholeFile);
            }
             
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "File could not be opened");
        }
    }//GEN-LAST:event_btnLoadFromFileActionPerformed

    private void btnSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToFileActionPerformed
        // make sure there is text in the text area, if it not empty
        if (txtArea.getText().isEmpty()){
        JOptionPane.showInternalMessageDialog(this, "Please place an order"); }
        else {
            //try(PrintWriter pw = new PrintWriter("order.txt")){
          //  pw.println(txtArea.getText());
             System.out.println("appendToFile" + appendToFile);
            try (FileWriter fw = new FileWriter(
                                 new File("order.txt"), appendToFile);
                    PrintWriter pw = new PrintWriter(fw)){
                
                pw.println(txtArea.getText());
         JOptionPane.showMessageDialog(this, "Order written to file"); 
        }catch(FileNotFoundException e){
            e.printStackTrace();
             JOptionPane.showMessageDialog(this, "File not found"); 
        }
            catch(IOException e){
            e.printStackTrace();
             JOptionPane.showMessageDialog(this, "Unable to create file"); 
        }
                }
 
    }//GEN-LAST:event_btnSaveToFileActionPerformed

    private void btnResetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFormActionPerformed
        this.dispose();  
       // Create a new frame in memory, everything will be reset 
       new MyCafe().setVisible(true);
    }//GEN-LAST:event_btnResetFormActionPerformed

    private void cmbMealTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMealTypeActionPerformed
  // the string selected in the combo box, if it's breackfast add breakfast stuff to the list, if it's lunch add lunch stuff to the list      
        String mealSelected = cmbMealType.getSelectedItem().toString();
        
        DefaultListModel<String> model = new DefaultListModel<>();
        switch(mealSelected){
            case "Breakfast":
                model.addElement("sausages");
                model.addElement("fried eggs");
                model.addElement("scrambled eggs");
                model.addElement("porridge");
                model.addElement("mushrooms");
                model.addElement("bacon");
                model.addElement("poached egg");
                break;
            case "Lunch":
                model.addElement("scrambled eggs");
                model.addElement("caesar salad");
                model.addElement("soup of the day");
                model.addElement("today's special");
                model.addElement("chicken baguette");
                break;
            case "Dinner":
                model.addElement("fried chicken");
                model.addElement("crispy duck");
                model.addElement("pulled pork");
                model.addElement("today's special");
                model.addElement("salmon darnes with chips");
                model.addElement("sea bass, lettuce and gravy");
                model.addElement("slow cooked beef");
        break;
            default:model.addElement("Choose Meal Type");
        }
        lstOptions.setModel(model);//loads the model into the options list
    }//GEN-LAST:event_cmbMealTypeActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
       btnSaveToFile.setEnabled(true); 
        String order = "";
        String options = lstOptions.getSelectedValuesList().toString().toLowerCase();
        order += options.substring(1,options.length()-1);

        if(rbCoffee.isSelected())
        order += "Coffee";
        else if(rbCoke.isSelected())
        order += "Coke";
        else if(rbFanta.isSelected())
        order += "Fanta";
        else if(rbSchweppes.isSelected())
        order += "Schweppes";
        else if(rbSprite.isSelected())
        order += "Sprite";
        else
        order += "Tea";

        if(cbButter.isSelected())
        order +=" and Butter";
        if(cbBread.isSelected())
        order +=" and Bread";
        if(cbKetchup.isSelected())
        order +=" and Ketchup";
        if(cbMayo.isSelected())
        order +=" and Mayo";
        if(cbSauce.isSelected())
        order +=" and Sauce";
        if(cbVinegar.isSelected())
        order +=" and Vinegar.";

        if (order.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please choose something");
        } else {
            txtArea.setText("You ordered " + order + ".");
        }

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void fileWriteModeRadioButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileWriteModeRadioButtonClicked
        if(rbAppendToFile.isSelected())
            appendToFile = true;
        else
            appendToFile=false;
    }//GEN-LAST:event_fileWriteModeRadioButtonClicked

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
            java.util.logging.Logger.getLogger(MyCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadFromFile;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnResetForm;
    private javax.swing.JButton btnSaveToFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbBread;
    private javax.swing.JCheckBox cbButter;
    private javax.swing.JCheckBox cbKetchup;
    private javax.swing.JCheckBox cbMayo;
    private javax.swing.JCheckBox cbSauce;
    private javax.swing.JCheckBox cbVinegar;
    private javax.swing.JComboBox cmbMealType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstOptions;
    private javax.swing.JRadioButton rbAppendToFile;
    private javax.swing.JRadioButton rbCoffee;
    private javax.swing.JRadioButton rbCoke;
    private javax.swing.JRadioButton rbFanta;
    private javax.swing.JRadioButton rbOverwrite;
    private javax.swing.JRadioButton rbSchweppes;
    private javax.swing.JRadioButton rbSprite;
    private javax.swing.JRadioButton rbTea;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
