package com.philips.dxr.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;

	JLabel lblTitle, lblNum1, lblNum2, lblResult;
	JTextField tfNum1, tfNum2;
	JButton btnAdd, btnSub, btnMul, btnDiv;

	public static void main(String[] args) {
		new Calculator().setVisible(true);
	}

	public Calculator() {
		setTitle("A Simple Calculator");
		setLocation(600, 400);
		setSize(400, 200);
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblTitle = new JLabel("A Simple Calculator", JLabel.CENTER);
		Font font = new Font("Monaco", Font.BOLD, 22);
		lblTitle.setFont(font);

		add(lblTitle, "North");

		add(getButtonsPanel(), BorderLayout.SOUTH);

		add(getNumbersPanel(), BorderLayout.CENTER);
	}

	private void calculate(String operator) {
		String result = null;
		try {
			double n1 = Double.parseDouble(tfNum1.getText());
			double n2 = Double.parseDouble(tfNum2.getText());

			switch (operator) {
			case "+":
				result = "Result = " + (n1 + n2);
				break;
			case "-":
				result = "Result = " + (n1 - n2);
				break;
			case "*":
				result = "Result = " + (n1 * n2);
				break;
			case "/":
				result = "Result = " + (n1 / n2);
				break;
			}

		} catch (Exception e) {
			result = "Error: " + e.getMessage();
		}
		lblResult.setText(result);
	}

	private Component getNumbersPanel() {
		JPanel p = new JPanel(new GridLayout(3, 2));
		lblNum1 = new JLabel("Enter number 1");
		lblNum2 = new JLabel("Enter number 2");

		tfNum1 = new JTextField();
		tfNum2 = new JTextField();

		lblResult = new JLabel();

		p.add(lblNum1);
		p.add(tfNum1);

		p.add(lblNum2);
		p.add(tfNum2);

		p.add(lblResult);

		return p;
	}

	private JPanel getButtonsPanel() {
		JPanel p = new JPanel(new FlowLayout());

		p.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				System.out.printf("(%d, %d)\n", e.getX(), e.getY());
			}
		});

		btnAdd = new JButton("Add");
		p.add(btnAdd);
		btnAdd.addActionListener(e -> calculate("+"));

		btnSub = new JButton("Subtract");
		p.add(btnSub);
		btnSub.addActionListener(e -> calculate("-"));

		btnMul = new JButton("Multiply");
		p.add(btnMul);
		btnMul.addActionListener(e -> calculate("*"));

		btnDiv = new JButton("Divide");
		p.add(btnDiv);
		btnDiv.addActionListener(e -> calculate("/"));

		return p;
	}
}
