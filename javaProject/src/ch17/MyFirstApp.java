package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//미완성....
public class MyFirstApp extends JFrame implements ActionListener {
	JTextArea ar = new JTextArea(6, 20);
	JTextField c1 = new JTextField(20);
	JTextField c2 = new JTextField(20);
	JTextField c3 = new JTextField(20);
	JTextField c4 = new JTextField(20);
	JButton submitButton = new JButton("골라줘");
	static String result;
	public MyFirstApp() {
		super("골라줭");
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(new JLabel("입력 후 골라줘 버튼을 눌러주세요!"));
		con.add(c1);
		con.add(c2);
		con.add(c3);
		con.add(c4);
		con.add(submitButton);
		submitButton.addActionListener(this);
		ar.append(result);
		con.add(ar);
		setSize(250, 300);
	}
	public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getSource() == submitButton) {
			String data [] = {c1.getText(), c2.getText(), c3.getText(), c4.getText()};
			double r = Math.random();
			int num = (int)Math.round(r * (data.length - 1));
			result = (data[num]);
		}
	}
	public static void main(String args[]) {
		MyFirstApp g = new MyFirstApp();
		g.setVisible(true);
		
	}
}
