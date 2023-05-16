package PasswGenerator;

// SecureRandom has 128 bits
// Random class has only 48 bits 
// This class provides a cryptographically strong random number generator (RNG)!

public class SecureRandom {
	
	
	public SecureRandom(String s) {
		
		
		
	}
	// SecureRandom sollte deklariert werden als:
	// SecureRandom random = new SecureRandom();
	// die Klasse SecureRandom wurde schon im PasswordGenerator deklariert
	// als
	// private static final SecureRandom secureRandom = new SecureRandom();

	// die Variable bytes vom Typ byte wurde deklariert
	// der Variable bytes wurde der Wert 16 zugewiesen
	byte bytes[] = new byte[16];
    
	// diese Zeile wurde bei der Oracle Doku vorgeschlagen, aber hier ergibt sie einen Fehler
	// random.nextBytes(bytes);
    
	// diese Zeile wurde bei der Oracle Doku vorgeschlagen, aber hier ergibt sie einen Fehler
	// seed bedeutet, dass man aus einem bestimmten Korn(seed) die Werte zum Generieren nimmt/get
    // byte seed[] = random.generateSeed(20);
    
	
	public int nextInt(int length) {
		//Random rand = new Random();
		//return "" + rand.nextInt(length);
		return 1;
	}
}
