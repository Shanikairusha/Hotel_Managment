/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Control.Home_Receipt_Control;
import Controllers.DeleteData;
import Controllers.RetriveCustomerData;
import Controllers.RetriveTable;
import Database.Query_Person;
import Encryption.Enc_Dec;
import FILE.write_read;
import ManagerEditables.SQLQryM;
import Model.Table;

import Person.Person;
import Person.User;
import Receipt.Receipt;
import Rooms.RoomMap;
import Tables.Tables;
import Receipt.SQLQuery;
import Report.SQLReport;
import Reservation.Reservation;
import Rooms.RoomType;
import Tables.Tables;
import Validation.PersonID;
import Validation.User_Validation;
import Validation.roomId;
import java.awt.Color;
import java.io.IOException;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.crypto.*;
import javax.swing.JFrame;
import static sun.net.www.MimeTable.loadTable;

/**
 *
 * @author Darkness
 */
public class Home extends javax.swing.JFrame {

   
    public Home() {
        initComponents();
        
       
        Query_Person qp = new Query_Person();
        qp.ID();
        txt_euserId.setText("USER-"+qp.getAutoGenUserId());
   
        loadTable();
   
    }
    
    public void RetriveTable(){
        
          ArrayList<Table> newarray = new ArrayList<>();
            
            DefaultTableModel inter_table = (DefaultTableModel) jTable1.getModel();
            
            RetriveTable retable = new RetriveTable();
           newarray = retable.ResTableIns();
           
          inter_table.setRowCount(0);
           
           for(int i =0; i<newarray.size();i++){
               inter_table.addRow(new Object[] {newarray.get(i).getResId(),newarray.get(i).getCustomerId(),newarray.get(i).getDate(),newarray.get(i).getCheck_in(),newarray.get(i).getCheck_out(),newarray.get(i).getUserId(),newarray.get(i).getAdult(),newarray.get(i).getChildren()});
           }
    }
    
    public void setUserInfo( String UserId, String username, String role){
    
        lbl_userid.setText(UserId);
        lbl_username.setText(username);
        lbl_userRole.setText(role);
    }

