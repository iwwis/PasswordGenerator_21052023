package PasswGenerator;

public class Main {

	public static void main(String[] args) {
	
		String s = PasswordGenerator.generatePassword(16, PasswordGenerator.CharacterSet.All);
		System.out.println(s);
		
		}
	
}
