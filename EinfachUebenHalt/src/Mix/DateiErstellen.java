package Mix;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class DateiErstellen {

	public static void main(String[] args) {
		File f = new File("C://Users//Stephan D//Desktop//apfel.txt"); 
		if(!f.exists()){			 //wenn File nicht vorhanden ist
			try {
			Formatter format = new Formatter("C://Users//Stephan D//Desktop//apfel.txt"); // wird datei neu erstellt!
			System.out.println("Datei neu erstellt");
			} catch(FileNotFoundException e) {
			e.printStackTrace();
			
				
			}
			System.out.println("Datei bereits vorhanden");
		}
		
	}
	
}