    private void loadTable(){
      
        ((DefaultTableModel)tbl_user.getModel()).setNumRows(0);
        ArrayList<User> usr = new ArrayList<User>();
        
          Query_Person sd = new Query_Person();
        DefaultTableModel mdl = (DefaultTableModel) tbl_user.getModel();
       
        usr=sd.getuserDetails();
        
        for(int i=0;i<usr.size();i++){
            mdl.addRow(new Object[] {usr.get(i).getName(),usr.get(i).getIdNo(),usr.get(i).getAddress(),usr.get(i).getPhnNm(),usr.get(i).getEmail(),usr.get(i).getUserId(),usr.get(i).getRole() });
        }
        
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
        Employeebtn1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        resturantMn = new javax.swing.JPanel();
        restMnger = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        userrole = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        lbl_userid = new javax.swing.JLabel();
        lbl_userRole = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlhome = new javax.swing.JPanel();
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
        jButton6 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
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
        lblctmrID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlsetting = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblIncome = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        date2 = new com.toedter.calendar.JDateChooser();
        jSeparator11 = new javax.swing.JSeparator();
        lblLimitedTotal = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblTotalRoom = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lblReservedRoom = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblRoomReport = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
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
        jButton9 = new javax.swing.JButton();
        pnlemployee = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_epass = new javax.swing.JPasswordField();
        cmb_erole = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txt_ename = new javax.swing.JTextField();
        txt_ephoneno = new javax.swing.JTextField();
        txt_eidno = new javax.swing.JTextField();
        txt_eemail = new javax.swing.JTextField();
        txt_eaddress = new javax.swing.JTextField();
        btn_close = new javax.swing.JButton();
        btn_InsertEmp = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        btn_MainInsert = new javax.swing.JButton();
        lbl_ChangePass = new javax.swing.JLabel();
        btn_MainUpdate = new javax.swing.JButton();
        btn_MainDelete = new javax.swing.JButton();
        btn_UpdateEmp = new javax.swing.JButton();
        btn_DeleteEmp = new javax.swing.JButton();
        txt_euserId = new javax.swing.JTextField();
        btn_Refresh = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        pnlbooking = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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

        Employeebtn1.setBackground(new java.awt.Color(43, 126, 126));
        Employeebtn1.setPreferredSize(new java.awt.Dimension(270, 50));
        Employeebtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Employeebtn1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 230, 60));

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
            .addComponent(Employeebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(Employeebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resturantMn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Banner.setBackground(new java.awt.Color(7, 7, 135));

        userrole.setBackground(new java.awt.Color(7, 7, 135));

        javax.swing.GroupLayout userroleLayout = new javax.swing.GroupLayout(userrole);
        userrole.setLayout(userroleLayout);
        userroleLayout.setHorizontalGroup(
            userroleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        userroleLayout.setVerticalGroup(
            userroleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        lbl_username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Username");

        lbl_userid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_userid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_userid.setText("Username");

        lbl_userRole.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_userRole.setForeground(new java.awt.Color(255, 255, 255));
        lbl_userRole.setText("User Role");

        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_male_user_64px.png"))); // NOI18N

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(1189, 1189, 1189)
                .addComponent(lbl_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(lbl_userRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addComponent(lbl_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_userid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(465, 465, 465)
                .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                            .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))
                        .addGroup(BannerLayout.createSequentialGroup()
                            .addComponent(lbl_userRole)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_username)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbl_userid)))
                    .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlhomeLayout = new javax.swing.GroupLayout(pnlhome);
        pnlhome.setLayout(pnlhomeLayout);
        pnlhomeLayout.setHorizontalGroup(
            pnlhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1169, Short.MAX_VALUE)
        );
        pnlhomeLayout.setVerticalGroup(
            pnlhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        pnlmanager.setBackground(new java.awt.Color(29, 138, 171));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Room Details");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblRMMap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RoomNo", "RoomType", "Rates", "Availability"
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
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

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

        jButton6.setText("jButton6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
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
                                        .addGap(40, 40, 40)
                                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnroomType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                                .addComponent(btnUpdate)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2))))
                                    .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlmanagerLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton3))
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
                                                .addComponent(txtRates, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))))
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
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jButton6)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlmanagerLayout.setVerticalGroup(
            pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmanagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmanagerLayout.createSequentialGroup()
                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
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
                            .addComponent(jButton2)
                            .addComponent(btnDelete)))
                    .addGroup(pnlmanagerLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlmanagerLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlmanagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTableRates, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(jButton4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
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
        pnlresturent.add(jlblRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 90, 30));

        jLabel18.setText("Table Bill");
        pnlresturent.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 150, 30));
        pnlresturent.add(lblTableTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 400, 100, 30));

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

        lblctmrID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlresturent.add(lblctmrID, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 280, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID No");
        pnlresturent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 110, 40));

        pnlsetting.setBackground(new java.awt.Color(0, 102, 102));

        tblIncome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No", "Res ID", "Date", "Total"
            }
        ));
        jScrollPane6.setViewportView(tblIncome);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Report");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Income");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel30.setText("Total Income");

        jLabel32.setText("Income From ");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("to");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("Rooms");

        jLabel36.setText("Total No of Rooms");

        jLabel46.setText("Reserved Rooms");

        tblRoomReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Room Type", "Rate", "Availability"
            }
        ));
        jScrollPane7.setViewportView(tblRoomReport);

        jLabel48.setText("List of Rooms");

        jButton10.setText("calculate");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlsettingLayout = new javax.swing.GroupLayout(pnlsetting);
        pnlsetting.setLayout(pnlsettingLayout);
        pnlsettingLayout.setHorizontalGroup(
            pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsettingLayout.createSequentialGroup()
                .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlsettingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlsettingLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsettingLayout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(133, 133, 133)
                                .addComponent(lblLimitedTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)))))
                .addGap(48, 48, 48)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlsettingLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(lblTotalRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lblReservedRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlsettingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(pnlsettingLayout.createSequentialGroup()
                        .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(15, Short.MAX_VALUE))))
            .addGroup(pnlsettingLayout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlsettingLayout.setVerticalGroup(
            pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsettingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlsettingLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlsettingLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lblLimitedTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165))
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlsettingLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblReservedRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlsettingLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(43, 43, 43)
                                .addGroup(pnlsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTotalRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))))
                        .addGap(48, 48, 48)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(pnlsettingLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator3))
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

        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRoomTypeLayout = new javax.swing.GroupLayout(pnlRoomType);
        pnlRoomType.setLayout(pnlRoomTypeLayout);
        pnlRoomTypeLayout.setHorizontalGroup(
            pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel27))
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(btnTypeUpdat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpnlRMtype, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        pnlRoomTypeLayout.setVerticalGroup(
            pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoomTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
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
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pnlemployee.setBackground(new java.awt.Color(23, 31, 44));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("USER ID");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("NAME");

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("ID NO");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("ADDRESS");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("PHONE NO");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PASSWORD");

        txt_epass.setBackground(new java.awt.Color(23, 31, 44));
        txt_epass.setForeground(new java.awt.Color(255, 255, 255));
        txt_epass.setToolTipText("Password");
        txt_epass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_epass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_epassActionPerformed(evt);
            }
        });

        cmb_erole.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        cmb_erole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Reception", " " }));
        cmb_erole.setToolTipText("Role");
        cmb_erole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_eroleActionPerformed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("ROLE");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("E-MAIL");

        txt_ename.setBackground(new java.awt.Color(23, 31, 44));
        txt_ename.setForeground(new java.awt.Color(255, 255, 255));
        txt_ename.setToolTipText("Name");
        txt_ename.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_enameActionPerformed(evt);
            }
        });

        txt_ephoneno.setBackground(new java.awt.Color(23, 31, 44));
        txt_ephoneno.setForeground(new java.awt.Color(255, 255, 255));
        txt_ephoneno.setToolTipText("Telephone Number");
        txt_ephoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_ephoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ephonenoKeyTyped(evt);
            }
        });

        txt_eidno.setBackground(new java.awt.Color(23, 31, 44));
        txt_eidno.setForeground(new java.awt.Color(255, 255, 255));
        txt_eidno.setToolTipText("Identity Card Number");
        txt_eidno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txt_eemail.setBackground(new java.awt.Color(23, 31, 44));
        txt_eemail.setForeground(new java.awt.Color(255, 255, 255));
        txt_eemail.setToolTipText("E-mail");
        txt_eemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_eemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eemailActionPerformed(evt);
            }
        });

        txt_eaddress.setBackground(new java.awt.Color(23, 31, 44));
        txt_eaddress.setForeground(new java.awt.Color(255, 255, 255));
        txt_eaddress.setToolTipText("Address");
        txt_eaddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btn_close.setBackground(new java.awt.Color(88, 200, 197));
        btn_close.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_close.setText("Close");
        btn_close.setToolTipText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_InsertEmp.setBackground(new java.awt.Color(88, 200, 197));
        btn_InsertEmp.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_InsertEmp.setText("Add");
        btn_InsertEmp.setToolTipText("Add Employee Details");
        btn_InsertEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertEmpActionPerformed(evt);
            }
        });

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID No", "Address", "Phone Number", "E-Mail", "UserID", "Role"
            }
        ));
        tbl_user.setToolTipText("Empolyee Details");
        tbl_user.setEnabled(false);
        tbl_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_userMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_user);

        btn_MainInsert.setBackground(new java.awt.Color(21, 169, 169));
        btn_MainInsert.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_MainInsert.setText("Insert Employee");
        btn_MainInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainInsertActionPerformed(evt);
            }
        });

        lbl_ChangePass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ChangePass.setText("Change Password");
        lbl_ChangePass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_ChangePassMouseMoved(evt);
            }
        });
        lbl_ChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ChangePassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ChangePassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ChangePassMouseExited(evt);
            }
        });

        btn_MainUpdate.setBackground(new java.awt.Color(153, 153, 153));
        btn_MainUpdate.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_MainUpdate.setText("Update Employee");
        btn_MainUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainUpdateActionPerformed(evt);
            }
        });

        btn_MainDelete.setBackground(new java.awt.Color(21, 169, 169));
        btn_MainDelete.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_MainDelete.setText("Delete Employee");
        btn_MainDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainDeleteActionPerformed(evt);
            }
        });

        btn_UpdateEmp.setBackground(new java.awt.Color(88, 200, 197));
        btn_UpdateEmp.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_UpdateEmp.setText("Update");
        btn_UpdateEmp.setToolTipText("Update Employee Details");
        btn_UpdateEmp.setEnabled(false);
        btn_UpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateEmpActionPerformed(evt);
            }
        });

        btn_DeleteEmp.setBackground(new java.awt.Color(88, 200, 197));
        btn_DeleteEmp.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_DeleteEmp.setText("Delete");
        btn_DeleteEmp.setToolTipText("Delete Employee Details");
        btn_DeleteEmp.setEnabled(false);
        btn_DeleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteEmpActionPerformed(evt);
            }
        });

        txt_euserId.setEditable(false);
        txt_euserId.setBackground(new java.awt.Color(23, 31, 44));
        txt_euserId.setForeground(new java.awt.Color(255, 255, 255));
        txt_euserId.setToolTipText("Autogenarated UserID");
        txt_euserId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_euserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_euserIdActionPerformed(evt);
            }
        });

        btn_Refresh.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_Refresh.setText("Table Refresh");
        btn_Refresh.setToolTipText("Refresh the Table");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });

        btn_Clear.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.setToolTipText("Clear TextBoxs");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("MANAGE EMPLOYEE");

        javax.swing.GroupLayout pnlemployeeLayout = new javax.swing.GroupLayout(pnlemployee);
        pnlemployee.setLayout(pnlemployeeLayout);
        pnlemployeeLayout.setHorizontalGroup(
            pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlemployeeLayout.createSequentialGroup()
                .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                        .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlemployeeLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(252, 252, 252))
                                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(126, 126, 126))
                                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(126, 126, 126))
                                    .addComponent(txt_eidno)
                                    .addComponent(txt_ename)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_eemail)
                                    .addComponent(txt_ephoneno)
                                    .addComponent(txt_eaddress)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(105, 105, 105))
                            .addGroup(pnlemployeeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                                        .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlemployeeLayout.createSequentialGroup()
                                .addComponent(btn_InsertEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_UpdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_DeleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmb_erole, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_euserId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ChangePass)
                                    .addComponent(txt_epass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlemployeeLayout.createSequentialGroup()
                                    .addComponent(btn_MainInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_MainUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_MainDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8)))
                .addContainerGap())
        );
        pnlemployeeLayout.setVerticalGroup(
            pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlemployeeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_MainInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_MainUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_MainDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_euserId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel16)
                        .addGap(5, 5, 5)
                        .addComponent(txt_epass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ChangePass)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_erole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_close)
                            .addComponent(btn_InsertEmp)
                            .addComponent(btn_UpdateEmp)
                            .addComponent(btn_DeleteEmp)))
                    .addGroup(pnlemployeeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ename, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_eidno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_eaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ephoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Refresh)
                            .addComponent(btn_Clear))))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Add");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Resarvation ID", "Customer ID", "Date", "Check-In", "Check-Out", "User-ID", "Adults", "Children"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Room Reservation");

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlbookingLayout = new javax.swing.GroupLayout(pnlbooking);
        pnlbooking.setLayout(pnlbookingLayout);
        pnlbookingLayout.setHorizontalGroup(
            pnlbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbookingLayout.createSequentialGroup()
                .addGroup(pnlbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlbookingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9))
                    .addGroup(pnlbookingLayout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(jLabel5)
                        .addGap(109, 109, 109)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(0, 210, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlbookingLayout.setVerticalGroup(
            pnlbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbookingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11)
                        .addComponent(jButton12)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );

        jLayeredPane1.setLayer(pnlhome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlmanager, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlresturent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlsetting, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlRoomType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlemployee, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlbooking, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlresturent, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlmanager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlRoomType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(pnlemployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(13, 13, 13)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(pnlbooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlresturent, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlmanager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlRoomType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(pnlhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(pnlemployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(56, 56, 56)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(pnlbooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(53, 53, 53)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidemanubar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(682, 682, 682))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidemanubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        pnlemployee.setVisible(false);
        
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
        pnlemployee.setVisible(false);
        
         RetriveTable();
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
        pnlemployee.setVisible(false);
       
    }//GEN-LAST:event_receiptlblMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        pnlhome.setVisible(false);
        pnlbooking.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(true);
        pnlRoomType.setVisible(false);
        pnlmanager.setVisible(false);
        pnlemployee.setVisible(false);
        
        ArrayList<Receipt> tbl = new ArrayList<Receipt>();
        DefaultTableModel mdl = (DefaultTableModel) tblIncome.getModel();
        SQLReport rtpt= new SQLReport();
        tbl=rtpt.getTable();
        mdl.setRowCount(0);
        for(int i=0;i<tbl.size();i++){
            mdl.addRow(new Object[] { tbl.get(i).getRecNo(),tbl.get(i).getResID(),tbl.get(i).getDate(),tbl.get(i).getTotal()});
        }
        
        lblTotal.setText(Double.toString(rtpt.total()));
        
        int reservedRooms=0,emptyRooms=0;
        
        DefaultTableModel rmmdl = (DefaultTableModel) tblRoomReport.getModel();
        
        SQLQryM room = new SQLQryM();
        ArrayList<RoomMap> roomtbl = new ArrayList<RoomMap>();
        roomtbl= room.InsertRoomTb();
        rmmdl.setRowCount(0);
        for(int n=0;n<roomtbl.size();n++){
           rmmdl.addRow(new Object [] {roomtbl.get(n).getRoomID(),roomtbl.get(n).getRoomType(),roomtbl.get(n).getRates(),roomtbl.get(n).getAvailability()});
            if(roomtbl.get(n).getAvailability()==1){
                reservedRooms +=1;
            }
            else{
                emptyRooms +=1;
            }
        }
        
        lblTotalRoom.setText(Integer.toString(reservedRooms+emptyRooms));
        lblReservedRoom.setText(Integer.toString(reservedRooms));
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         pnlhome.setVisible(false);
        pnlbooking.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
        pnlRoomType.setVisible(false);
        pnlmanager.setVisible(false);
        pnlemployee.setVisible(true);
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MousePressed

    private void pnlresturentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlresturentComponentShown
        
    }//GEN-LAST:event_pnlresturentComponentShown

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateActionPerformed
///////////////////////Generate a receipt for a customer////////////////////////////////////////////////////////////
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
       
  ///////////////////////////////////////////////////////////// ////////////////       
        write_read read = new write_read();
        
        Tables.setRates(Double.parseDouble(read.read()));
 //////////////////////////////////////////////////////////////////////////////  
        
         s=txtPersonID.getText();
        //validate the entering Identity Number of the customer
        if(!(valID.validate(s))){
            txtPersonID.setText("");
        }
        
        txtPersonID.setText("");
        lblctmrID.setText(s);
        
        
      
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
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////Clear the receipt panel/////////////////////////////////////////////////////////////
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
//////////////////////////Load the Manager panel////////////////////////////////////////////////
    private void restMngerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restMngerMouseClicked
        pnlbooking.setVisible(false);
        pnlhome.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
        pnlmanager.setVisible(true);
        pnlRoomType.setVisible(false);
        pnlemployee.setVisible(false);
        
        write_read read = new write_read();
        
        Tables.setRates(Double.parseDouble(read.read()));
        //txtTableRates.setText(read.read());
       // JOptionPane.showMessageDialog(null, Tables.getRates());
    
        
        txtTableRates.setText(String.valueOf(Tables.getRates()) );
        
        
      
           
            
            
        
    }//GEN-LAST:event_restMngerMouseClicked

    private void restMngerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restMngerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_restMngerMousePressed

    ///////////////////////////////Insert receipt data in to the table in receipt panel////////////////////////////////////
    private void btninsrtDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsrtDBMouseClicked
       String ResID= textResID.getText();
       int days = Integer.parseInt(lbldayCount.getText());
       double total=Double.parseDouble(lblFinalbill.getText());
       DefaultTableModel model = (DefaultTableModel) ResjTable.getModel();
       int tblrec=model.getRowCount();
       SQLQuery insertReceipt = new SQLQuery();
       
       if(insertReceipt.inserttoReceipt(ResID,days,tblrec ,total)==1){
           JOptionPane.showMessageDialog(null, "Receipt data are inserted into the company");
       }
       
      String ID= lblctmrID.getText();
      insertReceipt.DeleteCustomer(ID);
       
       
    }//GEN-LAST:event_btninsrtDBMouseClicked
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////Get values from Room Map table to text boxes in manager panel/////////////////////////////////////
    private void tblRMMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRMMapMouseClicked
        //create tablemodel object
        DefaultTableModel tbltotxt = (DefaultTableModel) tblRMMap.getModel();
        
        //add selected raw values to the text fields
            txtRoomNo.setText((tbltotxt.getValueAt(tblRMMap.getSelectedRow(),0)).toString());
            txtRoomType.setText((tbltotxt.getValueAt(tblRMMap.getSelectedRow(),1)).toString());
            txtRates.setText((tbltotxt.getValueAt(tblRMMap.getSelectedRow(),2)).toString());
            
    }//GEN-LAST:event_tblRMMapMouseClicked
//////////////////////////Update the RoomMap Table///////////////////////////////////////////////////////////////////////
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////Load/refresh the RoomMap Table in Manager table//////////////////////////////////////////////////////
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
                
              
               modelRMMd.addRow(new Object[] {AllRmDetails.get(i).getRoomID(),AllRmDetails.get(i).getRoomType(),AllRmDetails.get(i).getRates(),AllRmDetails.get(i).getAvailability()});
            }
            
    }//GEN-LAST:event_btnRefreshMouseClicked
