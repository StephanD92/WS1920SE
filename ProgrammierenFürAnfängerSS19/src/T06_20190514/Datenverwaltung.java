package T06_20190514;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Datenverwaltung {

	public Datenverwaltung() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean saveObject(File file, LinkedList<Artikel> artikelliste) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(artikelliste);
			return true;
		} catch (FileNotFoundException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(oos != null)
					oos.close();
				if(fos != null)
					fos.close();
			}catch(IOException io) {
				System.err.println("Fehler bei Abschlussarbeiten: " + io.getMessage());
			}
		}
	}
	
	public LinkedList<Artikel> loadObject(File file){

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj  = null;
		LinkedList<Artikel> artikelliste = null;
		
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			obj = ois.readObject();
			
			if(obj instanceof LinkedList<?>)
				artikelliste = (LinkedList<Artikel>) obj;
		} catch (FileNotFoundException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
		}catch(ClassCastException ce){
			System.err.println("Fehlermeldung: " + ce.getMessage());
		}finally {
			try {
				if(ois != null)
					ois.close();
				if(fis != null)
					fis.close();
			}catch(IOException io) {
				System.err.println("Fehler bei Abschlussarbeiten: " + io.getMessage());
			}
		}
		return artikelliste;
	}
		
}
