
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.rmi.transport.Transport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PLAYBOLD!!
 */
public class cust_withdraw extends javax.swing.JFrame {
Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    
    /**
     * Creates new form cust_withdraw
     */
    public cust_withdraw() {
        super("Withdraw");
        initComponents();
        conn=jconnect.ConnecrDb();
        setResizable(false);
        date();
        time();
    }
    public void date(){
      String tdate=new SimpleDateFormat("dd/MM/YY",Locale.ENGLISH).format(new Date());
      date.setText("" +tdate);
  }
  public void time(){
      new Timer(0,new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              java.text.SimpleDateFormat ad=new java.text.SimpleDateFormat("HH:mm:ss");
              String ttime=ad.format(new Date());
              time.setText("" +ttime);
          }
      }).start();
              
          }
  public void trans1(){
       String sql="insert into Transactions(Date,Time,Debit,Balance,Acc_No) values (?,?,?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,jamount.getText());
                   pst.setString(4,jtotal.getText());
                   pst.setString(5,jacc.getText());
                   pst.execute();
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
    
  }
  public void custlogout2(){
       String sql="insert into custlog(Outdate,Outtime,Acc_No) values (?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,jacc.getText());
                 pst.execute();
 }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
            
                
            }
        }
      
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
        jamount = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jimg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jacc = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtnacc = new javax.swing.JButton();
        jbalance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtotal = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jname = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "WITHDRAW", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jamountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jamountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jamountKeyTyped(evt);
            }
        });

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(146, 162));

        jDesktopPane1.setLayer(jimg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("AVAILABLE BALANCE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NAME");

        jacc.setEditable(false);
        jacc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jaccKeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("WITHDRAW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EMAIL");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ACCOUNT NO");

        jtnacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eye-icon3.png"))); // NOI18N
        jtnacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnaccActionPerformed(evt);
            }
        });

        jbalance.setEditable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TOTAL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("WITHDRAWAL AMOUNT");

        jtotal.setEditable(false);

        jemail.setEditable(false);

        jname.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jamount, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jacc, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtnacc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jacc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jtnacc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jamount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        date.setEditable(false);
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        time.setEditable(false);
        time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/11.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.jpg"))); // NOI18N

        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home-icon(1).png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apps-session-logout-icon(2).png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(739, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
             setVisible(false);                                        
                customer_portal ob=new customer_portal();
            ob.setVisible(true);  
            customer_portal.lbl1.setText(jacc.getText());
            customer_portal.name1.setText(jname.getText());
    }//GEN-LAST:event_homeActionPerformed

    private void jtnaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnaccActionPerformed
        // TODO add your handling code here:
         String sql="select * from Balances2 where Acc_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,jacc.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Name");
                jname.setText(add1);
                String add2=rs.getString("Email");
                jemail.setText(add2);
                String add3=rs.getString("Balances");
                jbalance.setText(add3);
               
                ///image
                 byte[]imagedata=rs.getBytes("Image");
                format=new ImageIcon(imagedata);
                jimg.setIcon(format);
                
                rs.close();
                pst.close();
                
                
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Enter correct Account Number");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
    }//GEN-LAST:event_jtnaccActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
