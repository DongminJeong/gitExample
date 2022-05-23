package ch01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFirstApp extends JFrame {
	private JTextField id = new JTextField(20);
	private JTextField text = new JTextField(20);
	private JTextArea ch = new JTextArea(6, 20); 
	
	public MyFirstApp() {
		super("first myChatting");
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		con.add(new JLabel("ID를 입력하세요"));
		con.add(id);
		con.add(new JLabel("TEXT를 입력하세요"));
		con.add(text);
		con.add(new JScrollPane(ch));
		
		id.addActionListener(new MyAction(id, text, ch));
		text.addActionListener(new MyAction(id, text, ch));
		
		setSize(250, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFirstApp();
	}
}

class MyAction implements ActionListener {
	JTextField id;
	JTextField text;
	JTextArea ch;

	public MyAction(JTextField id, JTextField text, JTextArea ch) {
		this.id = id;
		this.text = text;
		this.ch = ch;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (id.getText().equals("")) {
			JOptionPane.showMessageDialog(
					null,
					"아이디가 없습니다.",
					"오류",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		ch.append(id.getText()+" : "+text.getText()+"\n");
		text.setText("");
	}
}

