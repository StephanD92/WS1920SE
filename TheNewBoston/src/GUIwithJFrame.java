import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUIwithJFrame extends JFrame {

	private JLabel item1;
	
	public GUIwithJFrame() {
		super("Der Titel in der Title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Inhalt vom Label");
		item1.setToolTipText("MouseoverEvent");
		add(item1);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		GUIwithJFrame f1 = new GUIwithJFrame();
		f1.setVisible(true);
		f1.setBounds(200, 400, 500, 500);		
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
