package T06_20190514;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFileChooser {
	
	private JFileChooser fc;

	public MyFileChooser() {
		fc = new JFileChooser();		// erzeugt Objekt der Klase
		FileFilter filterTxt = new FileNameExtensionFilter("Textdatei","txt");
		FileFilter filterObj = new FileNameExtensionFilter("Objektdateiallalal", "obj");
		fc.addChoosableFileFilter(filterTxt);
		fc.addChoosableFileFilter(filterObj);

	}

	public File load() {
		// Oeffnen-Dialog anzeigen
		// statt null sollte hier ein Mutterfenster eingegeben werden.
		// z.B. this, wenn aus einer Grafik heraus der Aufruf erfolgt.
		int returnValue = fc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			System.out.println(fc.getSelectedFile());
			return fc.getSelectedFile();
		}
		return null;
	}
	
	public File save() {
		// Speichern-Dialog anzeigen
		// statt null sollte hier ein Mutterfenster eingegeben werden.
		// z.B. this, wenn aus einer Grafik heraus der Aufruf erfolgt.
		int returnValue = fc.showSaveDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			System.out.println(fc.getSelectedFile());
			return fc.getSelectedFile();
		}
		return null;
	}

	public static void main(String[] args) {
		new MyFileChooser().load();
	}

}
