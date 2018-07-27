package co.vinod.components;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame {

	private static final long serialVersionUID = 1L;

	public Calculator() {
		final Calculator me = this;

		setSize(400, 200);
		setLocation(300, 300);

		setTitle("Simple Calculator");

		setLayout(new BorderLayout());

		Panel p1 = new Panel();
		p1.add(new Label("A Simple Calculator Using AWT"));
		add(p1, BorderLayout.NORTH);

		Panel p2 = new Panel();
		add(p2, BorderLayout.SOUTH);

		p2.setLayout(new FlowLayout());

		Button btnAdd = new Button("Add");
		Button btnSub = new Button("Subtract");
		Button btnMul = new Button("Multiply");
		Button btnDiv = new Button("Division");

		p2.add(btnAdd);
		p2.add(btnSub);
		p2.add(btnMul);
		p2.add(btnDiv);

		Panel p3 = new Panel(new GridLayout(3, 2));
		add(p3, BorderLayout.CENTER);

		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		p3.add(new Label("Number 1: "));
		p3.add(tfNumber1);
		p3.add(new Label("Number 2: "));
		p3.add(tfNumber2);
		p3.add(new Label(""));
		Label lblResult = new Label();
		p3.add(lblResult);

		btnAdd.addActionListener(evt -> {
			double result = calculate(tfNumber1.getText(), tfNumber2.getText(), "+");
			lblResult.setText("Result of addition: " + result);
		});
		btnSub.addActionListener(evt -> {
			double result = calculate(tfNumber1.getText(), tfNumber2.getText(), "-");
			lblResult.setText("Result of addition: " + result);
		});
		btnMul.addActionListener(evt -> {
			double result = calculate(tfNumber1.getText(), tfNumber2.getText(), "*");
			lblResult.setText("Result of addition: " + result);
		});
		btnDiv.addActionListener(evt -> {
			double result = calculate(tfNumber1.getText(), tfNumber2.getText(), "/");
			lblResult.setText("Result of addition: " + result);
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				me.dispose();
			}
		});
	}

	double calculate(String num1, String num2, String operator) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		switch (operator) {
		case "+":
			return n1 + n2;
		case "-":
			return n1 - n2;
		case "*":
			return n1 * n2;
		case "/":
			return n1 / n2;
		default:
			throw new RuntimeException("Invalid operator");
		}
	}

}
