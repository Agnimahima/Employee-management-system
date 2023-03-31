import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

//import com.formdev.flatlaf.FlatDarculaLaf;

public class LoginForm extends JFrame {
    Font mainFont = new Font("Serif", Font.BOLD, 20);
    Font mainFont2 = new Font("Serif", Font.BOLD, 18);
    JTextField tf1, tf2, tf3, tf4, tf44, tf5, tf9, tf99, tf101, tf102, tf103, tf111, tf112, tf113, tf121, tf122, tf123,
            tf131, tf132, tf133;
    JTextField tf141, tf142, tf143;
    JLabel lbLoginForm = new JLabel("Registration Form", SwingConstants.CENTER);
    JLabel l1 = new JLabel("NAME");
    JLabel l2 = new JLabel("DATE OF BIRTH");
    JLabel l3 = new JLabel("DATE OF JOINING");
    JLabel l4 = new JLabel("AGE");
    JLabel l5 = new JLabel("ADDRESS");
    JLabel l6 = new JLabel("CITY");
    JLabel l7 = new JLabel("STATE");
    JLabel l8 = new JLabel("COUNTRY");
    JLabel l9 = new JLabel("MOBILE");
    JLabel l10 = new JLabel("EDUCATION");
    JLabel l11 = new JLabel("COLLEGE");
    JLabel l12 = new JLabel("OBTAINING");
    JLabel l13 = new JLabel("OBTAINED");
    JLabel l14 = new JLabel("PERCENTAGE");
    // String city[]={"KANPUR","UNNAO","JAIPUR","BHOPAL"};
    // String state[]={"UTTAR PRADESH","RAJASTHAN","MADHYA PRADESH","MAHRASTRA"};
    JComboBox tf6 = new JComboBox<>(new String[] { "  -- Select city -- " });
    JComboBox tf7 = new JComboBox<>(new String[] { "  -- Select State -- " });
    JTextField tf8 = new JTextField();

