package co.vinod.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JCalculator extends JFrame {

	private static final long serialVersionUID = 1L;

	public JCalculator() {

		setSize(400, 200);
		setLocation(300, 300);

		setTitle("Simple Calculator");

		getContentPane().setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		p1.add(new JLabel("A Simple Calculator Using AWT"));
		add(p1, BorderLayout.NORTH);

		JPanel p2 = new JPanel();
		add(p2, BorderLayout.SOUTH);

		p2.setLayout(new FlowLayout());

		JButton btnAdd = new JButton("Add");
		JButton btnSub = new JButton("Subtract");
		JButton btnMul = new JButton("Multiply");
		JButton btnDiv = new JButton("Division");

		p2.add(btnAdd);
		p2.add(btnSub);
		p2.add(btnMul);
		p2.add(btnDiv);

		JPanel p3 = new JPanel(new GridLayout(3, 2));
		add(p3, BorderLayout.CENTER);

		JTextField tfNumber1 = new JTextField();
		JTextField tfNumber2 = new JTextField();
		p3.add(new JLabel("Number 1: "));
		p3.add(tfNumber1);
		p3.add(new JLabel("Number 2: "));
		p3.add(tfNumber2);
		p3.add(new JLabel(""));
		JLabel lblResult = new JLabel();
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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
