/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Control.Home_Receipt_Control;
import ManagerEditables.SQLQryM;
import Receipt.Receipt;
import Rooms.RoomMap;
import Tables.Tables;
import Receipt.SQLQuery;
import Reservation.Reservation;
import Rooms.RoomType;
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
        Receiptbtn = new javax.swing.JPanel();
        receiptlbl = new javax.swing.JLabel();
        settingbtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        settingbtn1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        resturantMn = new javax.swing.JPanel();
        restMnger = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        userrole = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlmanager = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRMMap = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        txtRoomType = new javax.swing.JTextField();
        txtRates = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtTableRates = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnroomType = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        pnlbooking = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlhome = new javax.swing.JPanel();
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
        btninsrtDB = new javax.swing.JButton();
        pnlsetting = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlRoomType = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRoomType = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtpnlRMtype = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtRoomDetails = new javax.swing.JTextArea();
        btnTypeUpdat = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

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

        Receiptbtn.setBackground(new java.awt.Color(43, 126, 126));
        Receiptbtn.setPreferredSize(new java.awt.Dimension(270, 50));
        Receiptbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receiptlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        receiptlbl.setForeground(new java.awt.Color(255, 255, 255));
        receiptlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/restrant.png"))); // NOI18N
        receiptlbl.setText("      Receipt");
        receiptlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receiptlblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                receiptlblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                receiptlblMousePressed(evt);
            }
        });
        Receiptbtn.add(receiptlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 50));

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

        resturantMn.setBackground(new java.awt.Color(43, 126, 126));
        resturantMn.setPreferredSize(new java.awt.Dimension(270, 50));
        resturantMn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        restMnger.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        restMnger.setForeground(new java.awt.Color(255, 255, 255));
        restMnger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/settings-25-48.png"))); // NOI18N
        restMnger.setText("Resturant");
        restMnger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restMngerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restMngerMousePressed(evt);
            }
        });
        resturantMn.add(restMnger, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 60));

        javax.swing.GroupLayout sidemanubarLayout = new javax.swing.GroupLayout(sidemanubar);
        sidemanubar.setLayout(sidemanubarLayout);
        sidemanubarLayout.setHorizontalGroup(
            sidemanubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bookingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Receiptbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(settingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(settingbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(resturantMn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidemanubarLayout.setVerticalGroup(
            sidemanubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidemanubarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Receiptbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resturantMn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        pnlmanager.setBackground(new java.awt.Color(29, 138, 171));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Room Details");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblRMMap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RoomNo", "RoomType", "Rates"
            }
        ));
        tblRMMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRMMapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblRMMap);

        jLabel7.setText("RoomNo");

        jLabel20.setText("RoomType");

        jLabel23.setText("Rates");

        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        jButton3.setText("Clear");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Table Details");

        jLabel25.setText("Reservation Fee");

        jButton4.setText("Update");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton2.setText("New");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        btnroomType.setText("+ New Type");
        btnroomType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnroomTypeMouseClicked(evt);
            }
        });

        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlmanagerLayout = new javax.swing.GroupLayout(pnlmanager);
        pnlmanager.setLayout(pnlmanagerLayout);
        pnlmanagerLayout.setHorizontalGroup(
            pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmanagerLayout.createSequentialGroup()
                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlmanagerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlmanagerLayout.createSequentialGroup()
                                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmanagerLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(51, 51, 51)
                                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtRoomNo)
                                            .addComponent(txtRoomType)
                                            .addComponent(txtRates, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                                    .addGroup(pnlmanagerLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnroomType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                                .addComponent(btnUpdate)
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2)))))))
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(pnlmanagerLayout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTableRates, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(626, Short.MAX_VALUE))
        );
        pnlmanagerLayout.setVerticalGroup(
            pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmanagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlmanagerLayout.createSequentialGroup()
                            .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlmanagerLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(41, 41, 41)
                                    .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(txtRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addComponent(btnroomType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRates, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnlmanagerLayout.createSequentialGroup()
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(44, 44, 44)
                            .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdate)
                                .addComponent(jButton3)
                                .addComponent(jButton2)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlmanagerLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTableRates, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Booking");

        javax.swing.GroupLayout pnlhomeLayout = new javax.swing.GroupLayout(pnlhome);
        pnlhome.setLayout(pnlhomeLayout);
        pnlhomeLayout.setHorizontalGroup(
            pnlhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1796, Short.MAX_VALUE)
        );
        pnlhomeLayout.setVerticalGroup(
            pnlhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
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

        btninsrtDB.setText("Insert in to DB");
        btninsrtDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninsrtDBMouseClicked(evt);
            }
        });
        pnlresturent.add(btninsrtDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 130, -1));

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

        pnlRoomType.setBackground(new java.awt.Color(0, 102, 102));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Room Types");

        tblRoomType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RoomType", "Details"
            }
        ));
        tblRoomType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomTypeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblRoomType);

        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel26.setText("RoomType");

        jLabel28.setText("Details");

        txtRoomDetails.setColumns(20);
        txtRoomDetails.setRows(5);
        jScrollPane5.setViewportView(txtRoomDetails);

        btnTypeUpdat.setText("Update");
        btnTypeUpdat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTypeUpdatMouseClicked(evt);
            }
        });

        jButton7.setText("Clear All");

        jButton8.setText("New Type");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRoomTypeLayout = new javax.swing.GroupLayout(pnlRoomType);
        pnlRoomType.setLayout(pnlRoomTypeLayout);
        pnlRoomTypeLayout.setHorizontalGroup(
            pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel27))
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpnlRMtype, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(btnTypeUpdat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(888, Short.MAX_VALUE))
        );
        pnlRoomTypeLayout.setVerticalGroup(
            pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpnlRMtype, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5))))
                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTypeUpdat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRoomTypeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(421, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(pnlmanager, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlbooking, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlresturent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlsetting, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlRoomType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1805, Short.MAX_VALUE)
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
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlmanager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlRoomType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
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
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlmanager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlRoomType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
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
         pnlRoomType.setVisible(false);
         pnlmanager.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       // homebtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        homebtn.setBackground(new Color(124,197,197));
         bookingbtn.setBackground(new Color(43,126,126));
        Receiptbtn.setBackground(new Color(43,126,126));
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
         pnlRoomType.setVisible(false);
         pnlmanager.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        bookingbtn.setBackground(new Color(124,197,197));
        homebtn.setBackground(new Color(43,126,126));
        Receiptbtn.setBackground(new Color(43,126,126));
        settingbtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        
    }//GEN-LAST:event_jLabel3MouseEntered

    private void receiptlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiptlblMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_receiptlblMouseExited

    private void receiptlblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiptlblMousePressed
        Receiptbtn.setBackground(new Color(124,197,197));
        bookingbtn.setBackground(new Color(43,126,126));
        homebtn.setBackground(new Color(43,126,126));
        settingbtn.setBackground(new Color(43,126,126));
    }//GEN-LAST:event_receiptlblMousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
       settingbtn.setBackground(new Color(124,197,197));
       Receiptbtn.setBackground(new Color(43,126,126));
        bookingbtn.setBackground(new Color(43,126,126));
        homebtn.setBackground(new Color(43,126,126));
        
    }//GEN-LAST:event_jLabel6MousePressed

    private void receiptlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiptlblMouseClicked
        pnlhome.setVisible(false);
        pnlbooking.setVisible(false);
        pnlresturent.setVisible(true);
        pnlsetting.setVisible(false);
        pnlmanager.setVisible(false);
         pnlRoomType.setVisible(false);
       
    }//GEN-LAST:event_receiptlblMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         pnlhome.setVisible(false);
        pnlbooking.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(true);
        pnlRoomType.setVisible(false);
        pnlmanager.setVisible(false);
        
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
        //what if there are more than 1 reservation??
        //solved by using only one ResID for one customer
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
        //this 2 for loops are not needed if there is only one reservation for one customer
        
        jlblRate.setText(Double.toString(Tables.getRates()));
        int tblrecords = ResjTable.getRowCount();
        
        //get the total amount for the table reservations
        lblTableTotal.setText(Double.toString(control.tableTotal(tblrecords)));
        //get the final total of the all customer
         finalTotal =control.tableTotal(tblrecords)+(control.roomTotal(Integer.parseInt(NofDays), sum));
        lblFinalbill.setText(Double.toString(finalTotal));
        
        //this needs to be in another method
       // retreiveC.inserttoReceipt(CustmReservation.get(0).getResID(),Integer.parseInt(NofDays), sum);
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

    private void restMngerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restMngerMouseClicked
        pnlbooking.setVisible(false);
        pnlhome.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
        pnlmanager.setVisible(true);
        pnlRoomType.setVisible(false);
        
        
        Tables tbl1= new Tables();
        
        txtTableRates.setText(String.valueOf(Tables.getRates()) );
      
           
            
            
        
    }//GEN-LAST:event_restMngerMouseClicked

    private void restMngerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restMngerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_restMngerMousePressed

    private void btninsrtDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsrtDBMouseClicked
       String ResID= textResID.getText();
       int days = Integer.parseInt(lbldayCount.getText());
       double total=Double.parseDouble(lblFinalbill.getText());
       
       SQLQuery insertReceipt = new SQLQuery();
       
       if(insertReceipt.inserttoReceipt(ResID,days, total)==1){
           JOptionPane.showMessageDialog(null, "Receipt data are inserted into the company");
       }
    }//GEN-LAST:event_btninsrtDBMouseClicked

    private void tblRMMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRMMapMouseClicked
        //create tablemodel object
        DefaultTableModel tbltotxt = (DefaultTableModel) tblRMMap.getModel();
        
        //add selected raw values to the text fields
            txtRoomNo.setText((tbltotxt.getValueAt(tblRMMap.getSelectedRow(),0)).toString());
            txtRoomType.setText((tbltotxt.getValueAt(tblRMMap.getSelectedRow(),1)).toString());
            txtRates.setText((tbltotxt.getValueAt(tblRMMap.getSelectedRow(),2)).toString());
            
    }//GEN-LAST:event_tblRMMapMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        //create the update call and update the database
        
        //create the SQLQry object
        SQLQryM updt = new SQLQryM();
        
        String RoomNo = txtRoomNo.getText();
        String RoomType = txtRoomType.getText();
        Double rate = Double.parseDouble(txtRates.getText());
        
         int i=updt.UpdateDB(RoomNo, RoomType, rate);
        if(i==1){
            JOptionPane.showMessageDialog(null, "Update Succesful");
        }
        
        
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        
          //create a arraylist to retreive all the table details
        ArrayList<RoomMap> AllRmDetails = new ArrayList<RoomMap>();
        
        //create tablemodel
             DefaultTableModel modelRMMd = (DefaultTableModel) tblRMMap.getModel();
             
        //Create sqlquery class object to access the methods
        SQLQryM   MngPnl = new SQLQryM();
        //get data to the created object arraylist
        AllRmDetails= SQLQryM.InsertRoomTb();
        
        //access all the objects and put data into the table
            //using 2 for loops
            
            //clear the option that repeat the filling of the table clean the table before filling the table
            modelRMMd.setRowCount(0);
             
            for(int i=0;i<AllRmDetails.size();i++){
                
              
               modelRMMd.addRow(new Object[] {AllRmDetails.get(i).getRoomID(),AllRmDetails.get(i).getRoomType(),AllRmDetails.get(i).getRates()});
            }
            
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnroomTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnroomTypeMouseClicked
        // TODO add your handling code here:
         pnlbooking.setVisible(false);
        pnlhome.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
        pnlmanager.setVisible(false);
        pnlRoomType.setVisible(true);
    }//GEN-LAST:event_btnroomTypeMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
          //create a arraylist to retreive all the table details
        ArrayList<RoomType> AllRmType = new ArrayList<RoomType>();
        
        //create tablemodel
             DefaultTableModel modelRMMd = (DefaultTableModel) tblRoomType.getModel();
             
        //Create sqlquery class object to access the methods
        SQLQryM   MngPnl = new SQLQryM();
        //get data to the created object arraylist
        AllRmType= SQLQryM.RoomTypeTb();
        
        //access all the objects and put data into the table
            //using 2 for loops
            
            //clear the option that repeat the filling of the table clean the table before filling the table
            modelRMMd.setRowCount(0);
             
            for(int i=0;i<AllRmType.size();i++){
                
              
               modelRMMd.addRow(new Object[] {AllRmType.get(i).getRoomType(),AllRmType.get(i).getDetails()});
            }

    }//GEN-LAST:event_jButton5MouseClicked

    private void tblRoomTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomTypeMouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel tbltotxt = (DefaultTableModel) tblRoomType.getModel();
        
        //add selected raw values to the text fields
            txtpnlRMtype.setText((tbltotxt.getValueAt(tblRoomType.getSelectedRow(),0)).toString());
            txtRoomDetails.setText((tbltotxt.getValueAt(tblRoomType.getSelectedRow(),1)).toString());
    }//GEN-LAST:event_tblRoomTypeMouseClicked

    private void btnTypeUpdatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypeUpdatMouseClicked
        // TODO add your handling code here:
         SQLQryM updt = new SQLQryM();
        
        String RoomDetais = txtRoomDetails.getText();
        String RoomType = txtpnlRMtype.getText();
        
        
         int i=updt.UpdateType(RoomType, RoomDetais);
        if(i==1){
            JOptionPane.showMessageDialog(null, "Update Succesful");
        }
        
    }//GEN-LAST:event_btnTypeUpdatMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        SQLQryM insrt = new SQLQryM();
        
        int n=insrt.InsrtRMType(txtpnlRMtype.getText(), txtRoomDetails.getText());
        if(n==1){
            JOptionPane.showMessageDialog(null, "New Record was succesfully recorded");
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        SQLQryM insrt = new SQLQryM();
        
        String RoomNo = txtRoomNo.getText();
        String RoomType = txtRoomType.getText();
        Double rate = Double.parseDouble(txtRates.getText());
        
         int i=insrt.InsrtRMMP(RoomNo, RoomType, rate);
        if(i==1){
            JOptionPane.showMessageDialog(null, "New record was Succesfully created");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Double d = Double.parseDouble(txtTableRates.getText());
        Tables.setRates(d);
        JOptionPane.showMessageDialog(null, "Updated Succesfully");
    }//GEN-LAST:event_jButton4MouseClicked

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
    private javax.swing.JPanel Receiptbtn;
    private javax.swing.JTable ResjTable;
    private javax.swing.JTable TblRoom;
    private javax.swing.JPanel bookingbtn;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTypeUpdat;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btninsrtDB;
    private javax.swing.JButton btnroomType;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblRate;
    private javax.swing.JLabel lblCheckIn;
    private javax.swing.JLabel lblCheckOut;
    private javax.swing.JLabel lblFinalbill;
    private javax.swing.JLabel lblTableTotal;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lbldayCount;
    private javax.swing.JLabel lblrmTotal;
    private javax.swing.JPanel pnlRoomType;
    private javax.swing.JPanel pnlbooking;
    private javax.swing.JPanel pnlhome;
    private javax.swing.JPanel pnlmanager;
    private javax.swing.JPanel pnlresturent;
    private javax.swing.JPanel pnlsetting;
    private javax.swing.JPanel pnlsetting1;
    private javax.swing.JLabel receiptlbl;
    private javax.swing.JLabel restMnger;
    private javax.swing.JPanel resturantMn;
    private javax.swing.JPanel settingbtn;
    private javax.swing.JPanel settingbtn1;
    private javax.swing.JPanel sidemanubar;
    private javax.swing.JTable tblRMMap;
    private javax.swing.JTable tblRoomType;
    private javax.swing.JTextField textCustomerID;
    private javax.swing.JTextField textResID;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtRates;
    private javax.swing.JTextArea txtRoomDetails;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtRoomType;
    private javax.swing.JTextField txtTableRates;
    private javax.swing.JTextField txtpnlRMtype;
    private javax.swing.JPanel userrole;
    // End of variables declaration//GEN-END:variables
}
