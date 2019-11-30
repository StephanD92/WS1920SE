package Kapitel56;
import java.awt.*;
import javax.swing.*;

public class MeinFrameKing extends JFrame{

	// MeinFrame ist Container, der von JFrame erbt
	// Deswegen können ihm GUI-Komponenten hinzugefügt werden
	JLabel label;
	JLabel label2;
	JLabel label3;
	// Konstruktor
		MeinFrameKing(String title){
			super(title);
			setSize(200,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			setLayout(new FlowLayout());
		
			label = new JLabel("EinNeuesFensterVomTypMeinFrameKing");
			add(label);
			label2 = new JLabel("zweitesLabel");
			add(label2);
			label3 = new JLabel("drittesLabel");
			add(label3);
		}
}	
	

