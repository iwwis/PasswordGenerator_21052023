package PasswGenerator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JSlider;

public class PasswordAnzeige extends JFrame {
	
	
	JLabel label;
	JTextField generiertesPassword;
	JButton button;
	PasswordGenerator pwg;
	
	public PasswordAnzeige(PasswordGenerator pwg) {
		getContentPane().setBackground(new Color(214, 214, 214));
		getContentPane().setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pwg = pwg;
		this.label = new JLabel("Kopiere dein Passwort");
		this.button = new JButton("Erzeuge Passwort");
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		label.setBackground(new Color(240, 240, 240));
		label.setSize(189, 30);
		label.setLocation(95, 86);
	
		button.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		button.setForeground(new Color(0, 64, 128));
		button.setSize(173, 34);
		button.setLocation(95, 29);

		getContentPane().setLayout(null);
		getContentPane().add(button);
		getContentPane().add(label);

		
		generiertesPassword = new JTextField("Dein neues Passwort...");
		this.generiertesPassword.setBounds(getBounds(new Rectangle(50,50,50,50)));
		generiertesPassword.setHorizontalAlignment(SwingConstants.CENTER);
		generiertesPassword.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		generiertesPassword.setBounds(80, 176, 214, 25);
		
		getContentPane().add(generiertesPassword);

		// Listener
				this.button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// Das passiert, wenn der Button geklickt wird!
						String getCharacters = PasswordGenerator.getCharacters(CharacterSet.All);
						
						/// Kommentar korrigieren***!!!
						// Um die Länge des Passworts festzulegen, kann mann in der Zeile unten 
						// anstatt --- getCharacters.length() ---
						// ein festes Wert angeben. Zum Beispiel 24
						// String passwort = PasswordGenerator.generatePassword(getCharacters.length(), CharacterSet.All);
						// in diesem Projekt beschränkt man sich auf 24 Zeichen
						String passwort = PasswordGenerator.generatePassword(24, CharacterSet.All);
						PasswordAnzeige.this.generiertesPassword.setText(passwort);
						
						NeuMyFile mfh = new NeuMyFile();
						
						try {
							mfh.writePasswordToFile((passwort) + "\n");	
						}
						catch(IOException exc) {
							System.out.println("File wurde nicht korrekt gespeichert!");
						}
					}});
				
				// Ende des Konstruktors
	} 
}
