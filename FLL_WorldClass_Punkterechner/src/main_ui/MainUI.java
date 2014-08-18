package main_ui;

import java.awt.Dimension;

import javax.swing.*;

public class MainUI {
	public static void main(String[] args){
		JFrame mainframe = new JFrame();
		mainframe.setSize(500 , 500);
		mainframe.setDefaultCloseOperation(mainframe.EXIT_ON_CLOSE);
		mainframe.setVisible(true);
		
		JMenuBar menubar = new JMenuBar();
		mainframe.setJMenuBar(menubar);
		
		JMenu Einstellungen = new JMenu("Einstellungen");
		JMenu Hilfe = new JMenu("Hilfe");
				
		menubar.add(Hilfe);
		menubar.add(Einstellungen);
		
		mainframe.getContentPane().setLayout(null);
		
	}
}
