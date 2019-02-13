package school.management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Admin Login");
		label.setFont(new Font("Verdana", Font.PLAIN, 24));
		label.setBounds(157, 30, 148, 30);
		contentPane.add(label);
		
		Label label_1 = new Label("User Name");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(44, 100, 99, 30);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Password");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(44, 176, 87, 30);
		contentPane.add(label_2);
		
		TextField textField = new TextField();
		textField.setBounds(199, 100, 148, 37);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(199, 176, 148, 30);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(199, 244, 92, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset Password");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(351, 244, 148, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("User Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserLogin ul = new UserLogin();
				ul.setLocationRelativeTo(null);
				ul.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(223, 303, 136, 30);
		contentPane.add(btnNewButton_2);
	}
}
