package main_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class Panel_Startseite extends JPanel{
	
	public Panel_Startseite(){
		setBackground(Color.WHITE);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel l1 = new JLabel("1");
		c.gridx = 0;
		c.gridy = 0;
		add(l1, c);
		
		JLabel l2 = new JLabel("2");
		c.gridx = 0;
		c.gridy = 1;
		add(l2, c);
		
		JLabel l3 = new JLabel("3");
		c.gridx = 0;
		c.gridy = 2;
		add(l3, c);
		
		JButton b1 = new JButton("Button");
		c.gridx = 0;
		c.gridy = 4;
		add(b1 , c);
	}
}