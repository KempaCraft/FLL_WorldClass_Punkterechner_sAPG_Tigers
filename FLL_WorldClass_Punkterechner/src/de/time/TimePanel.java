package de.time;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimePanel extends JPanel {
	public static JLabel lbl_time;
	public static JLabel lbl_time_rest;
	public static JToggleButton btn_start;
	private JButton btn_reset;
	private JToggleButton btn_switch;

	/**
	 * Create the panel.
	 */
	public TimePanel() {
		
		TimeManager tm = new TimeManager();
		tm.start();
		
		setBackground(Color.WHITE);
		setLayout(null);
		
		lbl_time_rest = new JLabel('/' + "02:30");
		lbl_time_rest.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_time_rest.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_time_rest.setBounds(362, 119, 88, 25);
		add(lbl_time_rest);
		
		lbl_time = new JLabel("00:00");
		lbl_time.setFont(new Font("Arial", Font.PLAIN, 99));
		lbl_time.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_time.setBounds(0, 0, 352, 212);
		add(lbl_time);
		
		btn_start = new JToggleButton("Start");
		btn_start.setBounds(10, 277, 121, 23);
		add(btn_start);
		
		btn_reset = new JButton("Reset");
		btn_reset.setBounds(180, 277, 89, 23);
		add(btn_reset);
		
		btn_switch = new JToggleButton("Hochz\u00E4hlen");
		btn_switch.setBounds(329, 277, 121, 23);
		add(btn_switch);
		
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TimeManager.runTimer = false;
				TimeManager.resetTimer();
				TimeManager.updateTime();
			}
		});
		
		btn_start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!TimeManager.runTimer){
					TimeManager.runTimer = true;
				}
				else{
					TimeManager.runTimer = false;
					TimeManager.updateTime();
				}
			}
		});

		btn_switch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimeManager.runTimerDown = btn_switch.isSelected();
				TimeManager.updateTime();
			}
		});

	}
}