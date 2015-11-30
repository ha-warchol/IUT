package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
		this.add(Spinner());
	}
	private JSpinner Spinner(){
		JSpinner date = new JSpinner();
		Calendar cal = Calendar.getInstance();
		String[] months = { "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };
		JComboBox monthsList = new JComboBox(months);
		monthsList.setSelectedIndex(cal.get(Calendar.MONTH));
		
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		JComboBox daysList = new JComboBox(days);
		daysList.setSelectedIndex(cal.get(Calendar.DAY_OF_WEEK));

		SpinnerModel spinner = new SpinnerNumberModel(cal.get(Calendar.YEAR), 2010, 2020, 1);
		
		date.add((Component)spinner);
		date.add(monthsList);
		date.add(daysList);
		return date;
	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}
}