///////////////////////////////panel Handling//////////////////////////////////////////////////////////////////////////
    private void btnroomTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnroomTypeMouseClicked
        // TODO add your handling code here:
         pnlbooking.setVisible(false);
        pnlhome.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
        pnlmanager.setVisible(false);
        pnlRoomType.setVisible(true);
        pnlemployee.setVisible(false);
    }//GEN-LAST:event_btnroomTypeMouseClicked
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////Load the RoomType Table in RoomType panel////////////////////////////////////////////
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
////////////////////////////Get values from RoomType Table to the text Boxeses////////////////////////////////
    private void tblRoomTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomTypeMouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel tbltotxt = (DefaultTableModel) tblRoomType.getModel();
        
        //add selected raw values to the text fields
            txtpnlRMtype.setText((tbltotxt.getValueAt(tblRoomType.getSelectedRow(),0)).toString());
            txtRoomDetails.setText((tbltotxt.getValueAt(tblRoomType.getSelectedRow(),1)).toString());
    }//GEN-LAST:event_tblRoomTypeMouseClicked
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////Update the RoomType Table//////////////////////////////////////////////////
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
///////////////////////////////////////////////////////Insert data in to  the RoomType Table////////////////////////
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        SQLQryM insrt = new SQLQryM();
        
        int n=insrt.InsrtRMType(txtpnlRMtype.getText(), txtRoomDetails.getText());
        if(n==1){
            JOptionPane.showMessageDialog(null, "New Record was succesfully recorded");
        }
    }//GEN-LAST:event_jButton8MouseClicked
