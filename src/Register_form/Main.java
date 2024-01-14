
package Register_form;
import com.sun.jdi.connect.spi.Connection;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Desktop;
import java.net.URISyntaxException;
//Database
import java.awt.Image;
import java.sql.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame{
    static boolean firstTime = true;

    static java.sql.Connection con;
    //Constructor
    public Main() {
        createConnection();
    }

    void createConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payment", "root", "changeme");
            System.out.println("Success!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void main(String[] args) throws SQLException {

        Main mainObject = new Main();

        //Code for Database

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
        System.out.println("MySQL JDBC Driver Registered!");

        Connection connection= null;

        try {
            connection= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project_register_itc", "root", "");
            System.out.println("Connection completed");
        } catch (Exception e) {
            System.out.println("Connection Failed! Check coutput console");
            e.printStackTrace();
        }

        if(connection !=null){
            System.out.println("Connected to the database!");
        }else{
            System.out.println("Failed to make connection!");
        }


        //Login Frame

        JFrame flogin= new JFrame();
        Font font_login= new Font("Arial", Font.BOLD, 18);

        ImageIcon background = new ImageIcon(Main.class.getResource("background_login.png"));
        Image background_logo = background.getImage().getScaledInstance(1540, 900, Image.SCALE_DEFAULT);

        ImageIcon backgroundlogo = new ImageIcon(background_logo);

        JLabel background_label = new JLabel("", background, JLabel.CENTER);
        background_label.setIcon(backgroundlogo);
        background_label.setFont(font_login);
        background_label.setBounds(0, 0, 1540, 900);



        JLabel login_label= new JLabel("Login");
        login_label.setFont(new Font("Times New Roman", Font.BOLD, 28));
        login_label.setBounds(200, 20, 100, 30);

        JLabel username_label= new JLabel("User name");
        username_label.setFont(new Font("Arial", Font.CENTER_BASELINE, 18));
        username_label.setBounds(30, 70, 100, 20);
        username_label.setForeground(new Color(203,200,200));

        JTextField txt_username= new JTextField();
        txt_username.setFont(new Font("Arial",Font.BOLD, 18));
        Border border= BorderFactory.createLineBorder(new Color(203,200,200), 1);
        txt_username.setBorder(border);
        txt_username.setBounds(30, 100, 400, 40);
        txt_username.setForeground(Color.black);

        JLabel password_label= new JLabel("Password");
        password_label.setFont(new Font("Arial", Font.CENTER_BASELINE, 18));
        password_label.setBounds(30, 150, 100, 20);
        password_label.setForeground(new Color(203,200,200));

        JPasswordField txt_password= new JPasswordField();
        txt_password.setFont(new Font("Arial",Font.BOLD, 18));
        txt_password.setBorder(border);
        txt_password.setBounds(30, 180, 400, 40);
        txt_password.setForeground(Color.black);


        JLabel forget_label= new JLabel("Forgot password?");
        forget_label.setFont(new Font("Arial", Font.CENTER_BASELINE, 18));
        forget_label.setBounds(300, 230, 200, 20);
        forget_label.setForeground(new Color(169,163,163));

        JButton btn_login= new JButton("Login");
        btn_login.setForeground(Color.white);
        btn_login.setBounds(50, 270, 350, 40);
        btn_login.setBackground(new Color(140, 255, 140));
        btn_login.setBorder(null);

        //Button login

        btn_login.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseEntered(MouseEvent e) {
                btn_login.setBackground(Color.green);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_login.setBackground(Color.blue);
            }

        });

        JLabel signup_label= new JLabel("Not a member? Sign up with");
        signup_label.setBounds(110, 340, 300, 30);
        signup_label.setForeground(Color.red);
        signup_label.setFont(font_login);

        ImageIcon facebook = new ImageIcon(Main.class.getResource("icons8-facebook-48.png"));
        Image facebook_logo = facebook.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);

        ImageIcon facebooklogo = new ImageIcon(facebook_logo);

        JLabel facebook_label = new JLabel("", facebook, JLabel.CENTER);
        facebook_label.setIcon(facebooklogo);
        facebook_label.setBounds(110, 400, 40,40);



        ImageIcon google = new ImageIcon(Main.class.getResource("icons8-google-48.png"));
        Image google_logo = google.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);

        ImageIcon googlelogo = new ImageIcon(google_logo);

        JLabel google_label = new JLabel("", google, JLabel.CENTER);
        google_label.setIcon(googlelogo);
        google_label.setBounds(200, 400, 40, 40);


        ImageIcon twitter = new ImageIcon(Main.class.getResource("icons8-twitter-48.jpg"));
        Image twitter_logo = twitter.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);

        ImageIcon twitterlogo = new ImageIcon(twitter_logo);

        JLabel twitter_label = new JLabel("", twitter, JLabel.CENTER);
        twitter_label.setIcon(twitterlogo);
        twitter_label.setBounds(290, 400, 40, 40);



        JPanel p_containlogin= new JPanel();
        p_containlogin.setVisible(true);
        p_containlogin.setBounds(520, 100,470, 500);
        p_containlogin.setBackground(Color.white);
        p_containlogin.setLayout(null);

        p_containlogin.add(login_label);
        p_containlogin.add(username_label);
        p_containlogin.add(txt_username);
        p_containlogin.add(password_label);
        p_containlogin.add(txt_password);
        p_containlogin.add(forget_label);
        p_containlogin.add(btn_login);
        p_containlogin.add(signup_label);
        p_containlogin.add(facebook_label);
        p_containlogin.add(google_label);
        p_containlogin.add(twitter_label);

        background_label.add(p_containlogin);

        JPanel p_login= new JPanel();
        p_login.setSize(1540, 900);
        p_login.setVisible(true);


        p_login.add(background_label);


        flogin.setSize(1540, 900);
        flogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flogin.setLocationRelativeTo(null);
        flogin.setResizable(false);
        flogin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        flogin.setBackground(Color.cyan);
        flogin.setVisible(true);

        flogin.add(p_login);

        JFrame fmain= new JFrame();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");

        Font font= new Font("Time New Roman", Font.BOLD, 20);
        //Header
        ImageIcon iconITC_logo = new ImageIcon(Main.class.getResource("itc_logo.png"));
        Image imageITC_logo = iconITC_logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        ImageIcon itc_logo = new ImageIcon(imageITC_logo);

        JLabel headerLabel = new JLabel("       INSTITUTE OF TECHNOLOGY OF CAMBODIA ", iconITC_logo, JLabel.CENTER);
        headerLabel.setIcon(itc_logo);
        headerLabel.setFont(new Font("Time New Roman", Font.BOLD, 40));
        headerLabel.setBounds(20, 5, 100, 100);

        //User account

        //**************************************************************************



        //Register

        JLabel lname= new JLabel("Name                             : ");
        lname.setFont(font);
        lname.setBounds(20, 20, 300, 40);
        lname.setFont(font);

        JTextField tname= new JTextField();
        tname.setBounds(330, 20, 400, 40);
        tname.setFont(font);

        JLabel ldob= new JLabel("Date of Birth             : ");
        ldob.setFont(font);
        ldob.setBounds(20, 100, 300, 40);
        ldob.setFont(font);

        JDateChooser date= new JDateChooser();
        date.setBounds(330, 100, 400, 40);
        date.setFont(font);



        JLabel lgender= new JLabel("Gender                : ");
        lgender.setFont(font);
        lgender.setBounds(20, 180, 300, 40);
        lgender.setFont(font);

        JRadioButton b_male= new JRadioButton("Male");
        b_male.setFont(font);
        b_male.setBounds(330, 180, 150, 40);

        JRadioButton b_female= new JRadioButton("Female");
        b_female.setFont(font);
        b_female.setBounds(550, 180, 150, 40);

        ButtonGroup group_btn= new ButtonGroup();
        group_btn.add(b_male);
        group_btn.add(b_female);

        JLabel lfather= new JLabel("Father Name                             : ");
        lfather.setFont(font);
        lfather.setBounds(20, 260, 300, 40);
        lfather.setFont(font);

        JTextField tfather= new JTextField();
        tfather.setBounds(330, 260, 400, 40);
        tfather.setFont(font);


        JLabel lmother= new JLabel("Mother Name                             : ");
        lmother.setFont(font);
        lmother.setBounds(20, 340, 300, 40);
        lmother.setFont(font);

        JTextField tmother= new JTextField();
        tmother.setBounds(330, 340, 400, 40);
        tmother.setFont(font);

        JLabel laddress= new JLabel("Current Address              : ");
        laddress.setFont(font);
        laddress.setBounds(20, 420, 300, 40);
        laddress.setFont(font);

        JComboBox combo_Address= new JComboBox();
        combo_Address.setFont(new Font("Arial", Font.PLAIN, 18));
        combo_Address.setVisible(true);
        combo_Address.setBounds(330, 420, 400, 40);
        combo_Address.addItem(" ");
        combo_Address.addItem("Banteay Meanchey");
        combo_Address.addItem("Battambang");
        combo_Address.addItem("Kampong Cham");
        combo_Address.addItem("Kampong Chhnang");
        combo_Address.addItem("Kampong Speu");
        combo_Address.addItem("Kampong Thom");
        combo_Address.addItem("Kampot");
        combo_Address.addItem("Kandal");
        combo_Address.addItem("Kep");
        combo_Address.addItem("Koh Kong");
        combo_Address.addItem("Kratie");
        combo_Address.addItem("Mondulkiri");
        combo_Address.addItem("Oddar Meanchey");
        combo_Address.addItem("Pailin");
        combo_Address.addItem("Phnom Penh");
        combo_Address.addItem("Preah Sihanouk");
        combo_Address.addItem("Preah Vihea");
        combo_Address.addItem("Prey Veng");
        combo_Address.addItem("Pursat");
        combo_Address.addItem("Ratanakiri");
        combo_Address.addItem("Siem Reap");
        combo_Address.addItem("Stung Treng");
        combo_Address.addItem("Svay Rieng");
        combo_Address.addItem("Takeo");
        combo_Address.addItem("Tboung Khmum");

        JLabel lguardian= new JLabel("Guardian Name      : ");
        lguardian.setFont(font);
        lguardian.setBounds(20, 500, 300, 40);
        lguardian.setFont(font);


        JTextField tguardian= new JTextField();
        tguardian.setBounds(330, 500, 400, 40);
        tguardian.setFont(font);


        JLabel lguardian_phone= new JLabel("Guardian Phone      : ");
        lguardian_phone.setFont(font);
        lguardian_phone.setBounds(20, 580, 300, 40);
        lguardian_phone.setFont(font);


        JTextField tguardian_phone= new JTextField();
        tguardian_phone.setBounds(330, 580, 400, 40);
        tguardian_phone.setFont(font);

        JPanel p_leftside= new JPanel();
        p_leftside.setBackground(Color.lightGray);
        p_leftside.setBounds(20, 10, 800, 640);
        p_leftside.setLayout(null);
        p_leftside.setBorder(new LineBorder(Color.yellow, 4));


        p_leftside.add(lname);
        p_leftside.add(tname);
        p_leftside.add(ldob);
        p_leftside.add(date);
        p_leftside.add(lgender);
        p_leftside.add(b_male);
        p_leftside.add(b_female);
        p_leftside.add(lfather);
        p_leftside.add(tfather);
        p_leftside.add(lmother);
        p_leftside.add(tmother);
        p_leftside.add(laddress);
        p_leftside.add(combo_Address);
        p_leftside.add(lguardian);
        p_leftside.add(tguardian);
        p_leftside.add(lguardian_phone);
        p_leftside.add(tguardian_phone);

        //right_side

        JLabel limage= new JLabel();
        limage.setText("Image");
        limage.setFont(new Font("Time New Roman", Font.BOLD, 22));
        limage.setBounds(50, 10, 200, 40);
        limage.setForeground(Color.red);

        JButton btn_image= new JButton("Browse");
        btn_image.setFont(new Font("Time New Roman", Font.BOLD, 22));
        btn_image.setBorder(new LineBorder(Color.black, 1));
        btn_image.setBounds(50, 80, 160, 50);
        btn_image.setBackground(Color.cyan);

        //Browse


        JPanel p_profile= new JPanel();
        p_profile.setBounds(280, 10, 200, 170);
        p_profile.setBackground(Color.lightGray);
        p_profile.setBorder(new LineBorder(Color.yellow, 4));


        JPanel pimage= new JPanel();
        pimage.setBounds(10, 10, 600, 200);
        pimage.setBorder(new LineBorder(Color.yellow, 4));
        pimage.setLayout(null);
        pimage.add(limage);
        pimage.add(btn_image);
        pimage.add(p_profile);


        //Next label


