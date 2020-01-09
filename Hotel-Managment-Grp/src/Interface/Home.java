/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Control.Home_Receipt_Control;
import Receipt.Receipt;
import Rooms.RoomMap;
import Tables.Tables;
import Receipt.SQLQuery;
import Reservation.Reservation;
import Tables.Tables;
import Validation.PersonID;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darkness
 */
public class Home extends javax.swing.JFrame {

   
    public Home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        sidemanubar = new javax.swing.JPanel();
        homebtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bookingbtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        resturentbtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        settingbtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        settingbtn1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        userrole = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlbooking = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlhome = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlemployee = new javax.swing.JPanel();
        pnlresturent = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbldayCount = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblCheckIn = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblCheckOut = new javax.swing.JLabel();
        lblrmTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPersonID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textCustomerID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textResID = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblRoom = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResjTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jlblRate = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblTableTotal = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblFinalbill = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pnlsetting = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidemanubar.setBackground(new java.awt.Color(15, 132, 161));

        homebtn.setBackground(new java.awt.Color(43, 126, 126));
        homebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home-7-48.png"))); // NOI18N
        jLabel2.setText("     Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        homebtn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 50));

        bookingbtn.setBackground(new java.awt.Color(43, 126, 126));
        bookingbtn.setPreferredSize(new java.awt.Dimension(270, 50));
        bookingbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cal48.png"))); // NOI18N
        jLabel3.setText("     Booking");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        bookingbtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 50));

        resturentbtn.setBackground(new java.awt.Color(43, 126, 126));
        resturentbtn.setPreferredSize(new java.awt.Dimension(270, 50));
        resturentbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/restrant.png"))); // NOI18N
        jLabel4.setText("      Receipt");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        resturentbtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 50));

        settingbtn.setBackground(new java.awt.Color(43, 126, 126));
        settingbtn.setPreferredSize(new java.awt.Dimension(270, 50));
        settingbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/settings-25-48.png"))); // NOI18N
        jLabel6.setText("     Setting");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        settingbtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 60));

        settingbtn1.setBackground(new java.awt.Color(43, 126, 126));
        settingbtn1.setPreferredSize(new java.awt.Dimension(270, 50));
        settingbtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/settings-25-48.png"))); // NOI18N
        jLabel10.setText("     Employee");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        settingbtn1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 60));

        javax.swing.GroupLayout sidemanubarLayout = new javax.swing.GroupLayout(sidemanubar);
        sidemanubar.setLayout(sidemanubarLayout);
        sidemanubarLayout.setHorizontalGroup(
            sidemanubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bookingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(resturentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(settingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(settingbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidemanubarLayout.setVerticalGroup(
            sidemanubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidemanubarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resturentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Banner.setBackground(new java.awt.Color(7, 7, 135));

        userrole.setBackground(new java.awt.Color(7, 7, 135));

        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_male_user_64px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Role");

        lbl_username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Username");

        javax.swing.GroupLayout userroleLayout = new javax.swing.GroupLayout(userrole);
        userrole.setLayout(userroleLayout);
        userroleLayout.setHorizontalGroup(
            userroleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userroleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbl_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userroleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userroleLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(userroleLayout.createSequentialGroup()
                        .addComponent(lbl_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        userroleLayout.setVerticalGroup(
            userroleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userroleLayout.createSequentialGroup()
                .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(userroleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_username)
                .addContainerGap())
        );

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Booking");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("home");

        pnlemployee.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout pnlemployeeLayout = new javax.swing.GroupLayout(pnlemployee);
        pnlemployee.setLayout(pnlemployeeLayout);
        pnlemployeeLayout.setHorizontalGroup(
            pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
        );
        pnlemployeeLayout.setVerticalGroup(
            pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlhomeLayout = new javax.swing.GroupLayout(pnlhome);
        pnlhome.setLayout(pnlhomeLayout);
        pnlhomeLayout.setHorizontalGroup(
            pnlhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlhomeLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlemployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(544, Short.MAX_VALUE))
        );
        pnlhomeLayout.setVerticalGroup(
            pnlhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlhomeLayout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addGroup(pnlhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlhomeLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(400, 400, 400))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlhomeLayout.createSequentialGroup()
                        .addComponent(pnlemployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );

        javax.swing.GroupLayout pnlbookingLayout = new javax.swing.GroupLayout(pnlbooking);
        pnlbooking.setLayout(pnlbookingLayout);
        pnlbookingLayout.setHorizontalGroup(
            pnlbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbookingLayout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1)
                .addContainerGap(548, Short.MAX_VALUE))
            .addComponent(pnlhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlbookingLayout.setVerticalGroup(
            pnlbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbookingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlresturent.setBackground(new java.awt.Color(0, 102, 102));
        pnlresturent.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlresturentComponentShown(evt);
            }
        });
        pnlresturent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("      Resturent");
        pnlresturent.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 24, -1, -1));

        jLabel15.setText("Stayed days");
        pnlresturent.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 70, 32));

        lbldayCount.setBackground(new java.awt.Color(0, 51, 51));
        lbldayCount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlresturent.add(lbldayCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 150, 32));

        jLabel17.setText("Room Bill");
        pnlresturent.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 77, 29));

        jLabel19.setText("Check In");
        pnlresturent.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 88, 23));

        lblCheckIn.setBackground(new java.awt.Color(0, 51, 51));
        lblCheckIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlresturent.add(lblCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 150, 30));

        jLabel21.setText("Check Out");
        pnlresturent.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        lblCheckOut.setBackground(new java.awt.Color(0, 51, 51));
        lblCheckOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlresturent.add(lblCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 150, 29));

        lblrmTotal.setBackground(new java.awt.Color(0, 51, 51));
        lblrmTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlresturent.add(lblrmTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 150, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Customer's  ID No");
        pnlresturent.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIDActionPerformed(evt);
            }
        });
        pnlresturent.add(txtPersonID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        jLabel12.setText("Customer ID");
        pnlresturent.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        textCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCustomerIDActionPerformed(evt);
            }
        });
        pnlresturent.add(textCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        jLabel13.setText("Reservation ID");
        pnlresturent.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        pnlresturent.add(textResID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, -1));

        btnGenerate.setText("Generate");
        btnGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerateMouseClicked(evt);
            }
        });
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        pnlresturent.add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        TblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Romm Type", "Standard Rates(per day)"
            }
        ));
        jScrollPane1.setViewportView(TblRoom);

        pnlresturent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 290, 220));

        ResjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TableNo", "ResID"
            }
        ));
        jScrollPane2.setViewportView(ResjTable);

        pnlresturent.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 290, 220));

        jLabel14.setText("Standard rate for the reserveration of 1 table");
        pnlresturent.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 240, 40));
        pnlresturent.add(jlblRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 90, 30));

        jLabel18.setText("Table Bill");
        pnlresturent.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 150, 30));
        pnlresturent.add(lblTableTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, 70, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Final Bill");
        pnlresturent.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 80));

        lblFinalbill.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnlresturent.add(lblFinalbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 250, 80));

        jButton1.setText("Print");
        pnlresturent.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        btnClear.setText("New Bill");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        pnlresturent.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        pnlsetting.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Setting");

        javax.swing.GroupLayout pnlsettingLayout = new javax.swing.GroupLayout(pnlsetting);
        pnlsetting.setLayout(pnlsettingLayout);
        pnlsettingLayout.setHorizontalGroup(
            pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsettingLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel9)
                .addContainerGap(684, Short.MAX_VALUE))
        );
        pnlsettingLayout.setVerticalGroup(
            pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsettingLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel9)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(pnlbooking, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlresturent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlsetting, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1796, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlbooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlresturent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlbooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlresturent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidemanubar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidemanubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        pnlhome.setVisible(true);
        pnlbooking.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       // homebtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        homebtn.setBackground(new Color(124,197,197));
         bookingbtn.setBackground(new Color(43,126,126));
        resturentbtn.setBackground(new Color(43,126,126));
        settingbtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
       // homebtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        pnlhome.setVisible(false);
        pnlbooking.setVisible(true);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        bookingbtn.setBackground(new Color(124,197,197));
        homebtn.setBackground(new Color(43,126,126));
        resturentbtn.setBackground(new Color(43,126,126));
        settingbtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        resturentbtn.setBackground(new Color(124,197,197));
        bookingbtn.setBackground(new Color(43,126,126));
        homebtn.setBackground(new Color(43,126,126));
        settingbtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
       settingbtn.setBackground(new Color(124,197,197));
       resturentbtn.setBackground(new Color(43,126,126));
        bookingbtn.setBackground(new Color(43,126,126));
        homebtn.setBackground(new Color(43,126,126));
        
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        pnlhome.setVisible(false);
        pnlbooking.setVisible(false);
        pnlresturent.setVisible(true);
        pnlsetting.setVisible(false);
       
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         pnlhome.setVisible(false);
        pnlbooking.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MousePressed

    private void pnlresturentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlresturentComponentShown
        
    }//GEN-LAST:event_pnlresturentComponentShown

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnGenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateMouseClicked
        String s;     //assign textboxvalue to the s string
        double sum= 0 ;   //variable that is needed for calculating room total
        double ssum=0;      //help to find room total
        double finalTotal=0;    //variable that used to calculate final bill
        String NofDays;      //variable to get no of days ccustomer stayed
        //validating the ID number methods are in the Validation package
    //creating all the objects that are wanted to set all the functions    
        PersonID valID = new PersonID(); //In Validating package PersonId class uses to create the object,
        SQLQuery retreiveC = new SQLQuery();//In Recept package SQLQuery class it has all the sql queries as methods which are used in the Receipt panel 
        Home_Receipt_Control control= new Home_Receipt_Control();//In Control package one class for the receipt panel it has all the general methods
       
        
         s=txtPersonID.getText();
        //validate the entering Identity Number of the customer
        if(!(valID.validate(s))){
            txtPersonID.setText("");
        }
        
        
      
       String CusID = retreiveC.Cstretrieve(s);//call Cstretrive method with ID Number to search Customer ID
       textCustomerID.setText(CusID);
       
       //Get the customer ID and call that value in to the other method
       String ResID= retreiveC.ResDataRet(CusID);
       textResID.setText(ResID);
       
       //Get No of Reservations for the selected customer
       int Records =retreiveC.RecordCount(CusID);
       
       
       //create object arraylist and insert all the created reservation objects to the list
        ArrayList<Reservation> CustmReservation=new ArrayList<>();
        CustmReservation =retreiveC.TableInser( CusID);
        
        //retrieve checkIn and Check_out dates from the arraylist
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
        lblCheckIn.setText(dateFormat.format(CustmReservation.get(0).getCheck_In()));
        lblCheckOut.setText(dateFormat.format(CustmReservation.get(0).getCheck_Out()));
        
       //count the difference between checkIn and Check_out date
        lbldayCount.setText(Long.toString(control.getDateDiff(CustmReservation.get(0).getCheck_In(), CustmReservation.get(0).getCheck_Out())));
        NofDays = lbldayCount.getText();
        
        ArrayList<RoomMap> jtableroom=new ArrayList<>();
        
        for(int i=0;i<CustmReservation.size();i++)
        {
            jtableroom=retreiveC.RoomInser(CustmReservation.get(i).getResID());
          /*set any method to disable or hide all room related data in the 
               panel it will create more good panel
            */
        }
 
        //create table model to insert data int to the table from created arraylist of objects
        DefaultTableModel modelRoom=(DefaultTableModel) TblRoom.getModel();
        //created a loop so every that item in the arraylist are inserted in to the table
        for (int loop=0;loop<jtableroom.size();loop++)
        {
            
            modelRoom.addRow(new Object[] {jtableroom.get(loop).getRoomID(),jtableroom.get(loop).getRoomType(),jtableroom.get(loop).getRates()});
        }
        //calculate the sum from the table
        int rawcount=TblRoom.getRowCount();
        
       //created a loop to loop every record of the table and add all room rates
       for(int ttloop=0;ttloop<rawcount;ttloop++)
       {
           try{
                ssum=(double) (TblRoom.getValueAt(ttloop, 2));
                sum=sum+ssum;       
                }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
       //from sum you can find all the cost of rooms for 1 day
       //then call function roomTotal in Home_Receipt_Control to find the amount customer fully owe to the reservation
       
       lblrmTotal.setText(Double.toString(control.roomTotal(Integer.parseInt(NofDays), sum)));
        
        //create another arraylist to store all the table reservation of a certain customer
        ArrayList<Tables> jtbltable = new ArrayList<Tables>();
        //create a loop to find if there is any table reservations in all of the resevation that customer did
        //if there is put data in to the table so we can reuse the arraylist
        for(int tblloop=0;tblloop<CustmReservation.size();tblloop++)
        {
            jtbltable=retreiveC.ResTableIns(CustmReservation.get(tblloop).getResID());
            
              DefaultTableModel modeltable=(DefaultTableModel) ResjTable.getModel();
        //created a loop so every that item in the arraylist are inserted in to the table
            for (int loop=0;loop<jtbltable.size();loop++)
            {
                modeltable.addRow(new Object[] {jtbltable.get(loop).getTableID(),jtbltable.get(loop).getResID()});
            }
        }
        
        jlblRate.setText(Double.toString(Tables.getRates()));
        int tblrecords = ResjTable.getRowCount();
        
        //get the total amount for the table reservations
        lblTableTotal.setText(Double.toString(control.tableTotal(tblrecords)));
        //get the final total of the all customer
         finalTotal =control.tableTotal(tblrecords)+(control.roomTotal(Integer.parseInt(NofDays), sum));
        lblFinalbill.setText(Double.toString(finalTotal));
        
    }//GEN-LAST:event_btnGenerateMouseClicked

    private void textCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCustomerIDActionPerformed

    private void txtPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDActionPerformed

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
       DefaultTableModel modeltable=(DefaultTableModel) ResjTable.getModel();
       modeltable.setRowCount(0);
       DefaultTableModel modelRoom=(DefaultTableModel) TblRoom.getModel();
       modelRoom.setRowCount(0);
       
       txtPersonID.setText("");
       textCustomerID.setText("");
       textResID.setText("");
       lblCheckIn.setText("");
       lblCheckOut.setText("");
       lbldayCount.setText("");
       lblTableTotal.setText("");
       lblrmTotal.setText("");
       lblFinalbill.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JTable ResjTable;
    private javax.swing.JTable TblRoom;
    private javax.swing.JPanel bookingbtn;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlblRate;
    private javax.swing.JLabel lblCheckIn;
    private javax.swing.JLabel lblCheckOut;
    private javax.swing.JLabel lblFinalbill;
    private javax.swing.JLabel lblTableTotal;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lbldayCount;
    private javax.swing.JLabel lblrmTotal;
    private javax.swing.JPanel pnlbooking;
    private javax.swing.JPanel pnlemployee;
    private javax.swing.JPanel pnlhome;
    private javax.swing.JPanel pnlresturent;
    private javax.swing.JPanel pnlsetting;
    private javax.swing.JPanel resturentbtn;
    private javax.swing.JPanel settingbtn;
    private javax.swing.JPanel settingbtn1;
    private javax.swing.JPanel sidemanubar;
    private javax.swing.JTextField textCustomerID;
    private javax.swing.JTextField textResID;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JPanel userrole;
    // End of variables declaration//GEN-END:variables
}
