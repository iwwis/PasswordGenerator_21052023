package PasswGenerator;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		// readPasswortFromFile - file auslesen! aufrufen!
		NeuMyFile mfh = new NeuMyFile();

	
		// die Variable s wird mit einem Wert belegt
		// der Wert wurde durch den PasswordGenerator mit der Methode generatePassword gesettet
		// seine Parameter sind: 
		// 1. er muss 16 Zeichen haben und
		// 2. er nimmt die Werte aus der Klasse PasswordGenerator, erstellt aus dem String CharacterSet, 
		// 3. Werte werden aus dem Switch-Fall "All" genommen
		// 4. Ausgabe s gibt ein random-Wert aus - das sollte sie wenigstens machen!
		
		String s = PasswordGenerator.generatePassword(20, PasswordGenerator.CharacterSet.All);
		System.out.println(s);
		
		try {
			mfh.writePasswordToFile((s) + "\n");		
		}
		catch(IOException e) {
			System.out.println("File wurde nicht korrekt gespeichert!");
		}
		
		
	}
}
