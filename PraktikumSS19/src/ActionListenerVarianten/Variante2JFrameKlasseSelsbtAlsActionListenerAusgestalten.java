package ActionListenerVarianten;
//import java.awt.Event;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Variante2JFrameKlasseSelsbtAlsActionListenerAusgestalten extends JFrame implements ActionListener {
	
	
	private JTextField textfieldEingabe;
	private JTextField textfieldAusgabe;
	private JPasswordField passwortEingabe;
	private JTextField passwortAusgabe;
	private JLabel textfeldLabel;
	private JLabel textfeldLabel2;
	private JButton button1;
	private JButton button2;
	
	public Variante2JFrameKlasseSelsbtAlsActionListenerAusgestalten() {
		super("Hier steht toller Titel");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textfeldLabel = new JLabel("Gib übernehmenden Text ein:");
		textfeldLabel2 = new JLabel("Gib passwort ein:");
		
		textfieldEingabe = new JTextField();
		textfieldEingabe.setColumns(10);
		textfieldAusgabe = new JTextField();
		textfieldAusgabe.setEditable(false);
		textfieldAusgabe.setColumns(10);
		
		passwortEingabe = new JPasswordField();
		passwortEingabe.setColumns(10);
		passwortAusgabe = new JTextField("Das passwort ist:");
		passwortAusgabe.setEditable(false);
		
		button1 = new JButton("übergebe in anderes Feld");
		button2 = new JButton("zeige Passwort");
		
		
		add(textfeldLabel);
		add(textfieldEingabe);
		add(button1);
		add(textfieldAusgabe);
		add(textfeldLabel2);
		add(passwortEingabe);
		add(button2);
		add(passwortAusgabe);
		
		textfieldEingabe.addActionListener(this);
		textfieldAusgabe.addActionListener(this);
		passwortEingabe.addActionListener(this);
		passwortAusgabe.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == button1)
		textfieldAusgabe.setText(textfieldEingabe.getText());
//		if(e.getSource() == button2)
		passwortAusgabe.setText(passwortEingabe.getText());		
	}
	

	
	
}