    // public void initialize() {
    /**
     * @throws ClassNotFoundException
     */
    LoginForm() throws ClassNotFoundException {

        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        /*************** Form Panel ***************/

        lbLoginForm.setFont(mainFont);
        l1.setFont(mainFont2);
        l2.setFont(mainFont2);
        l3.setFont(mainFont2);
        l4.setFont(mainFont2);
        l5.setFont(mainFont2);
        l6.setFont(mainFont2);
        l7.setFont(mainFont2);
        l8.setFont(mainFont2);
        l9.setFont(mainFont2);
        l10.setFont(mainFont2);
        l11.setFont(mainFont2);
        l12.setFont(mainFont2);
        l13.setFont(mainFont2);
        l14.setFont(mainFont2);

        tf1 = new JTextField(30);
        tf2 = new JTextField(30);
        tf3 = new JTextField(30);
        tf4 = new JTextField(5);
         tf44 = new JTextField(20);
        tf5 = new JTextField(40);
        tf9 = new JTextField(10);
        tf8 = new JTextField(10);
        tf99 = new JTextField(10);
        tf101 = new JTextField();
        tf102 = new JTextField();
        tf103 = new JTextField();
        tf111 = new JTextField();
        tf112 = new JTextField();
        tf113 = new JTextField();
        tf121 = new JTextField();
        tf122 = new JTextField();
        tf123 = new JTextField();
        tf131 = new JTextField();
        tf132 = new JTextField();
        tf133 = new JTextField();
        tf141 = new JTextField();
        tf142 = new JTextField();
        tf143 = new JTextField();

        l1.setBounds(20, 100, 150, 20);
        l2.setBounds(20, 130, 150, 20);
        l3.setBounds(20, 160, 150, 20);
        l4.setBounds(20, 190, 150, 20);
        l5.setBounds(20, 220, 150, 20);
        l6.setBounds(20, 250, 150, 20);
        l7.setBounds(20, 280, 150, 20);
        l8.setBounds(20, 310, 150, 20);
        l9.setBounds(20, 340, 150, 20);
        l10.setBounds(20, 400, 120, 20);
        l11.setBounds(160, 400, 120, 20);
        l12.setBounds(300, 400, 120, 20);
        l13.setBounds(440, 400, 120, 20);
        l14.setBounds(580, 400, 100, 20);
        tf1.setBounds(200, 100, 200, 20);
        tf2.setBounds(200, 130, 200, 20);
        tf3.setBounds(200, 160, 200, 20);
        tf4.setBounds(200, 190, 200, 20);
        tf44.setBounds(430, 190, 100, 20);
        tf5.setBounds(200, 220, 200, 20);
        tf6.setBounds(200, 250, 150, 20);
        tf7.setBounds(200, 280, 150, 20);
        tf8.setBounds(200, 310, 150, 20);
        tf9.setBounds(200, 340, 200, 20);
        tf99.setBounds(430, 340, 100, 20);
        tf101.setBounds(20, 450, 120, 20);
        tf111.setBounds(160, 450, 120, 20);
        tf121.setBounds(300, 450, 120, 20);
        tf131.setBounds(440, 450, 120, 20);
        tf141.setBounds(580, 450, 120, 20);
        tf102.setBounds(20, 500, 120, 20);
        tf112.setBounds(160, 500, 120, 20);
        tf122.setBounds(300, 500, 120, 20);
        tf132.setBounds(440, 500, 120, 20);
        tf142.setBounds(580, 500, 120, 20);
        tf103.setBounds(20, 550, 120, 20);
        tf113.setBounds(160, 550, 120, 20);
        tf123.setBounds(300, 550, 120, 20);
        tf133.setBounds(440, 550, 120, 20);
        tf143.setBounds(580, 550, 120, 20);
        // l14.setBounds(590, 450,100, 20);
        // tf99.setBounds(430, 250,100, 20);
        // pfPassword = new JPasswordField();
        // pfPassword.setFont(mainFont);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        tf3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField3CaretUpdate(evt);
            }
        });
        tf6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        tf7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        tf9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        tf131.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        tf132.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });

        tf133.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField18KeyReleased(evt);
            }
        });
        c.add(l1);
        c.add(tf1);
        c.add(l2);
        c.add(tf2);
        c.add(l3);
        c.add(tf3);
        c.add(l4);
        c.add(tf4);
        //c.add(tf44);
        c.add(l5);
        c.add(tf5);
        c.add(l6);
        c.add(tf6);
        c.add(l7);
        c.add(tf7);
        c.add(l8);
        c.add(tf8);
        c.add(l9);
        c.add(tf9);
        c.add(tf99);
        c.add(l10);
        c.add(l11);
        c.add(l12);
        c.add(l13);
        c.add(l14);
        c.add(tf101);
        c.add(tf111);
        c.add(tf121);
        c.add(tf131);
        c.add(tf141);
        c.add(tf102);
        c.add(tf112);
        c.add(tf122);
        c.add(tf132);
        c.add(tf142);
        c.add(tf103);
        c.add(tf113);
        c.add(tf123);
        c.add(tf133);
        c.add(tf143);

        /*************** Buttons Panel ***************/
        JButton btn1 = new JButton("ADD");
        btn1.setFont(mainFont);
        JButton btn2 = new JButton("EDIT");
        btn2.setFont(mainFont);
        JButton btn3 = new JButton("DELETE");
        btn3.setFont(mainFont);
        JButton btn4 = new JButton("FIND");
        btn4.setFont(mainFont);
        JButton btn5 = new JButton("SAVE");
        btn5.setFont(mainFont);
        JButton btn6 = new JButton("CANCEL");
        btn6.setFont(mainFont);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TO DO add your handling code here:
                try {
                    String hostname = "localhost";
                    String sqlInstanceName = "DESKTOP-ESBPATO\\SQLEXPRESS";
                    String sqlDatabase = "model1";
                    String sqlUser = "sa";
                    String sqlPassword = "1234";
                    String name = tf1.getText();
                    String dob = tf2.getText();
                    String doj = tf3.getText();
                    String age = tf4.getText();
                    String mobile = tf9.getText();
                    String address = tf5.getText();
                    String city = (String) tf6.getSelectedItem();
                    String state = (String) tf7.getSelectedItem();
                    String country = tf8.getText();

                    String f_name = tf101.getText();
                    String f_college = tf111.getText();
                    String f_obt = tf121.getText();
                    String f_obtd = tf131.getText();
                    String f_per = tf141.getText();
                    String i_name = tf102.getText();
                    String i_college = tf112.getText();
                    String i_obt = tf122.getText();
                    String i_obtd = tf132.getText();
                    String i_per = tf142.getText();
                    String h_name = tf103.getText();
                    String h_college = tf113.getText();
                    String h_obt = tf123.getText();
                    String h_obtd = tf133.getText();
                    String h_per = tf143.getText();

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                            + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

                    Connection con = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
                    Statement st = con.createStatement();
                     st.executeUpdate( "insert into  master(NAME,DATE_OF_BIRTH,DATE_OF_JOINING,AGE,MOBILE,ADDRESS,CITY,STATE,COUNTRY,FIRST_STANDARD,FIRST_COLLEGE,FIRST_OBTAINING,FIRST_OBTAINED,FIRST_PERCENT,SECOND_STANDARD,SECOND_COLLEGE,SECOND_OBTAINING,SECOND_OBTAINED,SECOND_PERCENT,LAST_STANDARD, LAST_COLLEGE,LAST_OBTAINING,LAST_OBTAINED,LAST_PERCENT)values ('" + name + "','" + dob + "','" + doj + "','" + age + "','" + mobile + "','" + address + "','" + city + "','" + state + "','" + country + "','" + f_name + "','"
                    + f_college + "','" + f_obt + "','" + f_obtd + "','" + f_per + "','" + i_name
                     + "','" + i_college + "','" + i_obt + "','" + i_obtd + "','" + i_per + "','"
                     + h_name + "','" + h_college + "','" + h_obt + "','" + h_obtd + "','" + h_per
                     + "')");
                  //  st.executeUpdate("insert into master(name) values('" + name + "')");
                    JOptionPane.showMessageDialog(null, "data inserted");
                    setVisible(false);
                    new LoginForm().setVisible(true);

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("don't inserted data");
                }
            }
        });

        
        btn2.addActionListener(new ActionListener() {
            /*
             * (non-Javadoc)
             * 
             * @see
             * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
             */
            // baad me dekhna iskoooooooooooooooooooooooooooooooooooo
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String hostname = "localhost";
                    String sqlInstanceName = "LAPTOP-MVA8GBV5";
                    String sqlDatabase = "model1";
                    String sqlUser = "sa";
                    String sqlPassword = "1234";
                    String name = tf1.getText();

                    // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                            + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

                    Connection con = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from master where NAME='" + name + "'");
                    JOptionPane.showMessageDialog(null, "DATA READY FOR EDITING");
                    while (rs.next()) {
                        tf1.setText(rs.getString(2));
                        tf2.setText(rs.getString(3));
                        tf3.setText(rs.getString(4));
                        tf4.setText(rs.getString(5));
                        tf9.setText(rs.getString(6));
                        tf5.setText(rs.getString(7));
                        tf6.setSelectedItem(rs.getString(8));
                        tf7.setSelectedItem(rs.getString(9));
                        tf8.setText(rs.getString(10));
                        tf101.setText(rs.getString(11));
                        tf111.setText(rs.getString(12));
                        tf121.setText(rs.getString(13));
                        tf131.setText(rs.getString(14));
                        tf141.setText(rs.getString(15));
                        tf102.setText(rs.getString(16));
                        tf112.setText(rs.getString(17));
                        tf122.setText(rs.getString(18));
                        tf132.setText(rs.getString(19));
                        tf142.setText(rs.getString(20));
                        tf103.setText(rs.getString(21));
                        tf113.setText(rs.getString(22));
                        tf123.setText(rs.getString(23));
                        tf133.setText(rs.getString(24));
                        tf143.setText(rs.getString(25));

                    }
                } catch (SQLException ex) {
                    System.out.println("DATA NOT FOUND");
                }
            }
        });
        

        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TO DO Auto-generated method stub                                      
            // TO DO add your handling code here:
            try{
                String hostname="localhost";
                String sqlInstanceName="DESKTOP-ESBPATO\\SQLEXPRESS";
                String sqlDatabase="model1";
                String sqlUser="sa";
                String sqlPassword="1234";
                String name = tf1.getText();
            
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connectURL="jdbc:sqlserver://"+hostname+":1433"
                + ";instance="+sqlInstanceName+";databaseName="+sqlDatabase;
                
                 Connection con= DriverManager.getConnection(connectURL,sqlUser,sqlPassword);
                 Statement st= con.createStatement();
                 st.executeUpdate("delete from master where NAME='"+name+"'");
                 JOptionPane.showMessageDialog(null,"DATA DELETED");
            }catch(SQLException | ClassNotFoundException ex)
            {
                System.out.println("DATA NOT DELETED");
            }
        }
      
    });
     

        btn4.addActionListener(new ActionListener() {
            /*
             * (non-Javadoc)
             * 
             * @see
             * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
             */
            // baad me dekhna iskoooooooooooooooooooooooooooooooooooo
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String hostname = "localhost";
                    String sqlInstanceName = "LAPTOP-MVA8GBV5";
                    String sqlDatabase = "model1";
                    String sqlUser = "sa";
                    String sqlPassword = "1234";
                    String name = tf1.getText();

                    // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                            + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

                    Connection con = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from master where NAME='" + name + "'");
                    JOptionPane.showMessageDialog(null, "data fetched");
                    while (rs.next()) {
                        tf1.setText(rs.getString(2));
                        tf2.setText(rs.getString(3));
                        tf3.setText(rs.getString(4));
                        tf4.setText(rs.getString(5));
                        tf9.setText(rs.getString(6));
                        tf5.setText(rs.getString(7));
                        tf6.setSelectedItem(rs.getString(8));
                        tf7.setSelectedItem(rs.getString(9));
                        tf8.setText(rs.getString(10));
                        tf101.setText(rs.getString(11));
                        tf111.setText(rs.getString(12));
                        tf121.setText(rs.getString(13));
                        tf131.setText(rs.getString(14));
                        tf141.setText(rs.getString(15));
                        tf102.setText(rs.getString(16));
                        tf112.setText(rs.getString(17));
                        tf122.setText(rs.getString(18));
                        tf132.setText(rs.getString(19));
                        tf142.setText(rs.getString(20));
                        tf103.setText(rs.getString(21));
                        tf113.setText(rs.getString(22));
                        tf123.setText(rs.getString(23));
                        tf133.setText(rs.getString(24));
                        tf143.setText(rs.getString(25));

                    }
                } catch (SQLException ex) {
                    System.out.println("data not fecthed");
                }
            }
        });


        btn5.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {                                     
            // TODO update code code here:
            try{
                String hostname="localhost";
                String sqlInstanceName="DESKTOP-ESBPATO\\SQLEXPRESS";
                String sqlDatabase="model1";
                String sqlUser="sa";
                String sqlPassword="1234";
                String name = tf1.getText();
                String dob = tf2.getText();
                String doj = tf3.getText();
                String age = tf4.getText();
                String mobile = tf9.getText();
                String address = tf5.getText();
                String city = (String) tf6.getSelectedItem();
                String state = (String) tf7.getSelectedItem();
                String country = tf8.getText();

                String f_name = tf101.getText();
                String f_college = tf111.getText();
                String f_obt = tf121.getText();
                String f_obtd = tf131.getText();
                String f_per = tf141.getText();
                String i_name = tf102.getText();
                String i_college = tf112.getText();
                String i_obt = tf122.getText();
                String i_obtd = tf132.getText();
                String i_per = tf142.getText();
                String h_name = tf103.getText();
                String h_college = tf113.getText();
                String h_obt = tf123.getText();
                String h_obtd = tf133.getText();
                String h_per = tf143.getText();
            
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connectURL="jdbc:sqlserver://"+hostname+":1433"
                + ";instance="+sqlInstanceName+";databaseName="+sqlDatabase;
                
                 Connection con= DriverManager.getConnection(connectURL,sqlUser,sqlPassword);
                 Statement st= con.createStatement();
                 st.executeUpdate("update employee set DATE_OF_BIRTH='"+dob+"',DATE_OF_JOINING='"+doj+"',AGE='"+age+"'MOBILE='"+mobile+"',ADDRESS='"+address+"',CITY='"+city+"',STATE='"+state+"',COUNTRY='"+country+"',FIRST_STANDARD='"+f_name+"',FIRST_COLLEGE='"+f_college+"',FIRST_OBTAINING='"+f_obt+"',FIRST_OBTAINED='"+f_obtd+"',FIRST_PERCENT='"+f_per+"',SECOND_STANDARD='"+i_name+"',SECOND_COLLEGE='"+i_college+"',SECOND_OBTAINING='"+i_obt+"',SECOND_OBTAINED='"+i_obtd+"',SECOND_PERCENT='"+i_per+"',LAST_STANDARD='"+h_name+"',LAST_COLLEGE='"+h_college+"',LAST_OBTAINED='"+h_obt+"',LAST_OBTAINED='"+h_obtd+"',LAST_PERCENT='"+h_per+" where NAME='"+name+"'");
                 JOptionPane.showMessageDialog(null,"data updated");
                  setVisible(false);
                new LoginForm().setVisible(true);
            }catch(HeadlessException | ClassNotFoundException | SQLException ex)
            {
                System.out.println("not update");
            }
            
            
        }
            
                      

    });


        btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TO DO Auto-generated method stub
                dispose();
            }

        });

        // calling

        String hostname = "localhost";
        String sqlInstanceName = "DESKTOP-ESBPATO\\SQLEXPRESS";
        String sqlDatabase = "model1";
        String sqlUser = "sa";
        String sqlPassword = "1234";

        // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;
        try {
            Connection con = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
            PreparedStatement st = con.prepareStatement("Select city from stateinfo ");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String abc = rs.getString(1);
                tf6.addItem(abc);
            }
            System.out.println("City inserted");

        } catch (SQLException e) {
            System.out.println("CITY NOT INSERTED");
        }

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 5, 10, 0));
        buttonsPanel.setBounds(0, 0, 800, 40);
        // buttonsPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        buttonsPanel.add(btn1);
        buttonsPanel.add(btn2);
        buttonsPanel.add(btn3);
        buttonsPanel.add(btn4);
        buttonsPanel.add(btn5);
        buttonsPanel.add(btn6);
        c.add(buttonsPanel);

        /**************
         * Initialise the frame ***************
         * add(formPanel, BorderLayout.SOUTH);
         */
        // add( buttonsPanel, BorderLayout.NORTH);
        // c.setBackground(new java.awt.Color(255, 255, 255));
        // ((JComponent) c).setBorder(javax.swing.BorderFactory.createTitledBorder(new
        // javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "",
        // javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP,
        // new java.awt.Font("Arial", 0, 18))); // NOI18N
        ((JComponent) c).setToolTipText("");
        // c.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        // c.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        // c.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setTitle("DETAILS");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(800, 700);
        setMinimumSize(new Dimension(450, 350));
        // setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    /*
     * 
     * private User getAuthenticatedUser(String email, String password) {
     * User user = null;
     * final String hostname="localhost";
     * final String sqlInstanceName="DESKTOP-ESBPATO\\SQLEXPRESS";
     * final String sqlDatabase="model1";
     * final String USERNAME = "sa";
     * final String PASSWORD = "1234";
     * 
     * //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     * final String connectURL="jdbc:sqlserver://"+hostname+":1433"
     * + ";instance="+sqlInstanceName+";databaseName="+sqlDatabase;
     * 
     * try{
     * Connection conn = DriverManager.getConnection(connectURL, USERNAME,
     * PASSWORD);
     * // Connected to database successfully...
     * 
     * String sql = "SELECT * FROM users WHERE email=? AND password=?";
     * PreparedStatement preparedStatement = conn.prepareStatement(sql);
     * preparedStatement.setString(1, email);
     * preparedStatement.setString(2, password);
     * 
     * 
     * ResultSet resultSet = preparedStatement.executeQuery();
     * 
     * if (resultSet.next()) {
     * user = new User();
     * user.name = resultSet.getString("name");
     * user.email = resultSet.getString("email");
     * user.phone = resultSet.getString("phone");
     * user.address = resultSet.getString("address");
     * user.password = resultSet.getString("password");
     * }
     * 
     * preparedStatement.close();
     * conn.close();
     * 
     * }catch(Exception e){
     * System.out.println("Database connexion failed!");
     * }
     * 
     * 
     * return user;
     * }
     */
    String dman;

    private void first() throws ClassNotFoundException {
      //  User user = null;
        String hostname = "localhost";
        String sqlInstanceName = "DESKTOP-ESBPATO\\SQLEXPRESS";
        String sqlDatabase = "model1";
        String sqlUser = "sa";
        String sqlPassword = "1234";

        // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

        try {
            Connection con = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
            PreparedStatement st = con.prepareStatement("Select state from stateinfo where city='" + dman + "' ");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String abc = rs.getString(1);
                tf7.addItem(abc);
            }
            System.out.println("State inserted");
        } catch (SQLException e) {
            System.out.println("STATE NOT INSERTED");
        }
       // return user;
    }

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
        // TO DO add your handling code here:
        if (evt.getStateChange() == evt.SELECTED) {
            try {
                dman = tf6.getSelectedItem().toString();
                tf7.removeAllItems();
                first();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String getcounrty() throws ClassNotFoundException {
        String hostname = "localhost";
        String sqlInstanceName = "DESKTOP-ESBPATO\\SQLEXPRESS";
        String sqlDatabase = "model1";
        String sqlUser = "sa";
        String sqlPassword = "1234";
        String capital = "";

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

        try {
            Connection con = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
            PreparedStatement st = con.prepareStatement("Select country from stateinfo where state='" + cont + "'");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                capital = rs.getString(1);
            }
            System.out.println("country inserted");
        } catch (SQLException e) {
            System.out.println("country not inserted");
        }
        return capital;
    }

    String cont;

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
        if (evt.getStateChange() == evt.SELECTED) {
            try {
                cont = tf7.getSelectedItem().toString();
                tf8.setText(getcounrty());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // date of joining
    private void jTextField3CaretUpdate(javax.swing.event.CaretEvent evt) {
        // TODO add your handling code here:
        if (tf3.getText().equals("")) {
            tf3.setText("dd/mm/yyyy");
            tf4.setText("");
        } else {
            // dob
            String dob = tf2.getText();
            String arr[] = dob.split("/");
            int DD = Integer.parseInt(arr[0]);
            int mm = Integer.parseInt(arr[1]);
            int yyyy = Integer.parseInt(arr[2]);
            // doj
            String doj = tf3.getText();
            String arr1[] = doj.split("/");
            int DD1 = Integer.parseInt(arr1[0]);
            int mm1 = Integer.parseInt(arr1[1]);
            int yyyy1 = Integer.parseInt(arr1[2]);

            LocalDate d1 = LocalDate.of(yyyy, mm, DD);
            LocalDate d2 = LocalDate.of(yyyy1, mm1, DD1);

            Period p1 = Period.between(d1, d2);
            System.out.println("years:" + p1.getYears());
            int totalyears = p1.getYears();

            if (totalyears > 18 && yyyy > 1965) {
                tf4.setText(Integer.toString(totalyears));
                // jLabel17.setText("ELIGIBLE");
                JOptionPane.showMessageDialog(null, "YOU ARE ELIGIBLE");
            } else {
                tf4.setText(Integer.toString(totalyears));
                tf44.setText("YOU ARE NOT ELIGIBLE");

            }

        }
    }

    // next
    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {
        // TO DO add your handling code here:
        float percentage;
        float secored;
        float total_marks;

        secored = Float.parseFloat(tf121.getText());
        total_marks = Float.parseFloat(tf131.getText());
        percentage = (float) ((secored / total_marks) * 100);
        System.out.println("" + percentage);
        tf141.setText("" + percentage);
    }

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        float percentage;
        float secored;
        float total_marks;

        secored = Float.parseFloat(tf122.getText());
        total_marks = Float.parseFloat(tf132.getText());
        percentage = (float) ((secored / total_marks) * 100);
        System.out.println("" + percentage);
        tf142.setText("" + percentage);

    }

    private void jTextField18KeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        float percentage;
        float secored;
        float total_marks;

        secored = Float.parseFloat(tf123.getText());
        total_marks = Float.parseFloat(tf133.getText());
        percentage = (float) ((secored / total_marks) * 100);
        System.out.println("" + percentage);
        tf143.setText("" + percentage);

        double high = Double.parseDouble(tf121.getText());
        double inter = Double.parseDouble(tf122.getText());
        double hi_que = Double.parseDouble(tf123.getText());
        double high1 = Double.parseDouble(tf131.getText());
        double inter1 = Double.parseDouble(tf132.getText());
        double obtain = high + inter + hi_que;
        double total = high1 + inter1 + total_marks;
        double per = (int) ((obtain / total) * 100);

    }

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        String phone = tf9.getText();

        if (phone.matches("^[0-9]*$") && phone.length() == 10) {
            tf99.setText("Valid Phone no.");
        } else {

            tf99.setText("Invalid Phone no.");
        }

    }

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if (tf2.getText().equals("")) {
            tf2.setText("dd/mm/yyyy");
        }
    }

    // button2

    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * try {
         * UIManager.setLookAndFeel( new FlatDarculaLaf() );
         * } catch( Exception ex ) {
         * System.err.println( "Failed to initialize LaF" );
         * }
         */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new LoginForm().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        // LoginForm loginform = new LoginForm();
        // loginForm.initialize();
    }

}