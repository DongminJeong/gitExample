package ch12;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*이벤트 처리 : 사용자의 요청(request)에 시스템이 응답
 * 이벤트 리스너 : 이벤트 관찰자,. 감시자
 * 어ㅣ벤트 핸들러 :" 처리기*/


public class InnerExam extends Frame {
	public InnerExam() {
		super("내부 클래스 테스트");//제목처리
		setSize(300, 400);//가로,세로 초기사지으 설정
		setVisible(true);//프레임을 화면에 표시
	}
	
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		e.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			//윈도우창(프레임)이 닫힐때 호출(x 버튼을 누를 때)
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
		}
			
			@Override
			public void windowActivated(WindowEvent e) {	
			}
		});//무명클래스
	}

}