/////////////////////////////Insert new record in to the RoomMap table//////////////////
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        SQLQryM insrt = new SQLQryM();
        roomId rmval = new roomId();
        String RoomNo = txtRoomNo.getText();
        String RoomType = txtRoomType.getText();
        Double rate = Double.parseDouble(txtRates.getText());
        if(rmval.validateRm(RoomNo)){
            
            int i=insrt.InsrtRMMP(RoomNo, RoomType, rate);
            if(i==1){
                JOptionPane.showMessageDialog(null, "New record was Succesfully created");
            }
        
       
        }
    }//GEN-LAST:event_jButton2MouseClicked
/////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////Update the table rate file////////////////////////
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Double d = Double.parseDouble(txtTableRates.getText());
        Tables.setRates(d);
        JOptionPane.showMessageDialog(null, "Updated Succesfully");
        
        write_read update = new write_read();
        
        try {
            update.write(d);
            JOptionPane.showMessageDialog(null, "Updated succesfully");
           
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked
//////////////Tried to encrypt the rate text file//////////////////////////////////
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        /*     String enc_rate;
        try{
        Enc_Dec encoder = new Enc_Dec();
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        encoder.setInput(txtTableRates.getText().getBytes());
        encoder.setCipher(Cipher.getInstance("DES/CTR/NoPadding","BC"));
        encoder.getCipher().init(encoder.getCipher().ENCRYPT_MODE, encoder.getKey(),encoder.getIvSpec());
        encoder.setCiphertext(new byte[encoder.getCipher().getOutputSize(encoder.getInput().length)]);
        encoder.setCtlength(encoder.getCipher().update(encoder.getInput(), 0,encoder.getInput().length,encoder.getCiphertext(),0));
        encoder.setCtlength(encoder.getCtlength()+encoder.getCipher().doFinal(encoder.getCiphertext(), encoder.getCtlength()));
        
        enc_rate = new String(encoder.getCiphertext());
        JOptionPane.showMessageDialog(null, enc_rate);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }*/
    }//GEN-LAST:event_jButton6MouseClicked