//        ImageIcon iconITC_logo = new ImageIcon(Main.class.getResource("itc_logo.png"));
//        Image imageITC_logo = iconITC_logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//
//        ImageIcon itc_logo = new ImageIcon(imageITC_logo);
//
//        JLabel headerLabel = new JLabel("       INSTITUTE OF TECHNOLOGY OF CAMBODIA ", iconITC_logo, JLabel.CENTER);
//        headerLabel.setIcon(itc_logo);
//        headerLabel.setFont(new Font("Time New Roman", Font.BOLD, 40));
//        headerLabel.setBounds(20, 5, 100, 100);

        ImageIcon next_image= new ImageIcon(Main.class.getResource("icons8-arrow-100 (2).png"));
        Image imagenext= next_image.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon next_img= new ImageIcon(imagenext);


        JButton btn_next= new JButton("Next");
        btn_next.setBounds(520, 580, 130, 45);
        btn_next.setIcon(next_img);
        btn_next.setFont(new Font("Times New Roman", Font.BOLD, 22));
        btn_next.setBorder(new LineBorder(Color.red, 2));
        btn_next.setBackground(Color.black);
        btn_next.setForeground(Color.white);

        JButton btn_folder= new JButton("Next");
        btn_folder.setBounds(520, 580, 130, 45);
        btn_folder.setIcon(next_img);
        btn_folder.setFont(new Font("Times New Roman", Font.BOLD, 22));
        btn_folder.setBorder(new LineBorder(Color.red, 2));
        btn_folder.setBackground(Color.black);
        btn_folder.setForeground(Color.white);

        //Button

        JButton btn_add= new JButton("ADD");
        btn_add.setBounds(10, 580, 150, 50);
        btn_add.setBackground(Color.CYAN);
        btn_add.setFont(font);

        JButton btn_clear= new JButton("CLEAR");
        btn_clear.setBounds(180, 580, 150, 50);
        btn_clear.setBackground(Color.cyan);
        btn_clear.setFont(font);


        JButton btn_exit= new JButton("EXIT");
        btn_exit.setBounds(350, 580, 150, 50);
        btn_exit.setBackground(Color.cyan);
        btn_exit.setFont(font);



        //Contact

        JLabel lphone= new JLabel("Phone                :");
        lphone.setBounds(15, 30, 200, 40);
        lphone.setFont(font);

        JTextField tphone= new JTextField();
        tphone.setFont(font);
        tphone.setBounds(215, 30, 350, 40);

        JLabel lemail= new JLabel("Email                :");
        lemail.setBounds(15, 110, 200, 40);
        lemail.setFont(font);

        JTextField temail= new JTextField();
        temail.setFont(font);
        temail.setBounds(215, 110, 350, 40);

        JLabel ltelegram= new JLabel("Telegram           :");
        ltelegram.setBounds(15, 180, 200, 40);
        ltelegram.setFont(font);

        JTextField ttelegram= new JTextField();
        ttelegram.setFont(font);
        ttelegram.setBounds(215, 180, 350, 40);

        JPanel p_infoContact= new JPanel();
        p_infoContact.setBounds(10, 60, 580, 260);
        p_infoContact.setBorder(new LineBorder(Color.yellow, 4));
        p_infoContact.setLayout(null);

        p_infoContact.add(lphone);
        p_infoContact.add(tphone);
        p_infoContact.add(lemail);
        p_infoContact.add(temail);
        p_infoContact.add(ltelegram);
        p_infoContact.add(ttelegram);


        JLabel lcontact= new JLabel("Contact");
        lcontact.setBounds(20, 10, 100, 40);
        lcontact.setFont(new Font("Time New Roman", Font.BOLD, 22));

        JPanel p_contact= new JPanel();
        p_contact.setBounds(10, 220, 600, 330);
        p_contact.setBorder(new LineBorder(Color.yellow, 4));
        p_contact.setBackground(Color.lightGray);
        p_contact.setLayout(null);
        p_contact.add(lcontact);
        p_contact.add(p_infoContact);


        JPanel p_rtop= new JPanel();
        p_rtop.setBounds(10, 10, 620, 560);
        p_rtop.setBorder(new LineBorder(Color.yellow, 4));
        p_rtop.setBackground(Color.lightGray);
        p_rtop.setLayout(null);
        p_rtop.add(pimage);
        p_rtop.add(p_contact);

        JPanel p_rightside= new JPanel();
        p_rightside.setBackground(Color.lightGray);
        p_rightside.setBounds(840, 10, 640, 640);
        p_rightside.setLayout(null);
        p_rightside.setBorder(new LineBorder(Color.yellow, 4));

        p_rightside.add(p_rtop);
        p_rightside.add(btn_add);
        p_rightside.add(btn_clear);
        p_rightside.add(btn_exit);
        p_rightside.add(btn_next);
        p_rightside.add(btn_folder);



        JPanel p_register= new JPanel();
        p_register.setVisible(true);
        p_register.setBackground(Color.cyan);
        p_register.setLayout(null);
        p_register.setPreferredSize(new Dimension(1490, 650));
        p_register.setBorder(new LineBorder(Color.lightGray, 2));
        p_register.add(p_rightside);
        p_register.add(p_leftside);


        //Admin


        ImageIcon profile = new ImageIcon(Main.class.getResource("profile-removebg-preview.png"));
        Image imageITC_profile = profile.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);

        ImageIcon profile_pic = new ImageIcon(imageITC_profile);

        JLabel llist = new JLabel("      STUDENT REGISTER LIST", profile, JLabel.CENTER);
        llist.setIcon(profile_pic);
        llist.setFont(new Font("Times New Roman", Font.BOLD, 60));
        llist.setBounds(20, 10, 1300, 140);

        //Button

        Font btn_font= new Font("Times New Roman", Font.BOLD, 22);


        JButton btn_search= new JButton("SEARCH");
        btn_search.setBounds(100, 370, 180, 60);
        btn_search.setBackground(Color.lightGray);
        btn_search.setFont(btn_font);

        JButton btn_update= new JButton("UPDATE");
        btn_update.setBounds(450, 370, 180, 60);
        btn_update.setBackground(Color.lightGray);
        btn_update.setFont(btn_font);

        JButton btn_delete= new JButton("DELETE");
        btn_delete.setBounds(800, 370, 180,60);
        btn_delete.setBackground(Color.lightGray);
        btn_delete.setFont(btn_font);

        JButton btn_aexit= new JButton("EXIT");
        btn_aexit.setBounds(1150, 370, 180, 60);
        btn_aexit.setBackground(Color.red);
        btn_aexit.setFont(btn_font);

        // Table********************
        JTable tb= new JTable();
        DefaultTableModel model= (DefaultTableModel)tb.getModel();
        tb.setFont(new Font("Arial", Font.PLAIN, 20));
        tb.setBorder(new LineBorder(Color.cyan, 2));
        tb.setBounds(20, 20, 1420, 330);
        tb.setRowHeight(30);

        model.addColumn("No.");
        model.addColumn("Name");
        model.addColumn("DOB");
        model.addColumn("Gender");
        model.addColumn("Address");
        model.addColumn("Phone");
        model.addColumn("Email");
        model.addColumn("Telegram");
        int n=1;
        Object row1[]= {n++,"Chris", "Dec 12 2002","Male", "Phnom Penh", "099 888 888", "basflkh@gmail.com", "012 12 12 122"};
        model.addRow(row1);
        Object row2[]= {n++,"Alliza", "May 30 2001","Female", "Koh Kong", "011 222 333", "sajfd;@gmail.com", "011 222 333"};
        model.addRow(row2);
        Object row3[]= {n++, "Albert", "Jan 01 2000", "Male", "Stung Treng", "033 333 333","khlsg@gmail.com", "033 333 333"};
        model.addRow(row3);
        Object row4[]={n++, "Emili", "Apr 19 2003", "Female", "Kompung Chhnang", "077 777 777", ";ljhbk@gmail.com", "011 111 111"};
        model.addRow(row4);
        Object row5[]={n++, "Tom", "Sep 31 1999", "Male", "Kratie", "066 666 666", "x,nvnxb@gmail.com", "021 34 34 55"};
        model.addRow(row5);
        Object row6[]={n++, "Kratos", "Oct 07 1984", "Male", "Phnom Penh", "019 222 22 22", "kratos@gmail.com", "019 222 22 22"};
        model.addRow(row6);
        Object row7[]={n++, "Angela", "Jun 11 2001", "Female", "Prey Veng", "011 111 111", "Angela@gmail.com", "012 345 543"};
        model.addRow(row7);
        Object row8[]={n++, "Vannda", "Oct 07 1984", "Male", "Phnom Penh", "011 000 0001", "vannda@gmail.com", "011 000 0001"};
        model.addRow(row8);
        Object row9[]={n++, "Panha", "Aug 11 2000", "Male", "Phnom Penh", "", "Panha@gmail.com", "011 000 0001"};
        model.addRow(row9);
        JPanel p_update= new JPanel();
        p_update.setLayout(null);
        p_update.setBorder(new LineBorder(Color.black, 4));
        p_update.setBounds(10, 170, 1470, 480);
        p_update.add(btn_search);
        p_update.add(btn_update);
        p_update.add(btn_delete);
        p_update.add(btn_aexit);
        p_update.add(tb);

        JPanel p_atop= new JPanel();
        p_atop.setBounds(10, 10, 1470, 150);
        p_atop.setVisible(true);
        p_atop.setLayout(null);
        p_atop.setBackground(Color.CYAN);
        p_atop.setBorder(new LineBorder(Color.yellow, 4));
        p_atop.add(llist);

        JPanel p_admin= new JPanel();
        p_admin.setVisible(true);
        p_admin.setBackground(Color.blue);
        p_admin.setLayout(null);
        p_admin.setPreferredSize(new Dimension(1490, 650));
        p_admin.setBorder(new LineBorder(Color.red, 4));




        //choose courses
        Color color= Color.decode("#00008B");
        ImageIcon moddle_profile = new ImageIcon(Main.class.getResource("logo_ITC-elearning__1_-removebg-preview.png"));
        Image imageITC_moddle_profile = moddle_profile.getImage().getScaledInstance(350, 150, Image.SCALE_DEFAULT);

        ImageIcon moodle_profile_pic = new ImageIcon(imageITC_moddle_profile);

        JLabel header_courses = new JLabel("   INSTITUTE OF TECHNOLOGY OF CAMBODIA", profile, JLabel.CENTER);
        header_courses.setIcon(moodle_profile_pic);
        header_courses.setFont(new Font("Rubik Doodle Shadow", Font.BOLD, 45));
        header_courses.setBounds(20, 10, 1400, 140);



        ImageIcon home_image= new ImageIcon(Main.class.getResource("icons8-home-50.png"));
        Image homei= home_image.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon home= new ImageIcon(homei);

        JButton home_btn= new JButton(" Home");
        home_btn.setBounds(50, 190, 150, 55);
        home_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        home_btn.setForeground(Color.white);
        home_btn.setBackground(color);
        home_btn.setBorder(null);
        home_btn.setIcon(home);


        ImageIcon dashboard_image= new ImageIcon(Main.class.getResource("icons8-dashboard-60.png"));
        Image dashboardi= dashboard_image.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon dashboard= new ImageIcon(dashboardi);

        JButton dashboard_btn= new JButton(" Dashboard");
        dashboard_btn.setBounds(200, 190, 150, 55);
        dashboard_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        dashboard_btn.setForeground(Color.white);
        dashboard_btn.setBackground(color);
        dashboard_btn.setBorder(null);
        dashboard_btn.setIcon(dashboard);



        ImageIcon events_image= new ImageIcon(Main.class.getResource("icons8-events-60.png"));
        Image eventsi= events_image.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon events= new ImageIcon(eventsi);

        JButton events_btn= new JButton(" Events");
        events_btn.setBounds(350, 190, 150, 55);
        events_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        events_btn.setForeground(Color.white);
        events_btn.setBackground(color);
        events_btn.setBorder(null);
        events_btn.setIcon(events);


        ImageIcon m_courses_image= new ImageIcon(Main.class.getResource("icons8-bag-50.png"));
        Image m_coursesi= m_courses_image.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon m_courses= new ImageIcon(m_coursesi);

        JButton m_courses_btn= new JButton(" My Courses");
        m_courses_btn.setBounds(500, 190, 150, 55);
        m_courses_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        m_courses_btn.setForeground(Color.white);
        m_courses_btn.setBackground(color);
        m_courses_btn.setBorder(null);
        m_courses_btn.setIcon(m_courses);


        ImageIcon h_blocks_image= new ImageIcon(Main.class.getResource("icons8-hide-sidepanel-50.png"));
        Image h_blocksi= h_blocks_image.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon h_blocks= new ImageIcon(h_blocksi);

        JButton h_blocks_btn= new JButton(" Hide blocks");
        h_blocks_btn.setBounds(1500, 190, 150, 55);
        h_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        h_blocks_btn.setForeground(Color.white);
        h_blocks_btn.setBackground(color);
        h_blocks_btn.setBorder(null);
        h_blocks_btn.setIcon(h_blocks);

        ImageIcon s_view_image= new ImageIcon(Main.class.getResource("icons8-view-64.png"));
        Image s_viewi= s_view_image.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon s_view= new ImageIcon(s_viewi);

        JButton s_view_btn= new JButton(" Standard View");
        s_view_btn.setBounds(1650, 190, 200, 55);
        s_view_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        s_view_btn.setForeground(Color.white);
        s_view_btn.setBackground(color);
        s_view_btn.setBorder(null);
        s_view_btn.setIcon(s_view);


        JPanel p_ctop= new JPanel();
        p_ctop.setBounds(10, 10, 1920, 180);
        p_ctop.setBackground(new Color(52, 204, 255));
        p_ctop.setLayout(null);

        p_ctop.add(header_courses);

        // Show Block
        JButton show_blocks_btn= new JButton(" Show blocks");
        show_blocks_btn.setBounds(1470, 190, 200, 55);
        show_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        show_blocks_btn.setForeground(Color.white);
        show_blocks_btn.setBackground(color);
        show_blocks_btn.setBorder(null);
        show_blocks_btn.setIcon(h_blocks);



        JPanel p_courses= new JPanel();
        p_courses.setBounds(0, 0, 1920, 250);
        p_courses.setVisible(true);
        p_courses.setBorder(new LineBorder(Color.cyan, 2));
        p_courses.setBackground(color);
        p_courses.setLayout(null);
        p_courses.add(p_ctop);
        p_courses.add(home_btn);
        p_courses.add(dashboard_btn);
        p_courses.add(events_btn);
        p_courses.add(m_courses_btn);
        p_courses.add(h_blocks_btn);
        p_courses.add(s_view_btn);


        //******************************************************


        JTextField search= new JTextField("  Search Courses");
        search.setBounds(20, 270, 360, 30);
        search.setFont(new Font("Arial",Font.PLAIN, 18));
        search.setForeground(new Color(169, 169, 169));
        search.setBorder(new LineBorder(new Color(169, 169, 169), 1));

        JButton btn_go=new JButton("Go");
        btn_go.setFont(new Font("Arial",Font.PLAIN, 18));
        btn_go.setBackground(new Color(65,105,225));
        btn_go.setBorder(null);
        btn_go.setBounds(380, 270, 50, 30);
        btn_go.setForeground(Color.white);


        JLabel lcourses= new JLabel();
        lcourses.setText("Available courses");
        lcourses.setFont(new Font("Arial", Font.BOLD, 26));
        lcourses.setForeground(Color.black);
        lcourses.setBounds(20, 300, 500,60);


        //Group courses

        //Agri-food supply chain
        ImageIcon agri_image= new ImageIcon(Main.class.getResource("1_Agri_Food-removebg-preview.png"));
        Image agrii= agri_image.getImage().getScaledInstance(280, 150, Image.SCALE_DEFAULT);
        ImageIcon agri= new ImageIcon(agrii);

        JLabel l_iagri= new JLabel();
        l_iagri.setIcon(agri);
        l_iagri.setBounds(0, 0, 280, 150);

        JLabel l_agri= new JLabel("Agri-Food Supply Chain");
        l_agri.setBounds(15, 190, 250, 22);
        l_agri.setFont(new Font("Arial", Font.PLAIN, 22));


        ImageIcon lock_image= new ImageIcon(Main.class.getResource("icons8-lock-50.png"));
        Image locki= lock_image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon lock= new ImageIcon(locki);

        JLabel l_ikey= new JLabel();
        l_ikey.setIcon(lock);
        l_ikey.setBounds(240, 155, 20, 20);



        ImageIcon arrow_image= new ImageIcon(Main.class.getResource("icons8-greater-than-50.png"));
        Image arrowi= arrow_image.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon arrow= new ImageIcon(arrowi);

        JButton btn_course= new JButton();
        btn_course.setIcon(arrow);
        btn_course.setText("Course    ");
        btn_course.setBounds(20, 230, 230, 34);
        btn_course.setBackground(color);
        btn_course.setFont(new Font("Arial", Font.PLAIN, 16));
        btn_course.setForeground(Color.white);


        JPanel p_agri= new JPanel();
        p_agri.setLayout(null);
        p_agri.setBounds(20, 20, 280, 290);

        p_agri.add(l_iagri);
        p_agri.add(l_agri);
        p_agri.add(btn_course);
        p_agri.add(l_ikey);

        //EntrepreneurShip

        ImageIcon entrepreneurship_image= new ImageIcon(Main.class.getResource("2_Entrepreneuship__1_-removebg-preview.png"));
        Image entrepreneurshipi= entrepreneurship_image.getImage().getScaledInstance(280, 150, Image.SCALE_DEFAULT);
        ImageIcon entrepreneurship= new ImageIcon(entrepreneurshipi);

        JLabel l_ientrepreneurship= new JLabel();
        l_ientrepreneurship.setIcon(entrepreneurship);
        l_ientrepreneurship.setBounds(0, 0, 280, 150);

        JLabel l_entrepreneurship= new JLabel("      Entrepreneurship");
        l_entrepreneurship.setBounds(15, 190, 250, 22);
        l_entrepreneurship.setFont(new Font("Arial", Font.PLAIN, 22));


        ImageIcon lock2_image= new ImageIcon(Main.class.getResource("icons8-lock-50.png"));
        Image lock2i= lock2_image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon lock2= new ImageIcon(lock2i);

        JLabel l_ikey2= new JLabel();
        l_ikey2.setIcon(lock2);
        l_ikey2.setBounds(240, 155, 20, 20);



        ImageIcon arrow2_image= new ImageIcon(Main.class.getResource("icons8-greater-than-50.png"));
        Image arrow2i= arrow2_image.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon arrow2= new ImageIcon(arrow2i);

        JButton btn2_course= new JButton();
        btn2_course.setIcon(arrow2);
        btn2_course.setText("Course    ");
        btn2_course.setBounds(20, 230, 230, 34);
        btn2_course.setBackground(color);
        btn2_course.setFont(new Font("Arial", Font.PLAIN, 16));
        btn2_course.setForeground(Color.white);


        JPanel p_entrepreneurship= new JPanel();
        p_entrepreneurship.setLayout(null);
        p_entrepreneurship.setBounds(340, 20, 280, 290);

        p_entrepreneurship.add(l_ientrepreneurship);
        p_entrepreneurship.add(l_entrepreneurship);
        p_entrepreneurship.add(btn2_course);
        p_entrepreneurship.add(l_ikey2);


        //Food market

        ImageIcon food_market_image= new ImageIcon(Main.class.getResource("3_Food_market-removebg-preview.png"));
        Image food_marketi= food_market_image.getImage().getScaledInstance(280, 150, Image.SCALE_DEFAULT);
        ImageIcon food_market= new ImageIcon(food_marketi);

        JLabel l_ifood_market= new JLabel();
        l_ifood_market.setIcon(food_market);
        l_ifood_market.setBounds(0, 0, 280, 150);

        JLabel l_food_market= new JLabel("        Food market");
        l_food_market.setBounds(15, 190, 250, 22);
        l_food_market.setFont(new Font("Arial", Font.PLAIN, 22));


        ImageIcon lock3_image= new ImageIcon(Main.class.getResource("icons8-lock-50.png"));
        Image lock3i= lock3_image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon lock3= new ImageIcon(lock3i);

        JLabel l_ikey3= new JLabel();
        l_ikey3.setIcon(lock3);
        l_ikey3.setBounds(240, 155, 20, 20);



        ImageIcon arrow3_image= new ImageIcon(Main.class.getResource("icons8-greater-than-50.png"));
        Image arrow3i= arrow3_image.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon arrow3= new ImageIcon(arrow3i);

        JButton btn3_course= new JButton();
        btn3_course.setIcon(arrow3);
        btn3_course.setText("Course    ");
        btn3_course.setBounds(20, 230, 230, 34);
        btn3_course.setBackground(color);
        btn3_course.setFont(new Font("Arial", Font.PLAIN, 16));
        btn3_course.setForeground(Color.white);


        JPanel p_food_market= new JPanel();
        p_food_market.setLayout(null);
        p_food_market.setBounds(660, 20, 280, 290);

        p_food_market.add(l_ifood_market);
        p_food_market.add(l_food_market);
        p_food_market.add(btn3_course);
        p_food_market.add(l_ikey3);


        //New Product development

        ImageIcon new_product_development_image= new ImageIcon(Main.class.getResource("4_new_product_development-removebg-preview.png"));
        Image new_product_developmenti= new_product_development_image.getImage().getScaledInstance(280, 150, Image.SCALE_DEFAULT);
        ImageIcon new_product_development= new ImageIcon(new_product_developmenti);

        JLabel l_inew_product_development= new JLabel();
        l_inew_product_development.setIcon(new_product_development);
        l_inew_product_development.setBounds(0, 0, 280, 150);

        JLabel l_new_product_development= new JLabel("New product development");
        l_new_product_development.setBounds(15, 190, 250, 22);
        l_new_product_development.setFont(new Font("Arial", Font.PLAIN, 22));


        ImageIcon lock4_image= new ImageIcon(Main.class.getResource("icons8-lock-50.png"));
        Image lock4i= lock4_image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon lock4= new ImageIcon(lock4i);

        JLabel l_ikey4= new JLabel();
        l_ikey4.setIcon(lock4);
        l_ikey4.setBounds(240, 155, 20, 20);



        ImageIcon arrow4_image= new ImageIcon(Main.class.getResource("icons8-greater-than-50.png"));
        Image arrow4i= arrow4_image.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon arrow4= new ImageIcon(arrow4i);

        JButton btn4_course= new JButton();
        btn4_course.setIcon(arrow4);
        btn4_course.setText("Course    ");
        btn4_course.setBounds(20, 230, 230, 34);
        btn4_course.setBackground(color);
        btn4_course.setFont(new Font("Arial", Font.PLAIN, 16));
        btn4_course.setForeground(Color.white);


        JPanel p_new_product_development= new JPanel();
        p_new_product_development.setLayout(null);
        p_new_product_development.setBounds(20, 340, 280, 290);

        p_new_product_development.add(l_inew_product_development);
        p_new_product_development.add(l_new_product_development);
        p_new_product_development.add(btn4_course);
        p_new_product_development.add(l_ikey4);

        //Food legislation

        ImageIcon food_legislation_image= new ImageIcon(Main.class.getResource("8_Food_legislation-removebg-preview.png"));
        Image food_legislationi= food_legislation_image.getImage().getScaledInstance(280, 150, Image.SCALE_DEFAULT);
        ImageIcon food_legislation= new ImageIcon(food_legislationi);

        JLabel l_ifood_legislation= new JLabel();
        l_ifood_legislation.setIcon(food_legislation);
        l_ifood_legislation.setBounds(0, 0, 280, 150);

        JLabel l_food_legislation= new JLabel("Food legislation");
        l_food_legislation.setBounds(15, 190, 250, 22);
        l_food_legislation.setFont(new Font("Arial", Font.PLAIN, 22));


        ImageIcon lock5_image= new ImageIcon(Main.class.getResource("icons8-lock-50.png"));
        Image lock5i= lock5_image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon lock5= new ImageIcon(lock5i);

        JLabel l_ikey5= new JLabel();
        l_ikey5.setIcon(lock5);
        l_ikey5.setBounds(240, 155, 20, 20);



        ImageIcon arrow5_image= new ImageIcon(Main.class.getResource("icons8-greater-than-50.png"));
        Image arrow5i= arrow5_image.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon arrow5= new ImageIcon(arrow5i);

        JButton btn5_course= new JButton();
        btn5_course.setIcon(arrow5);
        btn5_course.setText("Course    ");
        btn5_course.setBounds(20, 230, 230, 34);
        btn5_course.setBackground(color);
        btn5_course.setFont(new Font("Arial", Font.PLAIN, 16));
        btn5_course.setForeground(Color.white);


        JPanel p_food_legislation= new JPanel();
        p_food_legislation.setLayout(null);
        p_food_legislation.setBounds(340, 340, 280, 290);

        p_food_legislation.add(l_ifood_legislation);
        p_food_legislation.add(l_food_legislation);
        p_food_legislation.add(btn5_course);
        p_food_legislation.add(l_ikey5);


        //Food industrial design

        ImageIcon food_industrial_design_image= new ImageIcon(Main.class.getResource("7_Food_storage_and_stabilization-removebg-preview.png"));
        Image food_industrial_designi= food_industrial_design_image.getImage().getScaledInstance(280, 150, Image.SCALE_DEFAULT);
        ImageIcon food_industrial_design= new ImageIcon(food_industrial_designi);

        JLabel l_ifood_industrial_design= new JLabel();
        l_ifood_industrial_design.setIcon(food_industrial_design);
        l_ifood_industrial_design.setBounds(0, 0, 280, 150);

        JLabel l_food_industrial_design= new JLabel("Food industrial design");
        l_food_industrial_design.setBounds(15, 190, 250, 22);
        l_food_industrial_design.setFont(new Font("Arial", Font.PLAIN, 22));


        ImageIcon lock6_image= new ImageIcon(Main.class.getResource("icons8-lock-50.png"));
        Image lock6i= lock6_image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon lock6= new ImageIcon(lock6i);

        JLabel l_ikey6= new JLabel();
        l_ikey6.setIcon(lock6);
        l_ikey6.setBounds(240, 155, 20, 20);



        ImageIcon arrow6_image= new ImageIcon(Main.class.getResource("icons8-greater-than-50.png"));
        Image arrow6i= arrow6_image.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon arrow6= new ImageIcon(arrow6i);

        JButton btn6_course= new JButton();
        btn6_course.setIcon(arrow6);
        btn6_course.setText("Course    ");
        btn6_course.setBounds(20, 230, 230, 34);
        btn6_course.setBackground(color);
        btn6_course.setFont(new Font("Arial", Font.PLAIN, 16));
        btn6_course.setForeground(Color.white);


        JPanel p_food_industrial_design= new JPanel();
        p_food_industrial_design.setLayout(null);
        p_food_industrial_design.setBounds(660, 340, 280, 290);

        p_food_industrial_design.add(l_ifood_industrial_design);
        p_food_industrial_design.add(l_food_industrial_design);
        p_food_industrial_design.add(btn6_course);
        p_food_industrial_design.add(l_ikey6);



        //Group courses


        JPanel p_groupcourses= new JPanel();
        p_groupcourses.setBounds(20, 350, 920, 600);
        p_groupcourses.setLayout(null);

        p_groupcourses.add(p_agri);
        p_groupcourses.add(p_entrepreneurship);
        p_groupcourses.add(p_food_market);
        p_groupcourses.add(p_new_product_development);
        p_groupcourses.add(p_food_legislation);
        p_groupcourses.add(p_food_industrial_design);


        JTabbedPane tabbedPane= new JTabbedPane();
        tabbedPane.setPreferredSize(new Dimension(1500, 700));
        tabbedPane.setFont(new Font("Arial", Font.PLAIN, 20));


        tabbedPane.add("Register", p_register);
        tabbedPane.add("Admin", p_admin);

        JPanel pmain= new JPanel();
        pmain.setBounds(0, 100, 1525, 890);
        pmain.setBackground(Color.darkGray);
        pmain.setBorder(new LineBorder(Color.yellow, 2));
        pmain.add(tabbedPane);


        JPanel pheader= new JPanel();
        pheader.setSize(1525, 125);
        pheader.setBackground(Color.gray);
        pheader.setBorder(new LineBorder(Color.yellow, 2));
        pheader.add(headerLabel);


        //Change here
        fmain.setVisible(false);
        fmain.setSize(1540, 800);
        fmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fmain.setLocationRelativeTo(null);
        fmain.setResizable(false);
        fmain.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fmain.setBackground(Color.cyan);


        fmain.add(pmain);
        fmain.add(pheader);


        // Navigation for Frame2

        JPanel nav_pan = new JPanel();
        nav_pan.setBounds(1100, 30, 920, 1080);
        nav_pan.setBackground(Color.white);
        nav_pan.setVisible(true);
        nav_pan.setLayout(null);
        JLabel Sign = new JLabel();
        Sign.setText("------------------------------------------------------------------------------------");
        Sign.setBounds(0, 250,1000,10);
        Sign.setFont(new Font("-apple-system", Font.ITALIC, 25));
        Sign.setBackground(Color.BLACK);

        ImageIcon identical_to_image = new ImageIcon(Main.class.getResource("three-horizontal-lines-icon.png"));
        Image identical_to = identical_to_image.getImage().getScaledInstance(25, 20, Image.SCALE_DEFAULT);
        ImageIcon identical = new ImageIcon(identical_to);
        JLabel navigation = new JLabel();
        navigation.setText("Navigation");
        navigation.setIcon(identical);
        navigation.setBounds(50, 260, 500, 50);
        navigation.setFont(new Font("-apple-system", Font.PLAIN, 30));
        navigation.setForeground(Color.BLACK);

        ImageIcon icon_dash_image = new ImageIcon(Main.class.getResource("dashboard-icon.png"));
        Image icon_dash_ = icon_dash_image.getImage().getScaledInstance(30, 25, Image.SCALE_DEFAULT);
        ImageIcon dash_icon = new ImageIcon(icon_dash_);
        JButton home_nav = new JButton();
        home_nav.setText("Home");
        home_nav.setIcon(dash_icon);
        home_nav.setBounds(70, 310, 500, 50);
        home_nav.setFont(new Font("-apple-system", Font.PLAIN, 25));
        home_nav.setForeground(Color.BLACK);
        home_nav.setBorderPainted(false);
        home_nav.setFocusPainted(false);
        home_nav.setContentAreaFilled(false);
        home_nav.setHorizontalAlignment(SwingConstants.LEFT);
        JButton dash_nav = new JButton();
        dash_nav.setText("Dashboard");
        dash_nav.setIcon(dash_icon);
        dash_nav.setBounds(70, 340, 500, 50);
        dash_nav.setFont(new Font("-apple-system", Font.PLAIN, 25));
        dash_nav.setForeground(Color.BLACK);
        dash_nav.setContentAreaFilled(false);
        dash_nav.setFocusPainted(false);
        dash_nav.setBorderPainted(false);
        dash_nav.setHorizontalAlignment(SwingConstants.LEFT);
        JButton site_pages = new JButton();
        site_pages.setText("> Site Pages");
        site_pages.setBounds(100, 375, 500, 50);
        site_pages.setFont(new Font("-apple-system", Font.PLAIN, 20));
        site_pages.setForeground(color.BLACK);
        site_pages.setBorderPainted(false);
        site_pages.setHorizontalAlignment(SwingConstants.LEFT);
        site_pages.setContentAreaFilled(false);

        JButton my_courses = new JButton();
        my_courses.setText("> My Courses");
        my_courses.setBounds(100, 405, 500, 50);
        my_courses.setFont(new Font("-apple-system", Font.PLAIN, 20));
        my_courses.setForeground(color.BLACK);
        my_courses.setBorderPainted(false);
        my_courses.setHorizontalAlignment(SwingConstants.LEFT);
        my_courses.setContentAreaFilled(false);



        JLabel Sign02 = new JLabel();
        Sign02.setText("------------------------------------------------------------------------------------");
        Sign02.setBounds(0, 490,1000,10);
        Sign02.setFont(new Font("-apple-system", Font.ITALIC, 25));
        Sign02.setBackground(Color.BLACK);

        JLabel online_users = new JLabel();
        online_users.setText("Online Users");
        online_users.setIcon(identical);
        online_users.setBounds(50,500,500, 50);
        online_users.setFont(new Font("-apple-system", Font.PLAIN, 30));
        online_users.setForeground(Color.BLACK);

        JLabel online_text = new JLabel();
        online_text.setText("12 online users ( last 5 minutes )");
        online_text.setBounds(100,550,500, 50);
        online_text.setFont(new Font("-apple-system", Font.PLAIN, 20));
        online_text.setForeground(Color.BLACK);


        // Add to panel
        nav_pan.add(my_courses);
        nav_pan.add(Sign);
        nav_pan.add(navigation);
        nav_pan.add(dash_nav);
        nav_pan.add(home_nav);
        nav_pan.add(site_pages);
        nav_pan.add(Sign02);
        nav_pan.add(online_users);
        nav_pan.add(online_text);

        h_blocks_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nav_pan.setVisible(false);
                h_blocks_btn.setVisible(false);
                p_courses.add(show_blocks_btn);
                show_blocks_btn.setVisible(true);
            }
        });

        show_blocks_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nav_pan.setVisible(true);
                show_blocks_btn.setVisible(false);
                h_blocks_btn.setVisible(true);
            }
        });





        //*****************Frame 2********************

        JFrame fcourses= new JFrame();
        fcourses.setSize(1920, 1080);
        fcourses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fcourses.setLayout(null);
        fcourses.setLocationRelativeTo(null);
        fcourses.setResizable(false);

        //Adding
        fcourses.add(search);
        fcourses.add(p_courses);
        fcourses.add(btn_go);
        fcourses.add(lcourses);
        fcourses.add(p_groupcourses);
        fcourses.add(nav_pan);

        //****************************************************Behavoir

