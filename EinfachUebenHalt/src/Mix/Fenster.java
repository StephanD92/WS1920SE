package Mix;
import javax.swing.*;
import java.awt.*;



public class Fenster extends JFrame {

	JTextField textfeld1;
	JTextField textfeld2;
	JButton button1;
	JButton button2;
	JLabel labl1;
	
	
	public Fenster() {
		super("Titel des Fensters");
		
		FlowLayout fl = new FlowLayout();
		textfeld1 = new JTextField("Erstes Textfeld gefüllt");
		textfeld2 = new JTextField();
		textfeld2.setEditable(false);
		textfeld2.setColumns(20);
		
		
		labl1 = new JLabel("Erstes Label");
		button1 = new JButton("übergebe text:");
		button2 = new JButton("schließe Fenster");
		
		this.add(button1);
		
	}
	
	
	public static void main(String[] args) {
		Fenster f1 = new Fenster();
		f1.setVisible(true);
		f1.setBounds(200, 400, 350, 350);
		f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
	}
	
		
	
		
	
	
}