/////////////////////////////////////Clear all texts in RoomType panel//////////
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        txtRoomNo.setText("");
        txtRoomType.setText("");
        txtRates.setText("");
    }//GEN-LAST:event_jButton3MouseClicked

///////////////////////////When form is shown hide all other panels except home////////////
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        pnlbooking.setVisible(false);
        pnlhome.setVisible(true);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
        pnlmanager.setVisible(false);
        pnlRoomType.setVisible(false);
        pnlemployee.setVisible(false);
        
          
        write_read read = new write_read();
        
        Tables.setRates(Double.parseDouble(read.read()));
        //txtTableRates.setText(read.read());
       // JOptionPane.showMessageDialog(null, Tables.getRates());
    
        
        txtTableRates.setText(String.valueOf(Tables.getRates()) );
        
    }//GEN-LAST:event_formComponentShown
//////////////////Exit in to the manager panel///////////////////////////////////////
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        pnlbooking.setVisible(false);
        pnlhome.setVisible(false);
        pnlresturent.setVisible(false);
        pnlsetting.setVisible(false);
        pnlmanager.setVisible(true);
        pnlRoomType.setVisible(false);
        pnlemployee.setVisible(false);
    }//GEN-LAST:event_jButton9MouseClicked

    
    /////////////////////////Delete record button in manager panel//////////////////////
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
      JFrame frame = new JFrame("Swing Tester");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SQLQryM delete = new SQLQryM();
      
      frame.setSize(560, 200);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(false);
        
        int result = JOptionPane.showConfirmDialog(frame,"Sure? You want to exit?", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        
        
            if(result == JOptionPane.YES_OPTION){
               delete.DeleteRoom(txtRoomNo.getText());
            }
           
        
    }//GEN-LAST:event_btnDeleteMouseClicked
