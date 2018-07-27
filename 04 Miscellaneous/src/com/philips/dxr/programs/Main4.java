package com.philips.dxr.programs;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main4 {
	public static void main(String[] args) {
		Frame f = new Frame("An AWT Frame Example");
		f.setSize(400, 200);
		f.setLocation(300, 300);
		f.setResizable(false);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		// f.setLayout(new FlowLayout());
		f.setLayout(new GridLayout(1, 3));

		Label lblMessage = new Label("Enter a number: ");
		f.add(lblMessage);

		TextField tfNumber = new TextField();
		tfNumber.setText("1");
		f.add(tfNumber);

		Button btnDouble = new Button("Double it");
		f.add(btnDouble);
		btnDouble.addActionListener(e -> {
			int num = Integer.parseInt(tfNumber.getText());
			tfNumber.setText(String.valueOf(num * 2));
		});

		f.setVisible(true);

	}
}
