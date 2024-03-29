
package banaonam.view;

import banaonam.model.chatlieu;
import banaonam.model.mau;
import banaonam.sevice.sanphamservice;
import banaonam.model.sanpham;
import banaonam.model.sanphamchitiet;
import banaonam.model.size;
import banaonam.sevice.ChatLieuService;
import banaonam.sevice.mauService;
import banaonam.sevice.sanphamchitietService;
import banaonam.sevice.sizeService;
import java.awt.Image;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class manhinhSanpham extends javax.swing.JInternalFrame {

    sanphamchitietService serviceSPCT = new sanphamchitietService();
    sanphamservice sanphamservice = new sanphamservice();
    sanphamchitietService sanphamchitietService = new sanphamchitietService();

    // Phân trang sản phẩm
    int soSP = sanphamservice.getCount();
    int trang = 1, tongTrang;

    // Phân trang sản phẩm chi tiết
    int page = 1, sumPage;

  
    public manhinhSanpham() {
        initComponents();
        setlaiborder();

        // lookText();
        combobox();
        //     lblMaspct.setVisible(false);
        // Phân trang sản 
        if (soSP / 3 == 0) {
            tongTrang = soSP / 3;
        } else {
            tongTrang = soSP / 3 + 1;
        }
        lblPage.setText("" + trang + "/" + tongTrang);
        chitietsp(false);
        LoadingTable();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnSanPham = new javax.swing.JPanel();
        txtngaytao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSua = new javax.swing.JToggleButton();
        btnCTSP = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        btnThem = new javax.swing.JToggleButton();
        txtTimSanPham = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxTimKiem = new javax.swing.JComboBox<>();
        jToggleButton5 = new javax.swing.JToggleButton();
        lblPage = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();
        lblTrang = new javax.swing.JLabel();
        jpnSPCT = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblQuanLySanPham = new javax.swing.JTable();
        pltong = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxCLV = new javax.swing.JComboBox<>();
        cbxMausac = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxSize = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnThemSize = new javax.swing.JButton();
        btnChatLieuVai = new javax.swing.JButton();
        btnMau = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSuaCTSP = new javax.swing.JButton();
        btnClearCTSP = new javax.swing.JButton();
        btnThemCTSP = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jToggleButton7 = new javax.swing.JToggleButton();
        lblPage1 = new javax.swing.JLabel();
        jToggleButton8 = new javax.swing.JToggleButton();
        lblMaspct = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 420));

        txtngaytao.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Mã sản phẩm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tên sản phẩm");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ngày tạo");

        tblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(666, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSua.setBackground(new java.awt.Color(0, 0, 0));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, -1));

        btnCTSP.setBackground(new java.awt.Color(0, 0, 0));
        btnCTSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCTSP.setForeground(new java.awt.Color(255, 255, 255));
        btnCTSP.setText("Chi tiết sản phẩm");
        btnCTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTSPActionPerformed(evt);
            }
        });
        jPanel3.add(btnCTSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, -1));

        btnThem.setBackground(new java.awt.Color(0, 0, 0));
        btnThem.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banaonam/icon/image icon/Image/Hinh/Search.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("tìm kiếm :");

        cbxTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sản phẩm", "Tên sản phẩm" }));

        jToggleButton5.setForeground(new java.awt.Color(238, 109, 14));
        jToggleButton5.setText("|<");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setForeground(new java.awt.Color(238, 109, 14));
        jToggleButton6.setText(">|");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnSanPhamLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtngaytao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(220, 220, 220)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnSanPhamLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxTimKiem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtTimSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(319, 319, 319)
                                .addComponent(jToggleButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnSanPhamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSanPhamLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnSanPhamLayout.createSequentialGroup()
                        .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimSanPham))
                    .addComponent(jToggleButton6)
                    .addComponent(lblPage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5)
                    .addComponent(lblTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jTabbedPane1.addTab("Sản Phẩm", jpnSanPham);

        jpnSPCT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblQuanLySanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm ", "Tên Sản Phẩm", "Mã CTSP", "size", "Màu Sắc", "Chất Liệu Vải", "Đơn Giá", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLySanPhamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblQuanLySanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(709, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 243, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        pltong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pltong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Size");
        pltong.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setText("tên sản phẩm");
        pltong.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel12.setText("Chất liệu vải");
        pltong.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        pltong.add(cbxCLV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, -1));

        pltong.add(cbxMausac, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 89, 181, -1));

        jLabel2.setText("mã sản phẩm");
        pltong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        pltong.add(txtTenSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, -1));

        txtMaSanPham.setEditable(false);
        pltong.add(txtMaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, -1));

        jLabel13.setText("đơn giá");
        pltong.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 23, -1, -1));

        pltong.add(cbxSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 180, -1));
        pltong.add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 54, 180, -1));
        pltong.add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 20, 180, -1));

        jLabel15.setText("màu sắc");
        pltong.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 92, 47, -1));

        jLabel14.setText("số lượng");
        pltong.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 57, -1, -1));

        btnThemSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banaonam/icon/image icon/Image/Hinh/Add.png"))); // NOI18N
        btnThemSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSizeActionPerformed(evt);
            }
        });
        pltong.add(btnThemSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 21, 23));

        btnChatLieuVai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banaonam/icon/image icon/Image/Hinh/Add.png"))); // NOI18N
        btnChatLieuVai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatLieuVaiActionPerformed(evt);
            }
        });
        pltong.add(btnChatLieuVai, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 21, 22));

        btnMau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banaonam/icon/image icon/Image/Hinh/Add.png"))); // NOI18N
        btnMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMauActionPerformed(evt);
            }
        });
        pltong.add(btnMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 21, 23));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSuaCTSP.setBackground(new java.awt.Color(0, 0, 0));
        btnSuaCTSP.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnSuaCTSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaCTSP.setText("Sửa");
        btnSuaCTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTSPActionPerformed(evt);
            }
        });
        jPanel5.add(btnSuaCTSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 90, -1));

        btnClearCTSP.setBackground(new java.awt.Color(0, 0, 0));
        btnClearCTSP.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnClearCTSP.setForeground(new java.awt.Color(255, 255, 255));
        btnClearCTSP.setText("Clear");
        btnClearCTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCTSPActionPerformed(evt);
            }
        });
        jPanel5.add(btnClearCTSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, -1));

        btnThemCTSP.setBackground(new java.awt.Color(0, 0, 0));
        btnThemCTSP.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnThemCTSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemCTSP.setText("Thêm");
        btnThemCTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTSPActionPerformed(evt);
            }
        });
        jPanel5.add(btnThemCTSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton7.setForeground(new java.awt.Color(238, 109, 14));
        jToggleButton7.setText("|<");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setForeground(new java.awt.Color(238, 109, 14));
        jToggleButton8.setText(">|");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        lblMaspct.setText("1");

        javax.swing.GroupLayout jpnSPCTLayout = new javax.swing.GroupLayout(jpnSPCT);
        jpnSPCT.setLayout(jpnSPCTLayout);
        jpnSPCTLayout.setHorizontalGroup(
            jpnSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSPCTLayout.createSequentialGroup()
                .addGroup(jpnSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnSPCTLayout.createSequentialGroup()
                        .addComponent(pltong, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnSPCTLayout.createSequentialGroup()
                        .addGroup(jpnSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnSPCTLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jToggleButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton8))
                            .addGroup(jpnSPCTLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblMaspct)))
                        .addGap(173, 173, 173)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnSPCTLayout.setVerticalGroup(
            jpnSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSPCTLayout.createSequentialGroup()
                .addGroup(jpnSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnSPCTLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnSPCTLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(pltong, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnSPCTLayout.createSequentialGroup()
                        .addComponent(lblMaspct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jpnSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton8)
                            .addComponent(lblPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("sản phẩm chi tiết", jpnSPCT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        themsanpham();

        lblPage.setText("" + trang + "/" + tongTrang);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        suasanpham();

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnCTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTSPActionPerformed
        chitietsp(true);
    }//GEN-LAST:event_btnCTSPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtTimSanPham.setText("");
        loadingtableSanpham(sanphamservice.getallsanpham(trang));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtTimSanPham.getText().trim().length() <= 0) {
            JOptionPane.showMessageDialog(this, "vui lòng nhập thông tin để tìm");
            return;
        }
        timkiemSP();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        mouclickSanPham();
        loadingtableSanphamchitiet();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThemCTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTSPActionPerformed
        sanphamchitietService spctSer = new sanphamchitietService();
        boolean check = false;

        for (sanphamchitiet object : sanphamchitietService.getallsanphamchitiet()) {
            if (object.getMASP().equalsIgnoreCase(txtMaSP.getText())) {

                //             if(txt)
                if (object.getSIZE().equals(cbxSize.getSelectedItem().toString()) && object.getMau().equals(cbxMausac.getSelectedItem().toString()) && object.getChatlieu().equals(cbxCLV.getSelectedItem().toString())) {
                    JOptionPane.showMessageDialog(this, "thêm thất bại ,loại sản phẩm này đã tồn tại rồi");
                    return;

                }
            }
        }
        int tron = JOptionPane.showConfirmDialog(this, "bạn có chắc muốn thêm chi tiết sản phẩm này không ?", "thêm CTSP", JOptionPane.YES_NO_OPTION);
        if (tron == 1) {
            return;
        } else {

            if (Integer.valueOf(txtSoLuong.getText().trim().length()) <= 0 || Integer.valueOf(txtDonGia.getText().trim().length()) <= 0) {
                JOptionPane.showMessageDialog(this, "không để trống");
                loadingtableSanphamchitiet();
                return;
            }
            if (Integer.valueOf(txtSoLuong.getText()) <= 0 || Integer.valueOf(txtDonGia.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "nhập sai số lượng , hãy nhập >= 1");
                loadingtableSanphamchitiet();
                return;
            }
            Pattern p = Pattern.compile("^[0-9]");
            if (p.matcher(txtSoLuong.getText()).find() && p.matcher(txtDonGia.getText()).find()) {
                sanphamchitiet spct = laydulieuSPCT();
                if (spctSer.addSPCT(spct) != null) {
                    JOptionPane.showMessageDialog(this, "thêm thành công");
                    loadingtableSanphamchitiet();
                } else {
                    JOptionPane.showMessageDialog(this, "thêm thất bại");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "hãy nhập số vào số lượng");
                return;
            }

        }


    }//GEN-LAST:event_btnThemCTSPActionPerformed

    private void btnSuaCTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTSPActionPerformed
        boolean check = false;
        int ma = Integer.valueOf(lblMaspct.getText());
        for (sanphamchitiet object : sanphamchitietService.getallsanphamchitiet()) {
            if (object.getMASP().equalsIgnoreCase(txtMaSP.getText())) {
                String maspct = String.valueOf(object.getMaspct());
                if (object.getSIZE().equals(cbxSize.getSelectedItem().toString()) && object.getMau().equals(cbxMausac.getSelectedItem().toString()) && object.getChatlieu().equals(cbxCLV.getSelectedItem().toString())) {
                    if (object.getMaspct() != ma) {
                        JOptionPane.showMessageDialog(this, "sửa thất bại ,loại sản phẩm này đã tồn tại rồi");
                        return;
                    }
                }
            }

        }
        int tron = JOptionPane.showConfirmDialog(this, "bạn có chắc muốn sửa chi tiết sản phẩm này không ?", "thêm CTSP", JOptionPane.YES_NO_OPTION);
        if (tron == 1) {
            return;
        } else {
            sanphamchitietService spctSer = new sanphamchitietService();
            if (Integer.valueOf(txtSoLuong.getText().trim().length()) <= 0 || Double.valueOf(txtDonGia.getText().trim().length()) <= 0) {
                JOptionPane.showMessageDialog(this, "không để trống");
                loadingtableSanphamchitiet();
                return;
            }

            Pattern p = Pattern.compile("^[0-9]");
            if (p.matcher(txtSoLuong.getText()).find() || p.matcher(txtDonGia.getText()).find()) {
                sanphamchitiet spct = laydulieuSPCTSua();
                if (Integer.valueOf(txtSoLuong.getText()) <= 0 || Double.valueOf(txtDonGia.getText()) <= 0) {
                    JOptionPane.showMessageDialog(this, "nhập sai số lượng , hãy nhập >= 1");
                    loadingtableSanphamchitiet();
                    return;
                }
                if (spctSer.UPDATESPCT(spct) != null) {
                    JOptionPane.showMessageDialog(this, "sửa thành công");
                    loadingtableSanphamchitiet();
                } else {
                    System.out.println("sửa không thành công");
                }
            } else {
                JOptionPane.showMessageDialog(this, "hãy nhập số vào số lượng");
                return;
            }

        }

    }//GEN-LAST:event_btnSuaCTSPActionPerformed

    private void btnClearCTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCTSPActionPerformed
        txtDonGia.setText("");
        txtSoLuong.setText("");
        cbxCLV.setSelectedIndex(0);
        cbxMausac.setSelectedIndex(0);
        cbxSize.setSelectedIndex(0);
        loadingtableSanphamchitiet();
        System.out.println("");
    }//GEN-LAST:event_btnClearCTSPActionPerformed
    String duongDan = "ảnh";
    private void btnChatLieuVaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatLieuVaiActionPerformed
        String chatlieu = JOptionPane.showInputDialog(this, "nhập chất liệu mới ");
        ChatLieuService chatlieuser = new ChatLieuService();
        boolean check = false;
        for (chatlieu object : chatlieuser.getallchatlieu()) {
            if (object.getTenChatLieu().equalsIgnoreCase(chatlieu)) {
                check = true;
            }
        }
        Pattern p = Pattern.compile("^[a-zA-Z]");
        if (chatlieu.trim().length() <= 0) {
            JOptionPane.showMessageDialog(this, "không để trống");
        } else {
            if (p.matcher(chatlieu).find()) {
                if (check == true) {
                    JOptionPane.showMessageDialog(this, "chất liệu này đã tồn tại rồi");
                } else {
                    if (chatlieuser.addchatlieu(chatlieu) != null) {
                        JOptionPane.showMessageDialog(this, "thêm thành công");
                        addvaocbxCL();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "chỉ được nhập chữ và không quá 10 ký tự");
            }

        }
    }//GEN-LAST:event_btnChatLieuVaiActionPerformed

    private void btnThemSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSizeActionPerformed
        String size = JOptionPane.showInputDialog(this, "nhập size mới ");
        sizeService sizeser = new sizeService();
        boolean check = false;
        for (size object : sizeser.getallchatlieu()) {
            if (object.getTenSize().equalsIgnoreCase(size)) {
                check = true;
            }
        }
        Pattern p = Pattern.compile("^[a-zA-Z]");
        if (size.trim().length() <= 0) {
            JOptionPane.showMessageDialog(this, "không để trống");
        } else {
            if (p.matcher(size).find()) {
                if (check == true) {
                    JOptionPane.showMessageDialog(this, "size này đã tồn tại rồi");
                } else {
                    if (sizeser.addsize(size) != null) {
                        JOptionPane.showMessageDialog(this, "thêm thành công");
                        addvaocbxsize();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "chỉ được nhập chữ và không quá 10 ký tự");
            }

        }
    }//GEN-LAST:event_btnThemSizeActionPerformed

    private void btnMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMauActionPerformed
        String mausac = JOptionPane.showInputDialog(this, "nhập màu mới ");
        mauService mauser = new mauService();
        boolean check = false;
        for (mau object : mauser.getallchatlieu()) {
            if (object.getTenMau().equalsIgnoreCase(mausac)) {
                check = true;
            }
        }
        Pattern p = Pattern.compile("^[a-zA-Z]");
        if (mausac.trim().length() <= 0) {
            JOptionPane.showMessageDialog(this, "không để trống");
        } else {
            if (p.matcher(mausac).find()) {
                if (check == true) {
                    JOptionPane.showMessageDialog(this, "màu này đã tồn tại rồi");
                } else {
                    if (mauser.addmau(mausac) != null) {
                        JOptionPane.showMessageDialog(this, "thêm thành công");
                        addvaocbxMau();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "chỉ được nhập chữ và không quá 10 ký tự");
            }

        }
    }//GEN-LAST:event_btnMauActionPerformed

    private void tblQuanLySanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLySanPhamMouseClicked
        mouclickSanPhamchitiet();
    }//GEN-LAST:event_tblQuanLySanPhamMouseClicked

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:

        if (trang <= 1) {
            trang = 1;
        } else {
            trang--;
        }

        loadingtableSanpham(sanphamservice.getallsanpham(trang));
        lblPage.setText("" + trang + "/" + tongTrang);

    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:

        if (trang >= tongTrang) {
            trang = tongTrang;
        } else {
            trang++;
        }
        lblPage.setText("" + trang + "/" + tongTrang);
        loadingtableSanpham(sanphamservice.getallsanpham(trang));

    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:

        if (page <= 1) {
            page = 1;
        } else {
            page--;
        }

        fillTableSP(serviceSPCT.getallsanphamchitiet(page, txtMaSP.getText()));
        lblPage1.setText("" + page + "/" + sumPage);
        System.out.println("" + page);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:

        if (page >= sumPage) {
            page = sumPage;
        } else {
            page++;
        }
        lblPage1.setText("" + page + "/" + sumPage);
        fillTableSP(serviceSPCT.getallsanphamchitiet(page, txtMaSP.getText()));
        System.out.println("" + sumPage);
    }//GEN-LAST:event_jToggleButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCTSP;
    private javax.swing.JButton btnChatLieuVai;
    private javax.swing.JButton btnClearCTSP;
    private javax.swing.JButton btnMau;
    private javax.swing.JToggleButton btnSua;
    private javax.swing.JButton btnSuaCTSP;
    private javax.swing.JToggleButton btnThem;
    private javax.swing.JButton btnThemCTSP;
    private javax.swing.JButton btnThemSize;
    private javax.swing.JComboBox<String> cbxCLV;
    private javax.swing.JComboBox<String> cbxMausac;
    private javax.swing.JComboBox<String> cbxSize;
    private javax.swing.JComboBox<String> cbxTimKiem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JPanel jpnSPCT;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JLabel lblMaspct;
    private javax.swing.JLabel lblPage;
    private javax.swing.JLabel lblPage1;
    private javax.swing.JLabel lblTrang;
    private javax.swing.JPanel pltong;
    private javax.swing.JTable tblQuanLySanPham;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    public static javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    public static javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTimSanPham;
    private javax.swing.JTextField txtngaytao;
    // End of variables declaration//GEN-END:variables

    public void loadingtableSanpham(List<sanpham> lisr) {
        DefaultTableModel dtm = (DefaultTableModel) tblSanPham.getModel();
        dtm.setRowCount(0);
        for (sanpham object : lisr) {
            Object[] obj = {
                object.getMasp(),
                object.getTensp(),
                object.getNgaytao(),};
            dtm.addRow(obj);
        }
    }

    public void chitietsp(boolean ht) {

        JDialog p = new JDialog();
        p.setSize(900, 410);
        p.setVisible(ht);
        p.add(jpnSPCT);
        p.setLocationRelativeTo(null);

        fillTableSP(sanphamchitietService.getallsanphamchitiet(1, txtMaSP.getText()));
        int soSPCT = sanphamchitietService.getCount(txtMaSP.getText());
        if (soSPCT / 3 == 0) {
            sumPage = soSPCT / 3 + 1;
        } else {
            sumPage = soSPCT / 3;
            System.out.println(" " + sumPage);
            System.out.println(" " + soSPCT / 3);
        }
        lblPage1.setText("" + page + "/" + sumPage);

    }

    public void loadingtableSanphamchitiet() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblQuanLySanPham.getModel();
            dtm.setRowCount(0);
            for (sanphamchitiet object : sanphamchitietService.getallsanphamchitiet()) {
                if (object.getMASP().equalsIgnoreCase(txtMaSP.getText())) {
                    Object obj[] = {
                        object.getMASP(),
                        object.getTensp(),
                        object.getMaspct(),
                        object.getSIZE(),
                        object.getMau(),
                        object.getChatlieu(),
                        object.getGIA(),
                        object.getSOLUONG(),};
                    dtm.addRow(obj);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void mouclickSanPham() {
        int row = tblSanPham.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMaSP.setText(tblSanPham.getValueAt(row, 0).toString());
        txtTenSP.setText(tblSanPham.getValueAt(row, 1).toString());
        txtngaytao.setText(tblSanPham.getValueAt(row, 2).toString());
        txtMaSanPham.setText(tblSanPham.getValueAt(row, 0).toString());
        txtTenSanPham.setText(tblSanPham.getValueAt(row, 1).toString());
    }

    private void mouclickSanPhamchitiet() {
        int row = tblQuanLySanPham.getSelectedRow();
        sanphamchitiet spct = sanphamchitietService.getallsanphamchitiet().get(row);
        if (row == -1) {
            return;
        }

        txtTenSanPham.setText(tblQuanLySanPham.getValueAt(row, 0).toString());
        txtMaSanPham.setText(tblQuanLySanPham.getValueAt(row, 1).toString());
        lblMaspct.setText(tblQuanLySanPham.getValueAt(row, 2).toString());
        cbxCLV.setSelectedItem(tblQuanLySanPham.getValueAt(row, 5).toString());
        cbxSize.setSelectedItem(tblQuanLySanPham.getValueAt(row, 3).toString());
        cbxMausac.setSelectedItem(tblQuanLySanPham.getValueAt(row, 4).toString());
        txtDonGia.setText(tblQuanLySanPham.getValueAt(row, 6).toString());
        txtSoLuong.setText(tblQuanLySanPham.getValueAt(row, 7).toString());

       

    }

    public sanpham laydulieuSP() {
        sanpham sp = new sanpham();
        try {

            LocalDate today = LocalDate.now();

            sp.setMasp(txtMaSP.getText());
            sp.setNgaytao(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            sp.setTensp(txtTenSP.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "có lỗi tại phần sản phẩm");
        }

        return sp;
    }

    public sanphamchitiet laydulieuSPCT() {
        sanphamchitiet SPCT = new sanphamchitiet();
        try {
            SPCT.setMASP(txtMaSP.getText());
            SPCT.setTensp(txtTenSP.getText());
            SPCT.setSOLUONG(Integer.parseInt(txtSoLuong.getText()));
            SPCT.setGIA(Integer.parseInt(txtDonGia.getText()));
            SPCT.setMau(String.valueOf(timMaMau(cbxMausac.getSelectedItem().toString())));
            SPCT.setSIZE(String.valueOf(timMaSize(cbxSize.getSelectedItem().toString())));
            SPCT.setChatlieu(String.valueOf(timMaCL(cbxCLV.getSelectedItem().toString())));
            SPCT.setThanhtoan("chưa thanh toán");
            SPCT.setLinkAnh(duongDan);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return SPCT;
    }

    public sanphamchitiet laydulieuSPCTSua() {
        sanphamchitiet SPCT = new sanphamchitiet();
        try {
            SPCT.setMASP(txtMaSP.getText());
            SPCT.setMaspct(Integer.parseInt(lblMaspct.getText()));
            SPCT.setTensp(txtTenSanPham.getText());
            SPCT.setSOLUONG(Integer.parseInt(txtSoLuong.getText()));
            SPCT.setGIA(Integer.parseInt(txtDonGia.getText()));
            SPCT.setMau(String.valueOf(timMaMau(cbxMausac.getSelectedItem().toString())));
            SPCT.setSIZE(String.valueOf(timMaSize(cbxSize.getSelectedItem().toString())));
            SPCT.setChatlieu(String.valueOf(timMaCL(cbxCLV.getSelectedItem().toString())));
            SPCT.setThanhtoan("chưa thanh toán");
            SPCT.setLinkAnh(duongDan);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return SPCT;
    }

    public void addvaocbxsize() {
        sizeService sizeser = new sizeService();

        cbxSize.removeAllItems();
        for (size object : sizeser.getallchatlieu()) {
            cbxSize.addItem(object.getTenSize());
        }

    }

    public void addvaocbxCL() {
        cbxCLV.removeAllItems();
        ChatLieuService clser = new ChatLieuService();

        for (chatlieu object : clser.getallchatlieu()) {
            cbxCLV.addItem(object.getTenChatLieu());
        }
    }

    public void addvaocbxMau() {
        cbxMausac.removeAllItems();
        mauService mauser = new mauService();
        for (mau object : mauser.getallchatlieu()) {
            cbxMausac.addItem(object.getTenMau());

        }
    }

    private void combobox() {
        addvaocbxsize();
        addvaocbxCL();
        addvaocbxMau();
    }

    private void LoadingTable() {
        loadingtableSanpham(sanphamservice.getallsanpham(trang));
        //loadingtableSanphamchitiet();
    }

//
    public Integer timMaMau(String tenmau) {
        Integer mamau = null;
        mauService mau = new mauService();

        for (mau object : mau.getallchatlieu()) {
            if (object.getTenMau().equalsIgnoreCase(tenmau)) {
                mamau = object.getMaMau();
            }
        }
        return mamau;
    }

    public Integer timMaSize(String tenSize) {
        Integer maSize = null;
        sizeService size = new sizeService();

        for (size object : size.getallchatlieu()) {
            if (object.getTenSize().equalsIgnoreCase(tenSize)) {
                maSize = object.getMaSize();
            }
        }
        return maSize;
    }
//

    public Integer timMaCL(String tenCL) {
        Integer maCL = null;
        ChatLieuService Cl = new ChatLieuService();

        for (chatlieu object : Cl.getallchatlieu()) {
            if (object.getTenChatLieu().equalsIgnoreCase(tenCL)) {
                maCL = object.getMaChatLieu();
            }
        }
        return maCL;
    }

    public void timkiemSP() {

        if (cbxTimKiem.getSelectedIndex() == 0) {
            DefaultTableModel dtm = (DefaultTableModel) tblSanPham.getModel();
            dtm.setRowCount(0);
            for (sanpham object : sanphamservice.getallsanpham()) {
                if (txtTimSanPham.getText().equalsIgnoreCase(object.getMasp())) {
                    Object[] obj = {
                        object.getMasp(),
                        object.getTensp(),
                        object.getNgaytao(),};
                    dtm.addRow(obj);
                }
            }
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblSanPham.getModel();
            dtm.setRowCount(0);

            for (sanpham object : sanphamservice.getallsanpham()) {
                
                String ten = object.getTensp();
                String normalized = Normalizer.normalize(ten, Normalizer.Form.NFD);
                Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
                String output = pattern.matcher(normalized).replaceAll("");
                System.out.print(ten);
                if (txtTimSanPham.getText().equalsIgnoreCase(output)||txtTimSanPham.getText().equalsIgnoreCase(object.getTensp())) {
                    Object[] obj = {
                        object.getMasp(),
                        object.getTensp(),
                        object.getNgaytao()};
                    dtm.addRow(obj);
                }
            }
        }
    }

    private void setlaiborder() {
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setSize(900, 460);
    }

    private void themsanpham() {
        Boolean check = false;
        sanpham sp = laydulieuSP();
        int tron = JOptionPane.showConfirmDialog(this, "bạn có muốn thêm không ?", "thông báo", JOptionPane.YES_NO_OPTION);
        if (tron == 1) {
            return;
        }
        if (txtTenSP.getText().trim().length() <= 0 || txtMaSP.getText().trim().length() <= 0 /*|| txtngaytao.getText().trim().length() <= 0*/) {
            JOptionPane.showMessageDialog(this, "không để trống");
            return;
        } else {
            for (sanpham object : sanphamservice.getallsanpham()) {
                if (object.getMasp().equalsIgnoreCase(txtMaSP.getText())) {
                    check = true;
                }
            }
            if (check == true) {
                JOptionPane.showMessageDialog(this, "mã sản phẩn " + " " + txtMaSP.getText() + " " + "đã tồn tại !");
            } else {
                if (sanphamservice.addSanPham(sp) != null) {
                    JOptionPane.showMessageDialog(this, "thêm sản phẩm thành công");

                    loadingtableSanpham(sanphamservice.getallsanpham(trang));
                } else {
                    JOptionPane.showMessageDialog(this, "thêm sản phẩm thất bại");
                }
            }
        }
    }

    private void suasanpham() {
        sanpham sp = laydulieuSP();
        int tron = JOptionPane.showConfirmDialog(this, "bạn có muốn sửa không ?", "thông báo", JOptionPane.YES_NO_OPTION);
        if (tron == 1) {
            return;
        }
        if (txtTenSP.getText().trim().length() <= 0 || txtMaSP.getText().trim().length() <= 0 || txtngaytao.getText().trim().length() <= 0) {
            JOptionPane.showMessageDialog(this, "không để trống");
            return;
        } else {

            if (sanphamservice.UpdateSanPham(sp) != null) {
                JOptionPane.showMessageDialog(this, "sửa sản phẩm thành công");
                loadingtableSanpham(sanphamservice.getallsanpham(trang));
            } else {
                JOptionPane.showMessageDialog(this, "sửa sản phẩm thất bại");
            }

        }
    }

    private void lookText() {
        txtngaytao.setEnabled(false);
        txtMaSanPham.setEnabled(false);
        txtTenSanPham.setEnabled(false);
    }

    private void fillTableSP(List<sanphamchitiet> list) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblQuanLySanPham.getModel();
        model.setRowCount(0);
        int i = 1;
        for (sanphamchitiet x : list) {

            Object obj[] = {
                x.getMASP(),
                x.getTensp(),
                x.getMaspct(),
                x.getSIZE(),
                x.getMau(),
                x.getChatlieu(),
                x.getGIA(),
                x.getSOLUONG(),};
            model.addRow(obj);

        }
    }
}