String a1=jbalance.getText();
String a2=jamount.getText();
int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jtotal.setText(sum1);

}catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(jamount.getText().isEmpty())
{
    JOptionPane.showMessageDialog(null, "Enter The Amount To Be Withdrawn");
}
else{
    

        try{
            String a3=jamount.getText();
            String email1=jemail.getText();
           String a1=jacc.getText(); 
           String a2=jtotal.getText();
           String sql="update Balances2 set Balances='"+a2+"' where Acc_No='"+a1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Withdrawn Sucessfuly!!!");
 ///mail
              Properties props=new Properties();
               props.put("mail.smtp.host","smtp.gmail.com");              
         props.put("mail.smtp.socketFactory.port","465");
        // props.put("mail.smtp.starttls.enable","true"); //
props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
           props.put("mail.smtp.auth","true");
            props.put("mail.smtp.port","465");
           //session code
           Session session=Session.getDefaultInstance(props,
                   new javax.mail.Authenticator() {
                 protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                     return new javax.mail.PasswordAuthentication("vermacommercialbank@gmail.com","Durgesh8788740554"); //big exception
        }                                          
         });
            try{
               Message message=new MimeMessage(session); 
               message.setFrom(new InternetAddress("rsvarma45370@gmail.com"));
               message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email1));
               message.setSubject("Amount Debited");
               message.setText("YOUR ACCOUNT XXXXX"+a1+" HAS BEEEN DEBITED FOR RUPEES "+a3+" FROM VERMA'S COMMERCIAL BANK CUSTOMER APPLICATION AND YOUR AVAILABLE BALANCE IS RUPEES  "+a2+"");
              javax.mail.Transport.send(message);
               JOptionPane.showMessageDialog(null, "Email Update Sent");
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null, e); 
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           
        }
        finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
        trans1();
              
                              
              jemail.setText("");
               jbalance.setText("");
              jamount.setText("");
               jtotal.setText("");
               //not working
               jimg.setIcon(null);
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jaccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jaccKeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jaccKeyTyped

    private void jamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jamountKeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jamountKeyTyped

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
         setVisible(false);                                        
                customerauth ob=new customerauth();
            ob.setVisible(true);  
            custlogout2();
           
    }//GEN-LAST:event_logoutActionPerformed

    private void jamountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jamountKeyReleased
 try{
String a1=jbalance.getText();
String a2=jamount.getText();
int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jtotal.setText(sum1);
}catch(Exception e){
JOptionPane.showMessageDialog(null, "PLEASE ENTER AMOUNT IN DIGITS");
}
    }//GEN-LAST:event_jamountKeyReleased

    private void jamountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jamountKeyPressed
if (evt.getKeyCode()==KeyEvent.VK_ENTER){
          try{
            String a3=jamount.getText();
            String email1=jemail.getText();
           String a1=jacc.getText(); 
           String a2=jtotal.getText();
           String sql="update Balances2 set Balances='"+a2+"' where Acc_No='"+a1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Withdrawn Sucessfuly!!!");
 ///mail
              Properties props=new Properties();
               props.put("mail.smtp.host","smtp.gmail.com");              
         props.put("mail.smtp.socketFactory.port","465");
        // props.put("mail.smtp.starttls.enable","true"); //
props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
           props.put("mail.smtp.auth","true");
            props.put("mail.smtp.port","465");
           //session code
           Session session=Session.getDefaultInstance(props,
                   new javax.mail.Authenticator() {
                 protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                     return new javax.mail.PasswordAuthentication("rsvarma45370@gmail.com","Durgesh(**)"); //big exception
        }                                          
         });
            try{
               Message message=new MimeMessage(session); 
               message.setFrom(new InternetAddress("rsvarma45370@gmail.com"));
               message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email1));
               message.setSubject("Amount Debited");
               message.setText("YOUR ACCOUNT XXXXX"+a1+" HAS BEEEN DEBITED FOR RUPEES "+a3+" FROM VERMA'S COMMERCIAL BANK CUSTOMER APPLICATION AND YOUR AVAILABLE BALANCE IS RUPEES  "+a2+"");
              javax.mail.Transport.send(message);
               JOptionPane.showMessageDialog(null, "Email Update Sent");
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null, e); 
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           
        }
        finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
        trans1();
              
               jname.setText("");                  
              jemail.setText("");
               jbalance.setText("");
              jamount.setText("");
               jtotal.setText("");   
         }
    }//GEN-LAST:event_jamountKeyPressed

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
            java.util.logging.Logger.getLogger(cust_withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cust_withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cust_withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cust_withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cust_withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jacc;
    private javax.swing.JTextField jamount;
    private javax.swing.JTextField jbalance;
    private javax.swing.JTextField jemail;
    private javax.swing.JLabel jimg;
    public static javax.swing.JTextField jname;
    private javax.swing.JButton jtnacc;
    private javax.swing.JTextField jtotal;
    private javax.swing.JButton logout;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
private ImageIcon format=null;

String filename=null;
int s=0;
byte[] person_image=null;
 
}