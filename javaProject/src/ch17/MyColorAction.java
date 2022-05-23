package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener {
	//멤버변수
	private JFrame f;
	private Color c;
	private Container con;
	//1) Component : 화면구성요소(프레임,버튼,패널...)
	//2) Container : 다른 컴포넌트를 담을 수 있는 요소
	//3) contentPane : 스윙에서는 contentPane에 컴포넌트들을 부착할 수 있는데, contentPane은
	//JFrame 객체가 처음 생길때 자동으로 생성되며 프레임 객체의 getContentPane()메소드를 사용해 얻을 수 있다.
	
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();//프레임의 컨텐츠영역으로 사용되며 프레임의 contentPane 오브젝트를 리턴한다.
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 변경
	}

}