//        //Database code
//        Connection con= null;
//        String URL= "jdbc:mysql://localhost/student_register_itc";
//        String driver= "com.mysql.jdbc.Driver";
//        String user= "root";
//        String password= "";
//        Statement stmt;
//        String query;
//        ResultSet rs;

//        // try and connect to the database
//        try {
//            Class.forName(driver).newInstance();
//            con = (Connection) DriverManager.getConnection(URL, user, password);
//        } catch (Exception e) {
//            System.err.println("Exception: " + e.getMessage());
//        }
//
//        //Socail button
//********************************************

//Google click
        google_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.google.com"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("Desktop is not supported. Can't open browser.");
                }
            }
        });

        facebook_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("Desktop is not supported. Can't open browser.");
                }
            }
        });

        forget_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://support.google.com/mail/answer/41078?hl=en&co=GENIE.Platform%3DDesktop"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("Desktop is not supported. Can't open browser.");
                }
            }
        });

        twitter_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.twitter.com"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("Desktop is not supported. Can't open browser.");
                }
            }
        });


        //Button login
        btn_login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txt_username.getText().equals("") && !txt_password.getText().equals("")){
                    fmain.setVisible(true);
                }
            }

        });

        //button next


        btn_next.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                fmain.setVisible(false);
            }
        });

        btn_next.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btn_next.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_next.setBackground(Color.red);
            }
        });

        btn_folder.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                fmain.setVisible(false);
            }
        });

        btn_folder.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseEntered(MouseEvent e) {
                btn_folder.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_folder.setBackground(Color.red);
            }

        });

        //button exit
        btn_exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fmain.dispose();
            }
        });

        //button clear

        btn_clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tname.setText(null);
                date.setDate(null);
                b_male.setSelected(false);
                b_female.setSelected(false);
                tfather.setText(null);
                tmother.setText(null);
                combo_Address.setSelectedIndex(0);
                tguardian.setText(null);
                tguardian_phone.setText(null);
            }
        });

        //Button add
        btn_add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name= tname.getText();
                    String dob= ((JTextField) date.getDateEditor().getUiComponent()).getText();
                    String gender;
                    if(b_male.isSelected()){
                        gender= "Male";
                    }else{
                        gender= "Female";
                    }
                    String address=combo_Address.getSelectedItem().toString();
                    String phone= tphone.getText();
                    String email= temail.getText();
                    String telegram= ttelegram.getText();
                    int id=9;
                    for(int i=0; i<tb.getRowCount(); i++){
                        id= Integer.parseInt(tb.getValueAt(i, 0).toString());
                    }
                    id++;
                    Object row[]={id,name, dob, gender, address, phone, email, telegram};
                    model.addRow(row);
                    tname.setText(null);
                    date.setDate(null);

                    combo_Address.setSelectedIndex(0);
                    tphone.setText(null);
                    temail.setText(null);
                    ttelegram.setText(null);
                    tguardian_phone.setText(null);
                    tfather.setText(null);
                    tmother.setText(null);
                    tguardian.setText(null);
                    tguardian_phone.setText(null);
                    limage.setVisible(false);
                    p_profile.add(limage);
                    b_male.setSelected(false);
                    b_female.setSelected(false);


                } catch (Exception t) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });

        //Button browse

        btn_image.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser= new JFileChooser();
                int response= fileChooser.showOpenDialog(null);

                if(response== JFileChooser.APPROVE_OPTION){
                    File file= new File(fileChooser.getSelectedFile().getAbsolutePath());
                    ImageIcon imageIcon= new ImageIcon(file.getAbsolutePath());
                    JLabel limage= new JLabel(imageIcon);
                    p_profile.add(limage);
                }
            }
        });
        //******************Admin

        btn_aexit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fmain.dispose();
            }

        });
        //Search Button
        btn_search.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                String user= JOptionPane.showInputDialog(null, "Input any info: ");
                DefaultTableModel model = (DefaultTableModel)tb.getModel();
                TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
                tb.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(user));
                boolean checkStudent= false;
                for(int i=0;i<model.getRowCount(); i++){
                    for(int j=0; j<model.getColumnCount(); j++){
                        if(user.equals(model.getValueAt(i, j) )){
                            checkStudent=true;
                            break;
                        }
                    }
                    if(checkStudent){
                        break;
                    }
                }
                if(checkStudent==false){
                    JOptionPane.showMessageDialog(null, "Student not found..!");

                }
            }
        });
        //Delete Button

        btn_delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tb.getSelectedRow();
                for(int i=0; i<model.getRowCount();i++){
                    DefaultTableModel model = (DefaultTableModel)tb.getModel();
                    int result=JOptionPane.showConfirmDialog(null, "Are you sure?");
                    if(result==JOptionPane.YES_OPTION){
                        model.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Deleted!");
                        tname.setText(null);
                        date.setDate(null);
                        b_male.setSelected(false);
                        b_female.setSelected(false);
                        tfather.setText(null);
                        tmother.setText(null);
                        combo_Address.setSelectedIndex(0);
                        tguardian.setText(null);
                        tguardian_phone.setText(null);
                        break;
                    }else if(result== JOptionPane.NO_OPTION || result== JOptionPane.CANCEL_OPTION){
                        JOptionPane.showMessageDialog(null, "Cancel..!");
                        break;
                    }
                }
            }

        });

        //mouse click table
