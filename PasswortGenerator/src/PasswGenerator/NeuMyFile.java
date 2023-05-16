package PasswGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException; // Strg + shitf + O
import java.util.Scanner;

public class NeuMyFile {
	
	private final String PATH = "src/pwarchiv.txt";
	
	public NeuMyFile() {
		
	}
	
	public void writePasswordToFile(String pw) throws IOException {
		File file = new File(PATH);
		
		FileWriter fw = new FileWriter(file, true);
		fw.write(pw);
		fw.flush();
		fw.close();
	}
	
	public String readPasswortFromFile() {
		String content = "";
		// File einlesen und dem Content hinzufügen
		return content;
		
		// Scanner sc = new Scanner(fw.content);
		
	}
	
}
