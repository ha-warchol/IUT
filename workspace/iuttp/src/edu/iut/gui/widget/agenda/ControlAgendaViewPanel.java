package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
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
		JPanel setDate = new JPanel();
		Calendar c = Calendar.getInstance();
		String [] months = ApplicationSession.instance().getMonths();
		JComboBox <String> monthsList = new JComboBox<String>(months);
		monthsList.setSelectedIndex(c.get(Calendar.MONTH));
		
		String [] days = ApplicationSession.instance().getDays();
		JComboBox <String> daysList = new JComboBox<String>(days);
		daysList.setSelectedIndex(c.get(Calendar.DAY_OF_WEEK));
		
		SpinnerModel spinner = new SpinnerNumberModel(c.get(Calendar.YEAR), c.get(Calendar.YEAR)-5,c.get(Calendar.YEAR)+5, 1);
		JSpinner spin = new JSpinner(spinner);
		
		setDate.add(spin);
		setDate.add(monthsList);
		setDate.add(daysList);
		setDate.setLayout(new GridLayout(3,1));
		add(setDate);
	}
	
	/**
	 * Obtenir l'année sélectionnée
	 * @return Année
	 */
	public int getYear() {
		return selectedYear;
	}
	
	/**
	 * Obtenir le mois sélectionné
	 * @return Mois
	 */
	public int getMonth() {
		return selectedMonth;
	}
	
	/**
	 * Obtenir le jour sélectionné
	 * @return Jour
	 */
	public int getDay() {
		return selectedDay;
	}
}
