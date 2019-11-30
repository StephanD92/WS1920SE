import javax.swing.*;


public class IntroductionGUIJOptionPane {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("Gib erste zahl ein");
		String s2 = JOptionPane.showInputDialog("Gib mal zweite Zahl ein");
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		int sum = num1+num2;
		
		// null bedeutet es wird direkt in der Mitte des Bildschirm positioniert
		JOptionPane.showMessageDialog(null, "Das Ergebnis ist: "+sum,
				"Hier der Titel der Antwort", JOptionPane.PLAIN_MESSAGE);
		
	}
	
	
}
