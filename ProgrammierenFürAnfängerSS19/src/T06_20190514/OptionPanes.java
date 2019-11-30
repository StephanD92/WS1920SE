package T06_20190514;

import javax.swing.JOptionPane;

public class OptionPanes {

	public static void main(String[] args) {
		
		try {
			Integer.parseInt("w223");
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Fehler: " + e.getMessage(), "NumberFormatException",JOptionPane.ERROR_MESSAGE);

		}
		
	}

}
