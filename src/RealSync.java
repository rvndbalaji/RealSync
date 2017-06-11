
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class RealSync extends javax.swing.JFrame 
{
    public static int tm =1;
  
     ActionListener copy = new ActionListener() 
    {

        @Override
        public void actionPerformed(ActionEvent evt) 
        { 
            
          
          synchronized(this)
          {     
            sync();
          };
          
        
        }

    };  
     
     
   
    
Timer tim = new Timer(tm*60*1000,copy);    //Min * 60 * Milliseconds

    
    
    
    
    public RealSync()
    {
        initComponents();
        gif.setVisible(false);
        jLabel3.setVisible(false); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        from = new javax.swing.JTextField();
        fromloc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        toloc = new javax.swing.JLabel();
        syncb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ct = new javax.swing.JLabel();
        btw = new javax.swing.JTextField();
        gif = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RealSync");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setBackground(new java.awt.Color(123, 161, 181));
        title1.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        title1.setForeground(java.awt.Color.white);
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1429795961_Copy-64.png"))); // NOI18N
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title1.setOpaque(true);
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, -1));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        from.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        from.setText("D:\\pics");
        from.setToolTipText("");
        from.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(96, 125, 139), new java.awt.Color(96, 125, 139)));
        jPanel1.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 390, 40));

        fromloc.setBackground(new java.awt.Color(67, 87, 114));
        fromloc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fromloc.setForeground(java.awt.Color.white);
        fromloc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fromloc.setText("Browse");
        fromloc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fromloc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fromloc.setOpaque(true);
        fromloc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fromlocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fromlocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fromlocMouseExited(evt);
            }
        });
        jPanel1.add(fromloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 123, 40));

        jLabel2.setBackground(new java.awt.Color(96, 125, 139));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sync this ");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 40));

        to.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        to.setText("D:\\New");
        to.setToolTipText("");
        to.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(96, 125, 139), new java.awt.Color(96, 125, 139)));
        jPanel1.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 390, 40));

        toloc.setBackground(new java.awt.Color(67, 87, 114));
        toloc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        toloc.setForeground(java.awt.Color.white);
        toloc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toloc.setText("Browse");
        toloc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toloc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toloc.setOpaque(true);
        toloc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tolocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tolocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tolocMouseExited(evt);
            }
        });
        jPanel1.add(toloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 123, 40));

        syncb.setBackground(new java.awt.Color(67, 87, 114));
        syncb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        syncb.setForeground(java.awt.Color.white);
        syncb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        syncb.setText("Synchronize");
        syncb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        syncb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        syncb.setOpaque(true);
        syncb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                syncbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                syncbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                syncbMouseExited(evt);
            }
        });
        jPanel1.add(syncb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 240, 40));

        jLabel1.setBackground(new java.awt.Color(67, 87, 114));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sync & update folders from different locations in realtime");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 87, 114)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        jLabel6.setBackground(new java.awt.Color(96, 125, 139));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("mins");
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 50, 40));

        jLabel4.setBackground(new java.awt.Color(96, 125, 139));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sync to");
        jLabel4.setToolTipText("");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 40));

        jLabel5.setBackground(new java.awt.Color(96, 125, 139));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sync every");
        jLabel5.setToolTipText("");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 40));

        ct.setBackground(java.awt.Color.white);
        ct.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ct.setText(" Sync count : 0");
        ct.setToolTipText("");
        ct.setOpaque(true);
        jPanel1.add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 140, 40));

        btw.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        btw.setText("1");
        btw.setToolTipText("");
        btw.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(96, 125, 139), new java.awt.Color(96, 125, 139)));
        btw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btwActionPerformed(evt);
            }
        });
        jPanel1.add(btw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 70, 40));

        gif.setBackground(java.awt.Color.white);
        gif.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gif.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/load20.gif"))); // NOI18N
        gif.setToolTipText("");
        gif.setOpaque(true);
        jPanel1.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 162, 230, 40));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("   Syncing :");
        jLabel3.setToolTipText("");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 160, 390, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 650, 270));

        title.setBackground(new java.awt.Color(67, 87, 114));
        title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        title.setText("Aravind Balaji   ");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title.setOpaque(true);
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 650, 30));

        title2.setBackground(new java.awt.Color(123, 161, 181));
        title2.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        title2.setForeground(new java.awt.Color(67, 87, 114));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("     RealSync");
        title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title2.setOpaque(true);
        getContentPane().add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 65));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String fol;
    private void fromlocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromlocMouseClicked
    try
      {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("Desktop"));
        chooser.setDialogTitle("Select folder to be synced");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.showOpenDialog(this);
     
        from.setText(chooser.getSelectedFile().getPath());
      }catch(Exception ex){}
     
    }//GEN-LAST:event_fromlocMouseClicked

    private void fromlocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromlocMouseEntered

        fromloc.setBackground(new java.awt.Color(82,107,140));
    }//GEN-LAST:event_fromlocMouseEntered

    private void fromlocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromlocMouseExited
        fromloc.setBackground(new java.awt.Color(67,87,114));
    }//GEN-LAST:event_fromlocMouseExited

    private void tolocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tolocMouseClicked
       
   try{     
        JFileChooser chooser = new JFileChooser();
chooser.setCurrentDirectory(new java.io.File("Desktop"));
chooser.setDialogTitle("Select folder to be synced");
chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
chooser.setAcceptAllFileFilterUsed(false);
chooser.showOpenDialog(this);
to.setText(chooser.getSelectedFile().getPath());

   }catch(Exception ex){}
    }//GEN-LAST:event_tolocMouseClicked

    private void tolocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tolocMouseEntered
        toloc.setBackground(new java.awt.Color(82,107,140));
    }//GEN-LAST:event_tolocMouseEntered

    private void tolocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tolocMouseExited
        toloc.setBackground(new java.awt.Color(67,87,114));
    }//GEN-LAST:event_tolocMouseExited

    private void syncbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncbMouseClicked

        if( syncb.getText().equals("Synchronize"))
 {       
        synchronized(this)
     {
         
            from.setEnabled(false);
            fromloc.setEnabled(false);
            to.setEnabled(false);
            toloc.setEnabled(false);  
         
       syncb.setText("Stop synchronizing");
       gif.setVisible(true);
       jLabel3.setVisible(true);
       
        tm = Integer.parseInt(btw.getText());
        File f = new File(from.getText());
        fol = f.getName();
     
        sync();
        tim.restart();
     };
        
      
 }
   
        
        else
        {
            stopsync();
        }
        
        
    }//GEN-LAST:event_syncbMouseClicked
