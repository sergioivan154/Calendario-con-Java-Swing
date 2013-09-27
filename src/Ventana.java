import java.beans.FeatureDescriptor;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;


public class Ventana extends JFrame {
	
	
	public JDatePickerImpl calendario;
	public JDatePanelImpl panelCalendar;
	public Ventana()
	{
		super("Ventana");
		panelCalendar=new JDatePanelImpl(null);
	
		calendario=new JDatePickerImpl(panelCalendar);
		this.add(calendario);
		this.setBounds(200,200,200,200);
		
	}

}
