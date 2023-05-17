package PasswGenerator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PasswordAnzeige extends JFrame {
	
	
	JLabel label;
	JTextField generiertesPassword;
	JButton button;
	PasswordGenerator pwg;
	
	public PasswordAnzeige(PasswordGenerator pwg) {
		getContentPane().setBackground(new Color(214, 214, 214));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pwg = pwg;
		this.label = new JLabel("Neu erzeugtes Passwort: ");


		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		label.setBackground(new Color(240, 240, 240));
		label.setSize(173, 30);
		label.setLocation(94, 121);
	
		this.button = new JButton("Erzeuge Passwort");
		button.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		button.setForeground(new Color(0, 64, 128));
		button.setSize(173, 34);
		button.setLocation(95, 29);
		// button.setBackground(new Color(0,0,0 ));
		getContentPane().setLayout(null);
		getContentPane().add(button);
		getContentPane().add(label);

		
		generiertesPassword = new JTextField("Dein neues Passwort...");
		this.generiertesPassword.setBounds(getBounds(new Rectangle(50,50,50,50)));
		generiertesPassword.setHorizontalAlignment(SwingConstants.CENTER);
		generiertesPassword.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		generiertesPassword.setBounds(95, 176, 184, 25);
		
		getContentPane().add(generiertesPassword);

		// Listener
				this.button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// Das passiert, wenn der Button geklickt wird!
						String getCharacters = PasswordGenerator.getCharacters(CharacterSet.All);
						String passwort = PasswordGenerator.generatePassword(getCharacters.length(), CharacterSet.All);
						PasswordAnzeige.this.generiertesPassword.setText(passwort);
						
					}});
				// Ende des Konstruktors
	} 
}
