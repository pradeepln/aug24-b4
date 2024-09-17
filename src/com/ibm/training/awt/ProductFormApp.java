package com.ibm.training.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.ibm.training.jdbc.ProductDAO;

public class ProductFormApp extends WindowAdapter implements ActionListener{
	
	Frame frame = new Frame("Product AWT App v1.0.8");
	
	Label lblName = new Label("Product Name");
	Label lblPrice = new Label("Product Price");
	Label lblQoh = new Label("Qty On Hand");
	
	TextField txtName = new TextField(20);
	TextField txtPrice = new TextField(20);
	TextField txtQoh = new TextField(20);
	
	Button btnSave = new Button("Save");
	Button btnClear = new Button("Clear Form");
	
	public ProductFormApp() {
		Panel panel = new Panel();
		
		panel.add(lblName);panel.add(txtName);
		panel.add(lblPrice);panel.add(txtPrice);
		panel.add(lblQoh);panel.add(txtQoh);
		panel.add(btnSave);panel.add(btnClear);
		
		frame.add(panel);
		
		frame.setLocation(400, 200);
		frame.setSize(300, 250);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		btnSave.addActionListener(this);
		btnClear.addActionListener(this);
	}

	public static void main(String[] args) {
		ProductFormApp app = new ProductFormApp();

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Bye!");
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnClear) {
			txtName.setText("");
			txtPrice.setText("");
			txtQoh.setText("");
		}else if(e.getSource() == btnSave) {
			ProductDAO dao = new ProductDAO();
			String name = txtName.getText();
			float price = Float.parseFloat(txtPrice.getText());
			int qoh = Integer.parseInt(txtQoh.getText());
			
			dao.save(name,price,qoh);
			
			System.out.println("Saved!");
			txtName.setText("");
			txtPrice.setText("");
			txtQoh.setText("");
		}
		
	}
}
