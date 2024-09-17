package com.ibm.training.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;

public class AWTUiApp extends MouseAdapter {

	Frame mainFrame = new Frame("My AWT UI :)");
	Label lblName = new Label("Enter Your Name");
	TextField txtName = new TextField(20);
	Button btnOk = new Button("Click Me!");
	Choice chcCountries = new Choice();
	List lstSkills = new List(4, true);
	
	public AWTUiApp() {
		
		chcCountries.add("India");
		chcCountries.add("Singapore");
		chcCountries.add("Sri Lanka");
		chcCountries.add("UAE");

		
		lstSkills.add("Java");
		lstSkills.add("Maven");
		lstSkills.add("JavaScript");
		lstSkills.add("MySql");

		Panel panel = new Panel();
		panel.add(lblName);
		panel.add(txtName);
		panel.add(btnOk);
		panel.add(chcCountries);
		panel.add(lstSkills);

		mainFrame.add(panel, BorderLayout.CENTER);

		mainFrame.setLocation(400, 200);
		mainFrame.setSize(400, 300);
		mainFrame.setVisible(true);
		
		txtName.addMouseListener(this);
		mainFrame.addWindowListener(new WindowCloser());
	}

	public static void main(String[] args) {
		AWTUiApp app = new AWTUiApp();
	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		 txtName.setBackground(Color.RED);
		 txtName.setForeground(Color.WHITE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		txtName.setBackground(Color.WHITE);
		txtName.setForeground(Color.BLACK);
	}

	class WindowCloser extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
