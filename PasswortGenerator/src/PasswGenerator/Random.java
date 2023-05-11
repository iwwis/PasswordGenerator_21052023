package PasswGenerator;

public class Random {

}

/*
	int length = 16;
	String digits = "0123456789";
	String specials = "~=+%^* /()[]{}/!@#$?|";
	String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	           + "abcdefghijklmnopqrstuvwxyz"
	           + digits + specials;
	
	Random rnd = new Random();
	List<String> result = new ArrayList<>();
	
	Consumer<String> appendChar = s ->
		result.add("" + s.charAt(rnd.nextInt(s.length())));
	
		appendChar.accept(digits);
		appendChar.accept(specials);
	
		while (result.size() < length)
	    appendChar.accept(all);
	
		Collections.shuffle(result, rnd);
		String str = String.join("", result);



*/
	
	// korrekte Zeile: String specials = "~=+%^*/()[]{}/!@#$?|";

// Die Generator-Methode von:
// https://programming.guide/java/generating-a-random-string.html

