package PasswGenerator;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class File {
	{
		File pw = new File("pwarchiv.txt");
		if(!pw.exists()) {
			try {
				pw.createNewFile();
				System.out.println("Die Datei pwarchiv.txt wurde erstellt");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		if(pw.canWrite()) {
			try {
				FileWriter fw = new FileWriter(pw, true);
				Formatter fm = new Formatter(fw);
				Scanner sf = new Scanner(pw);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Neuer Password wurde generiert und gespeichert: "); 
				
				String text = sc.nextLine();
				fm.format("%s \r \n", text);
				fm.close();
				fw.close();
				
				System.out.println("\nInhalt der Datei: ");
				while(sf.hasNextLine()) {
					System.out.println(sf.nextLine());
				}
				sc.close();
				sf.close();
				
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
