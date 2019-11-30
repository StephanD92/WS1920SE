package GUI2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BMIdieZweite extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField grTextField;
	private JTextField gewTextField;
	private JTextField bmiTextField;
	private JButton btnCalculate = null;
	public BMIdieZweite() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblGroesse = new JLabel("Groesse");
		GridBagConstraints gbc_lblGroesse = new GridBagConstraints();
		gbc_lblGroesse.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroesse.gridx = 1;
		gbc_lblGroesse.gridy = 1;
		getContentPane().add(lblGroesse, gbc_lblGroesse);
		
		grTextField = new JTextField();
		GridBagConstraints gbc_grTextField = new GridBagConstraints();
		gbc_grTextField.anchor = GridBagConstraints.WEST;
		gbc_grTextField.insets = new Insets(0, 0, 5, 0);
		gbc_grTextField.gridx = 3;
		gbc_grTextField.gridy = 1;
		getContentPane().add(grTextField, gbc_grTextField);
		grTextField.setColumns(8);
		
		JLabel lblGewicht = new JLabel("Gewicht");
		GridBagConstraints gbc_lblGewicht = new GridBagConstraints();
		gbc_lblGewicht.insets = new Insets(0, 0, 5, 5);
		gbc_lblGewicht.gridx = 1;
		gbc_lblGewicht.gridy = 3;
		getContentPane().add(lblGewicht, gbc_lblGewicht);
		
		gewTextField = new JTextField();
		GridBagConstraints gbc_gewTextField = new GridBagConstraints();
		gbc_gewTextField.anchor = GridBagConstraints.WEST;
		gbc_gewTextField.insets = new Insets(0, 0, 5, 0);
		gbc_gewTextField.gridx = 3;
		gbc_gewTextField.gridy = 3;
		getContentPane().add(gewTextField, gbc_gewTextField);
		gewTextField.setColumns(8);
		
		JLabel lblBmi = new JLabel("BMI");
		GridBagConstraints gbc_lblBmi = new GridBagConstraints();
		gbc_lblBmi.insets = new Insets(0, 0, 5, 5);
		gbc_lblBmi.gridx = 1;
		gbc_lblBmi.gridy = 5;
		getContentPane().add(lblBmi, gbc_lblBmi);
		
		bmiTextField = new JTextField();
		bmiTextField.setEditable(false);
		bmiTextField.setEnabled(false);
		GridBagConstraints gbc_bmiTextField = new GridBagConstraints();
		gbc_bmiTextField.insets = new Insets(0, 0, 5, 0);
		gbc_bmiTextField.anchor = GridBagConstraints.WEST;
		gbc_bmiTextField.gridx = 3;
		gbc_bmiTextField.gridy = 5;
		getContentPane().add(bmiTextField, gbc_bmiTextField);
		bmiTextField.setColumns(8);
		
		btnCalculate = new JButton("Calculate");
		GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
		gbc_btnCalculate.anchor = GridBagConstraints.WEST;
		gbc_btnCalculate.gridx = 3;
		gbc_btnCalculate.gridy = 7;
		getContentPane().add(btnCalculate, gbc_btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					double groesse = Double.parseDouble(grTextField.getText());
					double gewicht = Double.parseDouble(gewTextField.getText());
					double bmi = gewicht / (groesse * groesse);
					bmiTextField.setText("" + bmi);
				
					
				
			}
			
		});
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMIdieZweite test = new BMIdieZweite();
	}
	
	

}
