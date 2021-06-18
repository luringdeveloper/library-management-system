package com.librarymanagementsystem.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import com.librarymanagementsystem.utility.ImageResizer;
import com.librarymanagementsystem.utility.RoundedPanel;

import jiconfont.swing.IconFontSwing;

import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/com/librarymanagementsystem/images/icon.png")));
		Dimension dimension= Toolkit.getDefaultToolkit().getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, dimension.width,dimension.height);
		setTitle("Library Management System");
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(25,25,25));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		
		JPanel panel = new RoundedPanel();
		panel.setBackground(new Color(32,32,32));
		panel.setBounds(10, 11, 218, 681);
		desktopPane.add(panel);
		panel.setLayout(null);
		
		JLabel profilepic = new JLabel("");
		profilepic.setBorder(new LineBorder(new Color(25, 25, 25), 6, true));
		profilepic.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/background.jpg")), 169, 151));
		profilepic.setBounds(24, 25, 169, 151);
		panel.add(profilepic);
		
		JLabel lblNewLabel_3 = new JLabel("Ajay Pal");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(34, 187, 137, 27);
		panel.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		
		panel_3.setBackground(new Color(25,25,25));
		panel_3.setBounds(4, 290, 210, 46);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/dashboard.png")), 24,20));
		lblNewLabel_4.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(25,11,24,20);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dashboard");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(65, 0, 153, 44);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(25, 25, 25));
		panel_3_1.setBounds(4, 336, 210, 46);
		panel.add(panel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/revenue.png")), 24,20));
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(25,11,24,20);
		panel_3_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Analytics");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_5_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(65, 0, 153, 44);
		panel_3_1.add(lblNewLabel_5_1);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		panel_3_1_2.setBackground(new Color(25, 25, 25));
		panel_3_1_2.setBounds(4, 382, 210, 46);
		panel.add(panel_3_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("");
		lblNewLabel_4_1_2.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/profile.png")), 24,20));
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_4_1_2.setBounds(25,11,24,20);
		panel_3_1_2.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Profile ");
		lblNewLabel_5_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1_2.setForeground(new Color(105, 105, 105));
		lblNewLabel_5_1_2.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_5_1_2.setBounds(65, 0, 153, 44);
		panel_3_1_2.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/icon.png")), 28,27));
		lblNewLabel_6.setBounds(90, 604, 28, 27);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Library Management System");
		lblNewLabel_7.setForeground(Color.GRAY);
		lblNewLabel_7.setBackground(Color.GRAY);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(24, 643, 169, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Version 1.0");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setForeground(Color.GRAY);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1.setBackground(Color.GRAY);
		lblNewLabel_7_1.setBounds(24, 658, 169, 14);
		panel.add(lblNewLabel_7_1);
		
		JPanel panel_3_1_2_1 = new JPanel();
		panel_3_1_2_1.setLayout(null);
		panel_3_1_2_1.setBackground(new Color(25, 25, 25));
		panel_3_1_2_1.setBounds(4, 428, 210, 46);
		panel.add(panel_3_1_2_1);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("");
		lblNewLabel_4_1_2_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/sign out.png")), 24,20));
		lblNewLabel_4_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_2_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_4_1_2_1.setBounds(25,11,24,20);
		panel_3_1_2_1.add(lblNewLabel_4_1_2_1);
		
		JLabel lblNewLabel_5_1_2_1 = new JLabel("Sign Out");
		lblNewLabel_5_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1_2_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_5_1_2_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_5_1_2_1.setBounds(65, 0, 153, 44);
		panel_3_1_2_1.add(lblNewLabel_5_1_2_1);
		
		JLabel lblNewLabel_9 = new JLabel("Institute of Technology and Science");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_9.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(4, 208, 210, 21);
		panel.add(lblNewLabel_9);
		
		JPanel panel_1 = new RoundedPanel();
		panel_1.setBackground(new Color(32,32,32));
		panel_1.setBounds(238, 11, 1092, 74);
		desktopPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 40));
		lblNewLabel.setBounds(23, 22, 307, 52);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds(25, 57, 58, 2);
		panel_1.add(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBounds(238, 96, 1092, 596);
		desktopPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel card5 =new RoundedPanel();
		card5.setLayout(null);
		card5.setBackground(new Color(32, 32, 32));
		card5.setBounds(76, 322, 195, 235);
		panel_4.add(card5);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/addbook.png")), 58,71));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(66, 39, 58, 71);
		card5.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Add Book");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1_2.setBounds(10, 142, 175, 44);
		card5.add(lblNewLabel_1_2);
		
		JPanel card1 = new RoundedPanel(); 
		
		card1.setBorder(null);
		card1.setLayout(null);
		card1.setBackground(new Color(32, 32, 32));
		
		card1.setBounds(76, 44, 195, 235);
		panel_4.add(card1);
		
		JLabel lblNewLabel_1 = new JLabel("Total Dues");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1.setBounds(10, 154, 175, 44);
		card1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/duesleft.png")), 58,71));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 51, 58, 71);
		card1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("5500");
		lblNewLabel_8.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_8.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_8.setBounds(80, 51, 105, 72);
		card1.add(lblNewLabel_8);
		
		JPanel card2 = new RoundedPanel();
		card2.setLayout(null);
		card2.setBackground(new Color(32, 32, 32));
		card2.setBounds(335, 44, 195, 235);
		panel_4.add(card2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/issuebook.png")), 58,71));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(10, 49, 58, 71);
		card2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Issue Book");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1_1.setBounds(10, 152, 175, 44);
		card2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("200");
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_8_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_8_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_8_1.setBounds(80, 49, 105, 72);
		card2.add(lblNewLabel_8_1);
		
		JPanel card6 = new RoundedPanel();
		card6.setLayout(null);
		card6.setBackground(new Color(32, 32, 32));
		card6.setBounds(335, 322, 195, 235);
		panel_4.add(card6);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/removebook.png")), 58,71));
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setBounds(70, 37, 58, 71);
		card6.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Remove Book");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1_2_1.setBounds(10, 142, 175, 44);
		card6.add(lblNewLabel_1_2_1);
		
		JPanel card3 = new RoundedPanel();
		card3.setLayout(null);
		card3.setBackground(new Color(32, 32, 32));
		card3.setBounds(594, 44, 195, 235);
		panel_4.add(card3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Books Not Return ");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1_1_1.setBounds(10, 148, 175, 44);
		card3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setBounds(10, 48, 58, 71);
		card3.add(lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/booknotreturn.png")), 58,71));
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("78");
		lblNewLabel_8_1_2.setBounds(80, 48, 105, 72);
		card3.add(lblNewLabel_8_1_2);
		lblNewLabel_8_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_8_1_2.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_8_1_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		
		JPanel card7 = new RoundedPanel();
		card7.setLayout(null);
		card7.setBackground(new Color(32, 32, 32));
		card7.setBounds(594, 322, 195, 235);
		panel_4.add(card7);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Sell Book");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1_2_1_1.setBounds(10, 141, 175, 44);
		card7.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("");
		lblNewLabel_2_2_1_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/sellbook.png")), 58,51));
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setBounds(68, 56, 58, 51);
		card7.add(lblNewLabel_2_2_1_1);
		
		JPanel card4 = new RoundedPanel();
		card4.setLayout(null);
		card4.setBackground(new Color(32, 32, 32));
		card4.setBounds(851, 44, 195, 235);
		panel_4.add(card4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Return Book");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1_1_1_1.setBounds(10, 146, 175, 44);
		card4.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setBounds(72, 40, 58, 71);
		card4.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/returnbook.png")), 58,71));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel card8 = new RoundedPanel();
		card8.setLayout(null);
		card8.setBackground(new Color(32, 32, 32));
		card8.setBounds(851, 322, 195, 235);
		panel_4.add(card8);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Buy Book");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(47, 79, 79)));
		lblNewLabel_1_2_1_1_1.setBounds(10, 139, 175, 44);
		card8.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("");
		lblNewLabel_2_2_1_1_1.setIcon(ImageResizer.resize(new ImageIcon(Dashboard.class.getResource("/com/librarymanagementsystem/images/buybook.png")), 58,71));
		lblNewLabel_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1.setBounds(67, 36, 58, 71);
		card8.add(lblNewLabel_2_2_1_1_1);
		
		
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				card1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(47, 79, 79)));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				card1.setBorder(null);
			}
		});
		
		
	}
}