//        tb.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//            @Override
//            public void valueChanged(ListSelectionEvent event) {
//                if(!event.getValueIsAdjusting()){
//                    int row= tb.getSelectedRow();
//                    DefaultTableModel model= (DefaultTableModel)tb.getModel();
//                    tname.setText(model.getValueAt(row, 1).toString());
//                    try {
//                        Date date1= (Date) tb.getValueAt(row, 2);
//                        date.setDate(date1);
//                    } catch (Exception e) {
//                    }
//                    String gender= model.getValueAt(row, 3).toString();
//                    if(gender.equals("Male")){
//                        b_male.setSelected(true);
//                    }else{
//                        b_female.setSelected(true);
//                    }
//                    combo_Address.setSelectedItem(model.getValueAt(row, 4));
//                    tphone.setText(model.getValueAt(row, 5).toString());
//                    temail.setText(model.getValueAt(row, 6).toString());
//                    ttelegram.setText(model.getValueAt(row, 7).toString());
//                }
//            }
//        });
        //Update Button
        JButton btn_update1= new JButton("Update");
        btn_update1.setBounds(200, 580, 200, 50);
        btn_update1.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        btn_update1.setBackground(new Color(255, 0, 127));
        btn_update1.setForeground(Color.white);
        btn_update1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        btn_update1.setVisible(false);
        p_rightside.add(btn_update1);

        //Button Update
        btn_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(0);
                btn_add.setVisible(false);
                btn_clear.setVisible(false);
                btn_exit.setVisible(false);
                btn_next.setVisible(false);
                btn_update1.setVisible(true);
