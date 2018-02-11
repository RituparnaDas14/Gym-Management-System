/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proj1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ira Bhatnagar
 */
public class Inventory extends javax.swing.JInternalFrame {
   

   MDIwindow m;
    public Inventory(MDIwindow m) {
          super("Inventory Descriptionn",true,true,true,true);
        initComponents();
        this.m=m;
        try {
            Connection con=Dbconnection.getConn();
            PreparedStatement ps=con.prepareStatement("select * from receipt");
            ResultSet rs=ps.executeQuery();
           while(rs.next()) {
              jTextField1.setText(String.valueOf(rs.getInt(1)+1));
              jTextField1.setEditable(false);
            }
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "database error"+e);
        }
           
       
       
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Category");

        jLabel2.setText("Product Id");

        jLabel3.setText("Description");

        jLabel4.setText("Brand");

        jLabel5.setText("Quantity");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addnew.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Squat Station", "Barbells", "Bench press", "Dumb bells", "pullup bar", "Single Teir DB Rack", "2-Teir Dumbbell Rack", "Adjustable Bench", "Barbells 20-110", "Body Master 4-Station Tower", "Body Master 90⁰", "Body Master Ab", "Body Master Ab Bench", "Body Master Bicep Curl", "Body Master Calf", "Body Master Chin Dip Assist", "Body Master Decline Bench", "Body Master Dip", "Body Master Dip/Knee Raise", "Body Master Dumbbell Rack", "Body Master Flat Bench", "Body Master Glute", "Body Master Hyper Extnsion", "Body Master Incline Bench", "Body Master Incline Press", "Body Master Inner Thigh", "Body Master Inner/Outer Combo", "Body Master Knee Raise", "Body Master Lat Pull Down", "Body Master Leg Curl", "Body Master Leg Extension", "Body Master Leg Press", "Body Master Leg Press (P/L)", "Body Master Lower Back", "Body Master Outer Thigh", "Body Master Pec/Fly", "Body Master Preacher Curl (P/L)", "Body Master Rotary Torso", "Body Master Seated Calf (P/L)", "Body Master Seated Row", "Body Master Shoulder Press", "Body Master Smith Machine", "Body Master Strength", "Body Master Tricep Pushdown", "Cybex 600A ARC Trainer", "Cybex 620 ARC Trainer", "Cybex Eagle Ab Machine", "Cybex Knee/Dip", "Cybex Shoulder Press (P/L)", "Cybex Smith Machine", "Cybex VR3 Leg Press (Black)", "Dead Lift Platform", "Eagle Rotary Torso", "Expresso Bike", "FreeMotion Incline Trainer", "Hammer Strength Incline Bench", "Hammer Strength MTS Incline", "Hammer Strength Olympic Shoulder Press", "Hammer Strength Plate Tree", "Hammer Strength Power Rack", "Icarian Accessory Rack", "Life Fitness 5-Station Multi Station", "Life Fitness 91XI Elliptical", "Life Fitness 9500 Elliptical", "Life Fitness 95XI Elliptical", "Life Fitness Ab Bench", "Life Fitness Abdominal Machine", "Life Fitness Bi", "Life Fitness Chest Press", "Life Fitness Elliptical", "Life Fitness Incline Press", "Life Fitness Leg Curl", "Life Fitness Leg Extension", "Life Fitness Leg Press", "Life Fitness Pec", "Life Fitness Recumbent Bike", "Life Fitness Row", "Life Fitness Smith Machine", "Life Fitness Stepper", "Life Fitness Treadmill", "Matrix Elliptical", "Nautulis Decline Bench", "Nautulis Olympic Bench", "Nautulis Pullup Station", "Octane", "Precor 546 V4", "Precor 546i Elliptical", "Precor 546i EXP Elliptical", "Precor 556i Elliptical", "Precor 576i EXP Elliptical", "Precor 576i V4", "Precor 933 Treadmill", "Precor 956 Treadmill", "Precor 956i Treadmill", "Precor Ab Bench", "Precor AMT 100i", "Precor C776i Steppers", "Precor EFX 533", "Precor EXP 956i Treadmill", "Precor Icarian Cable Crossover", "Precor Jungle Gym (5-Station)", "Precor Pec/Fly", "Rack", "Schwinn AC Sport Spin Bike", "Stairmaster 7000PT", "StairMaster SM5", "Star Trac NXT Spin Bike", "Star Trac Elite Spinner", "Star Trac E-TRX Treadmill", "Star Trac Impact Chest Press", "Star Trac Impact Low Row", "Star Trac Pec/Fly", "Star Trac Recumbent Bike", "Star Trac Recumbent Bike - ETRX", "Star Trac Upright Bike", "Technogym Calf", "True CS500 Treadmill", "True CS800 Elliptical", "True CS800 Recumbent Bike", "True CS800 Upright Bike" }));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jButton3.setText("Edit ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Inventory Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox1, 0, 93, Short.MAX_VALUE)
                                .addComponent(jTextField4)
                                .addComponent(jTextField3)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.sql.Date sd=null;
       if(jTextField2.getText().equals(""))
       {
       JOptionPane.showMessageDialog(null, "please enter id");
       return;
       }
       if(jTextField3.getText().equals(""))
       {
       JOptionPane.showMessageDialog(null, "please enter description");
       return;
       }
       if(jTextField4.getText().equals(""))
       {
       JOptionPane.showMessageDialog(null, "please enter brand");
       return;
       }
      java.text.SimpleDateFormat sdf= new java.text.SimpleDateFormat("dd-MM-yyyy");
      String dt=sdf.format(jDateChooser1.getDate());
        try {
            java.util.Date d=sdf.parse(dt);
            sd=new java.sql.Date(d.getTime());
            JOptionPane.showMessageDialog(null, sd);
        } catch (Exception e) {
        }
         try {
            Connection con=Dbconnection.getConn();
            PreparedStatement ps=con.prepareStatement("insert into inventory(category,id,description,brand,quantity,date1) values (?,?,?,?,?,?)");
            ps.setString(1, jComboBox1.getSelectedItem().toString());
            ps.setString(2,jTextField1.getText() );
            ps.setString(3, jTextField2.getText());
            ps.setString(4, jTextField3.getText());
            ps.setString(5, jTextField4.getText());
              ps.setDate(6, sd);
           int x =ps.executeUpdate();
            if (x>0) {
                JOptionPane.showMessageDialog(null, "successfully inserted");
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "database error");
        }
      
                                          

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   InventoryEdit u=new InventoryEdit();
      m.add(u);
       u.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
