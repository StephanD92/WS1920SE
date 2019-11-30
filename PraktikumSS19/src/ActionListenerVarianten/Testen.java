package ActionListenerVarianten;
import java.awt.*;
import javax.swing.JFrame;

public class Testen {

	
	public static void main(String[] args) {
		
		
//		Variante2JFrameKlasseSelsbtAlsActionListenerAusgestalten fenster2 = new Variante2JFrameKlasseSelsbtAlsActionListenerAusgestalten();
//		fenster2.setVisible(true);
//		fenster2.setBounds(600,300,650,250);
//		fenster2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		fenster2.pack();
		
		
		Variante3InnereKlasseAlsActionListener fenster1 = new Variante3InnereKlasseAlsActionListener();
		fenster1.setVisible(true);
		fenster1.setBounds(600,400,350,350);
		fenster1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
