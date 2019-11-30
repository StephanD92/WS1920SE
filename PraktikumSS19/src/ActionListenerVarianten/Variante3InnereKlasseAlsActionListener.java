package ActionListenerVarianten;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Variante3InnereKlasseAlsActionListener extends JFrame {

	
	private JTextField item1;
	private JPasswordField item2;
	private JTextField item3;
	private JButton item4;
	
	
		public Variante3InnereKlasseAlsActionListener() {    //Konstruktor
			
			super("Titel des Konstruktors");
			
			setLayout(new FlowLayout());
			item1 = new JTextField();
			item2 = new JPasswordField("jjj");
			item3 = new JTextField("jo");
			item4 = new JButton("SchlieﬂeFenster");
			item1.setColumns(20);
			add(item1);
			add(item2);
			add(item3);
			add(item4);
			
			derListener Listener = new derListener();  //listener objekt wird erzeugt
			item1.addActionListener(Listener);
			item2.addActionListener(Listener);
			item3.addActionListener(Listener);
			item4.addActionListener(Listener);
			
		}
		private class derListener implements ActionListener {
			
			public void actionPerformed(ActionEvent event) {
				String string = "";
				if (event.getSource()==item1) {
					string = String.format("Feld 1: %s", event.getActionCommand());
					JOptionPane.showMessageDialog(null, string);
				}
				else if (event.getSource()==item2) {
					string = String.format("Password: %s", event.getActionCommand());
					JOptionPane.showMessageDialog(null, string);
				}
				else if (event.getSource()==item3) {
					string = String.format("Feld 3: %s", event.getActionCommand());
					JOptionPane.showMessageDialog(null, string);
				}
				else if (event.getSource()==item4) {
					string = String.format("Ich schlieﬂe jetzt das Fenster",event.getActionCommand());
					JOptionPane.showMessageDialog(null, string);
					System.exit(0);
				}
				
								
			}
			
		}

}

