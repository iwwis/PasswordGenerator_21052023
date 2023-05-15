package PasswGenerator;

public class Main {

	public static void main(String[] args) {
	
		// die Variable s wird mit einem Wert belegt
		// der Wert wurde durch den PasswordGenerator mit der Methode generatePassword gesettet
		// seine Parameter sind: 
		// 1. er muss 16 Zeichen haben und
		// 2. er nimmt die Werte aus der Klasse PasswordGenerator, erstellt aus dem String CharacterSet, 
		// 3. Werte werden aus dem Switch-Fall "All" genommen
		// 4. Ausgabe s gibt ein random-Wert aus - das sollte sie wenigstens machen!
		String s = PasswordGenerator.generatePassword(16, PasswordGenerator.CharacterSet.All);
		System.out.println(s);
		
		}
}
