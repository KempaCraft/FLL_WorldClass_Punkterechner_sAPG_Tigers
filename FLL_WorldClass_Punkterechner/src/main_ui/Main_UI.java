package main_ui;

import java.awt.MenuItem;

import javax.swing.*;

import java.awt.event.*;
import java.awt.Dimension;

import de.time.*;

public class Main_UI {
	
	
	public static void main (String[] args){
		
		JFrame mainframe = new JFrame("Punkterechner");
		mainframe.setVisible(true);
		mainframe.setSize(500, 200);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setMinimumSize(new Dimension(500, 200));
		// create the Frame
		
		JMenuBar menu = new JMenuBar();
		mainframe.setJMenuBar(menu);
		// Create Menu Bar
		
		JMenu Punkterechner = new JMenu("Punkterechner");
		JMenu Highscoreliste = new JMenu("Highscoreliste");
		JMenu Einstellungen = new JMenu("Einstellungen");
		JMenu Hilfe= new JMenu("Hilfe");
		JMenu Startseite = new JMenu("Startseite");
		JMenu Entwicklung = new JMenu("Entwicklung");
		// Create Topics of Menu bar
		
		menu.add(Startseite);
		menu.add (Einstellungen);
		menu.add(Punkterechner);
		menu.add (Highscoreliste);
		menu.add(Entwicklung);
		menu.add(Hilfe);
		// Add Topics to the Menu bar
		
		JMenuItem Hilfe_Über_uns = new JMenuItem("Über uns");
		JMenuItem Hilfe_Bedienungsanleitung = new JMenuItem("Bedienungsanleitung");
		JMenuItem Hilfe_Kontakt = new JMenuItem ("Kontakt");
		// Create Items for the different topics
		
		Hilfe.add(Hilfe_Bedienungsanleitung);
		Hilfe.add(Hilfe_Über_uns);
		Hilfe.add(Hilfe_Kontakt);
		// Add Items to the Menu bar(to the Topics);
		
		TimePanel pnTime = new TimePanel();
		
		class action_Über_Uns implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		}
		
		class action_Punkterechner implements ActionListener{
			public void actionPerformed(ActionEvent arg0){
			}
		}
		
		
	}

}
