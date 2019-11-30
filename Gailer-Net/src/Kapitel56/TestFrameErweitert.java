package Kapitel56;

import java.awt.*;
import javax.swing.*;

public class TestFrameErweitert {

	
	public static void main(String[] args) {
		
		
		JFrame master = new JFrame ("beendest du mich, ist ganzes Programm beendet");
		JFrame temp = new JFrame("beendest du mich, läuft programm weiter");
		
		
		master.setSize(200, 400);
		master.setVisible(true);
		master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// exit beendet programm
		
		temp.setSize(300, 500);
		temp.setVisible(true);
		temp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		// dispose entsorgt fram objekt aber programm läuft weiter
		
		
		
//		int breite = 600;
//		int hoehe = 400;
//		
//		JFrame frame = new JFrame("Erster Frame");
//		frame.setBounds(400, 200, breite, hoehe);
//		frame.setSize(breite+1000, hoehe);
//		
//		// legt breite und hoehe fest
//		frame.setVisible(true);  // muss immer true sein, sonst wird nix angezeigt
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
		
		
		
//		int breite = 600;
//		int hoehe = 500;
//		
//		JFrame frame = new JFrame("Test Frame Extrahierend");
//		
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		for (int extra=0; extra<999; extra+=1 )
//				frame.setSize(breite, hoehe+extra);

		
		// während laufzeit verändert sich groeße. wenn groeße sich nicht mehr veränder
		// läuft das programm weiterhin und verändert sich einfach nicht mehr
	}

}
