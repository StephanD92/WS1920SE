package T05_20190507_LSG;

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

public class Datenverwaltung {

	public Datenverwaltung() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean saveObject(String dateiname, LinkedList<Artikel> artikelliste) {
		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			file = new File(dateiname);
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
	
	public LinkedList<Artikel> loadObject(String dateiname){
		File file = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj  = null;
		LinkedList<Artikel> artikelliste = null;
		
		
		try {
			file = new File(dateiname);
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
	
	public boolean saveArtikelObject(String dateiname, Artikel artikel) {
		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			file = new File(dateiname);
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(artikel);
			return true;
		} catch (FileNotFoundException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
			return false;
		} catch (IOException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
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
	
	public Artikel loadArtikelObject(String dateiname) {
		File file = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj  = null;
		Artikel artikel = null;
		
		
		try {
			file = new File(dateiname);
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			obj = ois.readObject();
			
			if(obj instanceof Artikel)
				artikel = (Artikel) obj;
		} catch (FileNotFoundException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("Fehlermeldung: " + e.getMessage());
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
		return artikel;
	}
	
	public boolean saveCSV(String dateiname, LinkedList<Artikel> artikelliste) {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			file = new File(dateiname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			for(Artikel artikel : artikelliste) {
				bw.write(artikel.toString());
				bw.newLine();
			}
			return true;
		}catch(IOException io) {
			System.err.println("Fehlermeldung: " + io.getMessage());
			return false;
		}finally {
			try {
				if(bw != null)
					bw.close();
				if(fw != null)
					fw.close();
			}catch(IOException io) {
				System.err.println("Fehlermeldung: " + io.getMessage());
			}
		}
	}
	
	public LinkedList<Artikel> loadCSV(String dateiname){
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		String zeile = null;
		LinkedList<Artikel> artikelliste = null;
		
		try {
			artikelliste = new LinkedList<Artikel>();
			file = new File(dateiname);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while((zeile = br.readLine()) != null) {
				String[] tmp = zeile.split(";");
				int artikelnummer = Integer.parseInt(tmp[0]);
				String artikelbezeichnung = tmp[1];
				double artikelpreis = Double.parseDouble(tmp[2]);
				
				artikelliste.add(new Artikel(artikelnummer, artikelbezeichnung,artikelpreis));
			}
		}catch(IOException io) {
			System.err.println("Fehlermeldung: " + io.getMessage());
		}catch(NumberFormatException nfe){
			System.err.println("Fehlermeldung: " + nfe.getMessage());
		}finally {	
			try {
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
			}catch(IOException io) {
				System.err.println("Fehlermeldung: " + io.getMessage());
			}
		}
		return artikelliste;
	}
	
	public boolean saveArtikelCSV(String dateiname, Artikel artikel) {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			file = new File(dateiname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			

				bw.write(artikel.toString());
				bw.newLine();
	
			return true;
		}catch(IOException io) {
			System.err.println("Fehlermeldung: " + io.getMessage());
			return false;
		}finally {
			try {
				if(bw != null)
					bw.close();
				if(fw != null)
					fw.close();
			}catch(IOException io) {
				System.err.println("Fehlermeldung: " + io.getMessage());
			}
		}
	}
	
	public Artikel loadArtikelCSV(String dateiname) {
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		String zeile = null;
		Artikel artikel = null;
		
		try {
			file = new File(dateiname);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			zeile = br.readLine();
			String[] tmp = zeile.split(";");
			int artikelnummer = Integer.parseInt(tmp[0]);
			String artikelbezeichnung = tmp[1];
			double artikelpreis = Double.parseDouble(tmp[2]);
			artikel = new Artikel(artikelnummer, artikelbezeichnung,artikelpreis);
		}catch(IOException io) {
			System.err.println("Fehlermeldung: " + io.getMessage());
		}catch(NumberFormatException nfe){
			System.err.println("Fehlermeldung: " + nfe.getMessage());
		}finally {	
			try {
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
			}catch(IOException io) {
				System.err.println("Fehlermeldung: " + io.getMessage());
			}
		}
		return artikel;
	}

	protected void loadCSV(File selectedFile) {
		// TODO Auto-generated method stub
		
	}

}
