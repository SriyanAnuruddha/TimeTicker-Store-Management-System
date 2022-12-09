package Views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//import program packages
import Controllers.InvoiceController;
import Models.Invoice;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import Utilities.jPanelGradient;

public class InvoiceUI extends javax.swing.JFrame {

    //create objects
    InvoiceController invoiceControllerObj = new InvoiceController();
    Invoice invoiceObj;

    public InvoiceUI() {
        initComponents();
        Connect();
        
        bluePanel.setOpaque(false);
        purplePannel.setOpaque(false);
        orangePanel.setOpaque(false);
    }
    
    
    
   
    

    //data base connection
    Connection con;
    //insert/fetch data
    PreparedStatement pst;

    public void Connect() {
         String url = "jdbc:mysql://localhost:3306/timeticker";
        String user = "root";
        String password = "sysadmin@1122";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient();
        orangePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        qytTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        itemTxt = new javax.swing.JTextField();
        addDetailsBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        purplePannel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalOut = new javax.swing.JLabel();
        genBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        invoiceResetBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        invoiceNoOut = new javax.swing.JLabel();
        issuedateOut = new javax.swing.JLabel();
        clientNameOut = new javax.swing.JLabel();
        goHomebtn = new javax.swing.JButton();
        addressOut2 = new javax.swing.JLabel();
        bluePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        invoiceIdTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cusIdTxt = new javax.swing.JTextField();
        cusNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cusEmailTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cusAddressTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addBtn1 = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orangePanel.setBackground(new java.awt.Color(255, 153, 51));
        orangePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Unit Price");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Watch name");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Quantity");

        qytTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qytTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qytTxtActionPerformed(evt);
            }
        });

        priceTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtActionPerformed(evt);
            }
        });

        itemTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addDetailsBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addDetailsBtn.setText("Add item");
        addDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDetailsBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Enter Item Details");

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangePanelLayout.createSequentialGroup()
                        .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(61, 61, 61)
                        .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qytTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangePanelLayout.createSequentialGroup()
                        .addComponent(addDetailsBtn)
                        .addGap(312, 312, 312))))
        );
        orangePanelLayout.setVerticalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(54, 54, 54)
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(39, 39, 39)
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(qytTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(addDetailsBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        purplePannel.setBackground(new java.awt.Color(153, 153, 255));
        purplePannel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");

        totalOut.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        totalOut.setForeground(new java.awt.Color(255, 255, 255));

        genBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genBtn.setText("Generate Invoice");
        genBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Watch Name", "Price", "Quantity", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        invoiceResetBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invoiceResetBtn.setText("Clear ");
        invoiceResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceResetBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Invoice NO:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("client Address :");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Client Name    :");

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Issue Date      :");

        invoiceNoOut.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        invoiceNoOut.setForeground(new java.awt.Color(255, 255, 255));

        issuedateOut.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        issuedateOut.setForeground(new java.awt.Color(255, 255, 255));
        issuedateOut.setText("-");

        clientNameOut.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        clientNameOut.setForeground(new java.awt.Color(255, 255, 255));
        clientNameOut.setText("-");

        goHomebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goHomebtn.setText("Home");
        goHomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goHomebtnActionPerformed(evt);
            }
        });

        addressOut2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        addressOut2.setForeground(new java.awt.Color(255, 255, 255));
        addressOut2.setText("-");

        javax.swing.GroupLayout purplePannelLayout = new javax.swing.GroupLayout(purplePannel);
        purplePannel.setLayout(purplePannelLayout);
        purplePannelLayout.setHorizontalGroup(
            purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purplePannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(totalOut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
            .addGroup(purplePannelLayout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purplePannelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 303, Short.MAX_VALUE))
                    .addGroup(purplePannelLayout.createSequentialGroup()
                        .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(purplePannelLayout.createSequentialGroup()
                                .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addressOut2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                    .addComponent(issuedateOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(purplePannelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clientNameOut, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                            .addGroup(purplePannelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceNoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goHomebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceResetBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(295, 295, 295))))
        );
        purplePannelLayout.setVerticalGroup(
            purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purplePannelLayout.createSequentialGroup()
                .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purplePannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceNoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(clientNameOut))
                        .addGap(18, 18, 18)
                        .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(issuedateOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(addressOut2)
                            .addComponent(invoiceResetBtn)))
                    .addGroup(purplePannelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(goHomebtn)
                        .addGap(18, 18, 18)
                        .addComponent(genBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(purplePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bluePanel.setBackground(new java.awt.Color(102, 204, 255));
        bluePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Enter Customer Details");

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addBtn.setText("add Invoice");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        invoiceIdTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        invoiceIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceIdTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Invoice NO");

        dateTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Customer ID");

        cusIdTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cusNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cusNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusNameTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("customer name");

        cusEmailTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("customer Email");

        cusAddressTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Customer Address");

        addBtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addBtn1.setText("View Customer Details");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateBtn.setText("Update Invoice");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBtn.setText("Remove Invoice");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(71, 71, 71)
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoiceIdTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(dateTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cusIdTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cusNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cusEmailTxt)
                    .addComponent(cusAddressTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn1)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(clearbtn))
                .addGap(76, 76, 76))
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bluePanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn1))
                        .addGap(27, 27, 27)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cusIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn))
                        .addGap(43, 43, 43)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn))
                        .addGap(27, 27, 27)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cusEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearbtn))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(bluePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cusAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(purplePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(purplePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceIdTxtActionPerformed

    }//GEN-LAST:event_invoiceIdTxtActionPerformed

    private void addDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDetailsBtnActionPerformed

        try {

            int invoiceiD = Integer.parseInt(invoiceIdTxt.getText());

            String item = itemTxt.getText();
            double price = Double.parseDouble(priceTxt.getText());
            int qty = Integer.parseInt(qytTxt.getText());

            invoiceObj = invoiceControllerObj.addInvoice();
            double total = invoiceObj.total(price, qty);
            //add to Total table
            pst = con.prepareStatement("insert into Total (invoiceNo,watchName,qty,total,price) values (?,?,?,?,?)");
            pst.setInt(1, invoiceiD);
            pst.setString(2, item);
            pst.setInt(3, qty);
            pst.setDouble(4, total);
            pst.setDouble(5, price);

            int result = pst.executeUpdate();//this will return 0/1 depend on the value error wil display
            if (result == 1) {
                JOptionPane.showMessageDialog(rootPane, "Added Item details", "Sucess", 1);

                //clean the entered values
                priceTxt.setText("");
                qytTxt.setText("");
                itemTxt.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Invalid", "Error", 0);
            }

        } catch (SQLException ex) {

            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(rootPane, "Invoice ID field is empty", "Error", 0);
        }

    }//GEN-LAST:event_addDetailsBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int invoiceiD = Integer.parseInt(invoiceIdTxt.getText());
        String date = dateTxt.getText();
        int cusId = Integer.parseInt(cusIdTxt.getText());
        String cusName = cusNameTxt.getText();
        String email = cusEmailTxt.getText();
        String address = cusAddressTxt.getText();

        try {
            int result1 = 0;
            int result2 = 0;
            boolean exists1 = false;
            boolean exists2 = false;

            //check InvoiceID or Customer ID is alredy exists
            pst = con.prepareStatement("select invoiceNo from Invoice where invoiceNo=?");
            pst.setInt(1, invoiceiD);
            ResultSet rs1 = pst.executeQuery();

            if (rs1.next()) {
                exists1 = true;
            }
            pst = con.prepareStatement("select cusID from Customer where cusID=?");
            pst.setInt(1, cusId);
            ResultSet rs2 = pst.executeQuery();

            if (rs2.next()) {
                exists2 = true;
            }

            if (exists1 == false && exists2 == false) {
                //insert data into invoice table
                pst = con.prepareStatement("insert into Invoice (invoiceNo,issueDate) values (?,?)");
                pst.setInt(1, invoiceiD);
                pst.setString(2, date);

                result1 = pst.executeUpdate();//execute insert

                //insert data into Customer table
                pst = con.prepareStatement("insert into Customer (cusID,cusName,email,address,invoiceNo) values (?,?,?,?,?)");
                pst.setInt(1, cusId);
                pst.setString(2, cusName);
                pst.setString(3, email);
                pst.setString(4, address);
                pst.setInt(5, invoiceiD);
                result2 = pst.executeUpdate();//execute insert
            }else if(exists1 == true && exists2 == true) {
                JOptionPane.showMessageDialog(rootPane, "Customer id & invoice id alredy exists", "error", 0);
            }else if (exists1 == true) {
                JOptionPane.showMessageDialog(rootPane, "invoice id=" + invoiceiD + "alredy exists", "error", 0);
            } else if (exists2 == true) {
                JOptionPane.showMessageDialog(rootPane, "Customer id=" + cusId + "alredy exists", "error", 0);
            }
            
            
            
            

            if (result1 == 1 && result2 == 1) {
                JOptionPane.showMessageDialog(rootPane, "Added invoice", "Sucess", 1);
                //clean entered values
                dateTxt.setText("");
                cusIdTxt.setText("");
                cusNameTxt.setText("");
                cusEmailTxt.setText("");
                cusAddressTxt.setText("");
                itemTxt.setText("");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "invoice id/Customer ID is alredy exists", "error", 0);

            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int invoiceiD = Integer.parseInt(invoiceIdTxt.getText());
        try {
            pst = con.prepareStatement("delete from Invoice where invoiceNo=?");
            pst.setInt(1, invoiceiD);

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(rootPane, "Deleted invoice =" + invoiceiD, "Sucess", 1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "can't delete invoice =" + invoiceiD, "error", 0);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int invoiceiD = Integer.parseInt(invoiceIdTxt.getText());
        String date = dateTxt.getText();
        int cusId = Integer.parseInt(cusIdTxt.getText());
        String cusName = cusNameTxt.getText();
        String email = cusEmailTxt.getText();
        String address = cusAddressTxt.getText();
        try {
            //update invoice details
            pst = con.prepareStatement("update Invoice set issueDate=? where invoiceNo=?");
            pst.setString(1, date);
            pst.setInt(2, invoiceiD);
            int result1 = pst.executeUpdate();

            //update customer details
            pst = con.prepareStatement("update Customer set cusName=?,email=?,address=? where cusID=?");
            pst.setString(1, cusName);
            pst.setString(2, email);
            pst.setString(3, address);
            pst.setInt(4, cusId);

            int result2 = pst.executeUpdate();

            if (result1 == 1 && result2 == 1) {
                JOptionPane.showMessageDialog(rootPane, "succesfully updated", "Sucess", 1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "can't update values", "error", 0);
            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void qytTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qytTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qytTxtActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        int invoiceiD = Integer.parseInt(invoiceIdTxt.getText());
        try {
            pst = con.prepareStatement("select * from Customer,Invoice  where Customer.invoiceNo=Invoice.invoiceNo AND Invoice.invoiceNo=?");
            pst.setInt(1, invoiceiD);
            ResultSet rs = pst.executeQuery();
            rs.next();

            cusIdTxt.setText(rs.getString("cusID"));
            cusNameTxt.setText(rs.getString("cusName"));
            cusEmailTxt.setText(rs.getString("email"));
            cusAddressTxt.setText(rs.getString("address"));
            dateTxt.setText(rs.getString("issueDate"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "invoice number is invalid" + invoiceiD, "error", 0);
            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        invoiceIdTxt.setText("");
        dateTxt.setText("");
        cusIdTxt.setText("");
        cusNameTxt.setText("");
        cusEmailTxt.setText("");
        cusAddressTxt.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void genBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genBtnActionPerformed
        int invoiceiD = Integer.parseInt(invoiceIdTxt.getText());
        try {
            //reset invoice table
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            pst = con.prepareStatement("select * from Total where invoiceNo=?");
            pst.setInt(1, invoiceiD);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String watchName = rs.getString("watchName");
                String qty = String.valueOf(rs.getInt("qty"));
                String price = String.valueOf(rs.getDouble("price"));
                String total = String.valueOf(rs.getDouble("total"));

                //create String array for store data into jtable
                String tbData[] = {watchName, price, qty, total};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

                //add string array data into jtable
                tblModel.addRow(tbData);
            }

            //print invoice details
            pst = con.prepareStatement("select * from Customer,Invoice  where Customer.invoiceNo=Invoice.invoiceNo AND Invoice.invoiceNo=?");
            pst.setInt(1, invoiceiD);
            ResultSet rs2 = pst.executeQuery();
            rs2.next();
            invoiceNoOut.setText(rs2.getString("invoiceNo"));
            clientNameOut.setText(rs2.getString("cusName"));
            issuedateOut.setText(rs2.getString("issueDate"));
            addressOut2.setText(rs2.getString("address"));

            //taking total
            pst = con.prepareStatement("select sum(total) from Total where invoiceNo=? ");
            pst.setInt(1, invoiceiD);
            ResultSet rs3 = pst.executeQuery();
            rs3.next();

            double subTotal = rs3.getDouble(1);
            totalOut.setText(subTotal + "");

            //store subtotal value in invoice
            pst = con.prepareStatement("update Invoice set subtotal=? where invoiceNo=?");
            pst.setDouble(1, subTotal);
            pst.setInt(2, invoiceiD);

            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "invoice number is invalid" + invoiceiD, "error", 0);
            Logger.getLogger(InvoiceUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_genBtnActionPerformed

    private void invoiceResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceResetBtnActionPerformed

        //reset invoice table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        invoiceNoOut.setText("");
        clientNameOut.setText("");
        issuedateOut.setText("");
        addressOut2.setText("");
        totalOut.setText("");
    }//GEN-LAST:event_invoiceResetBtnActionPerformed

    private void cusNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusNameTxtActionPerformed

    private void priceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTxtActionPerformed

    private void goHomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goHomebtnActionPerformed
        MainUI ui = new MainUI();
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goHomebtnActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton addDetailsBtn;
    private javax.swing.JLabel addressOut2;
    private javax.swing.JPanel bluePanel;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel clientNameOut;
    private javax.swing.JTextField cusAddressTxt;
    private javax.swing.JTextField cusEmailTxt;
    private javax.swing.JTextField cusIdTxt;
    private javax.swing.JTextField cusNameTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton genBtn;
    private javax.swing.JButton goHomebtn;
    private javax.swing.JTextField invoiceIdTxt;
    private javax.swing.JLabel invoiceNoOut;
    private javax.swing.JButton invoiceResetBtn;
    private javax.swing.JLabel issuedateOut;
    private javax.swing.JTextField itemTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel orangePanel;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JPanel purplePannel;
    private javax.swing.JTextField qytTxt;
    private javax.swing.JLabel totalOut;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