//        tb.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//            @Override
//            public void valueChanged(ListSelectionEvent event) {
//                if(!event.getValueIsAdjusting()){
//                    int row= tb.getSelectedRow();
//                    DefaultTableModel model= (DefaultTableModel)tb.getModel();
//                    tname.setText(model.getValueAt(row, 1).toString());
//                    try {
//                        Date date1= (Date) tb.getValueAt(row, 2);
//                        date.setDate(date1);
//                    } catch (Exception e) {
//                    }
//                    String gender= model.getValueAt(row, 3).toString();
//                    if(gender.equals("Male")){
//                        b_male.setSelected(true);
//                    }else{
//                        b_female.setSelected(true);
//                    }
//                    combo_Address.setSelectedItem(model.getValueAt(row, 4));
//                    tphone.setText(model.getValueAt(row, 5).toString());
//                    temail.setText(model.getValueAt(row, 6).toString());
//                    ttelegram.setText(model.getValueAt(row, 7).toString());
//                }
//            }
//        });


            }
        });

        btn_update1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name=tname.getText();
                    String dob;
                    if (date.getDate() == null) {
                        date.setDate(new Date());
                    }
                    dob = sdf.format(date.getDate());
                    String gender;
                    if(b_male.isSelected()){
                        gender="Male";
                    }
                    else{
                        gender="Female";
                    }
                    String currentAddress= combo_Address.getSelectedItem().toString();
                    String phoneNumber= tphone.getText();
                    String email= temail.getText();
                    String telegramNumber= ttelegram.getText();
                    int row= tb.getSelectedRow();
                    DefaultTableModel model= (DefaultTableModel)tb.getModel();
                    model.setValueAt(row+1, row,0);
                    model.setValueAt(name, row, 1);
                    model.setValueAt(dob, row, 2);
                    model.setValueAt(gender, row, 3);
                    model.setValueAt(currentAddress, row, 4);
                    model.setValueAt(phoneNumber, row, 5);
                    model.setValueAt(email, row, 6);
                    model.setValueAt(telegramNumber, row, 7);
                    JOptionPane.showMessageDialog(null, "Update successfully");
                    btn_update1.setVisible(false);
                    btn_clear.setVisible(true);
                    btn_exit.setVisible(true);
                    btn_add.setVisible(true);
                    btn_next.setVisible(true);
                } catch (Exception t) {
                    t.printStackTrace();
                }
            }
        });

        //Click tabbedpane
        tabbedPane.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                String pw= "12345";
                String user_pw=JOptionPane.showInputDialog(null, "Input Pasword: ");
                if(!user_pw.equals(pw)){
                    fmain.dispose();
                }else{
                    p_admin.add(p_atop);
                    p_admin.add(p_update);
                }
            }

        });
        //Copy From s_view_btn

        JButton new_s_view_btn= new JButton(" Standard View");
        new_s_view_btn.setBounds(1650, 190, 200, 55);
        new_s_view_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new_s_view_btn.setForeground(Color.white);
        new_s_view_btn.setBackground(color);
        new_s_view_btn.setBorder(null);
        new_s_view_btn.setIcon(s_view);

        //Copy From h_blocks_btn

        JButton new_h_blocks_btn= new JButton(" Hide blocks");
        new_h_blocks_btn.setBounds(1500, 190, 150, 55);
        new_h_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new_h_blocks_btn.setForeground(Color.white);
        new_h_blocks_btn.setBackground(color);
        new_h_blocks_btn.setBorder(null);
        new_h_blocks_btn.setIcon(h_blocks);

        //Copy From m_courses_btn
        JButton new_m_courses_btn= new JButton(" My Courses");
        new_m_courses_btn.setBounds(500, 190, 150, 55);
        new_m_courses_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new_m_courses_btn.setForeground(Color.white);
        new_m_courses_btn.setBackground(color);
        new_m_courses_btn.setBorder(null);
        new_m_courses_btn.setIcon(m_courses);

        //Copy From events_btn
        JButton new_events_btn= new JButton(" Events");
        new_events_btn.setBounds(350, 190, 150, 55);
        new_events_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new_events_btn.setForeground(Color.white);
        new_events_btn.setBackground(color);
        new_events_btn.setBorder(null);
        new_events_btn.setIcon(events);

        //Copy From dashboard_btn
        JButton new_dashboard_btn= new JButton(" Dashboard");
        new_dashboard_btn.setBounds(200, 190, 150, 55);
        new_dashboard_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new_dashboard_btn.setForeground(Color.white);
        new_dashboard_btn.setBackground(color);
        new_dashboard_btn.setBorder(null);
        new_dashboard_btn.setIcon(dashboard);
        //Copy From home_btn

        JButton new_home_btn= new JButton(" Home");
        new_home_btn.setBounds(50, 190, 150, 55);
        new_home_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new_home_btn.setForeground(Color.white);
        new_home_btn.setBackground(color);
        new_home_btn.setBorder(null);
        new_home_btn.setIcon(home);

        //Copy From header_courses

        JLabel new_header_courses = new JLabel("   Agri-Food Supply Chain", profile, JLabel.CENTER);
        new_header_courses.setIcon(moodle_profile_pic);
        new_header_courses.setFont(new Font("Rubik Doodle Shadow", Font.BOLD, 45));
        new_header_courses.setBounds(20, 10, 1400, 140);

        //Copy From p_ctop

        JPanel new_p_ctop= new JPanel();
        new_p_ctop.setBounds(10, 10, 1920, 180);
        new_p_ctop.setBackground(new Color(52, 204, 255));
        new_p_ctop.setLayout(null);
        new_p_ctop.add(new_header_courses);

        //Copy From p_course

        JPanel new_p_courses= new JPanel();
        new_p_courses.setBounds(0, 0, 1920, 250);
        new_p_courses.setVisible(true);
        new_p_courses.setBorder(new LineBorder(Color.cyan, 2));
        new_p_courses.setBackground(color);
        new_p_courses.setLayout(null);
        new_p_courses.add(new_p_ctop);
        new_p_courses.add(new_home_btn);
        new_p_courses.add(new_dashboard_btn);
        new_p_courses.add(new_events_btn);
        new_p_courses.add(new_m_courses_btn);
        new_p_courses.add(new_h_blocks_btn);
        new_p_courses.add(new_s_view_btn);

        //load image
        ImageIcon get_folder_icon = new ImageIcon(Main.class.getResource("folder_icon.png"));
        Image scale_folder_icon = get_folder_icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon folder_image = new ImageIcon(scale_folder_icon);

        //Folder button
        JButton btn_folder_icon= new JButton("Courses");
        btn_folder_icon.setBounds(20, 300, 200, 45);
        btn_folder_icon.setIcon(folder_image);
        btn_folder_icon.setBorderPainted(false);
        btn_folder_icon.setContentAreaFilled(false);
        btn_folder_icon.setFocusPainted(false);
        btn_folder_icon.setCursor(Cursor.getDefaultCursor());
        btn_folder_icon.setFont(new Font("Arial", Font.BOLD, 16));


        //Agri-Food Button
        JButton agri_food_button= new JButton(">   Agri-Food Supply Chain");
        agri_food_button.setBounds(150, 300, 300, 45);
        agri_food_button.setBorderPainted(false);
        agri_food_button.setContentAreaFilled(false);
        agri_food_button.setFocusPainted(false);
        agri_food_button.setCursor(Cursor.getDefaultCursor());
        agri_food_button.setFont(new Font("Arial", Font.BOLD, 16));

        // JPanel For Agri_Food
        JPanel inner_agri_courses = new JPanel();
        inner_agri_courses.setBounds(0, 400, 1080, 1080);
        JButton seq1_1 = new JButton();
        seq1_1.setText("Sequence 1.1: Standard definition of food supply chain (FSC)");
        seq1_1.setBounds(10, 0, 500, 50);
        seq1_1.setBorderPainted(false);
        seq1_1.setContentAreaFilled(false);
        seq1_1.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_1.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq1_2 = new JButton();
        seq1_2.setText("Sequence 1.2: The sustainable issue of FSC");
        seq1_2.setBounds(10, 30, 500, 50);
        seq1_2.setBorderPainted(false);
        seq1_2.setContentAreaFilled(false);
        seq1_2.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_2.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq1_3 = new JButton();
        seq1_3.setText("Sequence 1.3: Innovative FSC based on the principles of bioeconomy and circular economy");
        seq1_3.setBounds(10, 60, 800, 50);
        seq1_3.setBorderPainted(false);
        seq1_3.setContentAreaFilled(false);
        seq1_3.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_3.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq1_4 = new JButton();
        seq1_4.setText("Sequence 1.4: Case studies of bioeconomy/circular economy projects in Cambodia");
        seq1_4.setBounds(10, 90, 800, 50);
        seq1_4.setBorderPainted(false);
        seq1_4.setContentAreaFilled(false);
        seq1_4.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_4.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq2_1 = new JButton();
        seq2_1.setText("Sequence 2.1: Economic analysis of contracts in a FSC");
        seq2_1.setBounds(10, 120, 800, 50);
        seq2_1.setBorderPainted(false);
        seq2_1.setContentAreaFilled(false);
        seq2_1.setFont(new Font("Arial", Font.BOLD, 16));
        seq2_1.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq2_2 = new JButton();
        seq2_2.setText("Sequence 2.2: Inter-firm contractual relationship");
        seq2_2.setBounds(10, 150, 800, 50);
        seq2_2.setBorderPainted(false);
        seq2_2.setContentAreaFilled(false);
        seq2_2.setFont(new Font("Arial", Font.BOLD, 16));
        seq2_2.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq2_3 = new JButton();
        seq2_3.setText("Sequence 2.3: The global value chain approach");
        seq2_3.setBounds(10, 180, 800, 50);
        seq2_3.setBorderPainted(false);
        seq2_3.setContentAreaFilled(false);
        seq2_3.setFont(new Font("Arial", Font.BOLD, 16));
        seq2_3.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq2_4 = new JButton();
        seq2_4.setText("Sequence 2.4: Apply GVC Framework to Cambodian Cases");
        seq2_4.setBounds(10, 210, 800, 50);
        seq2_4.setBorderPainted(false);
        seq2_4.setContentAreaFilled(false);
        seq2_4.setFont(new Font("Arial", Font.BOLD, 16));
        seq2_4.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq3_1 = new JButton();
        seq3_1.setText("Sequence 3.1: Introduction to Design Thinking");
        seq3_1.setBounds(10, 240, 800, 50);
        seq3_1.setBorderPainted(false);
        seq3_1.setContentAreaFilled(false);
        seq3_1.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_1.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq3_2 = new JButton();
        seq3_2.setText("Sequence 3.2: Applying Design Thinking to improve existing agri-food supply chains");
        seq3_2.setBounds(10, 270, 800, 50);
        seq3_2.setBorderPainted(false);
        seq3_2.setContentAreaFilled(false);
        seq3_2.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_2.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq3_3 = new JButton();
        seq3_3.setText("Sequence 3.3: Application 1: Improving the sustainability of an agrifood business within a FSC");
        seq3_3.setBounds(10, 300, 800, 50);
        seq3_3.setBorderPainted(false);
        seq3_3.setContentAreaFilled(false);
        seq3_3.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_3.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq3_4 = new JButton();
        seq3_4.setText("Sequence 3.4: Development of an AgriFood business within a circular economy");
        seq3_4.setBounds(10, 330, 800, 50);
        seq3_4.setBorderPainted(false);
        seq3_4.setContentAreaFilled(false);
        seq3_4.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_4.setHorizontalAlignment(SwingConstants.LEFT);

        inner_agri_courses.add(seq1_1);
        inner_agri_courses.add(seq1_2);
        inner_agri_courses.add(seq1_3);
        inner_agri_courses.add(seq1_4);
        inner_agri_courses.add(seq2_1);
        inner_agri_courses.add(seq2_2);
        inner_agri_courses.add(seq2_3);
        inner_agri_courses.add(seq2_4);
        inner_agri_courses.add(seq3_1);
        inner_agri_courses.add(seq3_2);
        inner_agri_courses.add(seq3_3);
        inner_agri_courses.add(seq3_4);

        seq1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_1 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=533&currentorg=Course_ID1_ORG&scoid=1084&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_1);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_2 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=534&currentorg=Course_ID1_ORG&scoid=1086&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_2);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq1_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_3 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=535&currentorg=Course_ID1_ORG&scoid=1088&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_3);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq1_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_4 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=536&currentorg=Course_ID1_ORG&scoid=1090&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_4);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri2_1 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=537&currentorg=Course_ID1_ORG&scoid=1092&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri2_1);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri2_2 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=538&currentorg=Course_ID1_ORG&scoid=1094&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri2_2);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq2_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri2_3 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=539&currentorg=Course_ID1_ORG&scoid=1096&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri2_3);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq2_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri2_4 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=540&currentorg=Course_ID1_ORG&scoid=1098&sesskey=tZC85Ik3ls&display=popup&mode=normal&mode=normal");
                    Desktop.getDesktop().browse(uri2_4);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq3_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_1 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=541&currentorg=Course_ID1_ORG&scoid=1100&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_1);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq3_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_2 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=542&currentorg=Course_ID1_ORG&scoid=1102&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_2);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq3_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_3 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=543&currentorg=Course_ID1_ORG&scoid=1104&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_3);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq3_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_4 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=544&currentorg=Course_ID1_ORG&scoid=1106&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_4);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        inner_agri_courses.setLayout(null);
        inner_agri_courses.setVisible(true);

        //Payment Panel For Agri_Food
        JPanel pay_pan = new JPanel();
        pay_pan.setLayout(null);
        pay_pan.setBounds(0, 500, 1920, 1080);
        JLabel license_label = new JLabel();
        license_label.setBounds(580, 50, 800, 50);
        license_label.setText("If you have already paid, enter the license key here");
        license_label.setFont(new Font("Arial", Font.BOLD, 24));
        license_label.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField pay_license = new JTextField();
        pay_license.setBounds(800, 100, 300, 50);
        pay_license.setHorizontalAlignment(SwingConstants.CENTER);
        pay_license.setFont(new Font("Arial", Font.BOLD, 24));

        JButton license_btn = new JButton();
        license_btn.setBounds(1100, 100, 100, 50);
        license_btn.setText("Enter");
        license_btn.setFont(new Font("Arial", Font.BOLD, 24));


        JLabel pay_label = new JLabel();
        pay_label.setText("Please Pay Before Accessing The Course");
        pay_label.setBounds(750, 200, 500, 50);
        pay_label.setFont(new Font("Arial", Font.BOLD, 24));
        JButton pay_btn = new JButton();
        pay_btn.setText("Pay Here");
        pay_btn.setBounds(880, 250, 150, 50);
        pay_btn.setFont(new Font("Arial", Font.BOLD, 24));

        //JPanel To Pay
        JPanel pay_for_license = new JPanel();
        pay_for_license.setLayout(null);
        pay_for_license.setBounds(0, 500, 1920, 1080);

        JLabel label_for_tf1 = new JLabel();
        label_for_tf1.setBounds(580, 50, 800, 50);
        label_for_tf1.setFont(new Font("Arial", Font.BOLD, 24));
        label_for_tf1.setText("Enter your name here: ");

        JTextField tf1_for_pay_for_license = new JTextField();
        tf1_for_pay_for_license.setBounds(1000, 50, 300, 50);
        tf1_for_pay_for_license.setHorizontalAlignment(SwingConstants.CENTER);
        tf1_for_pay_for_license.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel label_for_tf2 = new JLabel();
        label_for_tf2.setBounds(580, 100, 800, 50);
        label_for_tf2.setFont(new Font("Arial", Font.BOLD, 24));
        label_for_tf2.setText("Enter your credit card number: ");

        JTextField tf2_for_pay_for_license = new JTextField();
        tf2_for_pay_for_license.setBounds(1000, 100, 300, 50);
        tf2_for_pay_for_license.setHorizontalAlignment(SwingConstants.CENTER);
        tf2_for_pay_for_license.setFont(new Font("Arial", Font.BOLD, 24));

        JButton btn_for_price = new JButton();
        btn_for_price.setText("5$");
        btn_for_price.setBounds(750, 170, 150, 50);
        btn_for_price.setFont(new Font("Arial", Font.BOLD, 24));
        btn_for_price.setForeground(Color.YELLOW);

        pay_for_license.add(label_for_tf2);
        pay_for_license.add(label_for_tf1);
        pay_for_license.add(tf1_for_pay_for_license);
        pay_for_license.add(tf2_for_pay_for_license);

        //License key generated Panel
        JPanel key_gen = new JPanel();
        key_gen.setLayout(null);
        key_gen.setBounds(0, 500, 1920, 1080);

        JLabel license_key_generated = new JLabel();
        license_key_generated.setBounds(800, 100, 700, 50);
        license_key_generated.setFont(new Font("Arial", Font.BOLD, 24));

        //Accept license key button
        JButton accept_license = new JButton();
        accept_license.setText("OK");
        accept_license.setFont(new Font("Arial", Font.BOLD, 24));
        accept_license.setBounds(900, 150, 100, 50);


        //accept license button action handler
        accept_license.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                key_gen.setVisible(false);
                pay_pan.setVisible(true);
            }
        });

        //Add To Pay Panel
        pay_pan.add(pay_label);
        pay_pan.add(pay_btn);
        pay_pan.add(pay_license);
        pay_pan.add(license_label);
        pay_pan.add(license_btn);

        // License keys for agri_food+
        ArrayList<String> license_keys = new ArrayList<String>();
        license_keys.add("A01");
        license_keys.add("A02");
        license_keys.add("A03");
        //Pay Button Behavoir
        btn_for_price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String random_license_keys = license_keys.get((int) Math.floor(Math.random()* (license_keys.size())));
                pay_pan.setVisible(false);
                String name = tf1_for_pay_for_license.getText();
                String credit_card_no = tf2_for_pay_for_license.getText();
                try {
                    Statement stmt = con.createStatement();
                    String dbop = "INSERT INTO USERS (name, credit_card_no) VALUES ('" + name + "', '" + credit_card_no + "')";
                    stmt.execute(dbop);
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

                pay_for_license.setVisible(false);
                license_key_generated.setText("This is your license key: " + random_license_keys);
                key_gen.add(accept_license);
                key_gen.add(license_key_generated);
                key_gen.setVisible(true);
            }
        });

        pay_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pay_pan.setVisible(false);
                key_gen.setVisible(false);
                pay_for_license.add(btn_for_price);
                pay_for_license.setVisible(true);

            }
        });

        //License Enter Button
        license_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String license_number = pay_license.getText();
                pay_license.setText("");
                for (String license_key : license_keys) {
                    if (license_number.equals(license_key)) {
                        pay_pan.setVisible(false);
                        inner_agri_courses.setVisible(true);
                    }
                }

            }
        });

        //New JFrame for Agri_Food course

        JFrame inner_agri = new JFrame();
        inner_agri.setLayout(null);
        inner_agri.setSize(1920, 1080);
        inner_agri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_agri.setLayout(null);
        inner_agri.setLocationRelativeTo(null);
        inner_agri.setResizable(false);

        //Adding

        inner_agri.getContentPane().add(new_p_courses);
        inner_agri.add(btn_folder_icon);
        inner_agri.add(agri_food_button);
        inner_agri.add(inner_agri_courses);
        inner_agri.add(pay_pan);
        inner_agri.add(key_gen);
        inner_agri.add(pay_for_license);

        //Show the Frame when clicked
        btn_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_agri.setVisible(true);
                inner_agri_courses.setVisible(false);
                pay_pan.setVisible(true);
            }
        });

        btn_folder_icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                inner_agri.setVisible(false);
            }
        });

        //Go back to home/dashboard
        new_home_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_agri.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        new_dashboard_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_agri.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        //Copy From s_view_btn

        JButton new2_s_view_btn= new JButton(" Standard View");
        new2_s_view_btn.setBounds(1650, 190, 200, 55);
        new2_s_view_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new2_s_view_btn.setForeground(Color.white);
        new2_s_view_btn.setBackground(color);
        new2_s_view_btn.setBorder(null);
        new2_s_view_btn.setIcon(s_view);

        //Copy From h_blocks_btn

        JButton new2_h_blocks_btn= new JButton(" Hide blocks");
        new2_h_blocks_btn.setBounds(1500, 190, 150, 55);
        new2_h_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new2_h_blocks_btn.setForeground(Color.white);
        new2_h_blocks_btn.setBackground(color);
        new2_h_blocks_btn.setBorder(null);
        new2_h_blocks_btn.setIcon(h_blocks);

        //Copy From m_courses_btn
        JButton new2_m_courses_btn= new JButton(" My Courses");
        new2_m_courses_btn.setBounds(500, 190, 150, 55);
        new2_m_courses_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new2_m_courses_btn.setForeground(Color.white);
        new2_m_courses_btn.setBackground(color);
        new2_m_courses_btn.setBorder(null);
        new2_m_courses_btn.setIcon(m_courses);

        //Copy From events_btn
        JButton new2_events_btn= new JButton(" Events");
        new2_events_btn.setBounds(350, 190, 150, 55);
        new2_events_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new2_events_btn.setForeground(Color.white);
        new2_events_btn.setBackground(color);
        new2_events_btn.setBorder(null);
        new2_events_btn.setIcon(events);

        //Copy From dashboard_btn
        JButton new2_dashboard_btn= new JButton(" Dashboard");
        new2_dashboard_btn.setBounds(200, 190, 150, 55);
        new2_dashboard_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new2_dashboard_btn.setForeground(Color.white);
        new2_dashboard_btn.setBackground(color);
        new2_dashboard_btn.setBorder(null);
        new2_dashboard_btn.setIcon(dashboard);
        //Copy From home_btn

        JButton new2_home_btn= new JButton(" Home");
        new2_home_btn.setBounds(50, 190, 150, 55);
        new2_home_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new2_home_btn.setForeground(Color.white);
        new2_home_btn.setBackground(color);
        new2_home_btn.setBorder(null);
        new2_home_btn.setIcon(home);

        //Copy From header_courses

        JLabel new2_header_courses = new JLabel("   Entrepreneurship", profile, JLabel.CENTER);
        new2_header_courses.setIcon(moodle_profile_pic);
        new2_header_courses.setFont(new Font("Rubik Doodle Shadow", Font.BOLD, 45));
        new2_header_courses.setBounds(20, 10, 1400, 140);

        //Copy From p_ctop

        JPanel new2_p_ctop= new JPanel();
        new2_p_ctop.setBounds(10, 10, 1920, 180);
        new2_p_ctop.setBackground(new Color(52, 204, 255));
        new2_p_ctop.setLayout(null);
        new2_p_ctop.add(new2_header_courses);

        //Copy From p_course

        JPanel new2_p_courses= new JPanel();
        new2_p_courses.setBounds(0, 0, 1920, 250);
        new2_p_courses.setVisible(true);
        new2_p_courses.setBorder(new LineBorder(Color.cyan, 2));
        new2_p_courses.setBackground(color);
        new2_p_courses.setLayout(null);
        new2_p_courses.add(new2_p_ctop);
        new2_p_courses.add(new2_home_btn);
        new2_p_courses.add(new2_dashboard_btn);
        new2_p_courses.add(new2_events_btn);
        new2_p_courses.add(new2_m_courses_btn);
        new2_p_courses.add(new2_h_blocks_btn);
        new2_p_courses.add(new2_s_view_btn);

        //Folder button
        JButton btn2_folder_icon= new JButton("Courses");
        btn2_folder_icon.setBounds(20, 300, 200, 45);
        btn2_folder_icon.setIcon(folder_image);
        btn2_folder_icon.setBorderPainted(false);
        btn2_folder_icon.setContentAreaFilled(false);
        btn2_folder_icon.setFocusPainted(false);
        btn2_folder_icon.setCursor(Cursor.getDefaultCursor());
        btn2_folder_icon.setFont(new Font("Arial", Font.BOLD, 16));


        //Entrepreneurship Button
        JButton ent_button= new JButton(">   Entrepreneurship");
        ent_button.setBounds(150, 300, 300, 45);
        ent_button.setBorderPainted(false);
        ent_button.setContentAreaFilled(false);
        ent_button.setFocusPainted(false);
        ent_button.setCursor(Cursor.getDefaultCursor());
        ent_button.setFont(new Font("Arial", Font.BOLD, 16));

        // JPanel For Entrepreneurship
        JPanel inner_entre_courses = new JPanel();
        inner_entre_courses.setBounds(0, 400, 1080, 1080);
        JButton seq1_1_entre = new JButton();
        seq1_1_entre.setText("Sequence 1.1: Presentation of Business Model");
        seq1_1_entre.setBounds(10, 0, 500, 50);
        seq1_1_entre.setBorderPainted(false);
        seq1_1_entre.setContentAreaFilled(false);
        seq1_1_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_1_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq1_2_entre = new JButton();
        seq1_2_entre.setText("Sequence 1.2: CANVAS Business Model");
        seq1_2_entre.setBounds(10, 30, 500, 50);
        seq1_2_entre.setBorderPainted(false);
        seq1_2_entre.setContentAreaFilled(false);
        seq1_2_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_2_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq1_3_entre = new JButton();
        seq1_3_entre.setText("Sequence 1.3: Mc Kinsey Matrix");
        seq1_3_entre.setBounds(10, 60, 800, 50);
        seq1_3_entre.setBorderPainted(false);
        seq1_3_entre.setContentAreaFilled(false);
        seq1_3_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_3_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq1_4_entre = new JButton();
        seq1_4_entre.setText("Sequence 1.4: Porter Matrix");
        seq1_4_entre.setBounds(10, 90, 800, 50);
        seq1_4_entre.setBorderPainted(false);
        seq1_4_entre.setContentAreaFilled(false);
        seq1_4_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq1_4_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq2_1_entre = new JButton();
        seq2_1_entre.setText("Sequence 2.1: Client/marketing orientation");
        seq2_1_entre.setBounds(10, 120, 800, 50);
        seq2_1_entre.setBorderPainted(false);
        seq2_1_entre.setContentAreaFilled(false);
        seq2_1_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq2_1_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq2_2_entre = new JButton();
        seq2_2_entre.setText("Sequence 2.2: Marketing mix");
        seq2_2_entre.setBounds(10, 150, 800, 50);
        seq2_2_entre.setBorderPainted(false);
        seq2_2_entre.setContentAreaFilled(false);
        seq2_2_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq2_2_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq2_3_entre = new JButton();
        seq2_3_entre.setText("Sequence 2.3: Branding");
        seq2_3_entre.setBounds(10, 180, 800, 50);
        seq2_3_entre.setBorderPainted(false);
        seq2_3_entre.setContentAreaFilled(false);
        seq2_3_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq2_3_entre.setHorizontalAlignment(SwingConstants.LEFT);


        JButton seq3_1_entre = new JButton();
        seq3_1_entre.setText("Sequence 3.1: Manager becomes an entrepreneur");
        seq3_1_entre.setBounds(10, 210, 800, 50);
        seq3_1_entre.setBorderPainted(false);
        seq3_1_entre.setContentAreaFilled(false);
        seq3_1_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_1_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq3_2_entre = new JButton();
        seq3_2_entre.setText("Sequence 3.2: Manager/know how to surround youurself");
        seq3_2_entre.setBounds(10, 240, 800, 50);
        seq3_2_entre.setBorderPainted(false);
        seq3_2_entre.setContentAreaFilled(false);
        seq3_2_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_2_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq3_3_entre = new JButton();
        seq3_3_entre.setText("Sequence 3.3: Financial/business plan's construction");
        seq3_3_entre.setBounds(10, 270, 800, 50);
        seq3_3_entre.setBorderPainted(false);
        seq3_3_entre.setContentAreaFilled(false);
        seq3_3_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_3_entre.setHorizontalAlignment(SwingConstants.LEFT);

        JButton seq3_4_entre = new JButton();
        seq3_4_entre.setText("Sequence 3.4: Financial Analysis/Income and BS Statement");
        seq3_4_entre.setBounds(10, 300, 800, 50);
        seq3_4_entre.setBorderPainted(false);
        seq3_4_entre.setContentAreaFilled(false);
        seq3_4_entre.setFont(new Font("Arial", Font.BOLD, 16));
        seq3_4_entre.setHorizontalAlignment(SwingConstants.LEFT);

        inner_entre_courses.add(seq1_1_entre);
        inner_entre_courses.add(seq1_2_entre);
        inner_entre_courses.add(seq1_3_entre);
        inner_entre_courses.add(seq1_4_entre);
        inner_entre_courses.add(seq2_1_entre);
        inner_entre_courses.add(seq2_2_entre);
        inner_entre_courses.add(seq2_3_entre);
        inner_entre_courses.add(seq3_1_entre);
        inner_entre_courses.add(seq3_2_entre);
        inner_entre_courses.add(seq3_3_entre);
        inner_entre_courses.add(seq3_4_entre);

        seq1_1_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_1 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=568&currentorg=Course_ID1_ORG&scoid=1154&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_1);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq1_2_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_2 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=569&currentorg=Course_ID1_ORG&scoid=1156&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_2);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq1_3_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_3 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=570&currentorg=Course_ID1_ORG&scoid=1158&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_3);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq1_4_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri1_4 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=571&currentorg=Course_ID1_ORG&scoid=1160&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri1_4);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq2_1_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri2_1 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=572&currentorg=Course_ID1_ORG&scoid=1162&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri2_1);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq2_2_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri2_2 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=573&currentorg=Course_ID1_ORG&scoid=1164&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri2_2);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq2_3_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri2_3 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=574&currentorg=Course_ID1_ORG&scoid=1166&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri2_3);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });


        seq3_1_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_1 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=575&currentorg=Course_ID1_ORG&scoid=1168&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_1);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq3_2_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_2 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=576&currentorg=Course_ID1_ORG&scoid=1170&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_2);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq3_3_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_3 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=577&currentorg=Course_ID1_ORG&scoid=1172&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_3);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        seq3_4_entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI uri3_4 = new URI("https://moodle.itc.edu.kh/mod/scorm/player.php?a=578&currentorg=Course_ID1_ORG&scoid=1174&sesskey=tZC85Ik3ls&display=popup&mode=normal");
                    Desktop.getDesktop().browse(uri3_4);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        inner_entre_courses.setLayout(null);
        inner_entre_courses.setVisible(true);

        //Payment Panel For Entre_Food
        JPanel pay_pan_2 = new JPanel();
        pay_pan_2.setLayout(null);
        pay_pan_2.setBounds(0, 500, 1920, 1080);
        JLabel license_label_2 = new JLabel();
        license_label_2.setBounds(580, 50, 800, 50);
        license_label_2.setText("If you have already paid, enter the license key here");
        license_label_2.setFont(new Font("Arial", Font.BOLD, 24));
        license_label_2.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField pay_license_2 = new JTextField();
        pay_license_2.setBounds(800, 100, 300, 50);
        pay_license_2.setHorizontalAlignment(SwingConstants.CENTER);
        pay_license_2.setFont(new Font("Arial", Font.BOLD, 24));

        JButton license_btn_2 = new JButton();
        license_btn_2.setBounds(1100, 100, 100, 50);
        license_btn_2.setText("Enter");
        license_btn_2.setFont(new Font("Arial", Font.BOLD, 24));


        JLabel pay_label_2 = new JLabel();
        pay_label_2.setText("Please Pay Before Accessing The Course");
        pay_label_2.setBounds(750, 200, 500, 50);
        pay_label_2.setFont(new Font("Arial", Font.BOLD, 24));
        JButton pay_btn_2 = new JButton();
        pay_btn_2.setText("Pay Here");
        pay_btn_2.setBounds(880, 250, 150, 50);
        pay_btn_2.setFont(new Font("Arial", Font.BOLD, 24));

        //License key generated Panel
        JPanel key_gen_2 = new JPanel();
        key_gen_2.setLayout(null);
        key_gen_2.setBounds(0, 500, 1920, 1080);

        JLabel license_key_generated_2 = new JLabel();
        license_key_generated_2.setBounds(800, 100, 700, 50);
        license_key_generated_2.setFont(new Font("Arial", Font.BOLD, 24));

        //Accept license key button
        JButton accept_license_2 = new JButton();
        accept_license_2.setText("OK");
        accept_license_2.setFont(new Font("Arial", Font.BOLD, 24));
        accept_license_2.setBounds(900, 150, 100, 50);
        // Add to key_gen panel
        key_gen_2.add(license_key_generated_2);
