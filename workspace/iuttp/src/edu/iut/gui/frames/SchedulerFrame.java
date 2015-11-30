package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import edu.iut.app.ApplicationSession;
import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;


public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;

	protected void setupUI() {

		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);

		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu, menu2;
		JMenuItem menuItem;
		ActionListener nonImplemente = new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				JOptionPane.showMessageDialog(null, ApplicationSession.instance().getString("nonImplemente"), "WARNING", 0);
			}
		};
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/
		/* FILE MENU */
		menu = new JMenu(ApplicationSession.instance().getString("file"));
		menuItem = new JMenuItem(ApplicationSession.instance().getString("load"));
		menuItem.addActionListener(nonImplemente);
		menu.add(menuItem);
		menuItem = new JMenuItem(ApplicationSession.instance().getString("save"));
		menuItem.addActionListener(nonImplemente);
		menu.add(menuItem);
		menuItem = new JMenuItem(ApplicationSession.instance().getString("quit"));
		menuItem.addActionListener(nonImplemente);
		menu.add(menuItem);

		/* EDIT MENU */

		menu = new JMenu(ApplicationSession.instance().getString("edit"));
		menu2 = new JMenu(ApplicationSession.instance().getString("view"));

		menuItem = new JMenuItem(ApplicationSession.instance().getString("day"));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				layerLayout.show(contentPane, ActiveView.DAY_VIEW.name());
			}
		});
		menu2.add(menuItem);

		menuItem = new JMenuItem(ApplicationSession.instance().getString("week"));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				layerLayout.show(contentPane, ActiveView.WEEK_VIEW.name());
			}
		});
		menu2.add(menuItem);

		menuItem = new JMenuItem(ApplicationSession.instance().getString("month"));
		menuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				layerLayout.show(contentPane, ActiveView.MONTH_VIEW.name());
			}
		});
		menu2.add(menuItem);
		menu.add(menu2);

		/* HELP MENU */

		menu = new JMenu(ApplicationSession.instance().getString("help"));

		menuItem = new JMenuItem(ApplicationSession.instance().getString("display"));
		menuItem.addActionListener(nonImplemente);
		menu.add(menuItem);

		menuItem = new JMenuItem(ApplicationSession.instance().getString("about"));
		menuItem.addActionListener(nonImplemente);
		menu.add(menuItem);

		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
	}

	public SchedulerFrame() {
		super();

		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}

}
