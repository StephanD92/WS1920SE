package T09_20190604;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;

public class JDatePickerTest extends JFrame{
	
	private JPanel mainPanel;
	private JDateComponentFactory factory;
	private  JDatePanel datePanel;
	private  JDatePicker datePicker;

  public static void main(String... args) {
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        new JDatePickerTest();
      }
    });
  }

  public JDatePickerTest() {
    setTitle("JDatePicker");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationByPlatform(true);

    mainPanel = new JPanel();

    factory = new JDateComponentFactory();

    datePanel = factory.createJDatePanel();
    datePanel.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       printDatum((GregorianCalendar)(datePanel.getModel().getValue()));
      }
    });

    datePicker = factory.createJDatePicker();
    datePicker.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
    	  printDatum((GregorianCalendar)(datePicker.getModel().getValue()));
      }
    });

    mainPanel.add((JComponent) datePanel);
    mainPanel.add((JComponent) datePicker);

    add(mainPanel);

    pack();
    setVisible(true);
  }
  
  public void printDatum(GregorianCalendar cal) {
	try {
		String datePattern = "dd.MM.yyyy";
		DateFormat dateFormatter = new SimpleDateFormat(datePattern);
		System.out.println(dateFormatter.format(cal.getTime()));
	} catch (NullPointerException e) {
		System.err.println("Fehlermeldung: " + e.getMessage());
	}
  }
}