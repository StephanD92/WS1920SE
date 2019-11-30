package Dateien;

import java.io.*;

import javax.swing.JFileChooser;

public class EinXEins {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(fc);
		try {
		File file = fc.getSelectedFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		String text = null;
		for  (int x = 1; x<=10; x++) {
			text = "0; ";
			for (int y = 1; y<=10; y++) {
				text = text + x*y + "; ";
			}
			bw.write(text);
			bw.newLine();
		}
		bw.close();
		fw.close();
		} catch(IOException e) {
			e.printStackTrace();
	}	

}
}