package school.management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Label;
import java.awt.TextField;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(334, 136, 178, 28);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(93, 196, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" Reset Password");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(350, 196, 162, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Create Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				NewUser al = new NewUser();
				setLocationRelativeTo(null);
				al.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(350, 245, 162, 28);
		contentPane.add(btnNewButton_2);
		
		Label label = new Label("User Login");
		label.setFont(new Font("Verdana", Font.PLAIN, 24));
		label.setBounds(214, 20, 130, 36);
		contentPane.add(label);
		
		Label label_1 = new Label("User Name");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(93, 80, 114, 28);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Password");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(93, 136, 112, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("New Users Click Here");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_3.setBounds(72, 261, 162, 22);
		contentPane.add(label_3);
		
		TextField textField = new TextField();
		textField.setBounds(334, 80, 178, 36);
		contentPane.add(textField);
		
		JButton btnNewButton_3 = new JButton("Admin");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				AdminLogin ul = new AdminLogin();
				ul.setLocationRelativeTo(null);
				ul.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(276, 307, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