//        key_gen_2.add(accept_license_2);

        //accept license button action handler
        accept_license_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pay_pan_2.setVisible(true);
                key_gen_2.setVisible(false);
            }
        });

        // License keys for agri_food+
        ArrayList<String> license_keys_2 = new ArrayList<String>();
        license_keys_2.add("B01");
        license_keys_2.add("B02");
        license_keys_2.add("B03");
        //Pay Button Behavoir
        pay_btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String random_license_keys_2 = license_keys_2.get((int) Math.floor(Math.random()* (license_keys_2.size())));
                pay_pan_2.setVisible(false);
                license_key_generated_2.setText("This is your license key: " + random_license_keys_2);
                key_gen_2.add(accept_license_2);
                key_gen_2.setVisible(true);
            }
        });



        //Add To Pay Panel
        pay_pan_2.add(pay_label_2);
        pay_pan_2.add(pay_btn_2);
        pay_pan_2.add(pay_license_2);
        pay_pan_2.add(license_label_2);
        pay_pan_2.add(license_btn_2);


        //License Enter Button
        license_btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String license_number_2 = pay_license_2.getText();
                pay_license_2.setText("");
                for (String license_key : license_keys_2) {
                    if (license_number_2.equals(license_key)) {
                        inner_entre_courses.setVisible(true);
                        pay_pan_2.setVisible(false);
                    }
                }

            }
        });

        // Add JFrame for Entrepreneurship
        JFrame inner_ent = new JFrame();
        inner_ent.setLayout(null);
        inner_ent.setSize(1920, 1080);
        inner_ent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_ent.setLayout(null);
        inner_ent.setLocationRelativeTo(null);
        inner_ent.setResizable(false);
        inner_ent.add(new2_p_courses);
        inner_ent.add(ent_button);
        inner_ent.add(btn2_folder_icon);
        inner_ent.add(inner_entre_courses);
        inner_ent.add(pay_pan_2);
        inner_ent.add(key_gen_2);



        //Show the frame when clicked
        btn2_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_ent.setVisible(true);
                inner_entre_courses.setVisible(false);
                pay_pan_2.setVisible(true);
            }
        });



        btn2_folder_icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                inner_ent.setVisible(false);
            }
        });

        new2_home_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_ent.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        new2_dashboard_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_ent.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        //Copy From s_view_btn

        JButton new3_s_view_btn= new JButton(" Standard View");
        new3_s_view_btn.setBounds(1650, 190, 200, 55);
        new3_s_view_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new3_s_view_btn.setForeground(Color.white);
        new3_s_view_btn.setBackground(color);
        new3_s_view_btn.setBorder(null);
        new3_s_view_btn.setIcon(s_view);

        //Copy From h_blocks_btn

        JButton new3_h_blocks_btn= new JButton(" Hide blocks");
        new3_h_blocks_btn.setBounds(1500, 190, 150, 55);
        new3_h_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new3_h_blocks_btn.setForeground(Color.white);
        new3_h_blocks_btn.setBackground(color);
        new3_h_blocks_btn.setBorder(null);
        new3_h_blocks_btn.setIcon(h_blocks);

        //Copy From m_courses_btn
        JButton new3_m_courses_btn= new JButton(" My Courses");
        new3_m_courses_btn.setBounds(500, 190, 150, 55);
        new3_m_courses_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new3_m_courses_btn.setForeground(Color.white);
        new3_m_courses_btn.setBackground(color);
        new3_m_courses_btn.setBorder(null);
        new3_m_courses_btn.setIcon(m_courses);

        //Copy From events_btn
        JButton new3_events_btn= new JButton(" Events");
        new3_events_btn.setBounds(350, 190, 150, 55);
        new3_events_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new3_events_btn.setForeground(Color.white);
        new3_events_btn.setBackground(color);
        new3_events_btn.setBorder(null);
        new3_events_btn.setIcon(events);

        //Copy From dashboard_btn
        JButton new3_dashboard_btn= new JButton(" Dashboard");
        new3_dashboard_btn.setBounds(200, 190, 150, 55);
        new3_dashboard_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new3_dashboard_btn.setForeground(Color.white);
        new3_dashboard_btn.setBackground(color);
        new3_dashboard_btn.setBorder(null);
        new3_dashboard_btn.setIcon(dashboard);
        //Copy From home_btn

        JButton new3_home_btn= new JButton(" Home");
        new3_home_btn.setBounds(50, 190, 150, 55);
        new3_home_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new3_home_btn.setForeground(Color.white);
        new3_home_btn.setBackground(color);
        new3_home_btn.setBorder(null);
        new3_home_btn.setIcon(home);

        //Copy From header_courses

        JLabel new3_header_courses = new JLabel("   Food Market", profile, JLabel.CENTER);
        new3_header_courses.setIcon(moodle_profile_pic);
        new3_header_courses.setFont(new Font("Rubik Doodle Shadow", Font.BOLD, 45));
        new3_header_courses.setBounds(20, 10, 1400, 140);

        //Copy From p_ctop

        JPanel new3_p_ctop= new JPanel();
        new3_p_ctop.setBounds(10, 10, 1920, 180);
        new3_p_ctop.setBackground(new Color(52, 204, 255));
        new3_p_ctop.setLayout(null);
        new3_p_ctop.add(new3_header_courses);

        //Copy From p_course

        JPanel new3_p_courses= new JPanel();
        new3_p_courses.setBounds(0, 0, 1920, 250);
        new3_p_courses.setVisible(true);
        new3_p_courses.setBorder(new LineBorder(Color.cyan, 2));
        new3_p_courses.setBackground(color);
        new3_p_courses.setLayout(null);
        new3_p_courses.add(new3_p_ctop);
        new3_p_courses.add(new3_home_btn);
        new3_p_courses.add(new3_dashboard_btn);
        new3_p_courses.add(new3_events_btn);
        new3_p_courses.add(new3_m_courses_btn);
        new3_p_courses.add(new3_h_blocks_btn);
        new3_p_courses.add(new3_s_view_btn);

        //Folder button
        JButton btn3_folder_icon= new JButton("Courses");
        btn3_folder_icon.setBounds(20, 300, 200, 45);
        btn3_folder_icon.setIcon(folder_image);
        btn3_folder_icon.setBorderPainted(false);
        btn3_folder_icon.setContentAreaFilled(false);
        btn3_folder_icon.setFocusPainted(false);
        btn3_folder_icon.setCursor(Cursor.getDefaultCursor());
        btn3_folder_icon.setFont(new Font("Arial", Font.BOLD, 16));


        //Food Market button
        JButton food_market_icon= new JButton(">   Food Market");
        food_market_icon.setBounds(150, 300, 300, 45);
        food_market_icon.setBorderPainted(false);
        food_market_icon.setContentAreaFilled(false);
        food_market_icon.setFocusPainted(false);
        food_market_icon.setCursor(Cursor.getDefaultCursor());
        food_market_icon.setFont(new Font("Arial", Font.BOLD, 16));
        btn3_folder_icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                inner_ent.setVisible(false);
            }
        });

        // Add JFrame for Food Market
        JFrame inner_food_market = new JFrame();
        inner_food_market.setLayout(null);
        inner_food_market.setSize(1920, 1080);
        inner_food_market.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_food_market.setLayout(null);
        inner_food_market.setLocationRelativeTo(null);
        inner_food_market.setResizable(false);
        inner_food_market.add(new3_p_courses);
        inner_food_market.add(btn3_folder_icon);
        inner_food_market.add(food_market_icon);

        //Show the frame when clicked
        btn3_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_food_market.setVisible(true);
            }
        });

        new3_home_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_food_market.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        new3_dashboard_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_food_market.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        //Copy From s_view_btn

        JButton new4_s_view_btn= new JButton(" Standard View");
        new4_s_view_btn.setBounds(1650, 190, 200, 55);
        new4_s_view_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new4_s_view_btn.setForeground(Color.white);
        new4_s_view_btn.setBackground(color);
        new4_s_view_btn.setBorder(null);
        new4_s_view_btn.setIcon(s_view);

        //Copy From h_blocks_btn

        JButton new4_h_blocks_btn= new JButton(" Hide blocks");
        new4_h_blocks_btn.setBounds(1500, 190, 150, 55);
        new4_h_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new4_h_blocks_btn.setForeground(Color.white);
        new4_h_blocks_btn.setBackground(color);
        new4_h_blocks_btn.setBorder(null);
        new4_h_blocks_btn.setIcon(h_blocks);

        //Copy From m_courses_btn
        JButton new4_m_courses_btn= new JButton(" My Courses");
        new4_m_courses_btn.setBounds(500, 190, 150, 55);
        new4_m_courses_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new4_m_courses_btn.setForeground(Color.white);
        new4_m_courses_btn.setBackground(color);
        new4_m_courses_btn.setBorder(null);
        new4_m_courses_btn.setIcon(m_courses);

        //Copy From events_btn
        JButton new4_events_btn= new JButton(" Events");
        new4_events_btn.setBounds(350, 190, 150, 55);
        new4_events_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new4_events_btn.setForeground(Color.white);
        new4_events_btn.setBackground(color);
        new4_events_btn.setBorder(null);
        new4_events_btn.setIcon(events);

        //Copy From dashboard_btn
        JButton new4_dashboard_btn= new JButton(" Dashboard");
        new4_dashboard_btn.setBounds(200, 190, 150, 55);
        new4_dashboard_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new4_dashboard_btn.setForeground(Color.white);
        new4_dashboard_btn.setBackground(color);
        new4_dashboard_btn.setBorder(null);
        new4_dashboard_btn.setIcon(dashboard);
        //Copy From home_btn

        JButton new4_home_btn= new JButton(" Home");
        new4_home_btn.setBounds(50, 190, 150, 55);
        new4_home_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new4_home_btn.setForeground(Color.white);
        new4_home_btn.setBackground(color);
        new4_home_btn.setBorder(null);
        new4_home_btn.setIcon(home);

        //Copy From header_courses

        JLabel new4_header_courses = new JLabel("   New Product Development", profile, JLabel.CENTER);
        new4_header_courses.setIcon(moodle_profile_pic);
        new4_header_courses.setFont(new Font("Rubik Doodle Shadow", Font.BOLD, 45));
        new4_header_courses.setBounds(20, 10, 1400, 140);

        //Copy From p_ctop

        JPanel new4_p_ctop= new JPanel();
        new4_p_ctop.setBounds(10, 10, 1920, 180);
        new4_p_ctop.setBackground(new Color(52, 204, 255));
        new4_p_ctop.setLayout(null);
        new4_p_ctop.add(new4_header_courses);

        //Copy From p_course

        JPanel new4_p_courses= new JPanel();
        new4_p_courses.setBounds(0, 0, 1920, 250);
        new4_p_courses.setVisible(true);
        new4_p_courses.setBorder(new LineBorder(Color.cyan, 2));
        new4_p_courses.setBackground(color);
        new4_p_courses.setLayout(null);
        new4_p_courses.add(new4_p_ctop);
        new4_p_courses.add(new4_home_btn);
        new4_p_courses.add(new4_dashboard_btn);
        new4_p_courses.add(new4_events_btn);
        new4_p_courses.add(new4_m_courses_btn);
        new4_p_courses.add(new4_h_blocks_btn);
        new4_p_courses.add(new4_s_view_btn);

        //Folder button
        JButton btn4_folder_icon= new JButton("Courses");
        btn4_folder_icon.setBounds(20, 300, 200, 45);
        btn4_folder_icon.setIcon(folder_image);
        btn4_folder_icon.setBorderPainted(false);
        btn4_folder_icon.setContentAreaFilled(false);
        btn4_folder_icon.setFocusPainted(false);
        btn4_folder_icon.setCursor(Cursor.getDefaultCursor());
        btn4_folder_icon.setFont(new Font("Arial", Font.BOLD, 16));


        //New Product Development button
        JButton product_dev_icon= new JButton(">   New Product Development");
        product_dev_icon.setBounds(150, 300, 300, 45);
        product_dev_icon.setBorderPainted(false);
        product_dev_icon.setContentAreaFilled(false);
        product_dev_icon.setFocusPainted(false);
        product_dev_icon.setCursor(Cursor.getDefaultCursor());
        product_dev_icon.setFont(new Font("Arial", Font.BOLD, 16));

        // Add JFrame for New Product Development
        JFrame inner_product_dev = new JFrame();
        inner_product_dev.setLayout(null);
        inner_product_dev.setSize(1920, 1080);
        inner_product_dev.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_product_dev.setLayout(null);
        inner_product_dev.setLocationRelativeTo(null);
        inner_product_dev.setResizable(false);
        inner_product_dev.add(new4_p_courses);
        inner_product_dev.add(btn4_folder_icon);
        inner_product_dev.add(product_dev_icon);

        //Show the frame when clicked
        btn4_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_product_dev.setVisible(true);
            }
        });

        btn4_folder_icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                inner_product_dev.setVisible(false);
            }
        });

        new4_home_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_product_dev.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        new4_dashboard_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_product_dev.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        //Copy From s_view_btn

        JButton new5_s_view_btn= new JButton(" Standard View");
        new5_s_view_btn.setBounds(1650, 190, 200, 55);
        new5_s_view_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new5_s_view_btn.setForeground(Color.white);
        new5_s_view_btn.setBackground(color);
        new5_s_view_btn.setBorder(null);
        new5_s_view_btn.setIcon(s_view);

        //Copy From h_blocks_btn

        JButton new5_h_blocks_btn= new JButton(" Hide blocks");
        new5_h_blocks_btn.setBounds(1500, 190, 150, 55);
        new5_h_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new5_h_blocks_btn.setForeground(Color.white);
        new5_h_blocks_btn.setBackground(color);
        new5_h_blocks_btn.setBorder(null);
        new5_h_blocks_btn.setIcon(h_blocks);

        //Copy From m_courses_btn
        JButton new5_m_courses_btn= new JButton(" My Courses");
        new5_m_courses_btn.setBounds(500, 190, 150, 55);
        new5_m_courses_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new5_m_courses_btn.setForeground(Color.white);
        new5_m_courses_btn.setBackground(color);
        new5_m_courses_btn.setBorder(null);
        new5_m_courses_btn.setIcon(m_courses);

        //Copy From events_btn
        JButton new5_events_btn= new JButton(" Events");
        new5_events_btn.setBounds(350, 190, 150, 55);
        new5_events_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new5_events_btn.setForeground(Color.white);
        new5_events_btn.setBackground(color);
        new5_events_btn.setBorder(null);
        new5_events_btn.setIcon(events);

        //Copy From dashboard_btn
        JButton new5_dashboard_btn= new JButton(" Dashboard");
        new5_dashboard_btn.setBounds(200, 190, 150, 55);
        new5_dashboard_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new5_dashboard_btn.setForeground(Color.white);
        new5_dashboard_btn.setBackground(color);
        new5_dashboard_btn.setBorder(null);
        new5_dashboard_btn.setIcon(dashboard);
        //Copy From home_btn

        JButton new5_home_btn= new JButton(" Home");
        new5_home_btn.setBounds(50, 190, 150, 55);
        new5_home_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new5_home_btn.setForeground(Color.white);
        new5_home_btn.setBackground(color);
        new5_home_btn.setBorder(null);
        new5_home_btn.setIcon(home);

        //Copy From header_courses

        JLabel new5_header_courses = new JLabel("   Food Legislation", profile, JLabel.CENTER);
        new5_header_courses.setIcon(moodle_profile_pic);
        new5_header_courses.setFont(new Font("Rubik Doodle Shadow", Font.BOLD, 45));
        new5_header_courses.setBounds(20, 10, 1400, 140);

        //Copy From p_ctop

        JPanel new5_p_ctop= new JPanel();
        new5_p_ctop.setBounds(10, 10, 1920, 180);
        new5_p_ctop.setBackground(new Color(52, 204, 255));
        new5_p_ctop.setLayout(null);
        new5_p_ctop.add(new5_header_courses);

        //Copy From p_course

        JPanel new5_p_courses= new JPanel();
        new5_p_courses.setBounds(0, 0, 1920, 250);
        new5_p_courses.setVisible(true);
        new5_p_courses.setBorder(new LineBorder(Color.cyan, 2));
        new5_p_courses.setBackground(color);
        new5_p_courses.setLayout(null);
        new5_p_courses.add(new5_p_ctop);
        new5_p_courses.add(new5_home_btn);
        new5_p_courses.add(new5_dashboard_btn);
        new5_p_courses.add(new5_events_btn);
        new5_p_courses.add(new5_m_courses_btn);
        new5_p_courses.add(new5_h_blocks_btn);
        new5_p_courses.add(new5_s_view_btn);

        //Folder button
        JButton btn5_folder_icon= new JButton("Courses");
        btn5_folder_icon.setBounds(20, 300, 200, 45);
        btn5_folder_icon.setIcon(folder_image);
        btn5_folder_icon.setBorderPainted(false);
        btn5_folder_icon.setContentAreaFilled(false);
        btn5_folder_icon.setFocusPainted(false);
        btn5_folder_icon.setCursor(Cursor.getDefaultCursor());
        btn5_folder_icon.setFont(new Font("Arial", Font.BOLD, 16));


        //Food Legislation button
        JButton food_legis_icon= new JButton(">   Food Legislation");
        food_legis_icon.setBounds(150, 300, 300, 45);
        food_legis_icon.setBorderPainted(false);
        food_legis_icon.setContentAreaFilled(false);
        food_legis_icon.setFocusPainted(false);
        food_legis_icon.setCursor(Cursor.getDefaultCursor());
        food_legis_icon.setFont(new Font("Arial", Font.BOLD, 16));



        // Add JFrame for Food Legislation
        JFrame inner_food_legislation = new JFrame();
        inner_food_legislation.setLayout(null);
        inner_food_legislation.setSize(1920, 1080);
        inner_food_legislation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_food_legislation.setLayout(null);
        inner_food_legislation.setLocationRelativeTo(null);
        inner_food_legislation.setResizable(false);
        inner_food_legislation.add(new5_p_courses);
        inner_food_legislation.add(food_legis_icon);
        inner_food_legislation.add(btn5_folder_icon);

        //Show the frame when clicked
        btn5_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_food_legislation.setVisible(true);
            }
        });

        btn5_folder_icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                inner_food_legislation.setVisible(false);
            }
        });

        new5_home_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_food_legislation.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        new5_dashboard_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_food_legislation.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        //Copy From s_view_btn

        JButton new6_s_view_btn= new JButton(" Standard View");
        new6_s_view_btn.setBounds(1650, 190, 200, 55);
        new6_s_view_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new6_s_view_btn.setForeground(Color.white);
        new6_s_view_btn.setBackground(color);
        new6_s_view_btn.setBorder(null);
        new6_s_view_btn.setIcon(s_view);

        //Copy From h_blocks_btn

        JButton new6_h_blocks_btn= new JButton(" Hide blocks");
        new6_h_blocks_btn.setBounds(1500, 190, 150, 55);
        new6_h_blocks_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new6_h_blocks_btn.setForeground(Color.white);
        new6_h_blocks_btn.setBackground(color);
        new6_h_blocks_btn.setBorder(null);
        new6_h_blocks_btn.setIcon(h_blocks);

        //Copy From m_courses_btn
        JButton new6_m_courses_btn= new JButton(" My Courses");
        new6_m_courses_btn.setBounds(500, 190, 150, 55);
        new6_m_courses_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new6_m_courses_btn.setForeground(Color.white);
        new6_m_courses_btn.setBackground(color);
        new6_m_courses_btn.setBorder(null);
        new6_m_courses_btn.setIcon(m_courses);

        //Copy From events_btn
        JButton new6_events_btn= new JButton(" Events");
        new6_events_btn.setBounds(350, 190, 150, 55);
        new6_events_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new6_events_btn.setForeground(Color.white);
        new6_events_btn.setBackground(color);
        new6_events_btn.setBorder(null);
        new6_events_btn.setIcon(events);

        //Copy From dashboard_btn
        JButton new6_dashboard_btn= new JButton(" Dashboard");
        new6_dashboard_btn.setBounds(200, 190, 150, 55);
        new6_dashboard_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new6_dashboard_btn.setForeground(Color.white);
        new6_dashboard_btn.setBackground(color);
        new6_dashboard_btn.setBorder(null);
        new6_dashboard_btn.setIcon(dashboard);
        //Copy From home_btn

        JButton new6_home_btn= new JButton(" Home");
        new6_home_btn.setBounds(50, 190, 150, 55);
        new6_home_btn.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        new6_home_btn.setForeground(Color.white);
        new6_home_btn.setBackground(color);
        new6_home_btn.setBorder(null);
        new6_home_btn.setIcon(home);

        //Copy From header_courses

        JLabel new6_header_courses = new JLabel("   Food Industrial Design", profile, JLabel.CENTER);
        new6_header_courses.setIcon(moodle_profile_pic);
        new6_header_courses.setFont(new Font("Rubik Doodle Shadow", Font.BOLD, 45));
        new6_header_courses.setBounds(20, 10, 1400, 140);

        //Copy From p_ctop

        JPanel new6_p_ctop= new JPanel();
        new6_p_ctop.setBounds(10, 10, 1920, 180);
        new6_p_ctop.setBackground(new Color(52, 204, 255));
        new6_p_ctop.setLayout(null);
        new6_p_ctop.add(new6_header_courses);

        //Copy From p_course

        JPanel new6_p_courses= new JPanel();
        new6_p_courses.setBounds(0, 0, 1920, 250);
        new6_p_courses.setVisible(true);
        new6_p_courses.setBorder(new LineBorder(Color.cyan, 2));
        new6_p_courses.setBackground(color);
        new6_p_courses.setLayout(null);
        new6_p_courses.add(new6_p_ctop);
        new6_p_courses.add(new6_home_btn);
        new6_p_courses.add(new6_dashboard_btn);
        new6_p_courses.add(new6_events_btn);
        new6_p_courses.add(new6_m_courses_btn);
        new6_p_courses.add(new6_h_blocks_btn);
        new6_p_courses.add(new6_s_view_btn);

        //Folder button
        JButton btn6_folder_icon= new JButton("Courses");
        btn6_folder_icon.setBounds(20, 300, 200, 45);
        btn6_folder_icon.setIcon(folder_image);
        btn6_folder_icon.setBorderPainted(false);
        btn6_folder_icon.setContentAreaFilled(false);
        btn6_folder_icon.setFocusPainted(false);
        btn6_folder_icon.setCursor(Cursor.getDefaultCursor());
        btn6_folder_icon.setFont(new Font("Arial", Font.BOLD, 16));


        //New Product Development button
        JButton indus_desi_icon= new JButton(">   Food Industrial Design");
        indus_desi_icon.setBounds(150, 300, 300, 45);
        indus_desi_icon.setBorderPainted(false);
        indus_desi_icon.setContentAreaFilled(false);
        indus_desi_icon.setFocusPainted(false);
        indus_desi_icon.setCursor(Cursor.getDefaultCursor());
        indus_desi_icon.setFont(new Font("Arial", Font.BOLD, 16));

        // Add JFrame for Food Industrial Design
        JFrame inner_indus_design = new JFrame();
        inner_indus_design.setLayout(null);
        inner_indus_design.setSize(1920, 1080);
        inner_indus_design.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_indus_design.setLayout(null);
        inner_indus_design.setLocationRelativeTo(null);
        inner_indus_design.setResizable(false);
        inner_indus_design.add(new6_p_courses);
        inner_indus_design.add(btn6_folder_icon);
        inner_indus_design.add(indus_desi_icon);

        //Show the frame when clicked
        btn6_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_indus_design.setVisible(true);
            }
        });

        btn6_folder_icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(true);
                inner_indus_design.setVisible(false);
            }
        });

        new6_home_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_indus_design.setVisible(false);
                fcourses.setVisible(true);
            }
        });

        new6_dashboard_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inner_indus_design.setVisible(false);
                fcourses.setVisible(true);
            }
        });






    }
}