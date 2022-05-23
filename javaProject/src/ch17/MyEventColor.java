package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame{
	JButton b[] = new JButton[4];
	String s[] = {"North", "East", "South", "West"};
	Color c[] = {Color.red, Color.green, Color.blue, Color.yellow};
	public MyEventColor() {
		super("MyEventColor");
		for(int i = 0; i < b.length; i++) {
			b[i] = new JButton(s[i]);
			add(b[i], s[i]);
			b[i].addActionListener(new MyColorAction(this, c[i]));
		}
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyEventColor();
	}
}

