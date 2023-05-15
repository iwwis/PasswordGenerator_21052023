package PasswGenerator;

public class PasswordGenerator {

	// Auswahl von beliebigen Zeichen nach der Methode SecureRandom
    private static final SecureRandom secureRandom = new SecureRandom();

    // Auswahl der möglichen Zeichen deklariert in folgenden Strings:
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz";		// Kleinbuchstaben
    private static final String alphaCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// Großbuchstaben
    private static final String numeric = "0123456789";						// Zahlen
    private static final String specials = "!§$%&/()=?.:,;+*#<>";			// Sonderzeichen

    // Auswahl der möglichen Zeichenketten(Strings) definiert in Enum 
    public enum CharacterSet {
        Alpha,
        AlphaCaps,
        AlphaBoth,
        Numeric,
        AlphaNumeric,
        Special,
        All
    }
    // Initialisierung von einem String GetCharakters - nimm die o.g. Zeichen
    private static String getCharacters(CharacterSet characterSet) {

    	// switch von charakterSet - set die o.g. Zeichen
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
        String characters = getCharacters(characterSet);
        StringBuilder stringBuilder = new StringBuilder();
        
        // for-Schleife zum Durchgehen des gebildeten Strings mit allen Zeichen: StringBuilder
        for (int i = 0; i < length; i++) {
            stringBuilder.append(characters.charAt(secureRandom.nextInt(characters.length())));
        }

        return stringBuilder.toString();

    }
}