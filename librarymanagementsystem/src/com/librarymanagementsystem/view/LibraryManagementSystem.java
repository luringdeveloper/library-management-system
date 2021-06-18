package com.librarymanagementsystem.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.librarymanagementsystem.utility.ImageResizer;
import com.librarymanagementsystem.utility.RoundedPanel;

import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.SpinnerNumberModel;

public class LibraryManagementSystem extends JFrame {

	private JPanel contentPane;
	private JTextField loginphonenumber;
	private JPasswordField loginpassword;
	private JPasswordField passwordField2;
	private JTextField textField_1;
	private JTextField signupinstitutename;
	private JTextField txtEnter;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField signuppassword;
	private JPasswordField signuprepassword;
	private JTextField signuplibrarianame;
	private JTextField signuplibrarianmobile;
	private JTextField signupdpbl;
	private JPasswordField signupalternatepassword;
	private JTextField textField;
	private JTextField pprln;
	private JTextField ppslmn;
	private JPasswordField ppsap;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryManagementSystem frame = new LibraryManagementSystem();
					frame.setResizable(false);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	////
	

	/**
	 * Create the frame.
	 */
	private LibraryManagementSystem() {
		setBackground(Color.DARK_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LibraryManagementSystem.class.getResource("/com/librarymanagementsystem/images/icon.png")));
		setTitle("Library Management System");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 530);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(5, 5, 773, 481);
		
		JPanel panel = new RoundedPanel();
		panel.setBackground(new Color(0.8f,0.8f,0.8f,0.4f));
		panel.setBounds(243, 113, 315, 250);
		
		JPanel panel_1 = new RoundedPanel();
		panel_1.setBackground(new Color(0.8f,0.8f,0.8f,0.4f));
		panel_1.setBorder(null);
		//panel_1.setOpaque(false);
		panel_1.setForeground(Color.WHITE);
		
		panel_1.setBounds(50, 11, 315, 459);
		panel_1.setVisible(false);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new RoundedPanel();
		panel_2.setBounds(10, 50, 295, 39);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(null);
		
		JPanel panel_2_1 = new RoundedPanel();
		panel_2_1.setBounds(10, 107, 295, 39);
		panel_2_1.setBorder(null);
		panel_2_1.setBackground(Color.DARK_GRAY);
		
		JLabel forgetpassword = new JLabel("Forget Password?");
		
		forgetpassword.setBounds(206, 157, 99, 15);
		forgetpassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		forgetpassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		forgetpassword.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel createnewaacount = new JLabel("Create New Account?");
		
		createnewaacount.setBounds(10, 157, 138, 15);
		createnewaacount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		createnewaacount.setHorizontalAlignment(SwingConstants.LEFT);
		createnewaacount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton loginbutton = new JButton("Login");
	
		
		loginbutton.setBounds(102, 183, 123, 33);
		loginbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginbutton.setForeground(Color.WHITE);
		loginbutton.setBackground(Color.DARK_GRAY);
		loginbutton.setBorder(null);
		loginbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(5, 7, 29, 28);
		lblNewLabel_1.setIcon(ImageResizer.resize(new ImageIcon(LibraryManagementSystem.class.getResource("/com/librarymanagementsystem/images/usericon.png")), 29,28));
		desktopPane.setLayout(null);
		desktopPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("It's quick and easy.");
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setForeground(new Color(28, 30, 33));
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 36, 117, 24);
		panel_1.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(new Color(189, 183, 107));
		textField_1.setBorder(null);
		textField_1.setBounds(0, 58, 315, 3);
		textField_1.setCaretColor(Color.white);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		signupinstitutename = new JTextField(15);
		signupinstitutename.setOpaque(false);
		signupinstitutename.setHorizontalAlignment(SwingConstants.CENTER);
		signupinstitutename.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signupinstitutename.setText("Enter Institution Name");
		signupinstitutename.setBorder(new LineBorder(Color.BLACK, 1, true));
		signupinstitutename.setBackground(Color.DARK_GRAY);
		signupinstitutename.setForeground(Color.BLACK);
		signupinstitutename.setBounds(10, 65, 295, 30);
		signupinstitutename.setCaretColor(Color.white);
		panel_1.add(signupinstitutename);
		signupinstitutename.setColumns(10);
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Gender?");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(12, 302, 87, 24);
		panel_1.add(lblNewLabel_4_1);
		
		JRadioButton signupmale = new JRadioButton("Male");
		signupmale.setOpaque(false);
		buttonGroup.add(signupmale);
		signupmale.setHorizontalAlignment(SwingConstants.CENTER);
		signupmale.setFont(new Font("Times New Roman", Font.BOLD, 12));
		signupmale.setForeground(Color.BLACK);
		signupmale.setBackground(Color.DARK_GRAY);
		signupmale.setBounds(10, 324, 78, 23);
		panel_1.add(signupmale);
		
		JRadioButton signupfemale = new JRadioButton("Female");
		signupfemale.setOpaque(false);
		buttonGroup.add(signupfemale);
		signupfemale.setBorder(new LineBorder(Color.DARK_GRAY));
		signupfemale.setHorizontalAlignment(SwingConstants.CENTER);
		signupfemale.setFont(new Font("Times New Roman", Font.BOLD, 12));
		signupfemale.setForeground(Color.BLACK);
		signupfemale.setBackground(Color.DARK_GRAY);
		signupfemale.setBounds(109, 324, 87, 23);
		panel_1.add(signupfemale);
		
		JRadioButton signuptransgender = new JRadioButton("Transgender ");
		signuptransgender.setOpaque(false);
		buttonGroup.add(signuptransgender);
		signuptransgender.setHorizontalAlignment(SwingConstants.CENTER);
		signuptransgender.setFont(new Font("Times New Roman", Font.BOLD, 12));
		signuptransgender.setForeground(Color.BLACK);
		signuptransgender.setBackground(Color.DARK_GRAY);
		signuptransgender.setBounds(211, 324, 96, 23);
		panel_1.add(signuptransgender);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Sign Up");
		lblNewLabel_3_2_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3_2_1.setBounds(5, 0, 117, 39);
		panel_1.add(lblNewLabel_3_2_1);
		
		JButton signupdone = new JButton("Done");
		
		signupdone.setForeground(Color.WHITE);
		signupdone.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signupdone.setBorder(null);
		signupdone.setBackground(Color.DARK_GRAY);
		signupdone.setBounds(93, 399, 123, 33);
		panel_1.add(signupdone);
		
		signuppassword = new JPasswordField();
		signuppassword.setOpaque(false);
		signuppassword.setHorizontalAlignment(SwingConstants.CENTER);
		signuppassword.setBorder(new LineBorder(Color.BLACK, 1, true));
		signuppassword.setText("Enter Password");
		signuppassword.setEchoChar((char)0);
		signuppassword.setBackground(Color.DARK_GRAY);
		signuppassword.setForeground(Color.BLACK);
		signuppassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signuppassword.setBounds(10, 102, 295, 30);
		panel_1.add(signuppassword);
		
		signuprepassword = new JPasswordField();
		signuprepassword.setOpaque(false);
		signuprepassword.setHorizontalAlignment(SwingConstants.CENTER);
		signuprepassword.setBorder(new LineBorder(Color.BLACK, 1, true));
		signuprepassword.setEchoChar((char)0);
		signuprepassword.setText("Re-Enter Your Password");
		signuprepassword.setBackground(Color.DARK_GRAY);
		signuprepassword.setForeground(Color.BLACK);
		signuprepassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signuprepassword.setBounds(10, 140, 295, 30);
		panel_1.add(signuprepassword);
		
		signuplibrarianame = new JTextField(10);
		signuplibrarianame.setOpaque(false);
		signuplibrarianame.setText("Enter Librarian Name");
		signuplibrarianame.setHorizontalAlignment(SwingConstants.CENTER);
		signuplibrarianame.setForeground(Color.BLACK);
		signuplibrarianame.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signuplibrarianame.setCaretColor(Color.WHITE);
		signuplibrarianame.setBorder(new LineBorder(Color.BLACK, 1, true));
		signuplibrarianame.setBackground(Color.DARK_GRAY);
		signuplibrarianame.setBounds(10, 178, 295, 30);
		panel_1.add(signuplibrarianame);
		
		signuplibrarianmobile = new JTextField(10);
		signuplibrarianmobile.setOpaque(false);
		signuplibrarianmobile.setText("Enter Librarian Mobile Number");
		signuplibrarianmobile.setHorizontalAlignment(SwingConstants.CENTER);
		signuplibrarianmobile.setForeground(Color.BLACK);
		signuplibrarianmobile.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signuplibrarianmobile.setCaretColor(Color.WHITE);
		signuplibrarianmobile.setBorder(new LineBorder(Color.BLACK, 1, true));
		signuplibrarianmobile.setBackground(Color.DARK_GRAY);
		signuplibrarianmobile.setBounds(10, 218, 295, 30);
		panel_1.add(signuplibrarianmobile);
		
		signupdpbl = new JTextField(10);
		signupdpbl.setOpaque(false);
		signupdpbl.setEditable(false);
		signupdpbl.setHorizontalAlignment(SwingConstants.CENTER);
		signupdpbl.setForeground(Color.WHITE);
		signupdpbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signupdpbl.setCaretColor(Color.WHITE);
		signupdpbl.setBorder(new LineBorder(Color.BLACK, 1, true));
		signupdpbl.setBackground(Color.DARK_GRAY);
		signupdpbl.setBounds(10, 272, 186, 30);
		panel_1.add(signupdpbl);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setOpaque(false);
		btnBrowse.setForeground(Color.BLACK);
		btnBrowse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBrowse.setBorder(new LineBorder(Color.BLACK, 1, true));
		btnBrowse.setBackground(Color.DARK_GRAY);
		btnBrowse.setBounds(211, 271, 100, 33);
		panel_1.add(btnBrowse);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Profile Image");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(10, 248, 87, 24);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Security Question (Enter Alternate Password)");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4_1_1_1.setBounds(10, 346, 282, 24);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		signupalternatepassword = new JPasswordField();
		signupalternatepassword.setOpaque(false);
		signupalternatepassword.setText("Alternate Password");
		signupalternatepassword.setHorizontalAlignment(SwingConstants.CENTER);
		signupalternatepassword.setForeground(Color.BLACK);
		signupalternatepassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		signupalternatepassword.setEchoChar((char)0);
		signupalternatepassword.setBorder(new LineBorder(Color.BLACK, 1, true));
		signupalternatepassword.setBackground(Color.DARK_GRAY);
		signupalternatepassword.setBounds(10, 368, 295, 30);
		panel_1.add(signupalternatepassword);
		
		JLabel signuperror = new JLabel("");
		signuperror.setForeground(new Color(139, 0, 0));
		signuperror.setFont(new Font("Serif", Font.BOLD, 15));
		signuperror.setHorizontalAlignment(SwingConstants.CENTER);
		signuperror.setBounds(36, 435, 244, 24);
		panel_1.add(signuperror);
		
		
		desktopPane.add(panel);
		panel.setLayout(null);
		panel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.add(lblNewLabel_1);
		
		loginphonenumber = new JTextField();
		loginphonenumber.setText("Enter Phone Number");
		loginphonenumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		loginphonenumber.setForeground(Color.WHITE);
		loginphonenumber.setBorder(null);
		loginphonenumber.setOpaque(false);
		loginphonenumber.setCaretColor(getForeground());
		loginphonenumber.setBounds(44, 0, 251, 39);
		loginphonenumber.setCaretColor(Color.white);
		panel_2.add(loginphonenumber);
		loginphonenumber.setColumns(10);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(ImageResizer.resize(new ImageIcon(LibraryManagementSystem.class.getResource("/com/librarymanagementsystem/images/passwordicon.png")), 29,28));
		lblNewLabel_1_1.setBounds(5,7, 29, 28);
		panel_2_1.add(lblNewLabel_1_1);
		
		loginpassword = new JPasswordField();
		loginpassword.setText("Enter Password");
		loginpassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		loginpassword.setOpaque(false);
		loginpassword.setEchoChar((char)0);
		loginpassword.setForeground(Color.WHITE);
		loginpassword.setBorder(null);
		loginpassword.setBounds(44, 0, 223, 39);
		loginpassword.setCaretColor(Color.white);
		loginpassword.setCaretColor(getForeground());
		panel_2_1.add(loginpassword);
		panel.add(createnewaacount);
		panel.add(forgetpassword);
		panel.add(loginbutton);
		
		JLabel lblNewLabel_3_2 = new JLabel("Sign In");
		lblNewLabel_3_2.setForeground(new Color(28, 30, 33));
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3_2.setBounds(0, 0, 117, 39);
		panel.add(lblNewLabel_3_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setCaretColor(Color.white);
		textField_2.setBackground(new Color(189, 183, 107));
		textField_2.setBounds(0, 39, 315, 3);
		panel.add(textField_2);
		
		JLabel loginerror = new JLabel("");
		loginerror.setHorizontalAlignment(SwingConstants.CENTER);
		loginerror.setForeground(new Color(139, 0, 0));
		loginerror.setFont(new Font("Serif", Font.BOLD, 15));
		loginerror.setBounds(41, 215, 244, 24);
		panel.add(loginerror);
		contentPane.add(desktopPane);
		
		RoundedPanel profilepasswordreset = new RoundedPanel();
		profilepasswordreset.setLayout(null);
		profilepasswordreset.setBounds(448, 89, 315, 277);
		profilepasswordreset.setVisible(false);
		profilepasswordreset.setBackground(new Color(0.8f,0.8f,0.8f,0.4f));
		desktopPane.add(profilepasswordreset);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("It's quick and easy.");
		lblNewLabel_3_1_1.setForeground(new Color(28, 30, 33));
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBackground(Color.WHITE);
		lblNewLabel_3_1_1.setBounds(10, 36, 117, 24);
		profilepasswordreset.add(lblNewLabel_3_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setCaretColor(Color.WHITE);
		textField.setBorder(null);
		textField.setBackground(new Color(189, 183, 107));
		textField.setBounds(0, 58, 315, 3);
		profilepasswordreset.add(textField);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Profile Password Reset");
		lblNewLabel_3_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3_2_1_1.setBounds(5, 0, 209, 39);
		profilepasswordreset.add(lblNewLabel_3_2_1_1);
		
		JButton ppsd = new JButton("Done");
		ppsd.setForeground(Color.WHITE);
		ppsd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ppsd.setBorder(null);
		ppsd.setBackground(Color.DARK_GRAY);
		ppsd.setBounds(95, 193, 123, 33);
		profilepasswordreset.add(ppsd);
		
		pprln = new JTextField(10);
		pprln.setText("Enter Librarian Name");
		pprln.setOpaque(false);
		pprln.setHorizontalAlignment(SwingConstants.CENTER);
		pprln.setForeground(Color.BLACK);
		pprln.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pprln.setCaretColor(Color.WHITE);
		pprln.setBorder(new LineBorder(Color.BLACK, 1, true));
		pprln.setBackground(Color.DARK_GRAY);
		pprln.setBounds(10, 71, 295, 30);
		profilepasswordreset.add(pprln);
		
		ppslmn = new JTextField(10);
		ppslmn.setText("Enter Librarian Mobile Number");
		ppslmn.setOpaque(false);
		ppslmn.setHorizontalAlignment(SwingConstants.CENTER);
		ppslmn.setForeground(Color.BLACK);
		ppslmn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ppslmn.setCaretColor(Color.WHITE);
		ppslmn.setBorder(new LineBorder(Color.BLACK, 1, true));
		ppslmn.setBackground(Color.DARK_GRAY);
		ppslmn.setBounds(10, 111, 295, 30);
		profilepasswordreset.add(ppslmn);
		
		ppsap = new JPasswordField();
		ppsap.setText("Alternate Password");
		ppsap.setOpaque(false);
		ppsap.setHorizontalAlignment(SwingConstants.CENTER);
		ppsap.setForeground(Color.BLACK);
		ppsap.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ppsap.setEchoChar(' ');
		ppsap.setBorder(new LineBorder(Color.BLACK, 1, true));
		ppsap.setBackground(Color.DARK_GRAY);
		ppsap.setBounds(10, 152, 295, 30);
		profilepasswordreset.add(ppsap);
		
		JLabel pprerror = new JLabel("");
		pprerror.setHorizontalAlignment(SwingConstants.CENTER);
		pprerror.setForeground(new Color(139, 0, 0));
		pprerror.setFont(new Font("Serif", Font.BOLD, 15));
		pprerror.setBounds(41, 237, 244, 24);
		profilepasswordreset.add(pprerror);
		
				
		JLabel indexbackground = new JLabel("");
		indexbackground.setFont(new Font("Times New Roman", Font.BOLD, 20));
		indexbackground.setForeground(Color.WHITE);
		indexbackground.setIcon(ImageResizer.resize(new ImageIcon(LibraryManagementSystem.class.getResource("/com/librarymanagementsystem/images/background.jpg")), 773,481));
		indexbackground.setBounds(0, 0, 773, 481);
		
		desktopPane.add(indexbackground);

		
		createnewaacount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel.setVisible(false);
				panel_1.setBounds(243, 11, 315, 459);
				panel_1.setVisible(true);
				
			}
		});
		
		
		signupdone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		
		
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard dsDashboard=new Dashboard();
				dsDashboard.setVisible(true);
				dispose();
			}
		});
		
		forgetpassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profilepasswordreset.setBounds(243, 113, 315, 277);
				panel.setVisible(false);
				profilepasswordreset.setVisible(true);
				
				
			}
		});
		ppsd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				profilepasswordreset.setVisible(false);
				panel.setVisible(true);
			}
		});
		
		//browse event start
				btnBrowse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser fileChooser=new JFileChooser();
						fileChooser.setFileFilter(new FileNameExtensionFilter("Image File", "jpg"));				
						int i=fileChooser.showOpenDialog(LibraryManagementSystem.this);
						if(i==fileChooser.APPROVE_OPTION) {
							File file=fileChooser.getSelectedFile();
							
							if(file.getAbsolutePath().endsWith(".jpg")||file.getAbsolutePath().endsWith(".png"))
								signupdpbl.setText(file.getAbsolutePath());
							
							
						}
						
					}
				});
				//browse event end
		
	}
}
