package PasswGenerator;
import java.util.Random.*;
import java.security.SecureRandom;

enum CharacterSet {
    Alpha,
    AlphaCaps,
    AlphaBoth,
    Numeric,
    AlphaNumeric,
    Special,
    All
}


public class PasswordGenerator {

	// Auswahl von beliebigen Zeichen nach der Methode SecureRandom
    private static final SecureRandom secureRandom = new SecureRandom();

    // Auswahl der möglichen Zeichen deklariert in folgenden Strings:
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz";		// Kleinbuchstaben
    private static final String alphaCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// Großbuchstaben
    private static final String numeric = "0123456789";						// Zahlen
    private static final String specials = "!§$%&/()=?.:,;+*#<>";			// Sonderzeichen

    // Auswahl der möglichen Zeichenketten(Strings) definiert in Enum 
 
    // Initialisierung von einem String GetCharakters - kann dank enum CharacterSet nur die o.g. Zeichen nehmen!
    public static String getCharacters(CharacterSet characterSet) {

    	// switch von charakterSet - set die o.g. Zeichen als folgende swicht-cases
        switch (characterSet) {
            case Alpha:
                return alpha;
            case AlphaCaps:
                return alphaCaps;
            case AlphaBoth:
                return alpha + alphaCaps;
            case Numeric:
                return numeric;
            case AlphaNumeric:
                return alpha + alphaCaps + numeric;
            case Special:
                return specials;
            case All:
                return alpha + alphaCaps + numeric + specials;
        }

        return alpha;
    }
    
    // Deklaration des Strings generatePassword mit einer Länge (Typ: int) und aus dem String CharakterSet
    public static String generatePassword(int length, CharacterSet characterSet) { 
    	
    	// Construktor: aus getCharakters und charakterSet wird ein neuer String gebaut
    	// in der Klasse StringBuilder wird neue Klasse gebaut***** - Kommentar korrigieren!
        String characters = getCharacters(characterSet);

        StringBuilder stringBuilder = new StringBuilder();
        // for-Schleife zum Durchgehen des gebildeten Strings mit allen Zeichen: StringBuilder
        // die Funktion append hängt an den String stringBuilder die Werte aus den ()
        // die Funktion charAt gibt ein Zeichen zurück, der sich in dem String charakters befindet bis zu der Länge des Strings
        for (int i = 0; i < length; i++) {
            stringBuilder.append(characters.charAt(secureRandom.nextInt(characters.length())));
        }

        // Rückgabe eines neuen Strings stringBuilder 
        // mit der toString-Methode
        return stringBuilder.toString();
        // System.out.println(generiertesPassword);
    }
}