public void stopsync()
{
            syncb.setText("Synchronize");
            tim.stop();
            gif.setVisible(false);
            jLabel3.setVisible(false); 
            unicount=0;
            ct.setText(" Sync count : "+unicount);
            
            from.setEnabled(true);
            fromloc.setEnabled(true);
            to.setEnabled(true);
            toloc.setEnabled(true);
}
    private void syncbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncbMouseEntered
        syncb.setBackground(new java.awt.Color(82,107,140));
    }//GEN-LAST:event_syncbMouseEntered

    private void syncbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncbMouseExited
        
       syncb.setBackground(new java.awt.Color(67,87,114));
    }//GEN-LAST:event_syncbMouseExited

    private void btwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btwActionPerformed

    FolderCopy Fc = new FolderCopy(); 
    public float pbarn=0; 
    int unicount =0;
    
    public synchronized void sync()
    {
        
      
           int suc = Fc.BeginCopy(from.getText(),to.getText()+"\\"+fol); 
           
         if(suc==1)
         {
         
          unicount += 1;
          ct.setText(" Sync count : "+unicount);          
         }
         
         else
         {
           stopsync();  
         }   
        
         
        
         
        
    }
   
   
    public static void main(String args[]) 
    {
       
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
            java.util.logging.Logger.getLogger(RealSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealSync.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new RealSync().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btw;
    public javax.swing.JLabel ct;
    private javax.swing.JTextField from;
    private javax.swing.JLabel fromloc;
    public javax.swing.JLabel gif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel syncb;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JTextField to;
    private javax.swing.JLabel toloc;
    // End of variables declaration//GEN-END:variables
}
