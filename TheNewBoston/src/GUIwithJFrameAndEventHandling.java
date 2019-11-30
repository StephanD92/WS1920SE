import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class GUIwithJFrameAndEventHandling extends JFrame {

	private JTextField item1;			//fügen die Items hinzu die das Fenster haben soll
	private JTextField item2;			// es besteht aber noch kein Objekt. also sieht man noch nix
	private JTextField item3;
	private JPasswordField passwordField;
	
	
	public GUIwithJFrameAndEventHandling() {  // konstruktor der Klasse der Objekt erzeugt
		super("Titel des Konstruktors");
		
		setLayout(new FlowLayout());		// setzen das Layout des Fensters fest (FlowLayout)
		item1 = new JTextField(10);			// erzeugen ein neues Item, definieren es
		add(item1);				//Konstrukor bekommt der Items der Klasse übergeben
		item2 = new JTextField("Text hier eingeben");
		add(item2);
		item3 = new JTextField("nicht editierbar",20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("wort");
		add(passwordField);
	
		
		thehandler handler = new thehandler(); // baut ein Action listener OBJEKT
		item1.addActionListener(handler);  // unsere Items werden dem ActionListener Objekt übergeben
		item2.addActionListener(handler);  // diese Objekte werdem dem AtionListener übergeben und dort steht
		item3.addActionListener(handler);  // was mir machen sollen wenn diese Event passiert
		passwordField.addActionListener(handler);
	}
	
	// event handeling klasse die den ActinoListener implementiert.
	// hierdrin steht was gemacht werden soll wenn events passieren
	private class thehandler implements ActionListener{  // erzeugen klasse in klasse (erbt automatisch superklasse)
		
		public void actionPerformed(ActionEvent event) {   // build in methode die aufgerufen werden MUSS!!
			// event ist pressen der Enter Taste
			String string = "";  // ein leerer String wird erzeugt
			
			if(event.getSource()==item1)   // getSource = wo passiert das Event? in Item1? oder anderen?
				string = String.format("field 1: %s", event.getActionCommand());  // gibt field1 mit Variable aus
			    //getActionCommand holt sich den Text von der Location (item1)
			else if (event.getSource()==item2)  
				string = String.format("field 2: %s", event.getActionCommand());
			else if (event.getSource()==item3)  
				string = String.format("field 3: %s", event.getActionCommand());
			else if(event.getSource()==passwordField)
				string = String.format("passwordField: %s", event.getActionCommand());
			JOptionPane.showMessageDialog(null, string);  // der String wird in mitte des Fenster (null) ausgegeben!
		}
	}
	
	
	
	public static void main(String[] args) {
		GUIwithJFrameAndEventHandling dasErste = new GUIwithJFrameAndEventHandling();
		dasErste.setBounds(400, 500, 350, 350);
		dasErste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dasErste.setVisible(true);
	}
}
