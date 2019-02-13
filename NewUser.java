package school.management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
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
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("New User Registration");
		label.setFont(new Font("Dialog", Font.PLAIN, 24));
		label.setBounds(200, 10, 253, 34);
		contentPane.add(label);
		
		Label label_1 = new Label("First Name");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_1.setBounds(30, 68, 104, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Username");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_2.setBounds(30, 147, 82, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Last Name");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_3.setBounds(331, 68, 82, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label("Password");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_4.setBounds(326, 133, 110, 35);
		contentPane.add(label_4);
		
		TextField firstname = new TextField();
		firstname.setFont(new Font("Dialog", Font.PLAIN, 16));
		firstname.setBounds(140, 68, 137, 22);
		contentPane.add(firstname);
		
		TextField lastname = new TextField();
		lastname.setFont(new Font("Dialog", Font.PLAIN, 16));
		lastname.setBounds(445, 68, 150, 22);
		contentPane.add(lastname);
		
		TextField username = new TextField();
		username.setFont(new Font("Dialog", Font.PLAIN, 16));
		username.setBounds(140, 147, 137, 22);
		contentPane.add(username);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		password.setBounds(458, 147, 137, 22);
		contentPane.add(password);
		
		Label label_5 = new Label("Email ID");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_5.setBounds(30, 218, 82, 22);
		contentPane.add(label_5);
		
		Label label_6 = new Label("WEB URL");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_6.setBounds(341, 218, 82, 22);
		contentPane.add(label_6);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		registerBtn.setBounds(230, 272, 89, 23);
		contentPane.add(registerBtn);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resetBtn.setBounds(398, 272, 126, 23);
		contentPane.add(resetBtn);
		
		TextField email = new TextField();
		email.setBounds(140, 218, 143, 22);
		contentPane.add(email);
		
		TextField weburl = new TextField();
		weburl.setBounds(445, 218, 150, 22);
		contentPane.add(weburl);
		
		JButton signUp = new JButton("Already have an Account? Click Here.");
		signUp.setBounds(230, 336, 277, 28);
		contentPane.add(signUp);
	}

}