///////////////////////////////Report panel calculate button/////////////////////////////
    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        
        //SimpleDateFormat dat = new SimpleDateFormat("yyyy-mm-dd");
        Date d1 = date1.getDate();
        Date d2 = date2.getDate();
        //JOptionPane.showMessageDialog(null, "1");
        Double total=0.00;
        
         ArrayList<Receipt> datalist= new ArrayList<Receipt>();
         SQLReport datacomp = new SQLReport();
        // JOptionPane.showMessageDialog(null, "2");
         datalist=datacomp.getTable();
          
         
         for(int i=0;i<datalist.size();i++){
             if((d1.before(datalist.get(i).getDate()))&&(d2.after(datalist.get(i).getDate()))){
                 
                 total +=datalist.get(i).getTotal();
                 
             }
            
         }
         lblLimitedTotal.setText(Double.toString(total));
        
    }//GEN-LAST:event_jButton10MouseClicked

    private void txt_epassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_epassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_epassActionPerformed

    private void cmb_eroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_eroleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_eroleActionPerformed

    private void txt_enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_enameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_enameActionPerformed

    private void txt_ephonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ephonenoKeyTyped
        User_Validation uv = new User_Validation();
        uv.CheckIsNum(evt);
    }//GEN-LAST:event_txt_ephonenoKeyTyped

    private void txt_eemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eemailActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

     private void txtClear(){
        txt_ename.setText("");
        txt_eaddress.setText("");
        txt_eidno.setText("");
        txt_ephoneno.setText("");
        txt_eemail.setText("");
    }
    private void btn_InsertEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertEmpActionPerformed

        if(txt_eidno.getText().equals("")||txt_ename.getText().equals("")||txt_eaddress.getText().equals("")||
            txt_ephoneno.getText().equals("")||txt_eemail.getText().equals("")||txt_euserId.getText().equals("")||txt_epass.getPassword().equals("")){

            JOptionPane.showMessageDialog(null, "Empty Value!" , " WARNING", JOptionPane.WARNING_MESSAGE);
        }else{
            Person p = new Person(txt_eidno.getText(),txt_ename.getText(),txt_eaddress.getText(),Integer.parseInt(txt_ephoneno.getText()),txt_eemail.getText());

            User u = new User();
            u.setUserId(txt_euserId.getText());
            u.setIdNo(txt_eidno.getText());
            u.setPassword(String.valueOf(txt_epass.getPassword()));
            u.setRole((String) cmb_erole.getSelectedItem());
            p.setPDetails();
            u.SetUDetails();
            loadTable();
            txtClear();

        }

    }//GEN-LAST:event_btn_InsertEmpActionPerformed

     private boolean InsertionActive = true;
    private void tbl_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_userMouseClicked
        
        if(InsertionActive == false){

            int number = tbl_user.getSelectedRow();

            txt_ename.setText(tbl_user.getValueAt(number, 0).toString());
            txt_eidno.setText(tbl_user.getValueAt(number, 1).toString());
            txt_eaddress.setText(tbl_user.getValueAt(number, 2).toString());
            txt_ephoneno.setText(tbl_user.getValueAt(number, 3).toString());
            txt_eemail.setText(tbl_user.getValueAt(number, 4).toString());
            txt_euserId.setText(tbl_user.getValueAt(number, 5).toString());
            String Role = tbl_user.getValueAt(number, 6).toString();
            if(Role.equals("Manager")){
                cmb_erole.setSelectedIndex(0);
            }
            if(Role.equals("Reception")){
                cmb_erole.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_tbl_userMouseClicked

    private void btn_MainInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainInsertActionPerformed
        btn_InsertEmp.setEnabled(true);
        btn_UpdateEmp.setEnabled(false);
        btn_DeleteEmp.setEnabled(false);
        txt_epass.setEditable(true);
        txt_eidno.setEditable(true);
        btn_MainInsert.setBackground(new Color(21,169,169));
        btn_MainUpdate.setBackground(new Color(153,153,153));
        btn_MainDelete.setBackground(new Color(153,153,153));

        Query_Person qp = new Query_Person();
        qp.ID();
        txt_euserId.setText("USER-"+qp.getAutoGenUserId());
        InsertionActive = true;
        tbl_user.setEnabled(false);
        txtClear();
    }//GEN-LAST:event_btn_MainInsertActionPerformed

    private void lbl_ChangePassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChangePassMouseMoved

    }//GEN-LAST:event_lbl_ChangePassMouseMoved

    private void lbl_ChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChangePassMouseClicked
        ChangePass cp = new ChangePass();
        cp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_ChangePassMouseClicked

    private void lbl_ChangePassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChangePassMouseEntered
        lbl_ChangePass.setForeground(Color.red);
    }//GEN-LAST:event_lbl_ChangePassMouseEntered

    private void lbl_ChangePassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChangePassMouseExited
        lbl_ChangePass.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ChangePassMouseExited

    private void btn_MainUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainUpdateActionPerformed
        btn_InsertEmp.setEnabled(false);
        btn_UpdateEmp.setEnabled(true);
        btn_DeleteEmp.setEnabled(false);
        txt_epass.setEditable(false);
        txt_eidno.setEditable(false);

        btn_MainInsert.setBackground(new Color(153,153,153));
        btn_MainUpdate.setBackground(new Color(21,169,169));
        btn_MainDelete.setBackground(new Color(153,153,153));

        InsertionActive = false;
        tbl_user.setEnabled(true);
        txtClear();

    }//GEN-LAST:event_btn_MainUpdateActionPerformed

    private void btn_MainDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainDeleteActionPerformed
        btn_InsertEmp.setEnabled(false);
        btn_UpdateEmp.setEnabled(false);
        btn_DeleteEmp.setEnabled(true);
        txt_epass.setEditable(false);
        txt_ename.setEditable(false);
        txt_eidno.setEditable(false);
        txt_eaddress.setEditable(false);
        txt_ephoneno.setEditable(false);
        txt_eemail.setEditable(false);
        cmb_erole.setEditable(false);

        btn_MainInsert.setBackground(new Color(153,153,153));
        btn_MainUpdate.setBackground(new Color(153,153,153));
        btn_MainDelete.setBackground(new Color(21,169,169));

        InsertionActive = false;
        tbl_user.setEnabled(true);
        txtClear();
    }//GEN-LAST:event_btn_MainDeleteActionPerformed

    private void btn_UpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateEmpActionPerformed
        Person p1 = new Person(txt_eidno.getText(),txt_ename.getText(),txt_eaddress.getText(),Integer.parseInt(txt_ephoneno.getText()),txt_eemail.getText());

        User u1 = new User();
        u1.setIdNo(txt_eidno.getText());
        u1.setUserId(txt_euserId.getText());
        u1.setRole((String) cmb_erole.getSelectedItem());

        p1.UpdatePDetails();
        u1.UpdateUDetails();
        loadTable();
        txtClear();
    }//GEN-LAST:event_btn_UpdateEmpActionPerformed

    private void btn_DeleteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteEmpActionPerformed
        Person p1 = new Person();
        p1.setIdNo(txt_eidno.getText());
        p1.DeletePDetails();
        loadTable();
        txtClear();
    }//GEN-LAST:event_btn_DeleteEmpActionPerformed

    private void txt_euserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_euserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_euserIdActionPerformed

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        loadTable();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        txtClear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        String user_id = lbl_userid.getText();
        addreservation adres = new addreservation();
        adres.setuserid(user_id); //pass username to addreservation class

        adres.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //System.out.println(jTable1.getSelectedRow());  jTable1.getSelectedRow();
        DeleteData dd = new DeleteData();
        RetriveCustomerData getid = new RetriveCustomerData();
        try{
            int row = jTable1.getSelectedRow();
            String  customID = (jTable1.getModel().getValueAt(row, 1).toString());
            System.out.println(customID);
            String NIC= getid.re(customID);
            System.out.println(NIC);
            boolean result =  dd.delete(NIC);

            if(result == true){
                JOptionPane.showMessageDialog(null, "Delete Successfull");
            }else{
                JOptionPane.showMessageDialog(null, "Delete Failed");
            }

            //dd.delete(table_click);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        RetriveTable();
        //

    }//GEN-LAST:event_jButton12ActionPerformed
