package Register_form;
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {

    public static void main(String[] args) {
        JFrame fmain= new JFrame();

        Font font= new Font("Time New Roman", Font.BOLD, 20);
        //Header
        ImageIcon iconITC_logo = new ImageIcon(Main.class.getResource("itc_logo.png"));
        Image imageITC_logo = iconITC_logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        ImageIcon itc_logo = new ImageIcon(imageITC_logo);

        JLabel headerLabel = new JLabel("       INSTITUTE OF TECHNOLOGY OF CAMBODIA ", iconITC_logo, JLabel.CENTER);
        headerLabel.setIcon(itc_logo);
        headerLabel.setFont(new Font("Time New Roman", Font.BOLD, 40));
        headerLabel.setBounds(20, 5, 100, 100);



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
        p_groupcourses.setBounds(20, 350, 1000, 600);
        p_groupcourses.setBounds(20, 350, 1000, 600);
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

        fmain.setVisible(true);
        fmain.setSize(1540, 800);
        fmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fmain.setLocationRelativeTo(null);
        fmain.setResizable(false);
        fmain.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fmain.setBackground(Color.cyan);


        fmain.add(pmain);
        fmain.add(pheader);

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


        //****************************************************Behavoir

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


        //Button Add

        btn_add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int N=6;
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
                Object row[]={N,name, dob, gender, address, phone, email, telegram};
                model.addRow(row);
                fmain.setVisible(false);
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
                        break;
                    }else if(result== JOptionPane.NO_OPTION || result== JOptionPane.CANCEL_OPTION){
                        JOptionPane.showMessageDialog(null, "Cancel..!");
                        break;
                    }
                }
            }

        });

        //Update Button



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

        //New JFrame for Agri_Food course

        JFrame inner_agri = new JFrame();
        inner_agri.setLayout(null);
        inner_agri.setSize(1920, 1080);
        inner_agri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_agri.setLayout(null);
        inner_agri.setLocationRelativeTo(null);
        inner_agri.setResizable(false);

        //Adding

        inner_agri.add(new_p_courses);

        //Show the Frame when clicked
        btn_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_agri.setVisible(true);
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

        // Add JFrame for Entrepreneurship
        JFrame inner_ent = new JFrame();
        inner_ent.setLayout(null);
        inner_ent.setSize(1920, 1080);
        inner_ent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_ent.setLayout(null);
        inner_ent.setLocationRelativeTo(null);
        inner_ent.setResizable(false);
        inner_ent.add(new2_p_courses);

        //Show the frame when clicked
        btn2_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_ent.setVisible(true);
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

        // Add JFrame for Food Market
        JFrame inner_food_market = new JFrame();
        inner_food_market.setLayout(null);
        inner_food_market.setSize(1920, 1080);
        inner_food_market.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_food_market.setLayout(null);
        inner_food_market.setLocationRelativeTo(null);
        inner_food_market.setResizable(false);
        inner_food_market.add(new3_p_courses);

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

        // Add JFrame for New Product Development
        JFrame inner_product_dev = new JFrame();
        inner_product_dev.setLayout(null);
        inner_product_dev.setSize(1920, 1080);
        inner_product_dev.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_product_dev.setLayout(null);
        inner_product_dev.setLocationRelativeTo(null);
        inner_product_dev.setResizable(false);
        inner_product_dev.add(new4_p_courses);

        //Show the frame when clicked
        btn4_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_product_dev.setVisible(true);
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

        // Add JFrame for Food Legislation
        JFrame inner_food_legislation = new JFrame();
        inner_food_legislation.setLayout(null);
        inner_food_legislation.setSize(1920, 1080);
        inner_food_legislation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_food_legislation.setLayout(null);
        inner_food_legislation.setLocationRelativeTo(null);
        inner_food_legislation.setResizable(false);
        inner_food_legislation.add(new5_p_courses);

        //Show the frame when clicked
        btn5_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_food_legislation.setVisible(true);
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

        // Add JFrame for Food Industrial Design
        JFrame inner_indus_design = new JFrame();
        inner_indus_design.setLayout(null);
        inner_indus_design.setSize(1920, 1080);
        inner_indus_design.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inner_indus_design.setLayout(null);
        inner_indus_design.setLocationRelativeTo(null);
        inner_indus_design.setResizable(false);
        inner_indus_design.add(new6_p_courses);

        //Show the frame when clicked
        btn6_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcourses.setVisible(false);
                inner_indus_design.setVisible(true);
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