package PasswGenerator;

import java.io.IOException;

public class Main {
	// die untere Methode startet das Programm:
	public static void main(String[] args) {
		// hier werden zwei wichtigsten Funktionen* 
		// mit dem Konstruktor erstellt und deklariert:
		// Klasse PasswordGenerator mit dem Bezeichner pg und ....
		// Klasse PasswordAnzeige mit dem Bezeichner pwa, die den pg aufruft***
		PasswordGenerator pg = new PasswordGenerator();
		PasswordAnzeige pwa = new PasswordAnzeige(pg);
		// durch die Anwendung von setVisible wird die Anzeige aufgerufen***
		pwa.setVisible(true);
		
		// Die unteren Notizen entstanden im Laufe der Arbeit an dem Projekt
		// in der ersten Version entstand ein Programm ohne User-Interface:
		
		// readPasswortFromFile - file auslesen! aufrufen!
		// NeuMyFile mfh = new NeuMyFile();

		// die Variable s wird mit einem Wert belegt
		// der Wert wurde durch den PasswordGenerator mit der Methode generatePassword gesettet
		// seine Parameter sind: 
		// 1. er muss 16 Zeichen haben und
		// 2. er nimmt die Werte aus der Klasse PasswordGenerator, erstellt aus dem String CharacterSet, 
		// 3. Werte werden aus dem Switch-Fall "All" genommen
		// 4. Ausgabe s gibt ein random-Wert aus - das sollte sie wenigstens machen!
		// dieser Teil des Codes hat funktioniert - aber ohne Eingabefläche
		/**
		 *
		 * String s = PasswordGenerator.generatePassword(24, CharacterSet.All);
		 * System.out.println(s);
		 * Dieses Block wurde in der Klasse PasswordAnzeige hinzugefügt
			try {
				mfh.writePasswordToFile((s) + "\n");		// "s" stand vorher für den Passwort
				}
			catch(IOException e) {			"e" stand vorher für IOException
				System.out.println("File wurde nicht korrekt gespeichert!");
				}
		*/	
	}
}