//////////////////////////////////////////////////////////////////////////////////////////
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
    private javax.swing.JPanel Employeebtn1;
    private javax.swing.JPanel Receiptbtn;
    private javax.swing.JTable ResjTable;
    private javax.swing.JTable TblRoom;
    private javax.swing.JPanel bookingbtn;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTypeUpdat;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_DeleteEmp;
    private javax.swing.JButton btn_InsertEmp;
    private javax.swing.JButton btn_MainDelete;
    private javax.swing.JButton btn_MainInsert;
    private javax.swing.JButton btn_MainUpdate;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_UpdateEmp;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btninsrtDB;
    private javax.swing.JButton btnroomType;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_erole;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JPanel homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlblRate;
    private javax.swing.JLabel lblCheckIn;
    private javax.swing.JLabel lblCheckOut;
    private javax.swing.JLabel lblFinalbill;
    private javax.swing.JLabel lblLimitedTotal;
    private javax.swing.JLabel lblReservedRoom;
    private javax.swing.JLabel lblTableTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalRoom;
    private javax.swing.JLabel lbl_ChangePass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lbl_userRole;
    private javax.swing.JLabel lbl_userid;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lblctmrID;
    private javax.swing.JLabel lbldayCount;
    private javax.swing.JLabel lblrmTotal;
    private javax.swing.JPanel pnlRoomType;
    private javax.swing.JPanel pnlbooking;
    private javax.swing.JPanel pnlemployee;
    private javax.swing.JPanel pnlhome;
    private javax.swing.JPanel pnlmanager;
    private javax.swing.JPanel pnlresturent;
    private javax.swing.JPanel pnlsetting;
    private javax.swing.JLabel receiptlbl;
    private javax.swing.JLabel restMnger;
    private javax.swing.JPanel resturantMn;
    private javax.swing.JPanel settingbtn;
    private javax.swing.JPanel sidemanubar;
    private javax.swing.JTable tblIncome;
    private javax.swing.JTable tblRMMap;
    private javax.swing.JTable tblRoomReport;
    private javax.swing.JTable tblRoomType;
    private javax.swing.JTable tbl_user;
    private javax.swing.JTextField textCustomerID;
    private javax.swing.JTextField textResID;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtRates;
    private javax.swing.JTextArea txtRoomDetails;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtRoomType;
    private javax.swing.JTextField txtTableRates;
    private javax.swing.JTextField txt_eaddress;
    private javax.swing.JTextField txt_eemail;
    private javax.swing.JTextField txt_eidno;
    private javax.swing.JTextField txt_ename;
    private javax.swing.JPasswordField txt_epass;
    private javax.swing.JTextField txt_ephoneno;
    private javax.swing.JTextField txt_euserId;
    private javax.swing.JTextField txtpnlRMtype;
    private javax.swing.JPanel userrole;
    // End of variables declaration//GEN-END:variables
}
